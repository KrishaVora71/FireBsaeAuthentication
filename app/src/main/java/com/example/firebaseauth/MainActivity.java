package com.example.firebaseauth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private Button btnRegister;
    private EditText etRegEmail;
    private EditText etRegPassword;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRegister = findViewById(R.id.button_register);
        etRegEmail = findViewById(R.id.email_register);
        etRegPassword = findViewById(R.id.password_register);



        mAuth = FirebaseAuth.getInstance();


        btnRegister.setOnClickListener(view -> {
            String email1 = etRegEmail.getText().toString();
            String password1 = etRegPassword.getText().toString();
            createUser(email1, password1);
        });
    }

    private void createUser(String email1, String password1) {

        if (TextUtils.isEmpty(email1)) {
            etRegEmail.setError("Email cannot be empty");
            etRegEmail.requestFocus();
        } else if (TextUtils.isEmpty(password1)) {
            etRegPassword.setError("Password cannot be empty");
            etRegPassword.requestFocus();
        } else {

            mAuth.createUserWithEmailAndPassword(email1, password1).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                    if (task.isSuccessful()) {
                        Toast.makeText(MainActivity.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this, LoginActivity.class));
                    } else {
                        Toast.makeText(MainActivity.this, "Register Error", Toast.LENGTH_SHORT).show();
                    }

                }
            });

        }
    }


}







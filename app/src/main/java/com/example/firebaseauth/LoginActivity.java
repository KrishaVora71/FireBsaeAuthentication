package com.example.firebaseauth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

   private  Button btnLogin;
    private EditText etLoginEmail;
    private EditText etLoginPassword;
    private FirebaseAuth mAuth;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.button_register);
        etLoginEmail = findViewById(R.id.email_register);
        etLoginPassword = findViewById(R.id.password_register);

        mAuth = FirebaseAuth.getInstance();

        btnLogin.setOnClickListener(view -> {
            String email2 = etLoginEmail.getText().toString();
            String password2= etLoginPassword.getText().toString();
            createLogin(email2,password2);
        });

    }

    private void createLogin(String email2, String password2) {
        {
            //String email2 = etLoginEmail.getText().toString();
           // String password2= etLoginPassword.getText().toString();

            if (TextUtils.isEmpty(email2)) {
                etLoginEmail.setError("Email cannot be empty");
                etLoginEmail.requestFocus();
            } else if (TextUtils.isEmpty(password2)) {
                etLoginPassword.setError("Password cannot be empty");
                etLoginPassword.requestFocus();

            }else{
                mAuth.signInWithEmailAndPassword(email2,password2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(LoginActivity.this,"Registered successfully",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(LoginActivity.this,HomeActivity.class));
                        }else{
                            Toast.makeText(LoginActivity.this,"Login Error" + task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        }
    }
}
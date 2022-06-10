package com.example.firebaseauth;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UserHelper {
    String email,password;

    public UserHelper()
    {

    }

    public  UserHelper(String email,String password)
    {
        this.email= email;
        this.password = password;
    }

    public String getEmail()
    {
        return email;
    }
    public  void setEmail(String email){
        this.email = email;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

}
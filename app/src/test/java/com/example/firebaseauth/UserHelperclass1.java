package com.example.firebaseauth;

public class UserHelperclass1 {
    String email,password;

    public UserHelperclass1()
    {

    }

    public  UserHelperclass1(String email,String password)
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

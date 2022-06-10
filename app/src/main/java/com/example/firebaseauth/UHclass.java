package com.example.firebaseauth;

public class UHclass {

     String fname2,lname2,counter1;
    String email, password;

    public UHclass(){

    }


    public  UHclass(String email,String password,String fname2, String lname2 , String counter1 )
    {

        this.email = email;
        this.password = password;
        this.fname2= fname2;
        this.lname2 = lname2;
        this.counter1 = "0";
    }



    public  String getFname2()
    {
        return fname2;
    }
    public void setFname2(String fname2)
    {
        this.fname2 = fname2;
    }
    public  String getLname2()
    {
        return lname2;
    }
    public void setLname2(String lname2)
    {
        this.lname2 = lname2;
    }




    public String getEmail() { return email;}
    public void setEmail(String email){
        this.email= email;
    }
    public String getPassword(){ return  password;}
    public void setPassword(String password){
        this.password=password;
    }

    public String getCounter1() {
        return counter1;
    }

    public void setCounter1(String counter1) {
        this.counter1 = counter1;
    }
}
package com.example.firebaseauth;

public class UREM {
    String amount;
    String pay;
    String company;

    public UREM(){

    }
    public UREM(String amount,String pay,String company)
    {
        this.amount= amount;
        this.pay= pay;
        this.company= company;
    }

    public String getAmount()
    {
        return amount;
    }
    public void setAmount(String amount){
        this.amount=amount;
    }
    public String getPay()
    {
        return amount;
    }
    public void setPay(String pay){
        this.pay=pay;
    }
    public String getCompany()
    {
        return company;
    }
    public void setCompany(String company){
        this.company=company;
    }
}

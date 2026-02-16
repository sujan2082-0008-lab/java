package oop.accessmodifiers.publicmethod.bank;

public class Account {
    private double balance = 45000;
    private String accountNumber = "adasdas001119L";
    public void showAccountNumber(){
        System.out.println("Account Number: "+accountNumber);
    }
    private void calculateInterest(){
        double interest =(double)5/100*balance;
        System.out.println("Interest: "+interest);
    }
    void showBalance(){
        System.out.println("Current balance: "+balance);
        calculateInterest();
    }
}

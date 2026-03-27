package oop.methods;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        if(balance>amount){
            balance = balance - amount;
        }
        else{
            System.out.println("Insufficient money..");
        }

    }

    public static void main(String[] args){
        BankAccount bank = new BankAccount();
        bank.setAccountNumber(122345);
        bank.setAccountHolderName("Sujan Dangol");
        bank.setBalance(35000);
        bank.deposit(5000);
        bank.withdraw(19000);
        System.out.println("Your final balance is: "+bank.getBalance());
    }
}

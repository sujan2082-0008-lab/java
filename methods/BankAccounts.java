package oop.methods;

public class BankAccounts{
    private double balance=0;

    public void deposit(double amount){
        System.out.println("Deposited: "+amount);
        balance = balance + amount;

    }

    public void displayBalance(){
        System.out.println("Balance: "+balance);
    }
}

class SavingsAccount extends BankAccounts{
    public static void main(String[] args){
        SavingsAccount account = new SavingsAccount();
        account.deposit(1000);
        account.displayBalance();
    }
}

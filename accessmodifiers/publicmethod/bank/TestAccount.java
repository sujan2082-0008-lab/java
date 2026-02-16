package oop.accessmodifiers.publicmethod.bank;

public class TestAccount {
    public static void main(String[] args){
        Account account = new Account();
        account.showAccountNumber();
        account.showBalance();
//        account.calculateInterest();
    }
}

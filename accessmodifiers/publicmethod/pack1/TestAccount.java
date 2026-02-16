package oop.accessmodifiers.publicmethod.pack1;

import oop.accessmodifiers.publicmethod.bank.Account;
public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.showAccountNumber();
//        account.showBalance();
//        account.calculateInterest();
    }
}

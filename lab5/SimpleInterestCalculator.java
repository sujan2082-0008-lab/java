//Simple Interest Calculator: Write a program to calculate Simple Interest. Declare
//variables for Principal (P), Time (T), and Rate (R).
//Print the Simple Interest and the Total Amount (Principal + Interest).
package oop.lab5;

public class SimpleInterestCalculator {
    public static void main(String[] args){
        double principal = 50000;
        double time = 2.5;
        double rate = 5;

        double simpleInterest = (principal * time * rate)/100;
        double totalAmount = simpleInterest + principal;

        System.out.println("The simple interest is: " + simpleInterest);
        System.out.println("The total amount is: "+ totalAmount);
    }

}

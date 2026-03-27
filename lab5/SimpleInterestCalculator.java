//Simple Interest Calculator: Write a program to calculate Simple Interest. Declare
//variables for Principal (P), Time (T), and Rate (R).
//Print the Simple Interest and the Total Amount (Principal + Interest).
package oop.lab5;
import java.util.Scanner;
public class SimpleInterestCalculator {
    public static void main(String[] args){
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter principal amount: ");
       double principal=scanner.nextDouble();
       System.out.println("Enter time: ");
       double time=scanner.nextDouble();
       System.out.println("Enter rate: ");
       double rate=scanner.nextDouble();

       double si = principal*time*rate/100;
       double totalAmount = si + principal;

       System.out.println("Total amount: "+totalAmount);
        System.out.println("Simple interest: "+si);
        scanner.close();
    }

}

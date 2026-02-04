//The Bill Splitter: Imagine a restaurant bill of Rs.150.00 needs to be split among 4
//friends. Write a program to calculate how much each person pays. Then, add a 10% tip
//to the total bill and recalculate the split.
package oop.lab2;
import java.util.Scanner;
public class BillSplitter {
    public static void main(String[] args){
        double billAmount,tipPercentage;
        int numberOfPeople;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total bill amount: ");
        billAmount = scan.nextDouble();
        System.out.println("Enter the tip percentage: ");
        tipPercentage = scan.nextDouble();
        System.out.println("Enter the number of persons to split the bill: ");
        numberOfPeople = scan.nextInt();

        //calculation
        double tipAmount = tipPercentage/100 * billAmount;
        double totalAmount = tipAmount + billAmount;
        double splitAmount = totalAmount / numberOfPeople;

        System.out.println("< --- Sujan Restaurant --- >");
        System.out.println("Bill Amount: "+ billAmount);
        System.out.println("Tip Amount( "+tipPercentage+"%): "+tipAmount);
        System.out.println("Total Amount with tip: "+ totalAmount);
        System.out.println("Amount to be paid by each: "+ splitAmount);
        System.out.println("< --- Thank you --->");
        scan.close();
    }
}

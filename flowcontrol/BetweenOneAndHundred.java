//10. Write a program to check whether a number lies between 1 and 100.
package oop.flowcontrol;
import java.util.Scanner;
public class BetweenOneAndHundred {
    public static void main(String[] args){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        if(number >1 && number <100){
            System.out.println(number + " lies between 1 and 100.");
        }else{
            System.out.println(number + " doesn't lies between 1 and 100.");
        }
        scanner.close();
    }

}

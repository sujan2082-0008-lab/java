//1. Write a program to check whether a number is positive or negative using if–else
package oop.flowcontrol;
import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        if(number > 0){
            System.out.println(number + " is positive.");
        }
        else{
            System.out.println(number + " is negative.");
        }
        scanner.close();
    }
}

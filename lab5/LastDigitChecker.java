//Last Digit Checker:  Write a program that takes two integer numbers. Print true if both
//        numbers have the same last digit (e.g., 27 and 57 should return true).
//        Hint: Use num % 10 to get the last digit of any number.
package oop.lab5;
import java.util.Scanner;
public class LastDigitChecker {
    public static void main(String[] args){
        int number1;
        int number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number one: ");
        number1 = scanner.nextInt();
        System.out.println("Enter number two: ");
        number2 = scanner.nextInt();
        boolean result = number1 % 10 == number2 % 10 ;
        System.out.println(result);
        scanner.close();
    }

}

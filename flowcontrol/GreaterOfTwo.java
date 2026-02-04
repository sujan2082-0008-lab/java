//6. Write a program to find the greater of two numbers using if–else.
package oop.flowcontrol;
import java.util.Scanner;
public class GreaterOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1,number2;
        System.out.print("Enter first number: ");
        number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println(number1 + " is greater than "+ number2);
        } else {
            System.out.println(number2 + " is greater than "+number1);
        }
        scanner.close();
    }
}


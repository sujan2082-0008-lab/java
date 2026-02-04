//5. Write a program to check whether a number is equal to zero or not.
package oop.flowcontrol;
import java.util.Scanner;
public class EqualToZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        if (number == 0) {
            System.out.println(number + " is equal to zero.");
        } else {
            System.out.println(number + " is not equal to zero.");
        }
        scanner.close();
    }
}

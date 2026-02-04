//3. Write a program to check whether a number is greater than 10 or not.
package oop.flowcontrol;
import java.util.Scanner;
public class GreaterThanTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        if (number > 10) {
            System.out.println(number + " is greater than 10.");
        } else {
            System.out.println(number + " is not greater than 10.");
        }
        scanner.close();
    }
}

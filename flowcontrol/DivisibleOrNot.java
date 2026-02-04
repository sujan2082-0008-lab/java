//13. Write a program to check whether a number is divisible by both 5 and 11.
package oop.flowcontrol;
import java.util.Scanner;
public class DivisibleOrNot {
    public static void main(String[] args){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        number = scanner.nextInt();
        if(number % 5 == 0 && number % 11 == 0){
            System.out.println(number + " is divisible by both 5 and 11.");
        }
        else{
            System.out.println(number + " is not divisible by both 5 and 11.");
        }
        scanner.close();
    }
}

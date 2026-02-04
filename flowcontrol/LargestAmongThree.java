//11. Write a program to find the largest among three numbers using if–else.
package oop.flowcontrol;
import java.util.Scanner;
public class LargestAmongThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number1, number2, number3;
        System.out.print("Enter first number: ");
        number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        number2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        number3 = scanner.nextInt();

        if(number1 >= number2 && number1 >= number3){
            System.out.println(number1 + " is largest.");
        }
        else if(number2 >= number1 && number2 >= number3){
            System.out.println(number2 + " is largest.");
        }
        else{
            System.out.println(number3 + " is largest.");
        }
        scanner.close();
    }
}

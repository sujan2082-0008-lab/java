//8. Write a program to calculate the factorial of a number.
package oop.loops;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        int numberWhile = number;
        int numberDoWhile = number;
        //using for loop
        int factorialFor = 1;
        System.out.println("\nUsing for loop");
        for(int i=1;i<=number;i++){
            factorialFor = factorialFor * i;
        }
        System.out.println("The factorial of given number is: "+factorialFor);

        //using while loop
        System.out.println("\nUsing while loop");
        int j=1,factorialWhile=1;
        while(j<=numberWhile){
            factorialWhile = factorialWhile * j;
            j++;
        }
        System.out.println("The factorial of given number is: "+factorialWhile);

        //using do while loop
        System.out.println("\nUsing do while loop");
        int k=1,factorialDoWhile=1;
        do{
            factorialDoWhile = factorialDoWhile * k;
            k++;
        }while(k<=numberDoWhile);
        System.out.println("The factorial of given number is: "+factorialDoWhile);
        scanner.close();
    }
}

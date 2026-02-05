//10. Write a program to generate the Fibonacci series up to N terms.
package oop.loops;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the term: ");
        int term = scanner.nextInt();
        //using for
        System.out.println("\nUsing for loop");
        int firstNumFor=0,secondNumFor=1,thirdNumFor;
        System.out.println("Fibonacci Series: ");
        for(int i=1;i<=term;i++){
            System.out.println(firstNumFor);
            thirdNumFor=firstNumFor+secondNumFor;
            firstNumFor=secondNumFor;
            secondNumFor=thirdNumFor;
        }

        //using while
        System.out.println("\nUsing while loop");
        int firstNumWhile = 0, secondNumWhile = 1, thirdNumWhile,k=1;
        System.out.println("Fibonacci Series: ");
        while(k<=term){
            System.out.println(firstNumWhile);
            thirdNumWhile = firstNumWhile + secondNumWhile;
            firstNumWhile = secondNumWhile;
            secondNumWhile = thirdNumWhile;
            k++;
        }

        //using do while
        System.out.println("\nUsing do while loop");
        int firstNumDoWhile = 0, secondNumDoWhile = 1, thirdNumDoWhile,j=1;
        System.out.println("Fibonacci Series: ");
        do{
            System.out.println(firstNumDoWhile);
            thirdNumDoWhile = firstNumDoWhile + secondNumDoWhile;
            firstNumDoWhile = secondNumDoWhile;
            secondNumDoWhile = thirdNumDoWhile;
            j++;
        }while(j<=term);
        scanner.close();
    }
}

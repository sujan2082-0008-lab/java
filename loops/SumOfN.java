//3. Write a program to calculate the sum of first N natural numbers.
package oop.loops;
import java.util.Scanner;
public class SumOfN {
    public static void main(String[] args){
        int number,j=1,k=1;
        int sumFor=0;
        int sumWhile = 0;
        int sumDoWhile = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the term: ");
        number = scanner.nextInt();

        //for loop
        System.out.println("Using for loop");
        for(int i=1;i<=number;i++){
            sumFor = sumFor + i;
        }
        System.out.println("The sum upto " + number + " is " + sumFor + "\n");

        //while loop
        System.out.println("Using while loop");
        while(j<=number){
            sumWhile = sumWhile + j;
            j++;
        }
        System.out.println("The sum upto " + number + " is " + sumWhile + "\n");

        //do while
        System.out.println("Using do while loop");
        do{
            sumDoWhile = sumDoWhile + k;
            k++;
        }while(k<=number);
        System.out.println("The sum upto " + number + " is " + sumDoWhile);
        scanner.close();
    }
}

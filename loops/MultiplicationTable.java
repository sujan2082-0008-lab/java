//4. Write a program to print the multiplication table of a given number
package oop.loops;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        int i,j=1,k=1;
        Scanner scanner = new Scanner(System.in);
        int number,term;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        System.out.print("Enter the maximum term: ");
        term = scanner.nextInt();
        //using for loop
        System.out.println("\nUsing for loop\n");
        for(i=1;i<=term;i++){
            System.out.println(number + "*" + i + "=" +  number * i);
        }

        //using while loop
        System.out.println("\nUsing while loop\n");
        while(j<=term){
            System.out.println(number + "*" + j + "=" +  number * j);
            j++;
        }

        System.out.println("\nUsing do while loop\n");
        do{
            System.out.println(number + "*" + k + "=" +  number * k);
            k++;
        }while(k<=term);
        scanner.close();
    }

}

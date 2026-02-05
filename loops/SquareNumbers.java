//5. Write a program to print the square of numbers from 1 to 10.
package oop.loops;
public class SquareNumbers {
    public static void main(String[] args){
        final int MAX=10;
        int i,j=1,k=1;

        //using for loop
        System.out.println("\nUsing for loop\n");
        for(i=1;i<=MAX;i++){
            System.out.println("Square of " + i + " = " + i*i);
        }

        //using while loop
        System.out.println("\nUsing while loop\n");
        while(j<=MAX){
            System.out.println("Square of " + j + " = " + j*j);
            j++;
        }

        //using do while loop
        System.out.println("\nUsing do while loop\n");
        do{
            System.out.println("Square of " + k + " = " + k*k);
            k++;
        }while(k<=MAX);
    }
}

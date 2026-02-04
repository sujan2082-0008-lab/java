//1. Write a program to print numbers from 1 to 10 using a for loop
package oop.loops;
public class Numbers {
    public static void main(String[] args) {
        int i, j = 1, k = 1;

        //for loop
        System.out.println("Using for loop");
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //while loop
        System.out.println("Using while loop");
        while(j<=10){
            System.out.println(j);
            j++;
        }

        //do-while loop
        System.out.println("Using do while loop");
        do{
            System.out.println(k);
            k++;
        }while(k<=10);
    }
}

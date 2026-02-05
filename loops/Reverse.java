//7. Write a program to print the reverse of a number using a for loop.
package oop.loops;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        int numberFor,numberWhile,numberDoWhile;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        numberFor = scanner.nextInt();

        //using for loop
        System.out.println("\nUsing for loop");
        int digitFor, reverseFor=0;
        for(;numberFor > 0; numberFor = numberFor/10){
            digitFor = numberFor % 10;
            reverseFor = reverseFor * 10 + digitFor;
        }
        System.out.println("Reverse of the number is "+ reverseFor);

        //using while loop
        System.out.print("Enter a number: ");
        numberWhile = scanner.nextInt();
        System.out.println("\nUsing while loop");
        int j=1,digitWhile,reverseWhile=0;
        while(numberWhile > 0){
            digitWhile = numberWhile%10;
            reverseWhile = reverseWhile * 10 + digitWhile;
            numberWhile = numberWhile/10;
        }
        System.out.println("Reverse of the number is "+reverseWhile);

        //Using do while
        System.out.println("\nUsing do while loop");
        System.out.print("Enter a number: ");
        numberDoWhile = scanner.nextInt();
        int digitDoWhile,reverseDoWhile=0;
        do{
            digitDoWhile = numberDoWhile % 10;
            reverseDoWhile = reverseDoWhile * 10 + digitDoWhile;
            numberDoWhile = numberDoWhile / 10;
        }while(numberDoWhile>0);
        System.out.println("Reverse of the number is "+reverseDoWhile);
        scanner.close();
    }

}

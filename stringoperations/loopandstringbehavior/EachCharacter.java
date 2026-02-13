//1.	Write a program that:
//        •	Takes a string
//•	Prints each character on a new line using a loop
package oop.stringoperations.loopandstringbehavior;
import java.util.Scanner;
public class EachCharacter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your favorite word: ");
        String userInput = scanner.nextLine();
        for(int i = 0;i<userInput.length();i++){
            System.out.println(userInput.charAt(i));
        }
        scanner.close();
    }
}

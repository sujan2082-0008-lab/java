//1.	Write a program that:
//        •	Takes a string input from the user
//•	Prints the length of the string
//•	Converts it to uppercase and lowercase
package oop.stringoperations.userinputandstringoperations;
import java.util.Scanner;
public class LengthOfString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String userInput;
        System.out.println("Enter your favorite word: ");
        userInput = scanner.nextLine();
        System.out.println("The length of the word is: "+userInput.length());
        System.out.println("The word in uppercase: "+userInput.toUpperCase());
        System.out.println("The word in lowercase: "+userInput.toLowerCase());
        scanner.close();
    }
}

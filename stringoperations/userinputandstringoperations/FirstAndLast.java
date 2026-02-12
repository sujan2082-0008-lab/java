//2.	Write a program that accepts a string and:
//        •	Prints the first and last character
//•	Prints the middle character (if length is odd)
package oop.stringoperations.userinputandstringoperations;
import java.util.Scanner;
public class FirstAndLast {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your favorite word: ");
        String userInput = scanner.nextLine();
        System.out.println("The first character is: "+userInput.charAt(0));
        int lengthOfWord = userInput.length();
        if(lengthOfWord % 2 == 1){
            System.out.println("The middle character is: "+userInput.charAt(lengthOfWord/2));
        }
        System.out.println("The last character is: "+userInput.charAt(lengthOfWord-1));
        scanner.close();
    }
}

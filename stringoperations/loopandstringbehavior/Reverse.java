//2.	Write a program to reverse a string using:
//        •	for loop
//•	StringBuilder
package oop.stringoperations.loopandstringbehavior;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your favorite word: ");
        String userInput = scanner.nextLine();
        StringBuilder sb1 = new StringBuilder();
        int lengthOfWord = userInput.length();
        for(int i = lengthOfWord-1;i>=0;i--){
            char temp = userInput.charAt(i);
            sb1.append(temp);
        }
        System.out.println("Reversed: "+sb1);
        scanner.close();
    }

}

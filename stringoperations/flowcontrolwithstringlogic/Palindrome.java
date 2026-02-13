//2.	Write a program to check whether the entered string is a palindrome using:
//        •	if-else
//        •	charAt()
package oop.stringoperations.flowcontrolwithstringlogic;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String userInput = scanner.nextLine();
        int lengthOfWord = userInput.length();
        String newWord = "";
        for(int i=lengthOfWord-1;i>=0;i--){
            char temp = userInput.charAt(i);
            newWord = newWord+temp;
        }
        if(newWord.equals(userInput)){
            System.out.println(userInput+" is palindrome.");
        }
        else{
            System.out.println(userInput+" is not palindrome.");
        }
        scanner.close();
    }
}

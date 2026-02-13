//3.	Take a string from the user and:
//        •	If the string length is less than 5, print "Too short"
//        •	If between 5 and 10, print "Medium"
//        •	Else print "Long string"
package oop.stringoperations.flowcontrolwithstringlogic;
import java.util.Scanner;
public class Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        System.out.print("Enter your favorite word: ");
        userInput = scanner.nextLine();
        int lengthOfWord = userInput.length();
        if(lengthOfWord < 5){
            System.out.println("Too short");
        }
        else if(lengthOfWord <=10){
            System.out.println("Medium");
        }
        else{
            System.out.println("Long String");
        }
        scanner.close();
    }
}

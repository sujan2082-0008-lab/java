//1.	 Write a program that:
//        •	Takes a string input
//•	Checks whether the string is empty or not
//•	If empty → print "Empty String"
//        •	Else → print "Valid String"
package oop.stringoperations.flowcontrolwithstringlogic;
import java.util.Scanner;
public class EmptyOrNot {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your favorite word: ");
    String userInput = scanner.nextLine();
    if(userInput.isEmpty()){
        System.out.println("Empty String.");
    }
    else{
        System.out.println("Valid String.");
    }
    scanner.close();
}
}

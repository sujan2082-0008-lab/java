//14. Write a program to check whether a character is uppercase or lowercase.
package oop.flowcontrol;
import java.util.Scanner;
public class UpperOrLowercase {
    public static void main(String[] args){
        char alphabet;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        alphabet = scanner.next().charAt(0);
        boolean result = Character.isUpperCase(alphabet);
        if(result){
            System.out.println(alphabet + " is in uppercase.");
        }
        else{
            System.out.println(alphabet + " is in lowercase.");
        }
        scanner.close();
    }

}

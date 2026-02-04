//9. Write a program to check whether a character is a vowel or consonant.
package oop.flowcontrol;
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char letter;
        System.out.print("Enter an alphabet to check: ");
        letter = scanner.next().charAt(0);
        letter = Character.toLowerCase(letter);
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            System.out.println(letter + " is vowel.");
        }
        else{
            System.out.println(letter + " is consonant.");
        }
        scanner.close();
    }
}

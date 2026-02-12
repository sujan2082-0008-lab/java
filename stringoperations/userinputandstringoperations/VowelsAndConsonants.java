//3.	Take a string from the user and count:
//        •	Number of vowels
//•	Number of consonants
package oop.stringoperations.userinputandstringoperations;
import java.util.Scanner;
public class VowelsAndConsonants {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your favorite word: ");
        String userInput = scanner.nextLine();
        userInput = userInput.toLowerCase();
        int countVowel=0, countConsonant=0;
        int lengthOfWord = userInput.length();
        for(int i = 0; i < userInput.length(); i++) {
            char ch = userInput.charAt(i);
            if(Character.isLetter(ch)) {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    countVowel++;
                } else {
                    countConsonant++;
                }
            }
        }
        System.out.println("There are "+countVowel+" vowels in the word.");
        System.out.println("There are "+countConsonant+" consonants in the word.");
        scanner.close();
    }
}

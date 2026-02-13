//3.	Count how many times a specific character appears in a string.
package oop.stringoperations.loopandstringbehavior;
import java.util.Scanner;
public class FindHowManyTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        System.out.print("Enter the character to count: ");
        char target = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("Character '" + target + "' appears " + count + " times.");
        scanner.close();
    }
}
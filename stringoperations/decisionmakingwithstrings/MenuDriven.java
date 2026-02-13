//1.	Take username and password as input:
//        •	If username is "admin" and password is "1234" → print "Login Successful"
//        •	Else → print "Invalid Credentials"
//Write a menu-driven program:
//        1. Convert to Uppercase
//2. Convert to Lowercase
//3. Reverse String
//4. Exit
//Perform the selection operation using switch. Implement using the method and driver class.

package oop.stringoperations.decisionmakingwithstrings;
import java.util.Scanner;
public class MenuDriven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = "admin";
        String password = "1234";

        System.out.print("Enter username: ");
        String tempName = scanner.nextLine();

        System.out.print("Enter password: ");
        String tempPass = scanner.nextLine();

        if (userName.equals(tempName) && password.equals(tempPass)) {

            System.out.println("\nLogin Successful\n");

            int choice;

            do {
                System.out.println(" === Menu ===");
                System.out.println("1. Convert to Uppercase");
                System.out.println("2. Convert to Lowercase");
                System.out.println("3. Reverse a String");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                choice = scanner.nextInt();
                scanner.nextLine(); // clear buffer

                switch (choice) {

                    case 1:
                        new Uppercase().upperCase(scanner);
                        break;

                    case 2:
                        new LowerCase().lowerCase(scanner);
                        break;

                    case 3:
                        new Reverse().reverse(scanner);
                        break;

                    case 4:
                        System.out.println("Exiting program...");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

                if (choice != 4) {
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine();
                }

            } while (choice != 4);

        } else {
            System.out.println("Invalid Credentials.");
        }

        scanner.close();
    }
}

class Uppercase {

    void upperCase(Scanner scanner) {
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        System.out.println("Uppercase: " + userInput.toUpperCase());
    }
}

class LowerCase {

    void lowerCase(Scanner scanner) {
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        System.out.println("Lowercase: " + userInput.toLowerCase());
    }
}

class Reverse {

    void reverse(Scanner scanner) {
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        StringBuilder sb = new StringBuilder(userInput);
        System.out.println("Reversed: " + sb.reverse());
    }
}

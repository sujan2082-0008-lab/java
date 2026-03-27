package oop.others;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class MenuDriven {

    static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {

            System.out.println("Please enter 1 for Sign up.");
            System.out.println("Please enter 2 for Quit.");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                signup(sc);
            }

            else if (choice == 2) {
                System.out.println("Thank you for using the Application.");
                break;
            }

            else {
                System.out.println("Invalid Input");
            }
        }
    }

    public static void signup(Scanner sc) {

        String name, mobile, password, confirm, dob;

        // Full Name
        while (true) {
            System.out.print("Please enter your full name: ");
            name = sc.nextLine();

            if (name.length() > 4)
                break;
            else
                System.out.println("Full name must be more than 4 characters. Please start again.");
        }

        // Mobile Number
        while (true) {
            System.out.print("Please enter your mobile number (username): ");
            mobile = sc.nextLine();

            if (mobile.matches("0\\d{9}"))
                break;
            else
                System.out.println("Mobile number must have 10 digits starting with 0. Please start again.");
        }

        // Password
        while (true) {
            System.out.print("Please enter your password: ");
            password = sc.nextLine();

            if (password.matches("[A-Za-z]+[@&][0-9]+"))
                break;
            else
                System.out.println("Password must start with letters then @ or & and end with numbers.");
        }

        // Confirm Password
        while (true) {
            System.out.print("Please confirm your password: ");
            confirm = sc.nextLine();

            if (confirm.equals(password))
                break;
            else
                System.out.println("Your passwords do not match. Please start again.");
        }

        // Date of Birth
        while (true) {
            System.out.print("Please enter your Date of Birth #DD/MM/YYYY (No space): ");
            dob = sc.nextLine();

            if (!dob.matches("\\d{2}/\\d{2}/\\d{4}")) {
                System.out.println("You have entered the Date of Birth in invalid format.");
                continue;
            }

            String[] parts = dob.split("/");
            int year = Integer.parseInt(parts[2]);

            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            int age = currentYear - year;

            if (age >= 21)
                break;
            else
                System.out.println("You must be at least 21 years old.");
        }

        User u = new User(name, mobile, password, dob);
        users.add(u);

        System.out.println("You have successfully signed up.");
    }
}

class User {

    private String name;
    private String mobile;
    private String password;
    private String dob;

    public User(String name, String mobile, String password, String dob) {
        this.name = name;
        this.mobile = mobile;
        this.password = password;
        this.dob = dob;
    }
}
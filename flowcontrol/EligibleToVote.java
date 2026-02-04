//4. Write a program to check whether a person is eligible to vote (age ≥ 18).
package oop.flowcontrol;
import java.util.Scanner;
public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.print("Enter an age: ");
        age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Age " + age + " is allowed to vote.");
        } else {
            System.out.println("Age " + age + " is not allowed to vote.");
        }
        scanner.close();
    }
}

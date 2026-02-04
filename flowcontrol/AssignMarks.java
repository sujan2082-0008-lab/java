//12. Write a program to assign grade based on marks:
//        a. ≥ 90 → A
//        b. ≥ 75 → B
//        c. ≥ 60 → C
//        d. < 60 → Fail
package oop.flowcontrol;
import java.util.Scanner;
public class AssignMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();
        Assigner assigner = new Assigner();
        assigner.assign(marks);
        scanner.close();
    }
}

class Assigner {
    void assign(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Please enter marks in the range 0–100.");
            return;
        }
        char grade;

        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 75) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        if (grade == 'F') {
            System.out.println("You have failed.");
        }

        System.out.println("You have achieved grade " + grade + ".");
    }
}

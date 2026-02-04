//7. Write a program to check whether a student has passed or failed (pass marks = 40).
package oop.flowcontrol;
import java.util.Scanner;
public class CheckMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks;
        System.out.print("Enter your marks: ");
        marks = scanner.nextInt();
        if(marks >=40){
            System.out.println("Wow , You got "+marks+". You are passed");
        }
        else{
            System.out.println("You only got "+marks+". You are fail.");
        }
        scanner.close();
    }
}

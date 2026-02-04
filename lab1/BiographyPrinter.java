//The Biography Printer: Write a program that declares variables to store your name
//        (String), age (int), height in meters (double), and whether you are a student (boolean).
//Print a sentence combining these variables (e.g., "My name is Alex, I am 20 years old,
//        1.75m tall, and it is true that I am a student.").
package oop.lab1;
public class BiographyPrinter {
    public static void main(String[] args){
        String name = "Sujan Dangol";
        int age = 17;
        double height = 8.54;
        boolean isStudent = true;

        System.out.println("My name is "+ name+ ", I am "+age+" years old, "+height+"m tall, and it is "+isStudent+" that I am a student.");
    }
}

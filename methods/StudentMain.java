package oop.methods;

import java.util.Scanner;
class PersonX{
    String name;
    int age;

    PersonX(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayPerson(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }
}

class StudentX extends PersonX{
    int marks;
    StudentX(String name, int age, int marks){
        super(name,age);
        this.marks=marks;
    }

    char grade;
    void calculateGrade(){
        if(this.marks >=80 ){
            grade = 'A';
        }
        else if(this.marks >= 60){
            grade = 'B';
        }
        else if(this.marks >= 40){
            grade = 'C';
        }
        else{
            grade = 'F';
        }
        System.out.println(this.name +" has got "+grade+" grade.");
    }

    void displayStudent(){
        super.displayPerson();
        System.out.println("Marks: "+this.marks);
        calculateGrade();
    }
}

public class StudentMain{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your marks: ");
        int marks = scanner.nextInt();
        StudentX student = new StudentX(name,age,marks);
        student.displayStudent();
        scanner.close();
    }
}

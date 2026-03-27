package oop.methods;

public class Persona {
    protected String name = "Ram";
}

class Teacher extends Persona {
    private String subject = "OOP";

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

class StudentA extends Persona {
    private String course = "BCS";

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        StudentA student = new StudentA();

        teacher.display();
        student.display();
    }
}
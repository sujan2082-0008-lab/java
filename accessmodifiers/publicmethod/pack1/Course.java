package oop.accessmodifiers.publicmethod.pack1;

public class Course {
    String courseName;
    int courseDuration = 5;
    void showCourse(){
        courseName = "OOP";
        System.out.println("Course name: "+courseName);
        System.out.println("Course duration: "+courseDuration+" weeks.");
    }

}

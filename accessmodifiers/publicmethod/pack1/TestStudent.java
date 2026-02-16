package oop.accessmodifiers.publicmethod.pack1;

public class TestStudent {
    public static void main(String[] args){
        Student student = new Student();
        student.name = "Sujan";
        student.displayName(student.name);
    }
}

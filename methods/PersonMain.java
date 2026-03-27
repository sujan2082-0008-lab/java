package oop.methods;

class PersonZ{
    private String name;

    PersonZ(String name){
        this.name = name;
    }

    void display(){
        System.out.println("Name: "+name);
    }
}

class StudentZ extends PersonZ{
    private int rollNumber;

    StudentZ(String name, int rollNumber){
        super(name);
        this.rollNumber = rollNumber;
    }

    void displayStudent(){
        super.display();
        System.out.println("Roll number: "+this.rollNumber);
    }
}

public class PersonMain{
    public static void main(String[] args){
        StudentZ sz = new StudentZ("Sujan Dangol",12);
        sz.displayStudent();
    }
}

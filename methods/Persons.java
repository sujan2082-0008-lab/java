package oop.methods;
import java.util.Scanner;
public class Persons {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void displayPersonDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Persons{
    private int rollNumber;

    public int getRollNumber(){
        return rollNumber;
    }

    public void setRollNumber(int rollNumber){
        this.rollNumber=rollNumber;
    }

    public void displayStudentDetails(){
        System.out.println("Roll number:" +rollNumber);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String userName = scanner.nextLine();
        System.out.println("Enter age: ");
        int userAge = scanner.nextInt();
        System.out.println("Enter roll number: ");
        int userRoll = scanner.nextInt();


        Student st = new Student();
        st.setRollNumber(userRoll);
        st.setName(userName);
        st.setAge(userAge);

        st.displayPersonDetails();
        st.displayStudentDetails();
    }

}

//Write a Java program that declares and initializes variables of the following data types:
//int,  String, boolean, and double. Print each variable on a new line along with an appropriate message
//describing its data type.

package oop.others;

public class Variable {
    public static void main(String[] args){
        int number = 10;
        String name = "Sujan";
        boolean isBoy = true;
        double gpa = 2.54;

        System.out.println("Integer data type = "+ number);
        System.out.println("String data type = "+ name);
        System.out.println("Boolean data type = "+ isBoy);
        System.out.println("Double data type = "+ gpa);
    }
}

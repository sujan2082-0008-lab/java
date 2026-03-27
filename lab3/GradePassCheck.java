//Grade Pass Check: Declare a variable marks. Print true if the marks are greater than or
//equal to 40, and false otherwise.
package oop.lab3;
public class GradePassCheck {
    public static void main(String[] args){
        int marks = 20;
        boolean result = marks>=40;
        if(result){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

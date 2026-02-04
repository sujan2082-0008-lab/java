//Odd or Even Validator: Initialize an integer variable number. Write a program that
//prints true if the number is even, and false if it is odd. Hint: Use the modulo operator
//number % 2 == 0.
package oop.lab3;
public class OddOrEven {
    public static void main(String[] args){
        int number = 56;
        if(number % 2 == 0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }

}

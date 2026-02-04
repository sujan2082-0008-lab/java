//The Range Finder: Write a program to check if a given number n is strictly between 10
//and 20. Initialize n with a value (e.g., 15) and print the result of the logic: (n > 10) && (n
//        < 20).
package oop.lab4;

public class RangeFinder {
    public static void main(String[] args){
        int number = 15;
        if(number>10 && number<20){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
    }
}

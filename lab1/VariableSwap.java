//Variable Swapping: Write a program that initializes two integer variables, a = 10 and b
//        = 20. Swap their values with declaring a third variable (or using a temporary variable if
//        that logic is too advanced yet) and print the results before and after the swap.
package oop.lab1;
public class VariableSwap {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int temp;

        System.out.println("Before Swapping: a= "+a+" b= "+b);


        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping: a= "+a+" b= "+b);
    }
}

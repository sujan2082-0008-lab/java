//Complex Logic Verification: Given three variables a = 5, b = 10, c = 15: Print the result
//        (true/false) of the following expression: ((a < b) && (b < c)) || (a == 5)
package oop.lab4;

public class ComplexLogicVerification {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        boolean result = ((a < b) && (b < c)) || (a == 5);

        System.out.println(result);
    }
}

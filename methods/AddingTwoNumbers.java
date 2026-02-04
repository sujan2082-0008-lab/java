package oop.methods;
import java.util.Scanner;
public class AddingTwoNumbers {
    public static void main(String[] args){
        int number1,number2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        number2 = scanner.nextInt();
        Sum sum = new Sum();
        sum.sumOfTwoNumbers(number1,number2);
        scanner.close();
    }
}

class Sum{
    void sumOfTwoNumbers(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
    }
}
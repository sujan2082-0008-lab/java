//15. Write a program to check whether a number is multiple of 3 or 7.
package oop.flowcontrol;
import java.util.Scanner;
public class MultipleOfThreeOrSeven {
    public static void main(String[] args){
        int number;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        if(number % 3 == 0 || number % 7 == 0){
            System.out.println(number + " is multiple of 3 or 7.");
        }
        else{
            System.out.println(number + " is not multiple of both 3 or 7.");
        }
    }
}

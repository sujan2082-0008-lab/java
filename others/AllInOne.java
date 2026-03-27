package oop.others;
import java.util.Scanner;

public class AllInOne {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int fact = 1;
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            for(int i=1;i<=number;i++){
                fact=fact*i;
            }
            System.out.println(fact);
            scanner.close();
        }
    }


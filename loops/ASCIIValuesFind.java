//9. Write a program to display all ASCII values of characters A to Z.
package oop.loops;
public class ASCIIValuesFind {
    public static void main(String[] args) {

        // using for loop
        System.out.println("\nUsing for loop");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + " -> " + (int) ch);
        }

        // using while loop
        System.out.println("\nUsing while loop");
        char ch1 = 'A';
        while (ch1 <= 'Z') {
            System.out.println(ch1 + " -> " + (int) ch1);
            ch1++;
        }

        // using do-while loop
        System.out.println("\nUsing do while loop");
        char ch2 = 'A';
        do {
            System.out.println(ch2 + " -> " + (int) ch2);
            ch2++;
        } while (ch2 <= 'Z');
    }
}

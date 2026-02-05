//9. Write a program to display all ASCII values of characters A to Z.
package oop.loops;
public class ASCIIValues {
    public static void main(String[] args){
        char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        //using for loop
        System.out.println("\nUsing for loop");
        for(int i = 0;i<26;i++){
            int a = alphabets[i];
            System.out.println(alphabets[i] + " -> " + a);
        }

        //using while loop
        System.out.println("\nUsing while loop");
        int j=0;
        while(j<26){
            int b = alphabets[j];
            System.out.println(alphabets[j] + " -> "+b);
            j++;
        }

        //using do while loop
        System.out.println("\nUsing do while loop");
        int k=0;
        do{
            int c = alphabets[k];
            System.out.println(alphabets[k] + " -> "+c);
            k++;
        }while(k<26);
    }
}

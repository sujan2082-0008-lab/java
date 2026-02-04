//2. Write a program to print even numbers between 1 and 50.
package oop.loops;
public class EvenNumbers {
    public static void main(String[] args){
        int j=1,k=1;
        //for loop
        System.out.println("Using for loop");
        for(int i=1;i<=50;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        //while loop
        System.out.println("Using while loop");
        while(j<=50){
            if(j%2==0){
                System.out.println(j);
            }
            j++;
        }

        //do while
        System.out.println("Using do while loop");
        do{
            if(k%2==0){
                System.out.println(k);
            }
            k++;
        }while(k<=50);
    }
}

//6. Write a program to count how many numbers between 1 and 100 are divisible by 5.
package oop.loops;
public class Count {
    public static void main(String[] args){
        int j=1,k=1;
        int countFor = 0;
        int countWhile = 0;
        int countDoWhile = 0;

        //using for loop
        System.out.println("\nUsing for loop\n");
        System.out.println("Numbers divisible by 5 between 1 and 100 are: ");
        for(int i=1;i<=100;i++){
            if(i%5==0){
                System.out.print(i + "\t");
                countFor ++;
            }
        }
        System.out.println("\nExactly "+countFor+" numbers are divisible by 5 between 1 and 100.");

        //using while loop
        System.out.println("\nUsing while loop\n");
        System.out.println("Numbers divisible by 5 between 1 and 100 are: ");
        while(j<=100){
            if(j%5==0){
                System.out.print(j + "\t");
                countWhile ++;
            }
            j++;
        }
        System.out.println("\nExactly "+countWhile+" numbers are divisible by 5 between 1 and 100.");

        //using do while loop
        System.out.println("\nUsing do while loop\n");
        System.out.println("Numbers divisible by 5 between 1 and 100 are: ");
        do{
            if(k%5==0){
                System.out.print(k + "\t");
                countDoWhile ++;
            }
            k++;
        }while(k<=100);
        System.out.println("\nExactly "+countDoWhile+" numbers are divisible by 5 between 1 and 100.");
    }
}

//    Run the program and display the output.
//    Break down and explain in detail step by step operation.
package oop.others;

public class IncrementDecrement {
    public static void main(String[] args){
        incrementDecrement();
    }

    private static void incrementDecrement() {
        int count = 15;
        int a, b, c, d;
        a = count++;
        b = count;
        c = ++count;
        d = count;

        System.out.println(a + ", " + b + ", " + c + ", " + d);
    }
}

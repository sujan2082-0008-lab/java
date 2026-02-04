//Circle Calculations: Declare a final variable (constant) for PI = 3.14159 and a variable
//for radius = 7.5. Calculate and print the area of the circle.
package oop.lab2;
public class CircleCalculations {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double radius = 7.5;
        double area = PI * radius *radius;

        System.out.println("Area of the circle = " + area);
    }
}

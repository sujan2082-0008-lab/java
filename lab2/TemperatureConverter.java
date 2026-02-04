//Temperature Converter: Write a program that initializes a variable for temperature in
//Celsius (e.g., 25). Convert this value to Fahrenheit using the formula: F = (C ×  9/5) +32.
//Print the result.
package oop.lab2;

public class TemperatureConverter {
    public static void main(String[] args){
        double temperatureInCelcius = 25.43;
        double temperatureInFahrenheit = (temperatureInCelcius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit = "+ temperatureInFahrenheit);
    }
}

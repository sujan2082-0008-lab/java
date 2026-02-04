//Time Converter: Declare an integer variable representing a total number of seconds
//        (e.g., 86400). Use arithmetic and the modulo operator (%) to calculate and print how
//        many hours, minutes, and remaining seconds that represents.
package oop.lab2;
public class TimeConverter {
        public static void main(String[] args){
            int totalSeconds = 86500;
            int hours = totalSeconds / 3600;
            int remainingSeconds = totalSeconds % 3600;
            int minutes = remainingSeconds / 60;
            int seconds = remainingSeconds % 60;

            System.out.println("Hour = " + hours);
            System.out.println("Minutes = " + minutes);
            System.out.println("Remaining seconds: " + seconds);
        }
    }
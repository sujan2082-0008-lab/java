//Weekend Alarm: Declare two boolean variables: isSaturday and isSunday. Create a
//third boolean variable canSleepIn that is true if either isSaturday OR isSunday is true.
//Print the value of canSleepIn.
package oop.lab4;

public class WeekendAlarm {
    public static void main(String[] args){
        boolean isSaturday = true;
        boolean isSunday = false;

        boolean canSleepIn = isSaturday || isSunday;

        System.out.println("Can sleep in: " + canSleepIn);
        }
    }


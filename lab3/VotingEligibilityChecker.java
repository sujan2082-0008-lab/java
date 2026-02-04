//Write a program with an integer variable age. Print the
//result of the expression age >= 18. (The output should simply be true or false).
package oop.lab3;
public class VotingEligibilityChecker {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

}

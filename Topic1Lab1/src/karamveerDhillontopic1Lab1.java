/******************************************
 *  Author : Karamveer Dhillon
 *  Created On : Sat Sep 13 2025
 *  File : karamveerDhillontopic1Lab1.java
 *  Description : This program is a simple game that compares the user's input
 *  to a randomly generated number between 1 and 100.
 ******************************************/
import java.util.Scanner;
public class karamveerDhillontopic1Lab1 {
    public static void main (String[] args) {
        final int secretNumber = (int)(Math.random()*100 +1);
        int userGuess;
        System.out.println("Guess the secret number between 1 and 100:");
        Scanner input = new Scanner(System.in);
        userGuess = input.nextInt();
        int numTries = 1;
        if (userGuess == secretNumber) {
            System.out.println("BINGO!!");
            System.out.println("Number of tries: "  + numTries);
        }
        if (userGuess < secretNumber) {
            System.out.println("too low");
        }
        if (userGuess > secretNumber) {
            System.out.println("too high");
        }
        System.out.println("Guess the secret number between 1 and 100:");
        userGuess = input.nextInt();
        numTries = 2;
        if (userGuess == secretNumber) {
            System.out.println("BINGO!!");
            System.out.println("Number of tries: "  + numTries);
        }
        if (userGuess < secretNumber) {
            System.out.println("too low");
        }
        if (userGuess > secretNumber) {
            System.out.println("too high");
        }
        System.out.println("Guess the secret number between 1 and 100:");
        userGuess = input.nextInt();
        numTries = 3;
        if (userGuess == secretNumber) {
            System.out.println("BINGO!!");
            System.out.println("Number of tries: "  + numTries);
        }
        if (userGuess < secretNumber) {
            System.out.println("too low");
        }
        if (userGuess > secretNumber) {
            System.out.println("too high");
        }
        System.out.println("Guess the secret number between 1 and 100:");
        userGuess = input.nextInt();
        numTries = 4;
        if (userGuess == secretNumber) {
            System.out.println("BINGO!!");
            System.out.println("Number of tries: "  + numTries);
        }
        if (userGuess < secretNumber) {
            System.out.println("too low");
        }
        if (userGuess > secretNumber) {
            System.out.println("too high");
        }
        System.out.println("Guess the secret number between 1 and 100:");
        userGuess = input.nextInt();
        numTries = 5;
        if (userGuess == secretNumber) {
            System.out.println("BINGO!!");
            System.out.println("Number of tries: "  + numTries);

        }
        if (userGuess < secretNumber) {
            System.out.println("too low");
        }
        if (userGuess > secretNumber) {
            System.out.println("too high");
        }
    }
}
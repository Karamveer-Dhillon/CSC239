/******************************************
 *  Author : Karamveer Dhillon
 *  Created On : Sat Sep 20 2025
 *  File : KaramveerDhillonTopic1Lab2.java
 *  Description : This program asks the user to enter their birth date,
 *  calculates their current age, prints messages based on their age,
 *  and determines if their birth year is a leap year or a common year.
 ******************************************/

import java.time.*;
import java.util.Scanner;

public class KaramveerDhillonTopic1Lab2
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read user input.
        Scanner userInput = new Scanner(System.in);
        // Variables to store birth date components.
        int birthYear, birthMonth, birthDay;

        // ask the user to enter their birth date and validate the input in a loop.
        do
        {
            System.out.println("Please enter your birth year between 1900 and "+LocalDate.now().getYear()+": ");
            birthYear = userInput.nextInt();
        } while (birthYear > LocalDate.now().getYear() || birthYear < 1900);

        do
        {
            System.out.println("Please enter a valid birth month between 1 and 12: ");
            birthMonth = userInput.nextInt();
        } while ((birthMonth > 12 || birthMonth < 1) || birthYear == 2025 && birthMonth > LocalDate.now().getMonthValue());

        do
        {
            System.out.println("Please enter a valid birth date between 1 and 31: ");
            birthDay = userInput.nextInt();
        } while (birthDay > 31 || birthDay < 1);

        // Close the scanner.
        userInput.close();

        // Calculate the current age.
        int currentAge = Period.between(LocalDate.of(birthYear, birthMonth, birthDay), LocalDate.now()).getYears();

        // Print the current age.
        System.out.println("Current age: " + currentAge + " years");

        // Print messages based on the current age.
        if (currentAge >= 21)
        {
            System.out.println("You are old enough to gamble at a casino");
        }
        else if (currentAge >= 18)
        {
            System.out.println("You are old enough to be treated as an adult");
        }
        else if (currentAge >= 16)
        {
            System.out.println("You are old enough to know better");
        }

        // Determine if the birth year is a leap year or a common year.
        boolean leapYear = (birthYear % 4 == 0 && birthYear % 100 != 0) || (birthYear % 400 == 0);

        if (leapYear)
        {
            System.out.println("it is a leap year");
        }
        else
        {
            System.out.println("it is a common year");
        }
    }
}
/******************************************
 *  Author : Karamveer Dhillon
 *  Created On : Wed Sep 17 2025
 *  File : karamveerDhillonTopic1ReadingAssignment.java
 *  Description : This program calculates the area of a regular polygon
 *                based on user input for the number of sides and the length
 *                of each side. It validates the input to ensure the number of
 *                sides is greater than 2 and the length of sides is positive.
 ******************************************/
// Importing necessary libraries for user input and mathematical calculations.
import static java.lang.Math.PI;
import static java.lang.Math.tan;

import java.util.Scanner;

// Defining the main class.
public class KaramveerDhillonTopic1ReadingAssignment {

  // Main method where the program execution begins.
  public static void main(String[] args) {
    // Creating a Scanner object to read user input.
    Scanner userInput = new Scanner(System.in);
    // Prompting the user for the number of sides and length of sides.
    System.out.println("Please enter the number of sides in the polygon: ");
    int numSides = userInput.nextInt();
    System.out.println("Please enter the length of sides in the polygon: ");
    double lenSides = userInput.nextDouble();
    // Closing the scanner to prevent resource leaks.
    userInput.close();

    // Validating input and calculating the area of the polygon if valid.
    if (numSides <= 2 || lenSides <= 0) {
      System.out.println("Invalid input");
    } else {
      double areaPolygon =
        (numSides * (lenSides * lenSides)) / (4 * (tan(PI / numSides)));
      // Displaying the calculated area formatted to two decimal places.
      System.out.printf("The area of the polygon is %.2f%n", areaPolygon);
    }
  }
}

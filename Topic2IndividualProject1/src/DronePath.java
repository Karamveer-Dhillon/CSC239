/**
 * Author       : Karamveer Dhillon
 * Created On   : Fri 17-Oct-25
 * File         : DronePath.java
 * Description  : This program tracks the flight path of a drone by recording
 * its longitude, latitude, and altitude at various points. It calculates
 * the distance between the starting and ending points and determines the
 * minimum and maximum altitudes reached during the flight.
 */
// Import necessary libraries
import java.math.*;
import java.util.Scanner;
// Define the main class
public class DronePath {
  // Radius of the earth in kilometers
  final static double Radius = 6371;
 // Method to calculate distance between two points.
  public static double calcDistance(double latitude1,double longitude1,double latitude2,double longitude2) {
    double lat1 = Math.toRadians(latitude1);
    double lat2 = Math.toRadians(latitude2);
    double lon1 = Math.toRadians(longitude1);
    double lon2 = Math.toRadians(longitude2);

    return (Radius * Math.acos(Math.sin(lat1)*Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon2-lon1)));
  }
  // Method to find minimum altitude
  public static double findMinAltitude(double[][] points, int count) {
    double min = points[0][2];
    for (int i = 1; i < count; i++) {
      if (points[i][2] < min) min = points[i][2];
    }
    return min;
  }

  // Method to find maximum altitude
  public static double findMaxAltitude(double[][] points, int count) {
    double max = points[0][2];
    for (int i = 1; i < count; i++) {
      if (points[i][2] > max) max = points[i][2];
    }
    return max;
    }
  // Main method
  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  // 2D Array to store the data
  double [][] points = new double[50][3];
  // Counter for number of points entered
  int count = 0;
  // Welcome message
  System.out.println("*** White Mountains Drone Tracker ***");
  System.out.println("PLease enter up to 50 points (longitude, latitude, altitude).");
  // Sentinel value to stop input
  System.out.println("Enter -999 at any prompt to stop entering data.\n");

  // Loop to get user input
  while (count < 50) {

    System.out.print("How many points would you like to enter (1 or more)? (-999 to quit): ");
    // Get number of points to enter
    int numPoints = input.nextInt();
    if (numPoints == -999) break;
    // Validate number of points
    if (numPoints <= 0) {
      System.out.println("Please enter a positive number of points.");
      continue;
    }
    // Ensure the number of points does not exceed the limit
    for (int i = 0; i < numPoints && count < 50; i++) {
      System.out.print("Longitude (degrees): ");
      double lon = input.nextDouble();
      // Check for sentinel value
      if (lon == -999) {
        System.out.println("Data entry stopped");
        break;
      }

      // Get latitude
      System.out.print("Latitude (degrees): ");
      double lat = input.nextDouble();

      if (lat == -999) {
        System.out.println("Data entry stopped");
        break;
      }
      // Get altitude
      System.out.print("Altitude (meters): ");
      double alt = input.nextDouble();

      if (alt == -999) {
        System.out.println("Data entry stopped");
        break;
      }
      // Store the points in the array
      points[count][0] = lon;
      points[count][1] = lat;
      points[count][2] = alt;
      // Increment the count
      count++;
      // Confirm addition
      System.out.println( count + " Coordinates added!!");
    }
    // Check if maximum points reached
    if (count >= 50) {
      System.out.println("You've reached the 50-point limit");
    }
  }
  // Calculate distance, min and max altitudes
  double distance = calcDistance(points[0][1], points[0][0], points[count - 1][1], points[count - 1][0]);
  double minAlt = findMinAltitude(points, count);
  double maxAlt = findMaxAltitude(points, count);
  double rangeAlt = maxAlt - minAlt;

  // Display summary

  System.out.println("\n*** Drone Flight Summary ***");
  System.out.printf("Total Points Recorded: %d%n", count);
  System.out.printf("Distance from Start to End: %.3f km%n", distance);
  System.out.printf("Minimum Altitude: %.2f m%n", minAlt);
  System.out.printf("Maximum Altitude: %.2f m%n", maxAlt);
  System.out.printf("Altitude Range: %.2f m%n", rangeAlt);

  input.close();
  }
}

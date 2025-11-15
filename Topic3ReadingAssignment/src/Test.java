/**
 * Author : Karamveer Dhillon
 * Created On : 10/16/25
 * File : Test.java
 * Description : This program tests the Polygon class by creating two Polygon objects
 * and displaying their area, perimeter, and string representation.
 */

public class Test {
    public static void main(String[] args) {
        // Create a Polygon object with 5 sides, each of length 10
        Polygon p1 = new Polygon(5, 10);
        // Display the area, perimeter, and string representation of the polygon
        System.out.println("Area of Polygon: " + p1.area());
        System.out.println("Perimeter of Polygon: " + p1.perimeter());
        System.out.println(p1.toString());

        // Create a Polygon object using the default constructor
        Polygon p2 = new Polygon();

        // Set the number of sides and side length for the second polygon
        p2.setNumberSides(4);
        p2.setSideLength(5);
        // Display the area, perimeter, and string representation of the second polygon
        System.out.println("Area of Polygon: " + p2.area());
        System.out.println("Perimeter of Polygon: " + p2.perimeter());
        System.out.println(p2.toString());

    }

}
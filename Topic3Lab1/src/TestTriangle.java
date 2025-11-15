/**
 * Author : Karamveer Dhillon
 * Created On : 10/11/25
 * File : TestTriangle.java
 * Description : This program tests the Triangle class by creating instances 
 * and displaying their properties.
 */

public class TestTriangle {
    public static void main(String[] args) {
        // Create Triangle objects
        Triangle myTriangle1 = new Triangle();
        Triangle myTriangle2 = new Triangle(2,4);
        Triangle myTriangle3 = new Triangle(-4,2);
        // Create an array to hold Triangle objects
        Triangle[] myTriangleArray = new Triangle[3];
        myTriangleArray[0] = myTriangle1;
        myTriangleArray[1] = myTriangle2;
        myTriangleArray[2] = myTriangle3;
        // Display properties of each triangle
        System.out.println("Triangle 1: " + myTriangle1.toString());
        System.out.println("Triangle 2: " + myTriangle2.toString());
        System.out.println("Triangle 3: " + myTriangle3.toString());

        // Display areas of each triangle
        System.out.println("Triangle 1 area: " + myTriangle1.area());
        System.out.println("Triangle 2 area: " + myTriangle2.area());
        System.out.println("Triangle 3 area: " + myTriangle3.area());

    }
}
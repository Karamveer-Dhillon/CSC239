/**
 * Author : Karamveer Dhillon
 * Created On : 10/25/25
 * File : TestTransportation.java
 * Description : This program tests the Transportation, Car and Bicycle classes
 * and demonstrates the methods implemented.
 */

public class TestTransportation {

    // Print method
    public static void printTransportation(Transportation t) {
        System.out.println(t.toString());
    }

    public static void main(String[] args) {

        // Array of objects
        Transportation[] tArray = new Transportation[5];

        tArray[0] = new Car("BMW","M5",2025,5000);
        tArray[1] = new Car("Audi","A7",2023,10000);
        tArray[2] = new Bicycle("Trek","Rail+",2022);
        tArray[3] = new Bicycle("Trek","Fuel+",2019);
        tArray[4] = new Bicycle("Bianchi","Oltre",2021);

        // Demonstration of methods
        System.out.println(tArray[0].goForward());
        System.out.println(tArray[1].goReverse());
        System.out.println(tArray[1].Start());
        System.out.println(tArray[1].Stop());
        tArray[1].goFaster();
        tArray[1].goFaster();
        tArray[1].goSlower();
        System.out.println(tArray[4].turnLeft());
        System.out.println(tArray[4].turnRight());

        // Demonstration of print method
        printTransportation(tArray[0]);
        printTransportation(tArray[1]);
        printTransportation(tArray[2]);
        printTransportation(tArray[3]);
        printTransportation(tArray[4]);
    }
}
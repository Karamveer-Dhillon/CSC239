/**
 * Author : Karamveer Dhillon
 * Created On : 10/25/25
 * File : Main.java
 * Description : This class tests the ReadingMaterial and its child classes.
 */

public class Main {
    // Method to print ReadingMaterial objects
    public static void printReadingMaterial(ReadingMaterial rm) {
        System.out.println(rm.toString());
    }

    public static void main(String[] args) {
        // Creating objects
        ReadingMaterial r1 = new ReadingMaterial("digital");
        Newspaper n1 = new Newspaper("print",15);
        Book b1 = new Book("print",250,"softcover");

        // printing the created objects
        printReadingMaterial(r1);
        printReadingMaterial(n1);
        printReadingMaterial(b1);
    }
}
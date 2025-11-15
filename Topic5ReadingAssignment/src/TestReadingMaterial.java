import java.io.*;

/**
 * Author : Karamveer Dhillon
 * Created On : 10/25/25
 * File : TestReadingMaterial.java
 * Description : This class demonstrates exception handling and file I/O with ReadingMaterial classes.
 */

public class TestReadingMaterial {
    public static void main(String[] args) {
        FileWriter writer = null;
        BufferedReader reader = null;

        try {
            // Create file writer
            writer = new FileWriter("KaramveerDhillon.txt");

            // Create objects and write to file
            ReadingMaterial r1 = new ReadingMaterial("digital");
            writer.write(r1.toString());

            Newspaper n1 = new Newspaper("print", 15);
            writer.write(n1.toString());

            Book b1 = new Book("print", 250, "softcover");
            writer.write(b1.toString());

            System.out.println("objects written to file successfully.\n");

            // Attempt to create an invalid Book with 0 pages
            try {
                Book b2 = new Book("print", 0, "hardcover");
            } catch (IllegalNumPagesException e) {
                System.out.println("Caught exception: " + e.getMessage());
                System.out.println("Illegal number of pages: " + e.getNumPages() + "\n");
            }

            // Attempt to create an invalid Newspaper with negative pages
            try {
                Newspaper invalidNewspaper = new Newspaper("digital", -5);
            } catch (IllegalNumPagesException e) {
                System.out.println("Caught exception: " + e.getMessage());
                System.out.println("Illegal number of pages: " + e.getNumPages() + "\n");
            }

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            // Close the writer
            try {
                if (writer != null) {
                    writer.close();
                    System.out.println("File closed successfully.\n");
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }

        // Read the file back to console
        try {
            reader = new BufferedReader(new FileReader("KaramveerDhillon.txt"));
            System.out.println("Reading file contents:\n");

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            // Close the reader
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("\nFile reader closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error closing reader: " + e.getMessage());
            }
        }
    }
}

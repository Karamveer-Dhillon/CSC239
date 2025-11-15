/**
 * Author : Karamveer Dhillon
 * Created On : 10/18/25
 * File : TestBook.java
 * Description : This class tests the Book and Chapter classes
 * by creating instances and displaying their attributes.
 */
import java.util.Arrays;

public class TestBook {

    public static void main(String[] args) {
      // Create Chapter instances
      Chapter chapter1 = new Chapter("Introduction",5);
      Chapter chapter2 = new Chapter("Chapter 1",10);
      Chapter chapter3 = new Chapter("Chapter 2",15);
      // Create an array of chapters
      Chapter[] chapters = {chapter1,chapter2,chapter3};
      // Create Book instances
      Book myBook1 = new Book();
      Book myBook2 = new Book("Random Author","Random Book",2025,chapters);

      myBook1.setAuthor("Test Author");
      myBook1.setTitle("Test Book");
      myBook1.setYear(2025);
      myBook1.setChapter(chapter1,0);
      // Display Book details
      System.out.println("Custom Book Details:");
      System.out.println("Author: " + myBook2.getAuthor());
      System.out.println("Title: " + myBook2.getTitle());
      System.out.println("Year: " + myBook2.getYear());
      System.out.println("Chapters: " + Arrays.toString(myBook2.getChapter()));
      System.out.println("Chapter 2 Title: " + chapter2.getTitle());
      System.out.println("Chapter 2 Number of Pages: " + chapter2.getNumPages());
      // Display default Book details
      System.out.println("\nDefault Book Details:");
      System.out.println("Author: " + myBook1.getAuthor());
      System.out.println("Title: " + myBook1.getTitle());
      System.out.println("Year: " + myBook1.getYear());
      System.out.println("Chapters: " + myBook1.getChapter(1));
      // Display Chapter 1 details
      System.out.println("Chapter 1 Title: " + chapter1.getTitle());
      System.out.println("Chapter 1 Number of Pages: " + chapter1.getNumPages());

    }
}
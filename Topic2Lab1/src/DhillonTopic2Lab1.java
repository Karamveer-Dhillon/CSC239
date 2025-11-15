/******************************************
 *  Author : Karamveer Dhillon
 *  Created On : Mon Sep 29 2025
 *  File : DhillonTopic2Lab1.java
 *  Description : This program uses arrays and methods to manage a simple library inventory system.
 *  It allows adding books, removing books, increasing quantities, and displaying all books.
 ******************************************/
import java.util.Scanner;

public class DhillonTopic2Lab1 {
   // Create arrays to store book details
    static String[] titles;
    static String[] authors;
    static double[] prices;
    static int[] quantities;

    // Keep track of how many books are actually stored
    static int bookCount = 0;
    // Maximum capacity of the library
    static int MAX_BOOKS;
    // Scanner for user input
    static Scanner scanner = new Scanner(System.in);

    // Function to add a book
    public static void addBook() {
        // Check if we can add more books
        if (bookCount >= MAX_BOOKS) {
            System.out.println("Inventory full.Cannot add more books.\n");
            return;
        }
        // Input book details
        System.out.print("Enter book title: ");
        titles[bookCount] = scanner.nextLine();
        // Check for duplicate titles
        int index = findBookIndex(titles[bookCount]);
        if (index != -1) {
            // if found, just increase quantity
            System.out.print("Book already exists. Enter additional quantity: ");
            int extra = scanner.nextInt();
            scanner.nextLine();
            quantities[index] += extra;
            System.out.println("Quantity updated. New total: " + quantities[index] + "\n");
            return; // Don’t add a new entry
        }
        System.out.print("Enter author: ");
        authors[bookCount] = scanner.nextLine();

        System.out.print("Enter price: ");
        prices[bookCount] = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        quantities[bookCount] = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        // Increment book count
        bookCount++;
        System.out.println("Book added successfully\n");
    }

    // Function to reduce quantity of a book
    public static void removeBook() {
        System.out.print("Enter the title of the book to remove: ");
        String title = scanner.nextLine();
        int index = findBookIndex(title);
        // If book not found
        if (index == -1) {
            System.out.println("Book not found.\n");
        } else {
            // Reduce quantity by 1
            if (quantities[index] > 1) {
                quantities[index]--;
                System.out.println("One copy removed. Remaining quantity: " + quantities[index] + "\n");
            } else {
                // Shift everything left to remove completely
                for (int i = index; i < bookCount - 1; i++) {
                    titles[i] = titles[i + 1];
                    authors[i] = authors[i + 1];
                    prices[i] = prices[i + 1];
                    quantities[i] = quantities[i + 1];
                }
                // Clear last entry
                titles[bookCount - 1] = null;
                authors[bookCount - 1] = null;
                prices[bookCount - 1] = 0;
                quantities[bookCount - 1] = 0;
                // Decrement book count
                bookCount--;
                System.out.println("Book removed completely.\n");
            }
        }
    }

    // Function to increase quantity of an existing book
    public static void increaseQuantity() {
        System.out.print("Enter the title of the book to increase quantity: ");
        String title = scanner.nextLine();
        int index = findBookIndex(title);
        // If book not found
        if (index == -1) {
            System.out.println("Book not found.\n");
        } else {
            // Input additional quantity
            System.out.print("Enter no. of copies to add: ");
            int extra = scanner.nextInt();
            scanner.nextLine(); // clear buffer
            // Validate and update quantity
            if (extra > 0) {
                quantities[index] += extra;
                System.out.println("Quantity updated. New total: " + quantities[index] + "\n");
            } else {
                // Invalid input
                System.out.println("Invalid number of copies.\n");
            }
        }
    }

    // Function to display all books
    public static void displayBooks() {
        if (bookCount == 0) {
            // No books to display
            System.out.println("No books in the library.\n");
            return;
        }

        System.out.println("\n*** Library Inventory ***");
        for (int i = 0; i < bookCount; i++) {
            // Display book details formatted with alignment.
            System.out.printf("Title: %-20s Author: %-15s Price: $%.2f Quantity: %d\n",
                    titles[i], authors[i], prices[i], quantities[i]);
        }
        // New line for better readability
        System.out.println();
    }

    // function to find book index by title
    public static int findBookIndex(String title) {
        for (int i = 0; i < bookCount; i++) {
            // ignore case while comparing.
            if (titles[i].equalsIgnoreCase(title)) {
                return i;
            }
        }
        // Not found
        return -1;
    }

    // Main method
    public static void main(String[] args) {
        // Input maximum capacity
        System.out.print("Enter maximum number of books this library can hold: ");
        MAX_BOOKS = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        // Create arrays of chosen size
        titles = new String[MAX_BOOKS];
        authors = new String[MAX_BOOKS];
        prices = new double[MAX_BOOKS];
        quantities = new int[MAX_BOOKS];

        int choice;
        do {
            // Display menu
            System.out.println("****** Library Inventory Menu ******");
            System.out.println("1. Add New Book");
            System.out.println("2. Remove Book / Reduce Quantity");
            System.out.println("3. Increase Quantity of Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            // Handle user choice
            switch (choice) {
                case 1 -> addBook();
                case 2 -> removeBook();
                case 3 -> increaseQuantity();
                case 4 -> displayBooks();
                case 5 -> System.out.println("Exiting Library Inventory System. Goodbye!!");
                // Invalid choice
                default -> System.out.println("Invalid choice. Try again.\n");
            }
            // Loop until user chooses to exit. Use sentinel value 5.
        } while (choice != 5);
    }
}

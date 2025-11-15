/******************************************
 *  Author : Karamveer Dhillon
 *  Created On : Mon Oct 06 2025
 *  File : DhillonTopic2ReadingAssignment.java
 *  Description : This program manages user accounts, allowing for user addition and login functionality.
 *  The program checks for unique usernames and tracks login counts.
 ******************************************/
// Import Scanner for user input.
import java.util.Scanner;
// Main class
public class DhillonTopic2ReadingAssignment {
    // Scanner for user input
    static Scanner scanner = new Scanner(System.in);
    // 2D array to store user data
    static String[][] userData;
    // Number of fields per user
    static final int NUM_FIELDS = 5;
    // Maximum number of users
    static int MAX_USERS;
    // Current number of users
    static int numUsers = 0;

    // Method to add a new user
    public static void addUser() {
        // Check if maximum users reached
        if (numUsers >= MAX_USERS) {
            System.out.println("Cannot add more users.\n");
            return;
        }
        // Collect user details
        System.out.print("Enter first name:");
        userData[numUsers][0] = scanner.nextLine();

        System.out.print("Enter last name:");
        userData[numUsers][1] = scanner.nextLine();

        // Check for unique username
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        for (int i = 0; i < numUsers; i++) {
            // Check if username already exists
            if (userData[i][2].equalsIgnoreCase(username)) {
                System.out.println("Username already exists. Try another.");
                return;
            }
        }
        // Store username
        userData[numUsers][2] = username;

        System.out.print("Enter password:");
        userData[numUsers][3] = scanner.nextLine();

        // Initialize login count to 0
        userData[numUsers][4] = "0";

        // Increment user count
        numUsers++;

        // Confirm user addition
        System.out.printf("User '%s' added successfully!%n%n", userData[numUsers - 1][2]);
    }
    // Method for user login
    public static void userLogin() {
        // Prompt for login credentials
        System.out.print("Enter username: ");
        String loginUser = scanner.nextLine();

        System.out.print("Enter password: ");
        String loginPassword = scanner.nextLine();

        // Verify credentials
        for (int i = 0; i < numUsers; i++) {
            // Check if username matches
            if (userData[i][2].equalsIgnoreCase(loginUser)) {
                // Check if password matches
                if (userData[i][3].equals(loginPassword)) {
                    // Successful login
                    int loginCount = Integer.parseInt(userData[i][4]);
                    // Increment login count
                    loginCount++;
                    // Update login count in array
                    userData[i][4] = String.valueOf(loginCount);
                    // Display welcome message
                    System.out.printf("\nWelcome back, %s %s!%nYou have logged in %s times.%n%n",
                            userData[i][0], userData[i][1], userData[i][4]);
                } else {
                    // Incorrect password
                    System.out.println("Incorrect password.\n");
                }
                // Exit after processing the found username
                return;
            }
        }
        // Username not found
        System.out.println("Username not found.\n");
    }
    public static void main(String[] args){
        // Prompt for maximum number of users
        System.out.print("Enter the maximum number of users: ");
        MAX_USERS = scanner.nextInt();
        scanner.nextLine();
        // Initialize user data array
        userData = new String[MAX_USERS][NUM_FIELDS];

        // Menu loop
        int choice;
        // Use a do-while loop to display the menu until the user chooses to exit
        do {
            // Display menu options
            System.out.println("****** User Login ******");
            System.out.println("1. Add new user");
            System.out.println("2. User login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            // Handle user choice
            switch (choice) {
                case 1 -> addUser();
                case 2 -> userLogin();
                case 3 -> System.out.println("Goodbye!!");
                // Invalid choice
                default -> System.out.println("Invalid choice. Try again.\n");
            }
            // Continue until user chooses to exit
        } while (choice != 3);

        // Close the scanner
        scanner.close();
    }
}

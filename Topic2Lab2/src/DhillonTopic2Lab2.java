/**
 * Author: Karamveer Dhillon
 * Created On: 10/7/25
 * File: DhillonTopic2Lab2.java
 * Description: This program creates an array of user-specified size, fills it with random integers
 * between 1 and 100, and prints the array, its sum, minimum, and maximum values.
 */

// Importing the Scanner class for user input
import java.util.Scanner;

public class DhillonTopic2Lab2 {
    // Method to generate a random integer between MIN and MAX.
    public static int RandomInt(final int MIN, final int MAX) {
        return (int) (Math.random()*(MAX-MIN+1)+MIN);
    }
    // Method to fill an array with random integers between MIN and MAX.
    public static void randomizeArray(int[] arr, final int MIN, final int MAX){
        for (int i = 0; i < arr.length; i++){
            arr[i] = RandomInt(MIN,MAX);
        }
    }
    // Method to calculate the sum of elements in an array.
    public static int sumArray(final int [] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
    // Method to find the minimum value in an array.
    public static int minArray(final int [] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    // Method to find the maximum value in an array.
    public static int maxArray(final int [] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    // Method to print the elements of an array.
    public static void printArray(final int[] arr) {
        // used For-Each loop to print the array.
        for (int i: arr) System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args){
        // Prompting the user to enter the size of the array.
        System.out.print("Enter the number of items in the array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        // Closing the scanner.
        scanner.close();

        // Creating an array of the specified size and filling it with random integers.
        int [] myArray = new int[size];
        randomizeArray(myArray, 1, 100);
        //Printing the array.
        System.out.print("Array: ");
        printArray(myArray);

        // Calculating the sum, minimum, and maximum values of the array.
        final int SUM = sumArray(myArray);
        final int MIN = minArray(myArray);
        final int MAX = maxArray(myArray);

        // Printing the results.
        System.out.printf("Sum: %d %n",SUM);
        System.out.printf("Min: %d %n",MIN);
        System.out.printf("Max: %d %n",MAX);

    }
}

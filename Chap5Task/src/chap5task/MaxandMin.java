/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chap5task;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class MaxandMin {
    // Method to handle user input and calling methods to display max and min
    public static void init() {
        Scanner read = new Scanner(System.in);
        String choice;
        double num1, num2, num3;

        do {
            // Taking inputs from the user
            System.out.println("Enter first number: ");
            num1 = read.nextDouble();
            System.out.println("Enter second number: ");
            num2 = read.nextDouble();
            System.out.println("Enter third number: ");
            num3 = read.nextDouble();

            // Call methods to show the maximum and minimum values
            displayMax(num1, num2, num3);
            displayMin(num1, num2, num3);

            System.out.print("\nDo you want to run the program again? (Y/N): ");
            choice = read.next();

        } while (choice.equalsIgnoreCase("Y")); 
        
        read.close();
        System.out.println("Program exited.");
    }

    // Method to calculate and display the maximum of three numbers
    public static void displayMax(double num1, double num2, double num3) {
        double max = Math.max(num1, Math.max(num2, num3)); // Find the maximum
        System.out.println("Maximum: " + max); // Display the maximum
    }

    // Method to calculate and display the minimum of three numbers
    public static void displayMin(double num1, double num2, double num3) {
        double min = Math.min(num1, Math.min(num2, num3)); // Find the minimum
        System.out.println("Minimum: " + min); // Display the minimum
    }
}


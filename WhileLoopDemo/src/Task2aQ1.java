/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Task2aQ1 {
    public static void main(String[] args) {
        
        // Define the correct password
        String password = "SPGoop";
        // Define the maximum number of trials
        int trial = 5, attempt = 0;
        // Variable to track if access is granted
        boolean AccessPass = false;
        
        // Create a scanner object for user input
        Scanner read = new Scanner(System.in);
        
        // Loop to allow multiple attempts
        while (attempt < trial) {
            //Increment the attempt count
            attempt++; 
            
            // Prompt the user to enter the password
            System.out.print("Enter your password (Attempt " + attempt + " of " + trial + "): ");
            String inPassword = read.nextLine();
         
            // Compare the input password with the correct password
            if (inPassword.equals(password)) {
                //Set access to true if passwords match
                AccessPass = true; 
                //Exit the loop
                break; 
            } else {
                //Notify the user of incorrect password
                System.out.println("Incorrect password. Please try again."); 
            }
        }
        //Close the scanner
        read.close(); 
        
        //Display the result based on whether the correct password was entered
        if (AccessPass) {
            System.out.println("Access granted. Welcome!");
        } else {
            System.out.println("Access denied. Exceeded attempts.");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whileloopdemo;

/**
 *
 * @author USER
 */
public class Chap4Task4 {
    public static void main(String[] args){
        
        int power = 0, sum = 0;
        
        //Print numbers from 1 to 10
        System.out.println("Numbers 1-10:");
        for (int i = 1; i <= 10; i++) {
            //Print each number
            System.out.print(i + " ");
        }

        System.out.print("\n\nPower of two Numbers:\n");
        
        //Calculate and print the power of each number and sum the results
        for (int p = 1; p <= 10; p++) {
            //Calculate power of 2
            power = p * p; 
            //Print each power
            System.out.println( + p + " Power of two is: " + power); 
            // Add the power to the sum
            sum += power; 
        }
        
        // Print the sum of the powers
        System.out.println("\nSum of Powers: " + sum);
    }
}
    


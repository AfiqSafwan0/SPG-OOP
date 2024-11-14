/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Task3Q2v2 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        //User enter a number
        System.out.print("Enter a number to calculate its factorial: ");
        int n = read.nextInt();
        long factorial = 1; 
        
        //Iteratively calculate the factorial
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        //Display the result
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}


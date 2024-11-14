/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Task3Q1 {
    public static void main(String[] args){
        
        int added1 = 0, added2 = 1, series, num;
        
        Scanner read = new Scanner(System.in);
        //User enter the limit for the Fibonacci series
        System.out.print("Enter number for Fibonacci Series: ");
        series = read.nextInt();
        
        //Display the first Fibonacci number
        System.out.print("Fibonacci Series up to " + series + ": " + added1);
        
        //Calculate and display the Fibonacci series using a while loop
        while (added2 <= series) {
            System.out.print(", " + added2);
            
            //Calculate the next Fibonacci number
            num = added1 + added2;
            //Update the previous number
            added1 = added2;  
            //Update the current number
            added2 = num;     
        }
        System.out.println();
    }
}
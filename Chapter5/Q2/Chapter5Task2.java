/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter5task2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Chapter5Task2 {
    public void displayresult() {
    
        int integer, even = 0, odd = 0;
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter number of integers: ");
        integer = read.nextInt();  
        read.nextLine();
        
        //Loop through each integer the user inputs
        for (int num = 1; num <= integer; num++) {
            //User enter input for each integer
            System.out.print("Enter integer " + num + ": ");
            int number = read.nextInt();  
            //Check if the number is even or odd, 
            //and increment the appropriate counter
            if(number % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }
        
        //After the loop, print the total counts of even and odd numbers
        System.out.println("\nNumber of even integers: " + even);
        System.out.println("Number of odd integers: " + odd);
    }
}
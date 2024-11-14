/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whileloopdemo;

/**
 *
 * @author USER
 */
public class Chap4Task3 {
    public static void main(String[] args){
        
        int even = 0, odd = 0;
        
        // Print numbers from 1 to 10
        System.out.println("Numbers 1-10:");
        for (int i = 1; i <= 10; i++) {
            // Print each number
            System.out.print(i + " "); 
        }

        // Print even numbers from 1 to 10
        System.out.println("\n\nEven numbers:");
        for (int e = 2; e <= 10; e += 2) {
            // Print each even number
            System.out.print(e + " ");
            even += e;
        }

        // Print odd numbers from 1 to 10
        System.out.println("\n\nOdd numbers:");
        for (int o = 1; o <= 10; o++) {
            // Check if the number is odd
            if (o % 2 != 0) { 
            // Print each odd number
            System.out.print(o + " ");
            odd += o;
        }
    }
        //Display sum of even number
        System.out.print("\n\nSum of Even Number:" + even);
        //Display sum of odd number
        System.out.println("\nSum of Odd Number:" + odd);
    }
}

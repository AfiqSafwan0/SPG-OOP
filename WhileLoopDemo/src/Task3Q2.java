/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Task3Q2 {
    public static void main(String[] args) {
        
        int n = 5;
        //Initialize factorial to 1 (since factorials are multiplicative)
        long factorial = 1;
        
        //Iteratively calculate the factorial
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        //Display the result
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}


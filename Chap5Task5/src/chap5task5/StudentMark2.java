/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chap5task5;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class StudentMark2 {
     public double displaymark2() {
        
        int mark, total = 0;
        double average2;
        Scanner read = new Scanner(System.in);
        System.out.println("student mark2");
        //Loop through each integer the user inputs
       for (int num = 1; num <= 3; num++) {
            // User enters input for each integer
            System.out.print("Enter mark " + num + ": ");
            mark = read.nextInt();
            total += mark; // Accumulate the total of marks
        }

        // Calculate and display the average
        average2 = (double) total / 3;
        System.out.printf("Average mark 2: %.2f\n\n", average2);
        return average2;
    }
}

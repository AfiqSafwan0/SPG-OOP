/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5task3;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Grade {
    
    int A, B, C, D, E, mark;
    Scanner read = new Scanner(System.in);
    
    public void displaymark() {
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter mark " + i + ": ");
            mark = read.nextInt();
            countGrade(mark);
        }
}
    // Method to count grades based on the mark
    private void countGrade(int mark) {
        if (mark >= 80) {
            A++;
        } else if (mark >= 70) {
            B++;
        } else if (mark >= 60) {
            C++;
        } else if (mark >= 50) {
            D++;
        } else {
            E++;
        }
    }

    // Method to display the results
    public void displaygrade() {
        System.out.println("\nOut of 10:");
        System.out.println("Grade A: " + A);
        System.out.println("Grade B: " + B);
        System.out.println("Grade C: " + C);
        System.out.println("Grade D: " + D);
        System.out.println("Grade E: " + E);
    }
}

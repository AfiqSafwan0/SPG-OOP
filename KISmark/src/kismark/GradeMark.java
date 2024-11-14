/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kismark;

/**
 *
 * @author USER
 */
// Import class to read user input
import java.util.Scanner;

public class GradeMark {
       public static void main(String[] args){
           
           int marks = 0;
           Scanner read = new Scanner(System.in);
           
           //User input mark
           System.out.print("Enter marks : ");
           marks = read.nextInt();
           read.close();
           
           // Different output based on user input
           if (marks >= 80){
            System.out.println("Your grade is A");
        } 
           else if (marks >= 65 && marks <= 79) {
            System.out.println("Your grade is B");
        } 
           else if (marks >= 55 && marks <= 64) {
            System.out.println("Your grade is C");
        }
           else {
               System.out.println("You fail");
           }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphicchap8;

/**
 *
 * @author USER
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class tryandcatch {
    public static void main(String[] args) {
        //declare variable
        String totalstudent, choice;
        char grade;
        
        //scanner to read user input
        Scanner read = new Scanner(System.in); 
        boolean cont = true; //for y/n question
         try {
            while (cont) {
                // Declare and initialize variables
                int student, mark, A = 0, B = 0, C = 0, D = 0, F = 0, pass = 0, fail = 0;
                
                // Popup message for user to input the number of students
                totalstudent = JOptionPane.showInputDialog("Enter the number of students: ");
                student = Integer.parseInt(totalstudent);

                // Loop based on user input for how many students
                for (int i = 1; i <= student; i++) {
                    System.out.print("Enter student " + i + " mark: ");
                    mark = read.nextInt();

                    // Validation for mark less than 0
                    while (mark < 0) {
                        JOptionPane.showMessageDialog(null, "Invalid mark! Marks cannot be less than 0.");
                        System.out.print("Please re-enter student " + i + " mark: ");
                        mark = read.nextInt();
                    }

                    // Validation for mark greater than 100
                    while (mark > 100) {
                        JOptionPane.showMessageDialog(null, "Invalid mark! Marks cannot be greater than 100.");
                        System.out.print("Please re-enter student " + i + " mark: ");
                        mark = read.nextInt();
                    }
                    
                    // Calculate grade using 'calc' method
                    grade = calc(mark);

                    // Count the number of each grade
                    switch (grade) {
                        case 'A': A++; break;
                        case 'B': B++; break;
                        case 'C': C++; break;
                        case 'D': D++; break;
                        case 'F': F++; break;
                    }

                    // Check whether student passed or failed
                    if (grade != 'F') {
                        pass++;
                    } else {
                        fail++;
                    }
                } 

                // Display overall grade using 'displayGrade' method
                displayGrade(A, B, C, D, F);
                
                // Show number of students who passed and failed
                JOptionPane.showMessageDialog(null, "Student Pass: " + pass + "\n" + "Student Fail: " + fail);
                
                // Message to instructor based on students' performance
                if (pass > fail) {
                    JOptionPane.showMessageDialog(null, "Bonus to instructor!");
                } else {
                    JOptionPane.showMessageDialog(null, "Keep up the hard work!");
                }

                // For user to choose whether to continue or not
                choice = JOptionPane.showInputDialog("Continue? (y/n)");
                cont = choice.equalsIgnoreCase("y");
            }
        } catch (Exception ae) {
            System.out.println("Please enter corrrect input");
        }
    }

    // Method to calculate grade based on student's mark
    public static char calc(int mark) {
        if (mark >= 80) {
            return 'A';  
        } else if (mark >= 70) {
            return 'B';  
        } else if (mark >= 55) {
            return 'C';  
        } else if (mark >= 40) {
            return 'D';  
        } else {
            return 'F';
        }
    }

    // Method to show number of students with each grade
    public static void displayGrade(int A, int B, int C, int D, int F) {
        JOptionPane.showMessageDialog(null, 
            "Overall Results:\n" + 
            "Students with A: " + A + "\n" + 
            "Students with B: " + B + "\n" + 
            "Students with C: " + C + "\n" +  
            "Students with D: " + D + "\n" +  
            "Students with F: " + F);
    }   
}
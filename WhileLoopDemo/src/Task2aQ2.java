/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Task2aQ2 {
    public static void main(String[] args){
        
        int StudentNum, PassNum = 0, FailNum = 0;
        Scanner read = new Scanner(System.in);
        
        //User enter the number of students
        System.out.print("Enter the number of students: ");
        StudentNum = read.nextInt();
        
        //Loop through each student to input their marks
        for (int student = 1; student <= StudentNum; student++) {
            System.out.print("Enter mark for student " + student + ": ");
            int mark = read.nextInt();
            
            //Determine pass/fail based on the mark
            if (mark >= 40) { //Assuming 40 is the passing mark
                PassNum++;
            } else {
                FailNum++;
            }
        }
        
        //Close the scanner
        read.close();
        
        //Display the results
        System.out.println("\nTotal students: " + StudentNum);
        System.out.println("Number of students who passed: " + PassNum);
        System.out.println("Number of students who failed: " + FailNum);
        
        //Determine if the instructor gets a bonus
        if (PassNum > (StudentNum / 2)) {
            System.out.println("\nMore than 50% students passed the exam.\nBonus to instructor!");
        } else {
            System.out.println("No bonus to instructor.");
        }
    }
}
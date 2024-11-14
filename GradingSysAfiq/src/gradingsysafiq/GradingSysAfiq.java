/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradingsysafiq;

/**
 *
 * @author USER
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class GradingSysAfiq {
    public static void main(String[] args) {
        //declare variable
        String totalstudent, choice;
        char grade;
        
        //scanner to read user input
        Scanner read = new Scanner(System.in); 
        boolean cont = true; //for y/n question

        while (cont) {
            //declare and initialize variable
            int student, mark, A = 0, B = 0, C = 0, D = 0, F = 0, pass = 0, fail = 0;
            
            //popup message for user to input number of student
            totalstudent = JOptionPane.showInputDialog("Enter the number of students: ");
            student = Integer.parseInt(totalstudent);
        
        //loop based on user input for how many students
        for (int i = 1; i <= student; i++) {
                System.out.print("Enter student " + i + " mark: ");
                mark = read.nextInt();
                
                while (mark < 0) { //popup message if user put mark less than 0
                    JOptionPane.showMessageDialog(null, "Invalid mark! Marks cannot be less than 0.");
                    System.out.print("Please re-enter student " + i + " mark: ");
                    mark = read.nextInt(); //user re-enter the valid mark
                }
                
                while (mark > 100) { //popup message if user put mark more than 100
                    JOptionPane.showMessageDialog(null, "Invalid mark! Marks cannot be greater than 100.");
                    System.out.print("Please re-enter student " + i + " mark: ");
                    mark = read.nextInt(); //user re-enter valid mark
                }
                grade = calc(mark); //calculate grade using 'calc' method
            
            switch(grade) { //count the number of grade for each student who get
                case 'A': A++; 
                break;
                case 'B': B++; 
                break;
                case 'C': C++; 
                break;
                case 'D': D++; 
                break;
                case 'F': F++; 
                break;
            }
            //check whether student pass or fail
            if (grade != 'F'){
                pass++;
            }else{
                fail++;
            }
        } 
        displayGrade(A, B, C, D, F); //display overall grade using 'displayGrade' method
            //show number of student pass and fail
            JOptionPane.showMessageDialog(null, "Student Pass: " + pass + "\n" + "Student Fail: " + fail);
            
            //message to instructor based on student pass/fail
            if (pass > fail) {
                JOptionPane.showMessageDialog(null, "Bonus to instructor!");
            } else {
                JOptionPane.showMessageDialog(null, "Keep up the hard work!");
            }
            //for user to choose whether to continue or not
            choice = JOptionPane.showInputDialog("Continue? (y/n)");
            cont = choice.equalsIgnoreCase("y");
        }
    }
    //method to calculate grade based on student's mark
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

    //method to show number of student with their grade
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
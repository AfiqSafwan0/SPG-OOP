/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chap5task5;

/**
 *
 * @author USER
 */
public class HighestAverage {
    public void displayaverage() {
                
        double HighAverage;
        
        StudentMark mark1 = new StudentMark();
        //double average1 = mark1.displaymark();
        
        StudentMark2 mark2 = new StudentMark2();
        //double average2 = mark2.displaymark2();
        
        StudentMark3 mark3 = new StudentMark3();
        //double average3 = mark3.displaymark3();
        
        //Calculate the highest average using Math.max method
        HighAverage = Math.max(mark1.displaymark(), Math.max(mark2.displaymark2(), mark3.displaymark3()));

        //Display the highest average
        System.out.printf("The highest average is: %.2f\n", HighAverage);
        
    }
}

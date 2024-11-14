/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class MainClass {
    public static void main (String args[]){
        GradeBook myGradeBook = new GradeBook();
        myGradeBook.displayMessage();
        
        //Classname + ObjectName = new + Classname
        GradeMarks myGradeMarks = new GradeMarks();
        myGradeMarks.displayMarks();//display method can custom
        
        ClassAge myClassAge = new ClassAge();
        myClassAge.display();
    }
}
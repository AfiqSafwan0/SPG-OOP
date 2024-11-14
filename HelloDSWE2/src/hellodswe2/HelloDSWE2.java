/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hellodswe2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class HelloDSWE2 {

    public static void main(String[] args) {
        
        String name1, name2;
        Scanner read = new Scanner(System.in);
        
        System.out.print("Input your first name: ");
        name1 = read.nextLine();
        
        System.out.print("Input your last name: ");
        name2 = read.nextLine();
        read.close();
        
        System.out.println("\nHello\n" +name1+ " " +name2);
    }
    
}

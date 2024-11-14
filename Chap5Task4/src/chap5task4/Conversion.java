/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chap5task4;

import java.util.Scanner;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Conversion {
    public void displayconverter() {
        
        double convMass, convDist; 
        double amount, mass, distance, currency;
        int choice;
        Scanner read = new Scanner(System.in);
        
        System.out.print("Choose your converter : ");
        choice = read.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Insert Amount in MYR: RM ");
                amount = read.nextInt();
                currency = amount * 3586.2903;
                System.out.printf("\nRM %.2f = %.2f IDR\n", amount, currency);
                break;
                
            case 2:
                System.out.print("Insert Mass in KG: ");
                mass = read.nextInt();
                convMass = mass * 2.20462262;
                System.out.printf("\n%.2f Kg = %.2f lbs\n", mass, convMass);
                break;
              
            case 3:
                System.out.print("Insert Distance in KM : ");
                distance = read.nextInt();
                convDist = distance * 0.621371192;
                System.out.printf("\n%.2f Km = %.2f Miles\n", distance, convDist);
                break;
            
            default:
                System.out.println("Invalid choice");
                break;
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hellodswe2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        
        double convMass, convDist; 
        int amount, mass, distance, currency;
        int choice;
        Scanner read = new Scanner(System.in);
        
        System.out.println("Converter available :");
        System.out.println("1. Currency (MYR - IDR)");
        System.out.println("2. Mass (kg - pound)");
        System.out.println("3. Distance (km - miles)");
        System.out.print("Choose your converter : ");
        choice = read.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("\nInsert Amount in MYR: RM ");
                amount = read.nextInt();
                currency = amount * 2200;
                System.out.println("\nRM " +amount+ " = " +currency+ " IDR");
                break;
                
            case 2:
                System.out.print("\nInsert Mass in KG: ");
                mass = read.nextInt();
                convMass = mass * 2.2;
                System.out.println("\n" +mass+ " KG = " +convMass+ " LBS");
                break;
              
            case 3:
                System.out.print("\nInsert Distance in KM : ");
                distance = read.nextInt();
                convDist = distance * 0.621371;
                System.out.println("\n" +distance+ " KM = " +convDist+ " Miles");
                break;
            
            default:
                System.out.println("Invalid choice");
                break;
        }

    }
}

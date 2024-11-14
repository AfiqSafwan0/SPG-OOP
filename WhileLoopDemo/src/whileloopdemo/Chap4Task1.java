/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whileloopdemo;

/**
 *
 * @author USER
 */
public class Chap4Task1 {
    public static void main(String[] args){
        
        System.out.println("Integer from 1 to 10");
        
       // Using for loop
        System.out.println("\nUsing loop");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
        }

        // Using while loop
        System.out.println("\n\nUsing While");
        int j = 1;
        while (j <= 10) {
            System.out.print(j);
            j++;
        }

        // Using do-while loop
        System.out.println("\n\nUsing Do-While");
        int k = 1;
        do {
            System.out.print(k);
            k++;
        } while (k <= 10);
        System.out.println("");
    }
}
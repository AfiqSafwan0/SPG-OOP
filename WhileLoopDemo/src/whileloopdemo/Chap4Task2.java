/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whileloopdemo;

/**
 *
 * @author USER
 */
public class Chap4Task2 {
    public static void main(String[] args){
        
        int Forsum=0, Whilesum=0, Dowhilesum=0;
        // Using a for loop
        for (int i = 1; i <= 10; i++) {
           Forsum += i;
        }
        System.out.println("Sum of 1 to 10 using for loop: " + Forsum);

        // Using a while loop
        int j = 1;
        while (j <= 10) {
            Whilesum += j;
            j++;
        }
        System.out.println("Sum of 1 to 10 using while loop: " + Whilesum);

        // Using a do-while loop
        int k = 1;
        do {
            Dowhilesum += k;
            k++;
        } while (k <= 10);
        System.out.println("Sum of 1 to 10 using do-while loop: " + Dowhilesum);
    }
}


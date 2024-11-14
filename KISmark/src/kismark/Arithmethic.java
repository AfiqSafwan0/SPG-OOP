/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kismark;

/**
 *
 * @author USER
 */
// Import class to read user input
import java.util.Scanner;

public class Arithmethic {
      
    public static void main(String[] args){
           
           int num1,num2,choice;
           Scanner read = new Scanner(System.in);
           
           // Asks user for input
           System.out.print("1. Addition, +\n" + "2. Subtraction, -\n" + "3. Multiplication, *\n" + "4. Division, /\n" + "5. Modulus, %\n" + "6. Increment of first number, ++\n" + "7. Decrement of first number, --\n"+"Choose the operator u want to use: ");
           choice = read.nextInt();
           
           // User enter desired number
           System.out.print("Enter first number: ");
           num1 = read.nextInt();
           System.out.print("Enter second number: ");
           num2 = read.nextInt();
           read.close();
           
           // Different output based on user input
           switch(choice){
               case 1: System.out.println("Result: " + (num1 + num2)); break;
               case 2: System.out.println("Result: " + (num1 - num2)); break;
               case 3: System.out.println("Result: " + (num1 * num2)); break;
               case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                } break;
               case 5: System.out.println("Result: " + (num1 % num2)); break;
               case 6: System.out.println("Incremented value of first number is " + (++num1) + " and second number is " + (++num2)); break;
               case 7: System.out.println("Decremented value of first number is " + (--num1) + " and secon number is " + (++num2)); break;
               default: System.out.println("Invalid choice."); break;
           }
       }  
}

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
public class PuchaseSys {
    public static void main(String[] args){
        
        int menu = 0;
        int quantity,totalprice,itemPrice = 0;
        Scanner read = new Scanner(System.in);
        
        //System Display the menu and read user input
        System.out.println("Welcome to the Our Shop!");
        System.out.println("Here is the menu:");
        System.out.println("1. Chicken - RM15.00");
        System.out.println("2. Beef - RM10.00");
        System.out.println("3. Fish - RM12.00");
        System.out.println("4. Exit");
        System.out.print("Choose item you want to buy: ");
        menu = read.nextInt();
        
        // number of choice that display different output when user
        //enter the input
        switch(menu){
                case 1: itemPrice = (int) 15.00; break;
                case 2: itemPrice = (int) 10.00; break;
                case 3: itemPrice = (int) 12.00; break;
                case 4: System.out.println("Thank you for shopping with us");
                default: System.out.println("Invalid choice. Please select a valid item.");
                break;
        }
        
        //System ask for the quantity that user need to put
        System.out.print("Enter quantity: ");
        quantity = read.nextInt();
        read.close();

        // Total price is calculated
        totalprice = itemPrice * quantity;
        System.out.println("The total is RM" +totalprice);
    }
    
}

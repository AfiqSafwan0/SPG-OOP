/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kismark;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class DiscountProg {
        public static void main(String[] args){
            
            String itemname;
            int colorcode, quantity;
            double discrate = 0,totalprice,priceperitem,afterdisc;
            Scanner read = new Scanner(System.in);
            
            // Display discount menu and read user input
            System.out.println("1. Red = 10%");
            System.out.println("2. Blue = 20%");
            System.out.println("3. Yellow = 30%");
            System.out.println("4. Green = 40%");
            System.out.println("5. Gold = 50%");
            System.out.print("Choose discount rate from the following color code: ");
            colorcode = read.nextInt();
            
            switch(colorcode) {
                
                case 1: discrate = 0.1; break;
                case 2: discrate = 0.2; break;
                case 3: discrate = 0.3; break;
                case 4: discrate = 0.4; break;
                case 5: discrate = 0.5; break;
                default: System.out.println("Invalid code"); break;
            }
                // Input item details
                read.nextLine();
                System.out.print("Enter the item name: ");
                itemname = read.nextLine();

                System.out.print("Enter the price per item: ");
                priceperitem = read.nextDouble();

                System.out.print("Enter the quantity: ");
                quantity = read.nextInt();
                read.close();

                // Calculate total price, discount, and final price
                totalprice = priceperitem * quantity;
                double discountAmount = totalprice * discrate;
                afterdisc = totalprice - discountAmount;

                // Display results
                System.out.println("\nItem details:");
                System.out.println("Item Name: " + itemname);
                System.out.println("Price per Item: RM" + priceperitem);
                System.out.println("Quantity: " + quantity);
                System.out.println("Total Price: RM" + totalprice);
                System.out.println("Discount Rate: " + (discrate * 100) + "%");
                System.out.println("Discount Amount: RM" + discountAmount);
                System.out.println("Price After Discount: RM" + afterdisc);  
    }
}

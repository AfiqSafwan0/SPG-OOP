/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Task2bQ1 {
    public static void main(String[] args){
        
        String ItemName;
        double TotalSale = 0,Price = 0,ItemNum;
        double Commision, Earning;
        Scanner read = new Scanner(System.in);
        
        //User enter number of item
        System.out.print("Enter number of item: ");
        ItemNum = read.nextInt();
        read.nextLine();
        
        //Loop for user to enter item name and price
        for (int name = 1; name <= ItemNum; name++) {
            System.out.print("Enter name of item " + name + ": ");
            ItemName = read.nextLine();
            
        System.out.print("Enter price for " + ItemName + ": ");
            Price = read.nextInt();
            read.nextLine(); 
            //Price is added to total sale
            TotalSale +=Price;
        

    }
        //Display sale amount
        System.out.println("\nTotal sale is RM" +TotalSale);
        
        //Calculate commision from 5% of sale 
        Commision = TotalSale * 5/100;
        System.out.println("\nYour Commision is RM" +Commision);
        //Calculate total earning
        Earning = 600 + Commision;
        System.out.println("Your earning is RM600 + RM" +Commision+ " = RM" +Earning);
}}

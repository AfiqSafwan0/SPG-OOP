/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whileloopdemo;

/**
 *
 * @author USER
 */
public class DoWhileLoopDemo {
    public static void main(String[] args){
        
        int count = 5;
        System.out.println("Printing Numbers From 10 to 0");
        do{
            System.out.println(count++);
        }
        while(count <= 100);
    }
    
}

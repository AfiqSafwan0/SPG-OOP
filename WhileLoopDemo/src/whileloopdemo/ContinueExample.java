/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whileloopdemo;

/**
 *
 * @author USER
 */
public class ContinueExample {
    public static void main(String[] args){
        
        System.out.println("Numbers 1 - 10");
        for (int i = 1; i <= 10; i++){
            if (i == 5)
                continue; //Skip remaining code in loop when i is 5
            System.out.println(i +"\t");}
            System.out.println("Skip printing 5");
    }
}

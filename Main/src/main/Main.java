/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int mark;
        
        System.out.print("Enter Mark: ");
        mark = Integer.parseInt(stdin.readLine());
    }
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whileloopdemo;

/**
 *
 * @author USER
 */
public class ContinueExampleV2 {
    public static void main(String[] args){
        
        String searchMe = "Fuzzy Wuzzy was a bear. Fuzzy Wuzzy had no hair. Fuzzy Wuzzy wasn’t fuzzy, was he?";
        int max = searchMe.length();
        int numZs = 0;
        int numFs = 0;
        
        for (int i = 0; i<max; i++){ //interested only in z's
            if(searchMe.charAt(i) !='z')
                continue;
            //process z's
            numZs++;}
            
        for (int y = 0; y<max; y++){ //interested only in F's
            if(searchMe.charAt(y) !='F')
                continue;
            //process F's
            numFs++;}
        
        System.out.println(max);
        System.out.println("Found " +numZs+ " z's in the string."); 
        System.out.println("Found " +numFs+ "F's in the string.");
    }}
        
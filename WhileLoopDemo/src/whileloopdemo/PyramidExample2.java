/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whileloopdemo;

/**
 *
 * @author USER
 */
public class PyramidExample2 {
    public static void printPattern(int n) {
        int i, j;

        for (i = 1; i <= n; i++) {
            for (j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = 0; i < n / 2; i++) {
            for (j = 0; j < (n - 3); j++) {
                System.out.print(" ");
            }
            for (j = 0; j < n; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }
}


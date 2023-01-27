/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;

/**
 *
 * @author skolens-7
 */
import java.util.Scanner;
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ievadiet pirmo numuru: ");
        int a = sc.nextInt();
        System.out.print("Ievadiet otro numuru: ");
        int b = sc.nextInt();
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("Koeficients: " + quotient);
        System.out.println("Atlikums: " + remainder);
    }
    
}

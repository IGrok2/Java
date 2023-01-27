/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication53;

/**
 *
 * @author skolens-7
 */
import java.util.Scanner;
public class JavaApplication53 {
    
    /**
     * @param args the command line arguments
     */
    public static final double PI = 3.14159;
    public static void main(String[] args) {
        Scanner dati = new Scanner(System.in);
        System.out.println("Dot man radius: ");
        double radius = dati.nextDouble();
        double area = PI * radius * radius;
        System.out.println("KAUTKO: " +area);
    }
    
}

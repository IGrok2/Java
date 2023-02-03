/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzdevums4;

/**
 *
 * @author skolens-7
 */
import java.util.Scanner;
public class Uzdevums4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter segment a: ");
        int a = scanner.nextInt();
        System.out.print("Enter segment b: ");
        int b = scanner.nextInt();
        System.out.print("Enter segment c: ");
        int c = scanner.nextInt();
        
        if (a + b > c && a + c > b && b + c > a) {
      System.out.println("The segments can form a triangle.");
    } else {
      System.out.println("The segments cannot form a triangle.");
    }
  }
}
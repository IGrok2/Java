/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzdevums5;

/**
 *
 * @author skolens-7
 */
import java.util.Scanner;
public class Uzdevums5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the valuve type a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the valuve type b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the valuve type c: ");
        double c = scanner.nextDouble();
        
       double discriminant = b * b - 4 * a * c;

    if (discriminant > 0) {
      double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
      double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
      System.out.println("The equation has two real solutions: x1 = " + x1 + " and x2 = " + x2);
    } else if (discriminant == 0) {
      double x = -b / (2 * a);
      System.out.println("The equation has one real solution: x = " + x);
    } else {
      System.out.println("The equation has no real solutions.");
    }
  }
}
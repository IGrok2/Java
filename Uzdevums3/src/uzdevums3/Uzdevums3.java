/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzdevums3;

/**
 *
 * @author skolens-7
 */
import java.util.Scanner;
public class Uzdevums3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a two-digit number: ");
    int number = scanner.nextInt();

    int firstDigit = number / 10;
    int secondDigit = number % 10;

    if (firstDigit == secondDigit) {
      System.out.println("The number is monotonic.");
    } else if (firstDigit < secondDigit) {
      System.out.println("The number is increasing.");
    } else {
      System.out.println("The number is decreasing.");
    }
  }
}
    
}

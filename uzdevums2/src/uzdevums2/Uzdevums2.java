/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzdevums2;

/**
 *
 * @author skolens-7
 */
import java.util.Scanner;
public class Uzdevums2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

        int difference;
        if (num1 > num2){
            difference = num1 - num2;
        }else {
        difference = num2 - num1;
        }
            System.out.println("The difference between the larger and smaller numbers is: " + difference);
    }
    
}

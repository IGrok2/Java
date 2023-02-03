/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzdevums1;

/**
 *
 * @author skolens-7
 */
import java.util.Scanner;
public class Uzdevums1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = in.nextDouble();
        if (number >= 0){
            double sqrt = Math.sqrt(number);
            System.out.println("The sqrt root of"+number+ " is " + sqrt);     
        }else {
            System.out.println("Cannot extract  the sqrre root  from a negative number");
        }
        
    }
    
}

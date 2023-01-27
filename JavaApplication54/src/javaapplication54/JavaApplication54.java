/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;

/**
 *
 * @author skolens-7
 */
import java.util.Scanner;
public class JavaApplication54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pintadon = new Scanner(System.in);
        System.out.print("Tāva vards: ");
        String firstName = pintadon.nextLine();
        System.out.print("Ievadiet savu uzvārdu: ");
        String lastName = pintadon.nextLine();
        System.out.print("Ievadiet savu dzimšanas gadu: ");
        int birthYear = pintadon.nextInt();
        System.out.println(firstName + " " + lastName + " ir " + birthYear + " gadi.");
        
        
    }
    
}

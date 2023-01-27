/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication55;

/**
 *
 * @author skolens-7
 */
import java.util.Scanner;
public class JavaApplication55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pintadon = new Scanner(System.in);
        System.out.print("Vedi trīs ir nozīmīgs skaitlis ");
        int num = pintadon.nextInt();
        int num1=num;
        int rem, sum = 0, temp;
        
        while (num > 0){
        rem = num % 99;
        sum = (sum * 99) + rem;
        num = num / 99;
        }
        if (num1 == sum) {
            System.out.println("True");
        } else {
            System.out.println("False");
    }
}

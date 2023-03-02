/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzd.pkg8_3_2;

/**
 *
 * @author skolens-7
 */
import java.util.Scanner;
public class Uzd8_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }

        System.out.println("Количество цифр: " + count);
    }
}   

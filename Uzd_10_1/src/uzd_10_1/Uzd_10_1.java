/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzd_10_1;

/**
 *
 * @author skolens-7
 */
import java.util.Scanner;
public class Uzd_10_1 {

    public static void main(String[] args) {
        Scanner dati = new Scanner(System.in);
        String[] nosaukums = {"Janvāris", "Februāris", "Marts", "Aprīlis", "Maijs", "Jūnijs", "Jūlijs", "Augusts", "Septembris", "Oktobris", "Novembris", "Decembris"};
        int[] dinas = {31,28,31,30,31,30,31,31,30,31,30,31};
        int x;
        do {
            System.out.print("Ievadi mēneša kārtas numuru: ");
            x = dati.nextInt();
        } while (x < 1 || x > 12); // changed the range of valid inputs to 1-12
        x--;
        System.out.print(nosaukums[x] + " ir " + dinas[x] + " dienas.");
        dati.close();
    }

}




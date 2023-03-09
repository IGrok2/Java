/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzd_10_3;

/**
 *
 * @author skolens-7
 */
public class Uzd_10_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            String[] nosaukums = {"Janväri", "Februari", "Marta", "Aprili", "Maija", "Junijã", "Julija", "Augusta", "Septembri", "Oktobri", "Novembri", "Decembri"};
        int[] dinas = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int i;
        for (i = 0; i < 12; i++) {
            System.out.println(nosaukums[i] + " ir " + dinas[i] + " dienas.");
        }
    }

}
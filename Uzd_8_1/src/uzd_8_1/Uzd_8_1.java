/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzd_8_1;

/**
 *
 * @author skolens-7
 */
import java.util.Scanner;
public class Uzd_8_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dati = new Scanner(System.in);
        double N;
        int n;
        int X;
        int K = 0;
        int D = 0;
        System.out.print("Cik eur elites: ");
        N = dati.nextDouble();
        System.out.print("Cik centus liksiet: ");
        X = dati.nextInt();
        n = (int) N * 100;
        while (K < n) {
            D = D + 1;
            K = K + X;
            X = X * 2;
        }
        System.out.print("Naudu nāksis " + D + " dienas");
        dati.close();
    }
}

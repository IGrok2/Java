/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzd_10_2_3;

/**
 *
 * @author skolens-7
 */
import java.util.Random;
public class Uzd_10_2_3 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        int[] A = new int[20];
        Random rand = new Random();

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(2) == 0 ? -1 : 1;
        }


        System.out.print("Oriģinālais masīvs A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                A[i] = 1;
            } else if (A[i] == 1) {
                A[i] = 0;
            }
        }

     
        System.out.print("Inverss masīvs A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}

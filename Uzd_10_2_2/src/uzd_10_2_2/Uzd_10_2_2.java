/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzd_10_2_2;

/**
 *
 * @author skolens-7
 */
public class Uzd_10_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {3, 4, 5, 6, 7};
        int[] C = new int[5];
        
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }
        
        System.out.println("Masīvs A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        
        System.out.println("\nMasīvs B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        
        System.out.println("\nMasīvs C: ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}

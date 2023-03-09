/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzd_10_2_1;

/**
 *
 * @author skolens-7
 */
import java.util.Scanner;
public class Uzd_10_2_1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        int[] masivs = new int[10];
        int summaVisiem = 0;
        int summaParaIndeksu = 0;
        int summaNeparaVertibas = 0;
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ievadiet skaitli no 1 līdz 5: ");
            masivs[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            summaVisiem += masivs[i];
        }
        
        for (int i = 0; i < 10; i += 2) {
            summaParaIndeksu += masivs[i];
        }
        
        for (int i = 0; i < 10; i++) {
            if (masivs[i] % 2 != 0) {
                summaNeparaVertibas += masivs[i];
            }
        }
        1
        System.out.println("Masīva visu elementu summa ir: " + summaVisiem);
        System.out.println("Masīva elementu summa ar pāra kārtas indeksiem ir: " + summaParaIndeksu);
        System.out.println("Masīva elementu summa ar nepāra vērtībām ir: " + summaNeparaVertibas);
    }
}

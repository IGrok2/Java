/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8_2;

/**
 *
 * @author skolens-7
 */
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader lasa = new BufferedReader(new FileReader("skaitli.txt"));
            String pag;
            int x;
            pag = lasa.readLine();
            while (pag != null) {
                x = Integer.parseInt(pag);
                System.out.print(x + "; ");
                pag = lasa.readLine();
            }
            lasa.close();
        } catch (IOException e) {
            System.out.println("Problemas ar datni");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzd_6_2;

/**
 *
 * @author skolens-7
 */
import java.io.*;
public class Uzd_6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            BufferedReader lasa= new BufferedReader(new FileReader("preces.txt"));
            String dati;
            dati=lasa.readLine();
            System.out.print(dati+" ");
            dati=lasa.readLine();
            System.out.print(dati+" "); 
            dati=lasa.readLine(); 
            System.out.println(dati);
            dati=lasa.readLine();
            System.out.print(dati+" ");
            lasa.readLine();
            System.out.print(dati+" ");
            dati=lasa.readLine();
            System.out.println(dati);
            dati=lasa.readLine();
            System.out.print(dati+" "); 
            dati=lasa.readLine();
            System.out.print(dati+" "); 
            dati=lasa.readLine();
            System.out.println(dati);
            
            dati=lasa.readLine();
            System.out.print(dati+" "); 
            dati=lasa.readLine();
            System.out.print(dati+" ");
            dati=lasa.readLine();
            
            System.out.println(dati);
            lasa.close();
        }catch (IOException e){
        System.out.println("Prob ar dati");
        }
    }
    
}

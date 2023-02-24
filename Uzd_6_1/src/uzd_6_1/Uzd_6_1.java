/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzd_6_1;

/**
 *
 * @author skolens-7
 */
import java.io.*;
public class Uzd_6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            BufferedWriter raksta= new BufferedWriter(new FileWriter("preces.txt", false));
            raksta.write("Piens\n\n0.65");
            raksta.newLine();
            raksta.write("Krejums\n1\n0.90");
            raksta.newLine();
            raksta.close();
            System.out.println("Dati save!");
        }catch(IOException e){
        
        System.out.println("Prob ar dati");
        }
        try{
            BufferedWriter raksta= new BufferedWriter(new FileWriter("preces.txt", true));
            raksta.write("Piens\n\n0.67");
            raksta.newLine();
            raksta.write("Krejums\n1\n0.89");
            raksta.newLine();
            raksta.close();
            System.out.println("Dati save!");
        }catch(IOException e){
        
        System.out.println("Prob ar dati");
        }
    }
    
}

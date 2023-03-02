/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzd_8_3_3;

/**
 *
 * @author skolens-7
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Uzd_8_3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filename = "draugi.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}

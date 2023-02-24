package uzd_6_3;

import java.io.*;

public class Uzd_6_3 {

    public static void main(String[] args) {
        try {
            BufferedReader lasa = new BufferedReader(new FileReader("preces.txt"));
            BufferedWriter raksta = new BufferedWriter(new FileWriter("pirkums.txt", false));
            String nos;
            int sk;
            double cena, summa;
            nos = lasa.readLine();
            sk = Integer.parseInt(lasa.readLine());
            cena = Double.parseDouble(lasa.readLine());
            summa = sk * cena;
            raksta.write(nos + " " + (sk * cena) + "\n");
            nos = lasa.readLine();
            sk = Integer.parseInt(lasa.readLine());
            cena = Double.parseDouble(lasa.readLine());
            summa = summa + sk * cena;
            raksta.write(nos + " " + (sk * cena) + "\n");
            nos = lasa.readLine();
            sk = Integer.parseInt(lasa.readLine());
            cena = Double.parseDouble(lasa.readLine());
            raksta.write(nos + " " + (sk * cena) + "\n");
            summa = summa + sk * cena;
            nos = lasa.readLine();
            sk = Integer.parseInt(lasa.readLine());
            cena = Double.parseDouble(lasa.readLine());
            summa = summa + sk * cena;
            raksta.write(nos + " " + (sk * cena) + "\n");
            raksta.write("Pirkuma summa: " + summa);
            System.out.println("Pirkuma summa: " + summa);
            lasa.close();
            raksta.close();
        } catch (IOException e) {
            System.out.println("Prob ar dati");
        }
    }

}

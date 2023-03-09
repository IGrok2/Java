/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzd_10_4;

/**
 *
 * @author skolens-7
 */
public class Uzd_10_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a=new int[10];
        int i;
        int sum=0;
        for(i=0; i<10; i++){
        a[i]=(int)(Math.random()*8+3);
        System.out.print(a[i]+"\t");
        sum=sum+a[i];      
        }
        System.out.println("\nMasiva elementu summa: "+sum);
    }
    
}

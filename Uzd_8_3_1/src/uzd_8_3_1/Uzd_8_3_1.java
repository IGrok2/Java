/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzd_8_3_1;

/**
 *
 * @author skolens-7
 */
import java.util.Scanner;
public class Uzd_8_3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of tiles: ");
        int numPlates = scanner.nextInt();
        int currentPlates = 0;
        int currentFloor = 0;

        while (currentPlates < numPlates) {
            currentFloor++;
            currentPlates += currentFloor * currentFloor;
        }

        System.out.println("The pyramid will consist of " + currentFloor + " floors.");
    }
}
    }
    
}

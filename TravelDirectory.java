/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.directory;

import java.util.Scanner;

/**
 *
 * @author 641775
 */
public class TravelDirectory {

    private static InfoGuide ig; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
    System.out.println("Hello, thank you for visitng the European travel guide! How may we direct you?");
    System.out.println("\t1. Italy\n\t2. United Kingdom\n\t3. Greece\n\t4. Germany\n\t5. Turkey"); 
    String option = kb.nextLine();
     if (option.equals("1")) {
            System.out.println("Which of the following do you wish to view?:");
            System.out.println("\t1. Airfare\n\t2. Currency Converter\n\t3. Hotel\n\t4. Vehicle Rental\n\t5. Things to do");
     if (option.equals("1")) {
         
    }
    }
    }
}


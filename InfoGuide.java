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
public class InfoGuide {
    String name;
    
      public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = kb.nextLine();
      }
}

/**
 * @(#)TestaaBooleanOperaattoreita.java
 *
 *
 * @author
 * @version 1.00 2011/9/19
 */

import java.util.Scanner;

public class TestaaBooleanOperaattoreita {
  public static void main(String[] args) {
    // Luodaan skanneri
    Scanner input = new Scanner(System.in);

    // Vastaanotetaan syöte
    System.out.print("Anna kokonaisluku: ");
    int luku = input.nextInt();

    System.out.println("Onko " + luku + " jaollinen kahdella ja kolmella? " +
        ((luku % 2 == 0) && (luku % 3 == 0)));

    System.out.println("Onko " + luku + " jaollinen kahdella tai kolmella? " +
        ((luku % 2 == 0) || (luku % 3 == 0)));

    System.out.println("Onko " + luku +
         " jaollinen kahdella tai kolmella, mutta ei molemmilla? " +
         ((luku % 2 == 0) ^ (luku % 3 == 0)));
  }
}


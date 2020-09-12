/**
 * @(#)Kertotaulu.java
 *
 *
 * @author
 * @version 1.00 2011/10/6
 */


public class Kertotaulu {
  /** p‰‰ohjelma */
  public static void main(String[] args) {
    // Tulostetaan otsikko
    System.out.println("           Kertotaulu");

    // Tulostetaan numero-otsikot
    System.out.print("    ");
    for (int j = 1; j <= 9; j++)
      System.out.print("   " + j);

    System.out.println("\n-----------------------------------------");

    // Tulostetaan taulukko
    for (int i = 1; i <= 9; i++) {
      System.out.print(i + " | ");
      for (int j = 1; j <= 9; j++) {
        // Tulostetaan tulo sopivassa muodossa
        System.out.printf("%4d", i * j);
      }
      System.out.println();
    }
  }
}


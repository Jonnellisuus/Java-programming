/**
 * @(#)VahennyslaskuToistolla.java
 *
 *
 * @author
 * @version 1.00 2011/10/4
 */
import java.util.Scanner;

public class VahennyslaskuToistolla {

  public static void main(String[] args) {
    final int KYSYMYSTEN_MAARA = 5; // Kysymysten m‰‰r‰
    int oikeita = 0; // Oikeiden vastausten m‰‰r‰
    int laskuri = 0; // Kysymysten m‰‰r‰
    long aloitusAika = System.currentTimeMillis();
    String tulostus = ""; // Tulostusmerkkijono, aluksi tyhj‰
    Scanner input = new Scanner(System.in);

    while (laskuri < KYSYMYSTEN_MAARA) {
      // 1. Luodaan kaksi satunnaista lukua
      int luku1 = (int)(Math.random() * 10);
      int luku2 = (int)(Math.random() * 10);

      // 2. Jos luku1 pienempi, vaihdetaan paikkaa
      if (luku1 < luku2) {
        int temp = luku1;
        luku1 = luku2;
        luku2 = temp;
      }

      // 3. Kysyt‰‰n k‰ytt‰j‰lt‰ paljonko on luku1 - luku2î
      System.out.print(
        "Paljonko on " + luku1 + " - " + luku2 + "? ");
      int vastaus = input.nextInt();

      // 4. Arvioidaan tulos ja kerrotaan k‰ytt‰j‰lle
      if (luku1 - luku2 == vastaus) {
        System.out.println("Oikein!");
        oikeita++;
      }
      else
        System.out.println("V‰‰rin.\n" + luku1
          + " - " + luku2 + " on " + (luku1 - luku2));

      // Lis‰t‰‰n laskuria
      laskuri++;

      tulostus += "\n" + luku1 + "-" + luku2 + "=" + vastaus +
        ((luku1 - luku2 == vastaus) ? " oikein" : " v‰‰rin");
    }

    long loppuAika = System.currentTimeMillis();
    long testiAika = loppuAika - aloitusAika;

    System.out.println("Oikeita vastauksia oli " + oikeita +
      "\nTesti kesti " + testiAika / 1000 + " sekuntia\n" + tulostus);
  }
}


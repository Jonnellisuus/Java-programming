/**
 * @(#)LaskeVero.java
 *
 *
 * @author
 * @version 1.00 2011/9/19
 */
import java.util.Scanner;

public class LaskeVero {
  public static void main(String[] args) {
    // Luodaan Scanner
    Scanner input = new Scanner(System.in);

    // Kysyt‰‰n k‰ytt‰j‰n s‰‰ty‰
    System.out.print(
      "(0-yksin‰inen, 1-naimisissa yhdess‰,\n" +
      "2-naimisissa erikseen, 3-perheenp‰‰)\n" +
      "Anna verotuss‰‰ty: ");
    int saaty = input.nextInt();

    // Kysyt‰‰n verotettavia tuloja
    System.out.print("Anna verotettava tulo: ");
    double tulot = input.nextDouble();

    // Lasketaan vero
    double vero = 0;

    if (saaty == 0) { // Lasketaan vero yksin‰isille
      if (tulot <= 8350)
        vero = tulot * 0.10;
      else if (tulot <= 33950)
        vero = 8350 * 0.10 + (tulot - 8350) * 0.15;
      else if (tulot <= 82250)
        vero = 8350 * 0.10 + (33950 - 8350) * 0.15 +
          (tulot - 33950) * 0.25;
      else if (tulot <= 171550)
        vero = 8350 * 0.10 + (33950 - 8350) * 0.15 +
          (82250 - 33950) * 0.25 + (tulot - 82250) * 0.28;
      else if (tulot <= 372950)
        vero = 8350 * 0.10 + (33950 - 8350) * 0.15 +
          (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
          (tulot - 171550) * 0.35;
      else
        vero = 8350 * 0.10 + (33950 - 8350) * 0.15 +
          (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
          (372950 - 171550) * 0.33 + (tulot - 372950) * 0.35;
    }
    else if (saaty == 1) { // Lasketaan vero yhdess‰ verotettavalle parille
      // J‰tet‰‰n harjoitukseksi
    }
    else if (saaty == 2) { // Lasketaan vero erikseen verotettavalle parille
      // J‰tet‰‰n harjoitukseksi
    }
    else if (saaty == 3) { // Lasketaan vero perheenp‰‰lle
      // J‰tet‰‰n harjoitukseksi
    }
    else {
      System.out.println("Virhe: v‰‰r‰ s‰‰ty");
      System.exit(0);
    }

    // N‰ytet‰‰n tulos
    System.out.println("Vero on " + (int)(vero * 100) / 100.0);
  }
}


/**
 * @(#)Karkausvuosi.java
 *
 *
 * @author
 * @version 1.00 2011/9/20
 */
import java.util.Scanner;

public class Karkausvuosi {

  public static void main(String args[]) {
    // Luodaan Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Anna vuosi: ");
    int vuosi = input.nextInt();

    // Tarkistetaan onko vuosi karkausvuosi
    boolean onKarkausvuosi =
      (vuosi % 4 == 0 && vuosi % 100 != 0) || (vuosi % 400 == 0);

    // N‰ytet‰‰n tulos
    System.out.println("Onko " + vuosi + " karkausvuosi? " + onKarkausvuosi);
  }
}


/**
 * @(#)VahennyslaskuPeli.java
 *
 *
 * @author
 * @version 1.00 2011/9/15
 */
import java.util.Scanner;

public class VahennyslaskuPeli {

  public static void main(String[] args) {
    // 1. Luodaan kaksi yhden numeron satunnaislukua
    int luku1 = (int)(Math.random() * 10);
    int luku2 = (int)(Math.random() * 10);

    // 2. Jos luku1 < luku2, niin vaihdetaan luvut
    if (luku1 < luku2) {
      int temp = luku1;
      luku1 = luku2;
      luku2 = temp;
    }

    // 3. Kysytään opiskelijalta laskun tulosta
    System.out.print
      ("Paljonko on " + luku1 + " - " + luku2 + "? ");
    Scanner input = new Scanner(System.in);
    int vastaus = input.nextInt();

    // 4. Arvioidaan vastaus ja annetaan palaute
    if (luku1 - luku2 == vastaus)
      System.out.println("Oikein!");
    else
      System.out.println("Vastauksesi on väärä.\n" + luku1 + " - "
        + luku2 + " on " + (luku1 - luku2));
  }
}


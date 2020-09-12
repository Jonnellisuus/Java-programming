/**
 * @(#)YhteenlaskuPeli.java
 *
 *
 * @author
 * @version 1.00 2011/9/14
 */


import java.util.Scanner;

public class YhteenlaskuPeli {
  public static void main(String[] args) {
    int luku1 = (int)(System.currentTimeMillis() % 10);
    int luku2 = (int)(System.currentTimeMillis() / 7 % 10);

    // Luodaan Scanner
    Scanner input = new Scanner(System.in);

    System.out.print(
      "Paljonko on " + luku1 + " + " + luku2 + "? ");

    int vastaus = input.nextInt();

    System.out.println(
      luku1 + " + " + luku2 + " = " + vastaus + " on " +
      (luku1 + luku2 == vastaus));
  }
}


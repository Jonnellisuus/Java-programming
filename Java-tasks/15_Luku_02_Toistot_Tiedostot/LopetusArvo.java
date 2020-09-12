/**
 * @(#)LopetusArvo.java
 *
 *
 * @author
 * @version 1.00 2011/10/4
 */
import java.util.Scanner;

public class LopetusArvo {

  /** P‰‰ohjelma */
  public static void main(String[] args) {
    // Luodaan Scanner
    Scanner input = new Scanner(System.in);

    // Luetaan ensimm‰inen luku
    System.out.print(
      "Anna kokonaisluku (ohjelma p‰‰ttyy kun annat 0): ");
    int data = input.nextInt();

    // Luetaan dataa kunnes syˆte on 0
    int summa = 0;
    while (data != 0) {
      summa += data;

      // Luetaan seuraava data
      System.out.print(
        "Anna kokonaisluku (ohjelma p‰‰ttyy kun annat 0): ");
      data = input.nextInt();
    }

    System.out.println("Summa on " + summa);
  }
}


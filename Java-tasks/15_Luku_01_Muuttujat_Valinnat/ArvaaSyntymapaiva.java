/**
 * @(#)ArvaaSyntymapaiva.java
 *
 *
 * @author
 * @version 1.00 2011/9/14
 */
import java.util.Scanner;

public class ArvaaSyntymapaiva {

  public static void main(String[] args) {
    String joukko1 =
      " 1  3  5  7\n" +
      " 9 11 13 15\n" +
      "17 19 21 23\n" +
      "25 27 29 31";

    String joukko2 =
      " 2  3  6  7\n" +
      "10 11 14 15\n" +
      "18 19 22 23\n" +
      "26 27 30 31";

    String joukko3 =
      " 4  5  6  7\n" +
      "12 13 14 15\n" +
      "20 21 22 23\n" +
      "28 29 30 31";

    String joukko4 =
      " 8  9 10 11\n" +
      "12 13 14 15\n" +
      "24 25 26 27\n" +
      "28 29 30 31";

    String joukko5 =
      "16 17 18 19\n" +
      "20 21 22 23\n" +
      "24 25 26 27\n" +
      "28 29 30 31";

    int paiva = 0;

    // Luodaan Scanner
    Scanner input = new Scanner(System.in);

    // Kysyt��n k�ytt�j�lt� muutama kysymys
    System.out.print("Onko syntym�p�iv�si joukossa 1?\n");
    System.out.print(joukko1);
    System.out.print("\nVastaa 0 jos ei ja 1 jos kyll�: ");
    int vastaus = input.nextInt();

    if (vastaus == 1)
      paiva += 1;

    // Kysyt��n k�ytt�j�lt� muutama kysymys
    System.out.print("\nOnko syntym�p�iv�si joukossa 2?\n");
    System.out.print(joukko2);
    System.out.print("\nVastaa 0 jos ei ja 1 jos kyll�: ");
    vastaus = input.nextInt();

    if (vastaus == 1)
      paiva += 2;

    // Kysyt��n k�ytt�j�lt� muutama kysymys
    System.out.print("Onko syntym�p�iv�si joukossa 3?\n");
    System.out.print(joukko3);
    System.out.print("\nVastaa 0 jos ei ja 1 jos kyll�: ");
    vastaus = input.nextInt();

    if (vastaus == 1)
      paiva += 4;

    // Kysyt��n k�ytt�j�lt� muutama kysymys
    System.out.print("\nOnko syntym�p�iv�si joukossa 4?\n");
    System.out.print(joukko4);
    System.out.print("\nVastaa 0 jos ei ja 1 jos kyll�: ");
    vastaus = input.nextInt();

    if (vastaus == 1)
      paiva += 8;

    // Kysyt��n k�ytt�j�lt� muutama kysymys
    System.out.print("\nOnko syntym�p�iv�si joukossa 5?\n");
    System.out.print(joukko5);
    System.out.print("\nVastaa 0 jos ei ja 1 jos kyll�: ");
    vastaus = input.nextInt();

    if (vastaus == 1)
      paiva += 16;

    System.out.println("\nSyntym�p�iv�si on " + paiva + "!");
  }
}


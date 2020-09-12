/**
 * @(#)ArvaaNumeroBreakilla.java
 *
 *
 * @author
 * @version 1.00 2011/10/14
 */

import java.util.Scanner;

public class ArvaaNumeroBreakilla {

  public static void main(String[] args) {
    // Luodaan arvattava satunnaisluku
    int luku = (int)(Math.random() * 101);

    Scanner input = new Scanner(System.in);
    System.out.println("Arvaa maaginen luku v�lilt� 0 - 100");

    while (true) {
      // Pyydet��n k�ytt�j�lt� arvaus
      System.out.print("\nAnna arvauksesi: ");
      int arvaus = input.nextInt();

      if (arvaus == luku) {
        System.out.println("Kyll� luku on " + luku);
        break;
      }
      else if (arvaus > luku)
        System.out.println("Arvauksesi on liian suuri");
      else
        System.out.println("Arvauksesi on liian pieni");
    } // Silmukan loppu
  }
}


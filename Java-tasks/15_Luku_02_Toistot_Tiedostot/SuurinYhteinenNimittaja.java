/**
 * @(#)SuurinYhteinenNimittaja.java
 *
 *
 * @author
 * @version 1.00 2011/10/6
 */


import java.util.Scanner;

public class SuurinYhteinenNimittaja {
  /** p��ohjelma */
  public static void main(String[] args) {
    // luodaan scanner
    Scanner input = new Scanner(System.in);

    // pyydet��n kaksi lukua
    System.out.print("Anna ensimm�inen kokonaisluku: ");
    int n1 = input.nextInt();
    System.out.print("Anna toinen kokonaisluku: ");
    int n2 = input.nextInt();

    int gcd = 1;
    int k = 2;
    while (k <= n1 && k <= n2) {
      if (n1 % k == 0 && n2 % k == 0)
        gcd = k;
      k++;
    }

    System.out.println("Suurin yhteinen nimitt�j� luvuille " + n1 +
      " ja " + n2 + " on " + gcd);
  }
}


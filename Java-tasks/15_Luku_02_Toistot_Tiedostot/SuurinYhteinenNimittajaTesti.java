/**
 * @(#)SuurinYhteinenNimittaja.java
 *
 *
 * @author
 * @version 1.00 2011/10/6
 */


import java.util.Scanner;

public class SuurinYhteinenNimittajaTesti {
  /** p‰‰ohjelma */
  public static void main(String[] args) {
    // luodaan scanner
    Scanner input = new Scanner(System.in);

    // pyydet‰‰n kaksi lukua
    System.out.print("Anna ensimm‰inen kokonaisluku: ");
    int n1 = input.nextInt();
    System.out.print("Anna toinen kokonaisluku: ");
    int n2 = input.nextInt();

    int gcd ;
    int k ;
    // etsint‰ t‰h‰n

    System.out.println("Suurin yhteinen nimitt‰j‰ on " + n1 +
      " and " + n2 + " is " + gcd);
  }
}


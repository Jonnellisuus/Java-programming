/**
 * @(#)If Demo.java
 *
 *
 * @author
 * @version 1.00 2011/9/14
 */


import java.util.Scanner;

public class IfDemo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Anna kokonaisluku: ");
    int luku = input.nextInt();

    if (luku % 5 == 0)
      System.out.println("Viidellä jaollinen");

    if (luku % 2 == 0)
      System.out.println("Parillinen");
  }
}


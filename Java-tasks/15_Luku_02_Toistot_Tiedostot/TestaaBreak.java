/**
 * @(#)TestaaBreak.java
 *
 *
 * @author
 * @version 1.00 2011/10/14
 */


public class TestaaBreak {

  public static void main(String[] args) {
    int summa = 0;
    int luku = 0;

    while (luku < 20) {
      luku++;
      summa += luku;
      if (summa >= 100) break;
    }

    System.out.println("Luku on " + luku);
    System.out.println("Summa on " + summa);
  }
}


/**
 * @(#)TulevaMaksu.java
 *
 *
 * @author
 * @version 1.00 2011/10/14
 */


public class TulevaMaksu {

  public static void main(String[] args) {
    double maksu = 10000;   // Vuosi 1
    int vuosi = 1;
    while (maksu < 20000) {
      maksu = maksu * 1.07;
      vuosi++;
    }

    System.out.println("Maksu kaksinkertaistuu "
      + vuosi + " vuodessa");
  }
}


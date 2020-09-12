/**
 * @(#)MonteCarloSimulaatio.java
 *
 *
 * @author
 * @version 1.00 2011/10/14
 */


public class MonteCarloSimulaatio {

  public static void main(String[] args) {
    final int YRITYSTEN_MAARA = 100000000;
    int osumat = 0;

    for (int i = 0; i < YRITYSTEN_MAARA; i++) {
      double x = Math.random() * 2.0 - 1;
      double y = Math.random() * 2.0  - 1;
      if (x * x + y * y <= 1)
        osumat++;
    }

    double pii = 4.0 * osumat / YRITYSTEN_MAARA;
    System.out.println("PII on " + pii);
  }
}


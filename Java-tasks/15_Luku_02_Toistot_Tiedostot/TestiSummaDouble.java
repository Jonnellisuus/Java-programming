/**
 * @(#)TestiSumma.java
 *
 *
 * @author
 * @version 1.00 2011/10/6
 */


public class TestiSummaDouble {
  public static void main(String[] args) {
    // Alustetaan summa
    double summa = 0;

    // lis‰t‰‰n 0.01, 0.02, ..., 0.99, 1 summaan
    for (double i = 0.01; i <= 1.0; i = i + 0.01)
      summa += i;

    // N‰ytet‰‰n tulos
    System.out.println("Summa on " + summa);
  }
}


/**
 * @(#)TestiSumma.java
 *
 *
 * @author
 * @version 1.00 2011/10/6
 */


public class TestiSumma {
  public static void main(String[] args) {
    // Alustetaan summa
    float summa = 0;

    // lis‰t‰‰n 0.01, 0.02, ..., 0.99, 1 summaan
    for (float i = 0.01f; i <= 1.0f; i = i + 0.01f)
      summa += i;

    // N‰ytet‰‰n tulos
    System.out.println("Summa on " + summa);
  }
}


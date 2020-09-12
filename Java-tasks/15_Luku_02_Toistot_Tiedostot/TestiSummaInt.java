/**
 * @(#)TestiSumma.java
 *
 *
 * @author
 * @version 1.00 2011/10/6
 */


public class TestiSummaInt {
  public static void main(String[] args) {
    // Alustetaan summa
    double summa = 0;
    double arvo = 0.01;

    // lis‰t‰‰n 0.01, 0.02, ..., 0.99, 1 summaan
    for (int laskuri = 0; laskuri < 100; laskuri++) {
    	summa += arvo;
      	arvo += 0.01;
    }


    // N‰ytet‰‰n tulos
    System.out.println("Summa on " + summa);
  }
}


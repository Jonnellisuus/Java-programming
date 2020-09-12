/**
 * @(#)TestaaContinue.java
 *
 *
 * @author
 * @version 1.00 2011/10/14
 */


public class TestaaContinue {

  public static void main(String[] args) {
    int summa = 0;
    int luku = 0;

    while (luku < 20) {
      luku++;
      if (luku == 10 || luku == 11)
      	continue;
      summa += luku;
    }

    System.out.println("Summa on " + summa);
  }
}

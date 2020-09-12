/**
 * @(#)ArvaaSyntymapaivaDialogilla.java
 *
 *
 * @author
 * @version 1.00 2011/9/27
 */
import javax.swing.JOptionPane;

public class ArvaaSyntymapaivaDialogilla {

  public static void main(String[] args) {
    String joukko1 =
      " 1  3  5  7\n" +
      " 9 11 13 15\n" +
      "17 19 21 23\n" +
      "25 27 29 31";

    String joukko2 =
      " 2  3  6  7\n" +
      "10 11 14 15\n" +
      "18 19 22 23\n" +
      "26 27 30 31";

    String joukko3 =
      " 4  5  6  7\n" +
      "12 13 14 15\n" +
      "20 21 22 23\n" +
      "28 29 30 31";

    String joukko4 =
      " 8  9 10 11\n" +
      "12 13 14 15\n" +
      "24 25 26 27\n" +
      "28 29 30 31";

    String joukko5 =
      "16 17 18 19\n" +
      "20 21 22 23\n" +
      "24 25 26 27\n" +
      "28 29 30 31";

    int paiva = 0;

    // Prompt the user to vastaus questions
    int vastaus = JOptionPane.showConfirmDialog(null,
      "Onko syntymäpäiväsi näissä numeroissa?\n" + joukko1);

    if (vastaus == JOptionPane.YES_OPTION)
      paiva += 1;

    vastaus = JOptionPane.showConfirmDialog(null,
      "Onko syntymäpäiväsi näissä numeroissa?\n" + joukko2);

    if (vastaus == JOptionPane.YES_OPTION)
      paiva += 2;

    vastaus = JOptionPane.showConfirmDialog(null,
      "Onko syntymäpäiväsi näissä numeroissa?\n" + joukko3);

    if (vastaus == JOptionPane.YES_OPTION)
      paiva += 4;

    vastaus = JOptionPane.showConfirmDialog(null,
      "Onko syntymäpäiväsi näissä numeroissa?\n" + joukko4);

    if (vastaus == JOptionPane.YES_OPTION)
      paiva += 8;

    vastaus = JOptionPane.showConfirmDialog(null,
      "Onko syntymäpäiväsi näissä numeroissa?\n" + joukko5);

    if (vastaus == JOptionPane.YES_OPTION)
      paiva += 16;

    JOptionPane.showMessageDialog(null, "Syntymäpäiväsi on " +
      paiva + "!");
  }
}


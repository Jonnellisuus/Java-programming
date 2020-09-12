/**
 * @(#)LopetusarvoVahvistusDialogilla.java
 *
 *
 * @author
 * @version 1.00 2011/10/14
 */
import javax.swing.JOptionPane;

public class LopetusarvoVahvistusDialogilla {

  public static void main(String[] args) {
    int summa = 0;

    // Luetaan kunnes vastaus on NO
    int valinta = 0;
    while (valinta == JOptionPane.YES_OPTION) {
      // Luetaan seuraava data
      String dataString = JOptionPane.showInputDialog(
        "Anna kokonaisluku: ");
      int data = Integer.parseInt(dataString);

      summa += data;

      valinta = JOptionPane.showConfirmDialog(null, "Jatketaan?");
    }

    JOptionPane.showMessageDialog(null, "Summa on  " + summa);
  }
}


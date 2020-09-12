/**
 * @(#)LaskeLainaDialogilla.java
 *  Tiedon lukeminen k‰ytt‰j‰lt‰ dialogilla.
 *  Vastaava komentorivi-ikkunassa on mukana kommentoituna.
 *
 * @author
 * @version 1.00 2011/10/25
 */
// lis‰ys
import javax.swing.JOptionPane;

//import java.util.Scanner; // pois

public class LaskeLainaDialogilla {

  public static void main(String[] args) {
 /*   // Luodaan Scanner
    Scanner input = new Scanner(System.in);

    // Annetaan vuosikorko
    System.out.print("Anna korkoprosentti, esim 8,25: ");
    double vuosiKorko = input.nextDouble(); */

    // Kysyt‰‰n vuosikorko
    String vuosiKorkoString = JOptionPane.showInputDialog(
      "Anna korkoprosentti, esim. 8.25:");
    // Muunnetaan doubleksi
    double vuosiKorko = Double.parseDouble(vuosiKorkoString);

    // Lasketaan kuukausikorko
    double kuukausiKorko = vuosiKorko / 1200;

/*    // Annetaan vuosien m‰‰r‰
    System.out.print(
      "Anna vuosien m‰‰r‰ kokonaisulukuna, esim. 5: ");
    int vuodet = input.nextInt();

    // Annetaan lainan m‰‰r‰
    System.out.print("Anna lainan m‰‰r‰, esim.  120000,95: ");
    double lainaMaara = input.nextDouble(); */

    // Enter number of years
    String vuodetString = JOptionPane.showInputDialog(
      "Anna vuosien m‰‰r‰ kokonaislukuna, \nesim. 5:");

    // Muunnetaan string int arvoksi
    int vuodet = Integer.parseInt(vuodetString);

    // Annetaan lainan m‰‰r‰
    String lainaMaaraString = JOptionPane.showInputDialog(
      "Anna lainan m‰‰r‰, esim.  120000: ");

    // Convert string to double
    double lainaMaara = Double.parseDouble(lainaMaaraString);

    // Lasketaan kuukausimaksu
    double kuukausiMaksu = lainaMaara * kuukausiKorko / (1
      - 1 / Math.pow(1 + kuukausiKorko, vuodet * 12));
    double maksuYhteensa = kuukausiMaksu * vuodet * 12;

/*    // N‰ytet‰‰n tulokset
    System.out.println("Kuukausimaksu on  " +
      (int)(kuukausiMaksu * 100) / 100.0);
    System.out.println("Maksat kaikkiaan " +
      (int)(maksuYhteensa * 100) / 100.0); */

	// Muotoillaan: kaksi desimaalia
    kuukausiMaksu = (int)(kuukausiMaksu * 100) / 100.0;
    maksuYhteensa = (int)(maksuYhteensa * 100) / 100.0;

   // N‰ytet‰‰n tulokset
    String tulostus = "Kuukausimaksu on  " + kuukausiMaksu +
      "\nMaksat kaikkiaan " + maksuYhteensa;
    JOptionPane.showMessageDialog(null, tulostus);


  }
}


/**
 * @(#)Lotto.java
 *
 *
 * @author
 * @version 1.00 2011/9/21
 */
import java.util.Scanner;

public class Lotto {

  public static void main(String[] args) {
    // Arvotaan luku
    int arvottu = (int)(Math.random() * 100);

    // Kysyt‰‰n k‰ytt‰j‰n arvaus
    Scanner input = new Scanner(System.in);
    System.out.print("Arvaa kaksinumeroinen luku: ");
    int arvaus = input.nextInt();

    // Erotellaan luvun numerot
    int arvottuNumero1 = arvottu / 10;
    int arvottuNumero2 = arvottu % 10;

    // Erotellaan arvauksen numerot
    int arvausNumero1 = arvaus / 10;
    int arvausNumero2 = arvaus % 10;

    System.out.println("Arvottu luku on " + arvottu);

    // Tarkistetaan arvaus
    if (arvaus == arvottu)
      System.out.println("T‰ysin oikein, voitat 1000");
    else if (arvausNumero2 == arvottuNumero1
          && arvausNumero1 == arvottuNumero2)
      System.out.println("Arvauksen numerot oikein: voitat 3000");
    else if (arvausNumero1 == arvottuNumero1
          || arvausNumero1 == arvottuNumero2
          || arvausNumero2 == arvottuNumero1
          || arvausNumero2 == arvottuNumero2)
      System.out.println("Yksi numero oikein, voitat 1000");
    else
      System.out.println("Sorry, ei osunut");
  }
}


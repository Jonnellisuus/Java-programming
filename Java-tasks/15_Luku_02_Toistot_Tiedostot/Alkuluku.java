/**
 * @(#)Alkuluku.java
 *
 *
 * @author
 * @version 1.00 2011/10/14
 */


public class Alkuluku {

   public static void main(String[] args) {
    final int ALKULUKUJEN_MAARA = 50; // N‰ytett‰vien alkulukujen m‰‰r‰
    final int ALKULUKUJA_RIVILLA = 10; // N‰ytet‰‰n 10 per rivi
    int maara = 0; // Lasketaan lukujen m‰‰r‰
    int luku = 2; // Testattava luku

    System.out.println("50 ensimm‰ist‰ alkuluvua ovat \n");

    // Toistetaan alkulukujen etsint‰‰
    while (maara < ALKULUKUJEN_MAARA) {
      // Oletetaan ett‰ luku on alkuluku
      boolean onAlkuluku = true; // Onko luku alkuluku?

      // Testataan onko luku alkuluku
      for (int jakaja = 2; jakaja <= luku / 2; jakaja++) {
        if (luku % jakaja == 0) { // Jos tosi luku ei ole alkuluku
          onAlkuluku = false; // Asetetaan onAlkuluku ep‰todeksi
          break; // Poistutaan silmukasta
        }
      }

      // Tulostetaan alkuluku ja lis‰t‰‰n m‰‰r‰‰
      if (onAlkuluku) {
        maara++; // Lis‰t‰‰n m‰‰r‰‰

        if (maara % ALKULUKUJA_RIVILLA == 0) {
          // Tulostetaan luku ja vaihdetaan rivi‰
          System.out.println(luku);
        }
        else
          System.out.print(luku + " ");
      }

      // Tarkistetaan onko seuraava luku alkuluku
      luku++;
    }
  }
}

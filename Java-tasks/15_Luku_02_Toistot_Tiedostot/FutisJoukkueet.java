import javax.swing.JOptionPane;

/** 
   T‰m‰ ohjelma laskee kuinka monta futisjoukkuessa nuorista
   saisi koottua. Samalla testataan syˆtteen tarkistusta. 
*/

public class FutisJoukkueet 
{
   public static void main(String [] args) 
   {
      final int MIN_PELAAJIA  = 9;  // Pelaajien minimim‰‰r‰
      final int MAX_PELAAJIA  = 15; // Pelaajien maksimim‰‰r‰
      int pelaajia;                 // Pelaajien m‰‰r‰
      int joukkueenKoko;            // Joukkueen pelaajien m‰‰r‰
      int joukkueita;               // Joukkueiden m‰‰r‰
      int liikaa;                   // Ylim‰‰r‰isten pelaajien m‰‰r‰
      String input;                 // K‰ytt‰j‰n syˆte
      
      // Luetaan joukkueen pelaajien m‰‰r‰
      input = JOptionPane.showInputDialog("Montako pelaajaa on yhdess‰ joukkuessa? ");
      
      joukkueenKoko = Integer.parseInt(input);
      
      // Tarkistetaan syˆte
      while (joukkueenKoko < MIN_PELAAJIA || joukkueenKoko > MAX_PELAAJIA)
      {
         input = JOptionPane.showInputDialog("Lukum‰‰r‰n pit‰‰ olla v‰hint‰‰n" + 
                  MIN_PELAAJIA + " ja enint‰‰n " + MAX_PELAAJIA + 
                  "\nAnna joukkueen pelaajien m‰‰r‰: ");
         joukkueenKoko = Integer.parseInt(input);
      }
      
      // Luetaan k‰ytett‰viss‰ olevien pelaajien m‰‰r‰
      input = JOptionPane.showInputDialog("Anna k‰ytett‰viss‰ olevien pelaajien m‰‰r‰: ");
      pelaajia = Integer.parseInt(input);
      
      // Tarkastetaan syˆte
      while (pelaajia < 0) 
      {
         input = JOptionPane.showInputDialog("Anna 0 tai sit‰ suurempi luku: ");
         pelaajia = Integer.parseInt(input);
      }
      
      // Lasketaan joukkueiden m‰‰r‰
      joukkueita = pelaajia / joukkueenKoko;
      
      // Lasketaan ylim‰‰r‰isten pelaajien m‰‰r‰
      liikaa = pelaajia % joukkueenKoko;
      
      // N‰ytet‰‰n tulokset
      JOptionPane.showMessageDialog(null, "Pelaajista tulee " + joukkueita +
            " joukkuetta ja " + liikaa + " pelaajaa j‰‰ yli. ");
            
      System.exit(0);
   }
}                       
   
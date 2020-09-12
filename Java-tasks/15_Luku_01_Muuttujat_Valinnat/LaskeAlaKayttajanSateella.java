// tuodaan Scanner luokka pakkauksesta käyttöön
import java.util.Scanner;
// luokka LaskeAlaKayttajanSateella
public class LaskeAlaKayttajanSateella { 
	// main metodi
   public static void main(String[] args) { 
	// Luodaan Scanner olio
      Scanner input = new Scanner(System.in); 
	// kysytään sädettä
      System.out.print("Anna säde: "); 
	// luetaan säde input-oliosta
      double sade = input.nextDouble(); 
	// lasketaan ala
      double ala = sade * sade * 3.14159; 
	//tulostetaan tulos
      System.out.println("Kun ympyrän säde on " + 
	   sade + " niin sen ala on " + ala);
   } 
} 
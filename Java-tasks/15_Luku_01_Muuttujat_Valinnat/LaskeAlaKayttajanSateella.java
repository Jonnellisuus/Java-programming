// tuodaan Scanner luokka pakkauksesta k�ytt��n
import java.util.Scanner;
// luokka LaskeAlaKayttajanSateella
public class LaskeAlaKayttajanSateella { 
	// main metodi
   public static void main(String[] args) { 
	// Luodaan Scanner olio
      Scanner input = new Scanner(System.in); 
	// kysyt��n s�dett�
      System.out.print("Anna s�de: "); 
	// luetaan s�de input-oliosta
      double sade = input.nextDouble(); 
	// lasketaan ala
      double ala = sade * sade * 3.14159; 
	//tulostetaan tulos
      System.out.println("Kun ympyr�n s�de on " + 
	   sade + " niin sen ala on " + ala);
   } 
} 
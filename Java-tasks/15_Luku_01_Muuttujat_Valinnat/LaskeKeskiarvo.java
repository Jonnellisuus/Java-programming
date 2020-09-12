import java.util.Scanner; // Luokka Scanner on pakkauksessa the java.util

public class LaskeKeskiarvo {
  public static void main(String[] args) {
    // Luodaan Scanner olio
    Scanner input = new Scanner(System.in);
    
    // Pyydet‰‰n k‰ytt‰j‰lt‰ kolme lukua
    System.out.print("Anna kolme lukua: ");
    double luku1 = input.nextDouble();
    double luku2 = input.nextDouble();
    double luku3 = input.nextDouble();

    // Lasketaan keskiarvo
    double keskiarvo = (luku1 + luku2 + luku3) / 3;

    // N‰ytet‰‰n tulos
    System.out.println("Lukujen " + luku1 + ",  " + luku2 
      + " ja " + luku3 + " keskiarvo on " + keskiarvo);
  } 
}


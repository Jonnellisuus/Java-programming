/**
 * @(#)ArvaaNumero.java
 *
 *
 * @author
 * @version 1.00 2011/10/4
 */
import java.util.Scanner;

public class ArvaaNumero {

  public static void main(String[] args) {
    // Arvotaan arvattava numero
    int numero = (int)(Math.random() * 101);

    Scanner input = new Scanner(System.in);
    System.out.println("Arvaa maaginen luku v�lilt� 0-100");

    int arvaus = -1;
    while (arvaus != numero) {
      // Kysyt��n k�ytt�j�n arvaus
      System.out.print("\nMit� arvaat: ");
      arvaus = input.nextInt();

      if (arvaus == numero)
        System.out.println("Oikein, luku on " + numero);
      else if (arvaus > numero)
        System.out.println("Arvauksesi oli liian suuri");
      else
        System.out.println("Arvauksesi oli liian pieni");
    } // End of loop
  }
}


/**
 * @(#)ArvaaNumeroKerran.java
 *
 *
 * @author
 * @version 1.00 2011/10/4
 */
 import java.util.Scanner;

public class ArvaaNumeroKerran {

  public static void main(String[] args) {
    // Arvotaan arvattava numero
    int numero = (int)(Math.random() * 101);

    Scanner input = new Scanner(System.in);
    System.out.println("Arvaa maaginen luku väliltä 0-100");

    // Kysytään käyttäjän arvaus
    System.out.print("\nMitä arvaat: ");
    int arvaus = input.nextInt();

    if (arvaus == numero)
      System.out.println("Oikein luku on" + numero);
    else if (arvaus > numero)
      System.out.println("Arvasit liian suuren luvun");
    else
      System.out.println("Arvasit liian pienen luvun");
  }
}


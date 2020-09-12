import java.util.Scanner;

public class NaytaAika {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Pyydetään käyttäjältä syöte
    System.out.print("Anna sekuntien määrä kokonaislukuna: ");
    int sekunnit = input.nextInt();

    int minuutit = sekunnit / 60; // Selvitä minuuttien määrä sekunneissa
    int jaannosSekunnit = sekunnit % 60; // Jäljelle jäävät sekunnit
    System.out.println(sekunnit + " sekuntia on " + minuutit +
      " minuuttia ja " + jaannosSekunnit + " sekuntia");
  }
}


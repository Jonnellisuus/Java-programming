import java.util.Scanner;

public class NaytaAika {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Pyydet��n k�ytt�j�lt� sy�te
    System.out.print("Anna sekuntien m��r� kokonaislukuna: ");
    int sekunnit = input.nextInt();

    int minuutit = sekunnit / 60; // Selvit� minuuttien m��r� sekunneissa
    int jaannosSekunnit = sekunnit % 60; // J�ljelle j��v�t sekunnit
    System.out.println(sekunnit + " sekuntia on " + minuutit +
      " minuuttia ja " + jaannosSekunnit + " sekuntia");
  }
}


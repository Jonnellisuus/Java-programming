import java.util.Scanner;

public class LaskeLaina {
  public static void main(String[] args) {
    // Luodaan Scanner
    Scanner input = new Scanner(System.in);

    // Annetaan vuosikorko
    System.out.print("Anna korkoprosentti, esim 8,25: ");
    double vuosiKorko = input.nextDouble();

    // Lasketaan kuukausikorko
    double kuukausiKorko = vuosiKorko / 1200;

    // Annetaan vuosien m‰‰r‰
    System.out.print(
      "Anna vuosien m‰‰r‰ kokonaisulukuna, esim. 5: ");
    int vuodet = input.nextInt();

    // Annetaan lainan m‰‰r‰
    System.out.print("Anna lainan m‰‰r‰, esim.  120000,95: ");
    double lainaMaara = input.nextDouble();

    // Lasketaan kuukausimaksu
    double kuukausiMaksu = lainaMaara * kuukausiKorko / (1
      - 1 / Math.pow(1 + kuukausiKorko, vuodet * 12));
    double maksuYhteensa = kuukausiMaksu * vuodet * 12;

    // N‰ytet‰‰n tulokset
    System.out.println("Kuukausimaksu on  " +
      (int) (kuukausiMaksu * 100) / 100.0);
    System.out.println("Maksat kaikkiaan " +
      (int)(maksuYhteensa * 100) / 100.0);
  }
}


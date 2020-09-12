import java.util.Scanner;

public class Alvi {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Anna myyntihinta: ");
    double myyntiHinta = input.nextDouble();

    double vero = myyntiHinta * 0.09;
    System.out.println("Arvonlisävero on " + (int)(vero * 100) / 100.0);
  }
}


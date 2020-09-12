import java.util.Scanner;

public class FahrenheitCelsius {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Anna lämpötila Farenheit asteina: ");
    double fahrenheit = input.nextDouble();

    // Muutetaan Fahrenheit Celsiukseksi
    double celsius = (5.0 / 9) * (fahrenheit - 32);
    System.out.println("Fahrenheit " + fahrenheit + " on " +
      celsius + " Celsiusta");
  }
}


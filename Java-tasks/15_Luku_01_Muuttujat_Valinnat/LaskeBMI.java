/**
 * @(#)LaskeBMI.java
 *
 *
 * @author
 * @version 1.00 2011/9/15
 */
import java.util.Scanner;

public class LaskeBMI {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Kysyt‰‰n k‰ytt‰j‰n paino kiloina
    System.out.print("Anna painosi (kg): ");
    double paino = input.nextDouble();

    // Kysyt‰‰n k‰ytt‰j‰n pituus (cm)
    System.out.print("Anna pituutesi (cm): ");
    double pituus = input.nextDouble();

       // Lasketaan BMI
    double pituusMetreina = pituus / 100;
    double bmi = paino /
      (pituusMetreina * pituusMetreina);

    // N‰ytet‰‰n tulos
    System.out.printf("BMI:si on: %5.2f\n", bmi);
    if (bmi < 16)
      System.out.println("Olet vakavasti alipainoinen");
    else if (bmi < 18)
      System.out.println("Olet alipainoinen");
    else if (bmi < 24)
      System.out.println("Olet normaalipainoinen");
    else if (bmi < 29)
      System.out.println("Olet ylipainoinen");
    else if (bmi < 35)
      System.out.println("Olet vakavasti ylipainoinen");
    else
      System.out.println("Olet hirve‰n ylipainoinen");
  }
}


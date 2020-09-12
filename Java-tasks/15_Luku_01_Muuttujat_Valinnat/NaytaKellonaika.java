public class NaytaKellonaika {
  public static void main(String[] args) {
    // Hankintaan aika millisekunteina keskiy�st� 1.1.1970
    long millisekunnitYhteensa = System.currentTimeMillis();

    // Lasketaan sekunnit keskiy�st� 1.1.1970
    long sekunnitYhteensa = millisekunnitYhteensa / 1000;

    // Lasketaan sekunnit t�ll� tunnilla ja minuutilla
    long sekunnitNyt = (int)(sekunnitYhteensa % 60);

    // Lasketaan minuutit
    long minuutitYhteensa = sekunnitYhteensa / 60;

    // Lasketaan t�m�n tunnit minuutit
    long minuutitNyt = (int)(minuutitYhteensa % 60);

    // Lasketaan tunnit
    long tunnitYhteensa = minuutitYhteensa / 60;

    // Lasketaan t�m�n vuorokauden tunnit
    long tunnitNyt = (int)(tunnitYhteensa % 24);

    // N�ytet��n tulos
    System.out.println("Kelloaika on " + tunnitNyt + ":"
      + minuutitNyt + ":" + sekunnitNyt + " GMT");
  }
}


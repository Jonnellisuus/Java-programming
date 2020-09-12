//T‰m‰ ohjelma tulostaa dialogin Tervetuloa Javaan!
// tuodaan luokka JOptionPane k‰ytt‰‰ pakkauksesta javax.swing
import javax.swing.JOptionPane; 
// luokka TervetuloaViestiDialogi
public class TervetuloaViestiDialogi {	
  // main metodi
  public static void main(String[] args) { 
    // Kutsutaan luokan JOptionPane metodia showMessageDialog
    JOptionPane.showMessageDialog(null,
	"Tervetuloa Javaan!", 
	"N‰yt‰ viesti", 
	JOptionPane.INFORMATION_MESSAGE);
  }
}
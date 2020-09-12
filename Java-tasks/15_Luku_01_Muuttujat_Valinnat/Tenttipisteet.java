/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oh2_esimerkit;
import javax.swing.JOptionPane;

/**
 *
 * @author epesonen
 */
public class Tenttipisteet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tenttipiste;
        String input;
        
        // Lueteen numeerinen tenttipiste
        input= JOptionPane.showInputDialog("Anna tenttipisteet, niin " + 
                "minä kerron arvosanan: ");
        tenttipiste = Integer.parseInt(input);
        
        // Näytetään arvosana
        if (tenttipiste < 60) {
            JOptionPane.showMessageDialog(null, "Arvosanasi on 1.");
        }
        else {
            if (tenttipiste < 70) {
                JOptionPane.showMessageDialog(null, "Arvosanasi on 2.");
            }
            else {
                if (tenttipiste < 80) {
                    JOptionPane.showMessageDialog(null, "Arvosanasi on 3. ");
                }
                else {
                    if (tenttipiste < 90) {
                        JOptionPane.showMessageDialog(null, "Arvosanasi on 4.");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Arvosanasi on 1. ");
                    
                    }
                }
            }
        }
        // lopetetaan graafinen ohjelma.
        System.exit(0);
    }
    
}

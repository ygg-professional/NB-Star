package Proyecto;

import java.awt.Component;
import javax.swing.JFrame;

public class Ventana {
   public static void main(String[] args) {
      JFrame ventana = new JFrame("Proyecto final");
      Panel cod = new Panel();
      ventana.add(cod);
      ventana.setDefaultCloseOperation(3);
      ventana.setSize(700, 500);
      ventana.setLocationRelativeTo((Component)null);
      ventana.setVisible(true);
   }
}

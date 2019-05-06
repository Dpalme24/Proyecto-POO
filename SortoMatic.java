package organizador;

import javax.swing.JFrame;

public class SortoMatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainMenu vent = new MainMenu();
        vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //determinar que hacer cuando se cierre la ventana
      vent.setSize(600,480); //tamaño ventana
      vent.setVisible(true); //hacer visible
    }
    
}

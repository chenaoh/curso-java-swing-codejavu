package ventanas;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Principal {

	public static void main(String[] args) {
		
		try
        {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
           // UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

//            GTK: com.sun.java.swing.plaf.gtk.GTKLookAndFeel (GNU/Linux)
//            Windows: com.sun.java.swing.plaf.windows.WindowsLookAndFeel (Windows)
//            Motif: com.sun.java.swing.plaf.motif.MotifLookAndFeel (Multiplataforma)
//            Nimbus: javax.swing.plaf.nimbus.NimbusLookAndFeel (Multiplataforma)
//            Metal: javax.swing.plaf.metal.MetalLookAndFeel (Multiplataforma)

            

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
		
		/*Declaramos el objeto*/
		VentanaPrincipal miVentanaPrincipal;
		/*Instanciamos el objeto*/
		miVentanaPrincipal= new VentanaPrincipal();
		/*Enviamos el objeto como parametro para que sea unico
		 * en toda la aplicación*/
		miVentanaPrincipal.setVentanaPrincipal(miVentanaPrincipal);
		/*Hacemos que se cargue la ventana*/
		miVentanaPrincipal.setVisible(true);
	}
}

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

import paneles.Panel1;
import paneles.Panel2;
import paneles.PanelIntroduccion;


public class VentanaPrincipal extends JFrame{
	
	PanelIntroduccion miPanelIntroduccion;
	Panel1 panel1;
	Panel2 panel2;

	JTabbedPane   pestañas;

	VentanaPrincipal ()
	{
		setTitle     ( "CoDejaVu : JTabbedPane" ); 
		setSize      ( 420, 250   );
		//pone la ventana en el Centro de la pantalla
		setLocationRelativeTo(null);
		
		iniciarComponentes();
		
	}

	private void iniciarComponentes() {
		pestañas   = new JTabbedPane   ( );
		
		miPanelIntroduccion=new PanelIntroduccion();
		panel1=new Panel1();
		panel2=new Panel2();
	    
	   	    
	    pestañas.addTab ( "Pestaña 1", miPanelIntroduccion );
	    pestañas.addTab ( "Pestaña 2", panel1   );
	    pestañas.addTab ( "Pestaña 3", panel2   );

	    add ( pestañas );
	}
	
}

package ventanas;

import java.awt.Container;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class VentanaConfirmacion extends JDialog{
	private Container contenedor;
	JLabel labelTitulo;
	
	public VentanaConfirmacion(VentanaPrincipal miVentanaPrincipal, boolean modal){
		/*Al llamar al constructor super(), le enviamos el
		 * JFrame Padre y la propiedad booleana que determina
		 * que es hija*/
		super(miVentanaPrincipal, modal);
		contenedor=getContentPane();
		contenedor.setLayout(null);
   		//Asigna un titulo a la barra de titulo
		setTitle("CoDejaVu : JDialog VentanaConfirmacion");
		
		
		labelTitulo= new JLabel();
		labelTitulo.setText("VENTANA DE CONFIRMACION");
		labelTitulo.setBounds(20, 20, 180, 23);
		
		contenedor.add(labelTitulo);
		//tamaño de la ventana
		setSize(350,150);
		//pone la ventana en el Centro de la pantalla
		setLocationRelativeTo(null);
	}
}

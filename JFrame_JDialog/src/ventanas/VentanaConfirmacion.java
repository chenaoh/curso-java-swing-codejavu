package ventanas;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaConfirmacion extends JDialog{
	private Container contenedor;
	JLabel labelTitulo;
	JTextField campo1;
	JTextField campo2;
	JButton botonCambiar;/*declaramos el objeto Boton*/
	
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
		
		campo1= new JTextField();
		campo2= new JTextField();
		
		contenedor.add(labelTitulo);
		//tamaño de la ventana
		setSize(350,150);
		//pone la ventana en el Centro de la pantalla
		setLocationRelativeTo(null);
	}
}

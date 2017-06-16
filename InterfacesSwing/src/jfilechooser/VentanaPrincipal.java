package jfilechooser;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame implements ActionListener {
	
	private Container contenedor;/*declaramos el contenedor*/
	JButton botonCambiar;/*declaramos el objeto Boton*/
	JLabel labelTitulo;/*declaramos el objeto Label*/
	private VentanaPrincipal miVentanaPrincipal;
	
	public VentanaPrincipal(){
		/*permite iniciar las propiedades de los componentes*/
		iniciarComponentes();
   		/*Asigna un titulo a la barra de titulo*/
		setTitle("CoDejaVu : JFrame VentanaPrincipal");
		/*tamaño de la ventana*/
		setSize(300,180);
		/*pone la ventana en el Centro de la pantalla*/
		setLocationRelativeTo(null);
	}

	/**
	 * @param miVentana
	 * Enviamos una instancia de la ventana principal
	 */
	public void setVentanaPrincipal(VentanaPrincipal miVentana) {
		miVentanaPrincipal=miVentana;
	}

	private void iniciarComponentes() {
		contenedor=getContentPane();/*instanciamos el contenedor*/
		/*con esto definmos nosotros mismos los tamaños y posicion
		 * de los componentes*/
		contenedor.setLayout(null);
		
		/*Propiedades del boton, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		botonCambiar= new JButton();
		botonCambiar.setText("Iniciar");
		botonCambiar.setBounds(100, 80, 80, 23);
		botonCambiar.addActionListener(this);
		
		/*Propiedades del Label, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		labelTitulo= new JLabel();
		labelTitulo.setText("VENTANA PRINCIPAL");
		labelTitulo.setBounds(80, 20, 180, 23);
		
		/*Agregamos los componentes al Contenedor*/
		contenedor.add(labelTitulo);
		contenedor.add(botonCambiar);
	}

	/*Agregamos el evento al momento de llamar la otra ventana*/
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource()==botonCambiar)
		{
			JFileChooser file=new JFileChooser(System.getProperty("usarDirectorio.dir")); 
		}
	}
}

package jtoolbar;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import aplicacion.VentanaPrincipal;

public class ClaseJToolbar extends JDialog{

	JLabel labelTitulo;/*declaramos el objeto Label*/
	JTextArea areaDeTexto;
	String texto;
	JToolBar barraDeOpciones;
	JButton boton1,boton2,boton3;
	JTextField campo1;
	JPanel miPanel;
	public ClaseJToolbar(VentanaPrincipal miVentanaPrincipal, boolean modal){
		/*Al llamar al constructor super(), le enviamos el
		 * JFrame Padre y la propiedad booleana que determina
		 * que es hija*/
		super(miVentanaPrincipal, modal);
		
		miPanel=new JPanel();
		miPanel.setLayout(null);

   		//Asigna un titulo a la barra de titulo
		setTitle("CoDejaVu : JToolbar");
				
		/*Propiedades del Label, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		labelTitulo= new JLabel();
		labelTitulo.setText("CONTENEDOR JTOOLBAR");
		labelTitulo.setBounds(120, 30, 180, 23);
		
		texto="Este contenedor representa una barra de herramientas donde\n" +
			  "podemos alojar diferentes componentes Java Swing, la barra\n" +
			  "puede ser arrastara a cualquier posicion de los extremos o\n" +
			  "se puede sacar como ventana independiente";
		areaDeTexto = new JTextArea();
		areaDeTexto.setText(texto);
		areaDeTexto.setBounds(40, 60, 350, 100);
		
		boton1=new JButton();
		boton2=new JButton();
		boton3=new JButton();
		boton1.setText("boton1");
		boton2.setText("boton2");
		boton3.setText("boton3");
		campo1= new JTextField();
				
		/*Propiedades de jtoolbar*/
		barraDeOpciones = new JToolBar();
        barraDeOpciones.add(boton1);
        barraDeOpciones.add(boton2);
        barraDeOpciones.add(boton3);
        barraDeOpciones.add(campo1);
        
        //Agrega la barra a la ventana y define como se distribuyen los componentes en ella 
		getContentPane().add(barraDeOpciones, BorderLayout.NORTH);
		pack();
		/*Agregamos los componentes al Contenedor*/
		miPanel.add(labelTitulo);
		miPanel.add(areaDeTexto);
		add(miPanel);
		//tamaño de la ventana
		setSize(420,300);
		//pone la ventana en el Centro de la pantalla
		setLocationRelativeTo(null);
	}
}

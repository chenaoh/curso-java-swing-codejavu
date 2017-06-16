package jpanel;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import aplicacion.VentanaPrincipal;

import jdialog.ClaseJDialog;

public class ClaseJPanel extends JDialog implements ActionListener
	{
		//private Container contenedor;
		JLabel labelTitulo, tituloPanel1,tituloPanel2;/*declaramos el objeto Label*/
		private JPanel miPanelPrincipal;//contenedor de los componentes
		private JPanel panel1,panel2;//paneles de ejemplo
		private JButton miBotonPanel2;
		private JButton botonOcultar, botonMostrar;
		
		
		public ClaseJPanel(VentanaPrincipal miVentanaPrincipal, boolean modal)//constructor
		{
			super(miVentanaPrincipal, modal);
			iniciaComponentes();
       		//Asigna un titulo a la barra de titulo
			setTitle("CoDejaVu : Ventana JPanel");
			//tamaño de la ventana
			setSize(550,350);
			//pone la ventana en el Centro de la pantalla
			setLocationRelativeTo(null);
		}

		private void iniciaComponentes() {
			miPanelPrincipal = new JPanel();
			miPanelPrincipal.setLayout(null);
			
			/*Propiedades del Label, lo instanciamos, posicionamos y
			 * activamos los eventos*/
			labelTitulo= new JLabel();
			labelTitulo.setText("CONTENEDOR JPANEL");
			labelTitulo.setBounds(200, 20, 180, 23);
			
		    /*propiedades Panel1*/
		    componentesPanel1();
		   	/*propiedades Panel2*/
			componentesPanel2();
			
			botonMostrar = new JButton();
			botonMostrar.setText("Mostrar Panel2");
			botonMostrar.setBounds(50, 230, 150, 23);
			botonMostrar.addActionListener(this);
			
			botonOcultar = new JButton();
			botonOcultar.setText("Ocultar Panel2");
			botonOcultar.setBounds(50, 260, 150, 23);
			botonOcultar.addActionListener(this);
			
			/*Agregamos los componentes al Contenedor*/
			miPanelPrincipal.add(labelTitulo);
			miPanelPrincipal.add(panel1);
			miPanelPrincipal.add(panel2);
			miPanelPrincipal.add(botonMostrar);
			miPanelPrincipal.add(botonOcultar);
			add(miPanelPrincipal);
		}


		private void componentesPanel1() {
			panel1 = new JPanel();
			panel1.setBounds(50, 50, 200, 150);
			panel1.setBackground(Color.red);
			
			tituloPanel1= new JLabel();
			tituloPanel1.setText("Titulo Panel1");
			tituloPanel1.setBounds(40, 20, 90, 23);
			
			panel1.add(tituloPanel1);
		}
		
		private void componentesPanel2() {
			panel2 = new JPanel();
			panel2.setLayout(null);//con esto defino que voy a asignar posiciones de forma manual, sin layout
			panel2.setBounds(280, 50, 200, 150);
			panel2.setBackground(Color.green);
			
			tituloPanel2= new JLabel();
			tituloPanel2.setText("Titulo Panel2");
			tituloPanel2.setBounds(60, 20, 90, 23);
			
			miBotonPanel2 = new JButton();
			miBotonPanel2.setText("Boton");
			miBotonPanel2.setBounds(50, 80, 90, 23);
			
			panel2.add(tituloPanel2);
			panel2.add(miBotonPanel2);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==botonMostrar)
			{
				panel2.setVisible(true);
			}
			if (e.getSource()==botonOcultar)
			{
				panel2.setVisible(false);
			}
		}
		
	}
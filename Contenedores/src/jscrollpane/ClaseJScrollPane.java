package jscrollpane;

import java.awt.Container;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import aplicacion.VentanaPrincipal;

public class ClaseJScrollPane extends JDialog 
	{
		private Container contenedor;
		JLabel labelTitulo;/*declaramos el objeto Label*/
		private JPanel miPanel;//contenedor de los componentes
		private JScrollPane scrollPaneles;
		JTextArea areaDeTexto;
		String texto;
		
		public ClaseJScrollPane(VentanaPrincipal miVentanaPrincipal, boolean modal)//constructor
		{
			super(miVentanaPrincipal, modal);
			miPanel = new JPanel();
			miPanel.setLayout(null);
			scrollPaneles = new JScrollPane(); 
			
			/*Propiedades del Label, lo instanciamos, posicionamos y
			 * activamos los eventos*/
			labelTitulo= new JLabel();
			labelTitulo.setText("CONTENEDOR JSCROLLPANE");
			labelTitulo.setBounds(120, 20, 180, 23);
			
			texto="Este conetenedor permite mostrar las barras de scroll en \nnuestra " +
					"Ventana o Sección de la ventana (si lo adicionamos a\n un panel) " +
					"De esta forma podemos crear gran cantidad de \ncomponentes sin " +
					"necesidad de tener una ventana muy grande.\n\n" +
					"Los scroll se muestran dependiendo del tamaño de la ventana";
			areaDeTexto = new JTextArea();
			areaDeTexto.setText(texto);
			areaDeTexto.setBounds(20, 50, 350, 100);
			
			/*Agregamos los componentes al Contenedor*/
			miPanel.add(labelTitulo);
			miPanel.add(areaDeTexto);
			//add(miPanel);
			miPanel.setPreferredSize(new java.awt.Dimension(400, 220));

			/*Definimos las propiedades del JSCrollPanel*/
			scrollPaneles.setAutoscrolls(true);//indicamos que se creen automaticamente los scroll
		    getContentPane().add(scrollPaneles);
			scrollPaneles.setViewportView(miPanel);//agregamos el panel al scroll 
			
       		//Asigna un titulo a la barra de titulo
			setTitle("CoDejaVu : JScrollPane");
			//tamaño de la ventana
			setSize(400,200);
			//pone la ventana en el Centro de la pantalla
			setLocationRelativeTo(null);
		}
	}
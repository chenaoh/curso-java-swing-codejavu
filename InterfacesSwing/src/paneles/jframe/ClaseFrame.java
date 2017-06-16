package paneles.jframe;

import java.awt.Container;
import javax.swing.JFrame;

public class ClaseFrame extends JFrame 
	{
		private Container contenedor;
		
		public ClaseFrame()//constructor
		{
			contenedor=getContentPane();
			contenedor.setLayout(null);
       		//Asigna un titulo a la barra de titulo
			setTitle("CoDejaVu : Titulo De La ventana");
			//tamaño de la ventana
			setSize(400,200);
			//pone la ventana en el Centro de la pantalla
			setLocationRelativeTo(null);
		}
	}
package paneles;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Panel1 extends JPanel{

	JLabel labelTitulo;/*declaramos el objeto Label*/
	private JPanel miPanel;//contenedor de los componentes
	private JScrollPane scrollPaneles;
	JTextArea areaDeTexto;
	String texto;
	
	public Panel1()//constructor
	{
		setLayout(null);
		
		miPanel = new JPanel();
		miPanel.setLayout(null);
		miPanel.setBackground(Color.cyan);
		
		scrollPaneles = new JScrollPane(); 
		scrollPaneles.setBounds(5,10,380,150);
		
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
		areaDeTexto.setBounds(20, 50, 340, 100);
		
		/*Agregamos los componentes al Contenedor*/
		miPanel.add(labelTitulo);
		miPanel.add(areaDeTexto);
		//add(miPanel);
		miPanel.setPreferredSize(new java.awt.Dimension(350, 250));

		scrollPaneles.setViewportView(miPanel);//agregamos el panel al scroll 

		add(scrollPaneles);
	}
	
}

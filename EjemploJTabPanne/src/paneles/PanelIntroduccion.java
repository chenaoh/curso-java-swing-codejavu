package paneles;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelIntroduccion extends JPanel {
	
	JLabel labelTitulo;/*declaramos el objeto Label*/
	JTextArea areaDeTexto;
	
	public PanelIntroduccion(){
		setLayout(null);
		
		iniciarComponentes();
		
	}

	private void iniciarComponentes() {
		/*Propiedades del Label, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		labelTitulo= new JLabel();
		labelTitulo.setText("CONTENEDOR JTABBEDPANE");
		labelTitulo.setBounds(120, 20, 180, 23);
		
		String texto="Este conetenedor presenta una ventana con pestañas en su\n barra " +
				"de tareas, cada pestaña presenta un panel diferente \ndonde se " +
				"pueden almacenar otros componentes\n Java Swing ";
		areaDeTexto = new JTextArea();
		areaDeTexto.setText(texto);
		areaDeTexto.setBounds(20, 50, 350, 100);
		
		/*Agregamos los componentes al Contenedor*/
		add(labelTitulo);
		add(areaDeTexto);
		
	}

}

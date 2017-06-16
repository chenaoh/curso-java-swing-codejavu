package jsplitpane;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

import aplicacion.VentanaPrincipal;

public class ClaseJSplitPane extends JDialog {
	JSplitPane splitPanel1;
	JTextArea areaDeTexto;
	String texto;
	JLabel labelTitulo, tituloPanel1,tituloPanel2;/*declaramos el objeto Label*/
	
	public ClaseJSplitPane(VentanaPrincipal miVentanaPrincipal, boolean modal){
		/*Al llamar al constructor super(), le enviamos el
		 * JFrame Padre y la propiedad booleana que determina
		 * que es hija*/
		super(miVentanaPrincipal, modal);

   		//Asigna un titulo a la barra de titulo
		setTitle("CoDejaVu : JSplitPane");
		
		/*Agregamos los componentes al Contenedor*/
		inciaComponentes();
		
		//tamaño de la ventana
		setSize(600,300);
		//pone la ventana en el Centro de la pantalla
		setLocationRelativeTo(null);
		
	}

	private void inciaComponentes() {
		
		splitPanel1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		iniciaPanel1();
		
		splitPanel1.add(labelTitulo);
		splitPanel1.add(areaDeTexto);
		
		getContentPane().add(splitPanel1, BorderLayout.CENTER);

		pack();
		
	}

	private void iniciaPanel1() {
		
		/*Propiedades del Label, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		labelTitulo= new JLabel();
		labelTitulo.setText("CONTENEDOR JSPLITPANE");
		//labelTitulo.setBounds(120, 20, 180, 23);
		
		texto="Este conetenedor presenta una ventana con pestañas en su\n barra " +
				"de tareas, cada pestaña presenta un panel diferente \ndonde se " +
				"pueden almacenar otros componentes\n Java Swing ";
		areaDeTexto = new JTextArea();
		areaDeTexto.setText(texto);
		//areaDeTexto.setBounds(20, 50, 350, 100);
		
	}

}

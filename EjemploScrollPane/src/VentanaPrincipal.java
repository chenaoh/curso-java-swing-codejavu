import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;


public class VentanaPrincipal extends JFrame{

	JLabel labelTitulo;
	private JPanel miPanel;
//	private JScrollPane scrollPaneles;
	JTextArea areaDeTexto;
	String texto;
		
	VentanaPrincipal ()
	{
		setTitle     ( "CoDejaVu : JScrollPane" ); 
		setSize      ( 420, 250   );
		//pone la ventana en el Centro de la pantalla
		setLocationRelativeTo(null);
		
		iniciarComponentes();
		
	}

	private void iniciarComponentes() {
		miPanel = new JPanel();
		miPanel.setLayout(null);
		miPanel.setBackground(Color.cyan);
		
	//	scrollPaneles = new JScrollPane(); 
	//	scrollPaneles.setBounds(5,10,380,150);
		
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

	//	scrollPaneles.setViewportView(miPanel);//agregamos el panel al scroll 
		add(miPanel);//comentar
	//	add(scrollPaneles);
	}
	
}

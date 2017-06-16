package jdesktoppane;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import aplicacion.VentanaPrincipal;

/**
 * Instancia un JFrame con un JDesktopPane y dentro de este
 * un JInternalFrame.
 * @author chuidiang
 *
 */
public class ClaseJDesktopPane extends JDialog  implements ActionListener {
	
	JInternalFrame internalFrame, internalFrame2; 
	JDesktopPane desktopPane;
	JPanel miPanel,panel1;
	JLabel labelTitulo,tituloPanel1;
	JButton boton;
	JTextArea areaDeTexto;
	String texto;
	private JMenuBar barraMenu;
	private JMenu menu;
	private JMenuItem menuItemVentana1;
	int posA=20, posB=300;

	
	public ClaseJDesktopPane(VentanaPrincipal miVentanaPrincipal, boolean modal)
	{
		super(miVentanaPrincipal, modal);
		desktopPane = new JDesktopPane();
		
		barraMenu = new JMenuBar();
		menu = new JMenu();
		menuItemVentana1 = new JMenuItem();
	        
	    /*Crea los items del menu mostrar ventana 1..*/
	    menuItemVentana1.setText("Muestra Ventana 1");
	    menu.add(menuItemVentana1);
	    menuItemVentana1.addActionListener(this);
	    
	    
	    menu.setText("Menú");
	    barraMenu.add(menu);

	    setJMenuBar(barraMenu);
		
		/*llama al metodo para inicializar el panel*/		
		componentesPanel1();
		componentesPanel2();
		
		/*Propiedades del JInternalFrame*/
		internalFrame = new JInternalFrame("Ventana Interna 1");
		internalFrame.add(miPanel);
		internalFrame.setBounds(10,20,350,200);//definimos un tamaño y una posicion de la ventana
		
		internalFrame2 = new JInternalFrame("Ventana Interna 2");
		internalFrame2.add(panel1);
		internalFrame2.setBounds(10,300,200,100);//definimos un tamaño y una posicion de la ventana
		internalFrame2.setResizable(true);//permite redimencionar la ventana interna
		internalFrame2.setClosable(true);//permite cerrar la ventana interna

		//internalFrame.setSize(400,200);//con esto se da un tamaño a la ventana
		/*en caso de no darle un tamaño fijo a la ventana,Se invoca el metodo pack()
		 *para que se pueda visualizar la ventana interna, sino no se muestra*/
		//internalFrame.pack();
		
		desktopPane.add(internalFrame);
		desktopPane.add(internalFrame2);
		// Muestra las ventanas internas
		internalFrame.setVisible(true);
		internalFrame2.setVisible(true);
		getContentPane().add(desktopPane);
		
		//Asigna un titulo a la barra de titulo
		setTitle("CoDejaVu : JDesktopPane");
		// Se visualiza todo.
		setSize(600,700);
		
		//pone la ventana en el Centro de la pantalla
		setLocationRelativeTo(null);
	}
	
	/**
	 * Creamos la segunda ventana, usamos los atributos de pos
	 * para determinar las posiciones de los elementos nuevos
	 */
	private void creaVentana2() {
		if (posA>300) {
			posA=50;
			posB+=50;
		}
		posA+=50;
		internalFrame2 = new JInternalFrame("Ventana Interna 2");
		internalFrame2.add(panel1);
		internalFrame2.setBounds(posA,posB,200,100);//definimos un tamaño y una posicion de la ventana
		internalFrame2.setResizable(true);//permite redimencionar la ventana interna
		internalFrame2.setClosable(true);//permite cerrar la ventana interna
		desktopPane.add(internalFrame2);
		internalFrame2.setVisible(true);
	}

	private void componentesPanel1() {
		miPanel = new JPanel();
		miPanel.setLayout(null);
		
		/*Propiedades del Label, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		labelTitulo= new JLabel();
		labelTitulo.setText("CONTENEDOR JDESKTOPPANE");
		labelTitulo.setBounds(90, 20, 180, 23);
		
		texto="Este conetenedor presenta una ventana principal\n" +
				"junto con otras ventanas internas, cada ventana\n" +
				"sera independiente y permite cambiar su posición\n" +
				"y tamaño (dependiendo de las propiedades\n asignadas)";
		areaDeTexto = new JTextArea();
		areaDeTexto.setText(texto);
		areaDeTexto.setBounds(20, 50, 290, 100);
		
		/*Agregamos los componentes al Contenedor*/
		miPanel.add(labelTitulo);
		miPanel.add(areaDeTexto);
		//add(miPanel);
		
	}

	private void componentesPanel2() {
		panel1 = new JPanel();
		panel1.setBounds(50, 50, 200, 150);
		panel1.setBackground(Color.CYAN);
		
		tituloPanel1= new JLabel();
		tituloPanel1.setText("Titulo Panel1");
		tituloPanel1.setBounds(40, 20, 90, 23);
		
		panel1.add(tituloPanel1);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource()==menuItemVentana1) {
			creaVentana2();
		}
	}

}
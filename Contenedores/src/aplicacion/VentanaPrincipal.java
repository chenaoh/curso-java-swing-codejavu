package aplicacion;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


import jdesktoppane.ClaseJDesktopPane;
import jdialog.ClaseJDialog;
import jframe.ClaseFrame;
import jpanel.ClaseJPanel;
import jscrollpane.ClaseJScrollPane;
import jsplitpane.ClaseJSplitPane;
import jtabbedpane.ClaseJTabbedPane;
import jtoolbar.ClaseJToolbar;

public class VentanaPrincipal extends JFrame implements ActionListener {
	
	private Container contenedor;/*declaramos el contenedor*/
	/*declaramos los objetos Boton*/
	JButton botonJFrame,botonJDialog,botonJPanel,botonJScrollPane,botonJSplitPane,botonJTabbedPane,botonJDesktopPane,botonJToolBar;
	JLabel labelTitulo;/*declaramos el objeto Label*/
	private VentanaPrincipal miVentanaPrincipal;
	private JMenuBar barraMenu;
	private JMenu menuAcercaDe;
	 /*items del menu Acerca De...*/
    private JMenuItem menuItemAplicacion,menuItemBlog;
	String informacionAplicacion="";
	String informacionCoDejaVu="";
	
	public VentanaPrincipal(){
		
		/*Inicializamos el Mensaje del menu Acerca de...*/
		informacionAplicacion="Esta es una aplicacion simple con el fin de exponer \n";
		informacionAplicacion+="de forma sencilla los diferentes contenedores \n";
		informacionAplicacion+="Java Swing.\n\n";
		informacionAplicacion+="Autor: Cristian David Henao H.\n\n\n";
		
		informacionCoDejaVu="CoDejaVu es un blog personal sobre lecciones Aprendidas\n";
		informacionCoDejaVu+="en torno a Ingenieria de Software, presentando conceptos\n";
		informacionCoDejaVu+="basicos y ejemplos sencillos de programación.\n\n";
		informacionCoDejaVu+="codejavu.blogspot.com\n\n\n";
		
		/**/
		/*permite iniciar las propiedades de los componentes*/
		iniciarComponentes();
   		/*Asigna un titulo a la barra de titulo*/
		setTitle("CoDejaVu : JFrame VentanaPrincipal");
		/*tamaño de la ventana*/
		setSize(740,300);
		/*pone la ventana en el Centro de la pantalla*/
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		barraMenu = new JMenuBar();
		menuAcercaDe = new JMenu();
		menuItemAplicacion = new JMenuItem();
	    menuItemBlog = new JMenuItem();
	        
	    /*Crea los items del menu Acerca De...*/
	    menuItemAplicacion.setText("Aplicación");
	    menuAcercaDe.add(menuItemAplicacion);
	    menuItemAplicacion.addActionListener(this);
	        
	    menuItemBlog.setText("CoDejaVu...");
	    menuAcercaDe.add(menuItemBlog);
	    menuItemBlog.addActionListener(this);
	        
	    menuAcercaDe.setText("Acerca de...");
	    barraMenu.add(menuAcercaDe);

	    setJMenuBar(barraMenu);
		
		/*Propiedades del boton, lo instanciamos, posicionamos y
		 * activamos los eventos*/

	    botonJFrame= new JButton();
	    botonJFrame.setText("Ejemplo JFrame");
	    botonJFrame.setBounds(40, 80, 200, 25);
	    botonJFrame.addActionListener(this);
	    
	    botonJDialog= new JButton();
		botonJDialog.setText("Ejemplo JDialog");
		botonJDialog.setBounds(260, 80, 200, 25);
		botonJDialog.addActionListener(this);
		
		botonJPanel= new JButton();
		botonJPanel.setText("Ejemplo JPanel");
		botonJPanel.setBounds(480, 80, 200, 25);
		botonJPanel.addActionListener(this);
		
		botonJScrollPane= new JButton();
		botonJScrollPane.setText("Ejemplo JScrollPane");
		botonJScrollPane.setBounds(40, 120, 200, 25);
		botonJScrollPane.addActionListener(this);
		    
		botonJSplitPane= new JButton();
		botonJSplitPane.setText("Ejemplo JSplitPane");
		botonJSplitPane.setBounds(260, 120, 200, 25);
		botonJSplitPane.addActionListener(this);
		
		botonJTabbedPane= new JButton();
		botonJTabbedPane.setText("Ejemplo JTabbedPane");
		botonJTabbedPane.setBounds(480, 120, 200, 25);
		botonJTabbedPane.addActionListener(this);
		
		botonJDesktopPane= new JButton();
		botonJDesktopPane.setText("Ejemplo JDesktopPane");
		botonJDesktopPane.setBounds(150, 160, 200, 25);
		botonJDesktopPane.addActionListener(this);
		
		botonJToolBar= new JButton();
		botonJToolBar.setText("Ejemplo JToolBar");
		botonJToolBar.setBounds(370, 160, 200, 25);
		botonJToolBar.addActionListener(this);
		/////////////////////////////////////
		
		/*Propiedades del Label, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		labelTitulo= new JLabel();
		labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 28));
		labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		labelTitulo.setText("CONTENEDORES JAVA SWING");
		labelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
	    labelTitulo.setBounds(110, 10, 500, 40);
		
		/*Agregamos los componentes al Contenedor*/
		contenedor.add(labelTitulo);
		contenedor.add(botonJFrame);
		contenedor.add(botonJDialog);
		contenedor.add(botonJPanel);
		contenedor.add(botonJScrollPane);
		contenedor.add(botonJSplitPane);
		contenedor.add(botonJTabbedPane);
		contenedor.add(botonJDesktopPane);
		contenedor.add(botonJToolBar);
	}

	/*Agregamos el evento al momento de llamar la otra ventana*/
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource()==botonJFrame)
		{
			ClaseFrame miClaseJFrame= new ClaseFrame();
			miClaseJFrame.setVisible(true);
		}
		if (evento.getSource()==botonJDialog)
		{
			ClaseJDialog miClaseJDialog=new ClaseJDialog(miVentanaPrincipal,true);
			miClaseJDialog.setVisible(true);
		}
		if (evento.getSource()==botonJPanel)
		{
			ClaseJPanel miClaseJPanel= new ClaseJPanel(miVentanaPrincipal,true);
			miClaseJPanel.setVisible(true);
		}
		if (evento.getSource()==botonJScrollPane)
		{
			ClaseJScrollPane miClaseJScrollPane = new ClaseJScrollPane(miVentanaPrincipal,true);
			miClaseJScrollPane.setVisible(true);
		}
		if (evento.getSource()==botonJTabbedPane)
		{
			ClaseJTabbedPane miClaseJTabbedPane = new ClaseJTabbedPane(miVentanaPrincipal,true);
			miClaseJTabbedPane.setVisible(true);
		}
		if (evento.getSource()==botonJDesktopPane)
		{
			ClaseJDesktopPane miClaseJDesktopPane = new ClaseJDesktopPane(miVentanaPrincipal,true);
			miClaseJDesktopPane.setVisible(true);
		}
		if (evento.getSource()==botonJToolBar)
		{
			ClaseJToolbar miClaseJToolbar = new ClaseJToolbar(miVentanaPrincipal,true);
			miClaseJToolbar.setVisible(true);
		}
		if (evento.getSource()==botonJSplitPane)
		{
			ClaseJSplitPane miClaseJSplitPane = new ClaseJSplitPane(miVentanaPrincipal,true);
			miClaseJSplitPane.setVisible(true);
		}
		/*Desde aqui tambien trabajamos algunos eventos simples*/
		if (evento.getSource()==menuItemAplicacion) {
			JOptionPane.showMessageDialog(null, informacionAplicacion,"INFORMACION",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if (evento.getSource()==menuItemBlog) {
			JOptionPane.showMessageDialog(null, informacionCoDejaVu,"CoDejaVu!!!",JOptionPane.WARNING_MESSAGE);
		}
	}
}

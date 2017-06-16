package aplicacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

/**
 * @author HENAO
 * @author codejavu
 *
 */
public class VentanaPrincipal extends JFrame implements ActionListener
	{

		private JPanel miPanel;//contenedor de los componentes
		private JMenuBar barraMenu;
		private JMenu menuArchivo,menuEdicion,menuAcercaDe, subMenuGirar, menuOpciones;
		/*items del menu Archivo*/
	    private JMenuItem menuItemNuevo,menuItemAbrir,menuItemGuardar,itemSalir;
	    /*items del menu Edicion*/
	    private JMenuItem menuItemCopiar,menuItemPegar,menuItemGirar1,menuItemGirar2;
	    /*items del menu Acerca De...*/
	    private JMenuItem menuItemAplicacion,menuItemBlog;
	    /*items del menu Opciones*/
	    private JRadioButtonMenuItem jRadioButtonMenu1,jRadioButtonMenu2;
	    private JCheckBoxMenuItem jCheckMenu1,jCheckMenu2;
	    /*labels de los menus para mostrar en pantalla*/
	    private JLabel labelArchivo, labelEdicion, labelOpciones, titulo;
	    private JLabel labelArchivoSeleccionado, labelEdicionSeleccionado, labelOpcionesCheckSeleccionadas,labelOpcionesRadioSeleccionadas;
	    
	    private JPopupMenu menuEmergente;
	    private JMenuItem itemEmergente1,itemEmergente2;
	    
	    /*Cadenas para asignar los resultados de eventos*/
		String cadenaArchivo="";
		String cadenaEdicion="";
		String cadenaOpcionesCheck="";
		String cadenaOpcionesRadio="";
		String cadenaCheck1="";
		String cadenaCheck2="";
		String cadenaRadio1="";
		String cadenaRadio2="";
		String informacionAplicacion="";
		String informacionCoDejaVu="";
		
		public VentanaPrincipal()//constructor
		{
			iniciarComponentes();
       		//Asigna un titulo a la barra de titulo
			setTitle("CoDejaVu : Titulo De La ventana");
			//tamaño de la ventana
			setSize(400,200);
			//pone la ventana en el Centro de la pantalla
			setLocationRelativeTo(null);
			/*impide que la ventana cambie de tamaño*/
			setResizable(false);
		}

		private void iniciarComponentes() {
						
			/*Inicializamos el Mensaje del menu Acerca de...*/
			informacionAplicacion="Esta es una aplicacion simple con el fin de exponer \n";
			informacionAplicacion+="de forma sencilla el funcionamieno basico de los \n";
			informacionAplicacion+="componentes de Texto Java Swing.\n\n";
			informacionAplicacion+="Autor: Cristian David Henao H.\n\n\n";
			
			informacionCoDejaVu="CoDejaVu es un blog personal sobre lecciones Aprendidas\n";
			informacionCoDejaVu+="entorno a Ingenieria de Software, presentando conceptos\n";
			informacionCoDejaVu+="basicos y ejemplos sencillos de programación.\n\n";
			informacionCoDejaVu+="codejavu.blogspot.com\n\n\n";
			
			/**/
			
			/*Inicia instancias de los componentes*/
			miPanel = new JPanel();
			miPanel.setLayout(null);
			barraMenu = new JMenuBar();
	        menuArchivo = new JMenu();
	        menuEdicion = new JMenu();
	        menuOpciones = new JMenu();
	        menuAcercaDe = new JMenu();
	        subMenuGirar = new JMenu();
	        menuItemNuevo = new JMenuItem();
	        menuItemAbrir = new JMenuItem();
	        menuItemGuardar = new JMenuItem();
	        itemSalir = new JMenuItem();
	        
	        menuItemCopiar = new JMenuItem();
	        menuItemPegar = new JMenuItem();
	        menuItemGirar1 = new JMenuItem();
	        menuItemGirar2 = new JMenuItem();
	        
	        menuItemAplicacion = new JMenuItem();
	        menuItemBlog = new JMenuItem();
	        
	        itemEmergente1 = new JMenuItem();
	        itemEmergente2 = new JMenuItem();
	        
	        menuEmergente = new JPopupMenu();
	        
	        titulo =new JLabel();
	        labelArchivo =new JLabel();
	        labelEdicion =new JLabel();
	        labelOpciones =new JLabel();	
	        labelArchivoSeleccionado =new JLabel();
	        labelEdicionSeleccionado =new JLabel();
	        labelOpcionesCheckSeleccionadas =new JLabel();
	        labelOpcionesRadioSeleccionadas =new JLabel();
	        /*Fin instancias de los componentes*/  
	        
	        /*Labels*/
	        titulo.setBounds(10,0,80,30);
	        titulo.setText("MENU");
	        
	        labelArchivo.setBounds(10,20,80,30);
	        labelArchivo.setText("Archivo : ");
	        
	        labelEdicion.setBounds(10,40,80,30);
	        labelEdicion.setText("Edicion : ");
	        
	        labelOpciones.setBounds(10,60,80,30);
	        labelOpciones.setText("Opciones : ");
	        
	        labelArchivoSeleccionado.setBounds(70,20,200,30);
	        labelEdicionSeleccionado.setBounds(70,40,200,30);
	        labelOpcionesCheckSeleccionadas.setBounds(75,60,200,30);
	        labelOpcionesRadioSeleccionadas.setBounds(75,80,200,30);
	        /*Labels*/
	        
	        /*Crea los items del menu Archivo*/
	        menuItemNuevo.setText("Nuevo");
	        menuItemNuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));  
	        menuArchivo.add(menuItemNuevo);   
	        menuArchivo.addSeparator();
	        
	        menuItemAbrir.setText("Abrir");
	        menuArchivo.add(menuItemAbrir);
	        menuArchivo.addSeparator();
	                       
	        menuItemGuardar.setText("Guardar");
	        menuArchivo.add(menuItemGuardar);
	        menuArchivo.addSeparator();
	        
	        itemSalir.setText("Salir");
	        menuArchivo.add(itemSalir);
	        
	        /*Crea los items del menu Edicion*/
	        menuItemCopiar.setText("Copiar");
	        menuEdicion.add(menuItemCopiar);
	        	        
	        menuItemPegar.setText("Pegar");
	        menuEdicion.add(menuItemPegar);

	        /*Crea los items del menu Girar que en este caso lo usamos como
	         *subMenu*/
	        menuItemGirar1.setText("Vertical");
	        subMenuGirar.add(menuItemGirar1);
	        
	        menuItemGirar2.setText("Horizontal");
	        subMenuGirar.add(menuItemGirar2);
	        
	        /*Agregamos el Menu Girar al Menu Edicion para que Edicion
	         *Contenga a Girar como un SubMenu*/
	        subMenuGirar.setText("Girar");
	        menuEdicion.add(subMenuGirar);
	        
	        /////////////////////////////
	        //Creamos los items de checkbox.
	        menuOpciones.addSeparator();
	        jCheckMenu1 = new JCheckBoxMenuItem("Check1");
	        menuOpciones.add(jCheckMenu1);

	        jCheckMenu2 = new JCheckBoxMenuItem("Check2");
	        menuOpciones.add(jCheckMenu2);
	        
	        //Creamos los items de radioButtons
	        menuOpciones.addSeparator();
	        ButtonGroup grupoRadios = new ButtonGroup();

	        jRadioButtonMenu1 = new JRadioButtonMenuItem("Radio1");
	        grupoRadios.add(jRadioButtonMenu1);
	        menuOpciones.add(jRadioButtonMenu1);

	        jRadioButtonMenu2 = new JRadioButtonMenuItem("Radio2");
	        grupoRadios.add(jRadioButtonMenu2);
	        menuOpciones.add(jRadioButtonMenu2);
	        
	        ///////////////////////
	        
	        ///Creamos los items del Menu emergente o Popup
	        itemEmergente1.setText("Opcion Emergente 1");
	        menuEmergente.add(itemEmergente1);
	        itemEmergente2.setText("Opcion Emergente 2");
	        menuEmergente.add(itemEmergente2);
	        ///
	        	        
	        /*Crea los items del menu Acerca De...*/
	        menuItemAplicacion.setText("Aplicación");
	        menuAcercaDe.add(menuItemAplicacion);
	        
	        menuItemBlog.setText("CoDejaVu...");
	        menuAcercaDe.add(menuItemBlog);
	        
	        /*Agrega los Menus de la barra de Menu*/
	        menuArchivo.setText("Archivo");
	        barraMenu.add(menuArchivo);
	        
	        menuEdicion.setText("Edicion");
	        barraMenu.add(menuEdicion);
	        
	        menuOpciones.setText("Opciones");
	        barraMenu.add(menuOpciones);
	        
	        menuAcercaDe.setText("Acerca de...");
	        barraMenu.add(menuAcercaDe);

	        setJMenuBar(barraMenu);
	        
	        /*Creamos los eventos para las opciones*/
	        menuItemNuevo.addActionListener(this);
	        menuItemAbrir.addActionListener(this);
	        menuItemGuardar.addActionListener(this);
	        itemSalir.addActionListener(this);
	        menuItemCopiar.addActionListener(this);
	        menuItemPegar.addActionListener(this);
	        menuItemGirar1.addActionListener(this);
	        menuItemGirar2.addActionListener(this);
	        menuItemAplicacion.addActionListener(this);
	        menuItemBlog.addActionListener(this);
	        jCheckMenu1.addActionListener(this);
	        jCheckMenu2.addActionListener(this);
	        jRadioButtonMenu1.addActionListener(this);
	        jRadioButtonMenu2.addActionListener(this);
	        itemEmergente1.addActionListener(this);
	        itemEmergente2.addActionListener(this);
	        
	        miPanel.add(titulo);
	        miPanel.add(labelArchivo);
	        miPanel.add(labelEdicion);
	        miPanel.add(labelOpciones);
	        miPanel.add(labelArchivoSeleccionado);
	        miPanel.add(labelEdicionSeleccionado);
	        miPanel.add(labelOpcionesCheckSeleccionadas);
	        miPanel.add(labelOpcionesRadioSeleccionadas);
	        miPanel.setComponentPopupMenu(menuEmergente);
	        add(miPanel);
	        
		}

		@Override
		public void actionPerformed(ActionEvent evento) {
			
			/*Cada metodo valida si se presiona o no alguna de las 
			 *opciones del menu, se trabajan en metodos separados por organizacion*/
			eventosMenuArchivo(evento);
			labelArchivoSeleccionado.setText(cadenaArchivo);
			
			eventosMenuEdicion(evento);
			labelEdicionSeleccionado.setText(cadenaEdicion);
			
			eventosOpciones(evento);			
			labelOpcionesCheckSeleccionadas.setText(cadenaOpcionesCheck);
			labelOpcionesRadioSeleccionadas.setText(cadenaOpcionesRadio);
			
			
			/*Desde aqui tambien trabajamos algunos eventos simples*/
			if (evento.getSource()==menuItemAplicacion) {
				JOptionPane.showMessageDialog(null, informacionAplicacion,"INFORMACION",JOptionPane.INFORMATION_MESSAGE);
			}
			
			if (evento.getSource()==menuItemBlog) {
				JOptionPane.showMessageDialog(null, informacionCoDejaVu,"CoDejaVu!!!",JOptionPane.WARNING_MESSAGE);
			}
			
			if (evento.getSource()==itemEmergente1) {
				JOptionPane.showMessageDialog(null, "Presionó la opción emergente 1");
			}
			
			if (evento.getSource()==itemEmergente2) {
				JOptionPane.showMessageDialog(null, "Presionó la opción emergente 2");
			}
			
		}


		/**
		 * Metodos para los eventos del menu Archivo
		 * @param e
		 */
		private void eventosMenuArchivo(ActionEvent e) {

			if (e.getSource()==menuItemNuevo) {
				cadenaArchivo=""+menuItemNuevo.getText();
			}
			if (e.getSource()==menuItemAbrir) {
				cadenaArchivo=" "+menuItemAbrir.getText();
			}
			if (e.getSource()==menuItemGuardar) {
				cadenaArchivo=""+menuItemGuardar.getText();
			}
			if (e.getSource()==itemSalir) {
				cadenaArchivo=""+itemSalir.getText();
			}
		}
		
		/**
		 * Metodos para los eventos del menu Edicion
		 * @param e
		 */
		private void eventosMenuEdicion(ActionEvent e) {
			
			if (e.getSource()==menuItemCopiar) {
				cadenaEdicion=""+menuItemCopiar.getText();
			}
			if (e.getSource()==menuItemPegar) {
				cadenaEdicion=""+menuItemPegar.getText();
			}
			if (e.getSource()==menuItemGirar1) {
				cadenaEdicion="Girar/"+menuItemGirar1.getText();
			}
			if (e.getSource()==menuItemGirar2) {
				cadenaEdicion="Girar/"+menuItemGirar2.getText();
			}
		}
		

		/**
		 * Metodos para los eventos del menu Opciones
		 * @param e
		 */
		private void eventosOpciones(ActionEvent e) {
			
			if (e.getSource()==jCheckMenu1) {
				if (jCheckMenu1.getState()) {
					cadenaCheck1=jCheckMenu1.getText()+" es True";
				}else{
					cadenaCheck1=jCheckMenu1.getText()+" es False";
				}
			}
			if (e.getSource()==jCheckMenu2) {
				if (jCheckMenu2.getState()) {
					cadenaCheck2=jCheckMenu2.getText()+" es True";
				}else{
					cadenaCheck2=jCheckMenu2.getText()+" es False";
				}
			}
			
			if (e.getSource()==jRadioButtonMenu1 || e.getSource()==jRadioButtonMenu2 ) {
				if (jRadioButtonMenu1.isSelected()) {
					cadenaRadio1=jRadioButtonMenu1.getText()+" es True";
				}else{
					cadenaRadio1=jRadioButtonMenu1.getText()+" es False";
				}
	
				if (jRadioButtonMenu2.isSelected()) {
					cadenaRadio2=jRadioButtonMenu2.getText()+" es True";
				}else{
					cadenaRadio2=jRadioButtonMenu2.getText()+" es False";
				}
			}

			cadenaOpcionesCheck = cadenaCheck1+", "+cadenaCheck2;
			cadenaOpcionesRadio = cadenaRadio1+", "+cadenaRadio2;
		}


	}
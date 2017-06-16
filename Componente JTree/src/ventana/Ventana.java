package ventana;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
 

/**
 * @author HENAO
 * @author CoDejaVu.blogspot.com
 *
 */
public class Ventana extends JFrame implements TreeSelectionListener {
 
 
    private JPanel panelPrincipal;
    JLabel labelTitulo;/*declaramos el objeto Label*/
    JLabel tituloPanel1,tituloPanel2,tituloPanel3,tituloPanel4,tituloPanel5,tituloPanel6;
    JTree arbol;/*declaramos el objeto Arbol*/
    JScrollPane scrollPaneArbol,scrollPaneArea;
    JTextArea areaDeTexto;
    String s="";
    private JPanel panel1,panel2,panel3,panel4,panel5,panel6;//paneles de ejemplo

    public Ventana() {
    	    	  
    	iniciaComponentes();
    	    	
    	setTitle("CoDejaVu : Ejemplo JTree");
        //tamaño de la ventana
        setSize(340,430);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


	private void iniciaComponentes() {
		
        panelPrincipal = new JPanel();
        setContentPane(panelPrincipal);
        panelPrincipal.setLayout(null);
        
        /*Propiedades del label*/
		labelTitulo= new JLabel();
		labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 28));
		labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		labelTitulo.setText("Componente JTree");
		labelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		labelTitulo.setBounds(10, 20, 300, 40);
 
        arbol = new JTree();
        
        //llamamos el metodo que permite la creación del Arbol
        crearArbol();
        
        scrollPaneArbol = new JScrollPane();
        scrollPaneArbol.setBounds(10, 80, 150, 130);
        scrollPaneArbol.setViewportView(arbol);
        
        /*como son muchos paneles los creamos mediante el llamado a metodos
         * para facilitar el entendimiento del codigo*/
        definePaneles();
        
        areaDeTexto = new JTextArea();
        scrollPaneArea = new JScrollPane();
        scrollPaneArea.setBounds(10,220, 300, 120);
        scrollPaneArea.setViewportView(areaDeTexto);

        panelPrincipal.add(labelTitulo);
        panelPrincipal.add(scrollPaneArbol);
        panelPrincipal.add(scrollPaneArea);
        panelPrincipal.add(panel1);
        panelPrincipal.add(panel2);
        panelPrincipal.add(panel3);
        panelPrincipal.add(panel4);
        panelPrincipal.add(panel5);
        panelPrincipal.add(panel6);        
	}


	/**
	 * Creamos los nodos y las propiedades del arbol
	 */
	private void crearArbol() {
		
		/*Construimos los nodos del arbol que seran ramas u hojas*/
        DefaultMutableTreeNode carpetaRaiz = new DefaultMutableTreeNode("Carpeta");
        /*Definimos el modelo donde se agregaran los nodos*/
        DefaultTreeModel modelo = new DefaultTreeModel(carpetaRaiz);
        /*agregamos el modelo al arbol, donde previamente establecimos la raiz*/
        arbol = new JTree(modelo);
        /*definimos los eventos*/
        arbol.getSelectionModel().addTreeSelectionListener(this);
        
        /*Definimos mas nodos del arbol y se lo agregamos al modelo*/
        DefaultMutableTreeNode carpeta2 = new DefaultMutableTreeNode("SubCarpeta");
        DefaultMutableTreeNode archivo1 = new DefaultMutableTreeNode("Archivo1");
        DefaultMutableTreeNode archivo2 = new DefaultMutableTreeNode("Archivo2");
        DefaultMutableTreeNode archivo3 = new DefaultMutableTreeNode("Archivo3");
        /*Definimos donde se agrega el nodo, dentro de que rama y que posicion*/
        modelo.insertNodeInto(carpeta2, carpetaRaiz, 0);
        modelo.insertNodeInto(archivo1, carpetaRaiz, 1);
        modelo.insertNodeInto(archivo2, carpetaRaiz, 2);

        /*Creamos las hojas del arbol*/
        DefaultMutableTreeNode archivo4 = new DefaultMutableTreeNode("Archivo4");
        DefaultMutableTreeNode archivo5 = new DefaultMutableTreeNode("Archivo5");
        DefaultMutableTreeNode archivo6 = new DefaultMutableTreeNode("Archivo6");
        
        modelo.insertNodeInto(archivo3, carpeta2, 0);
        modelo.insertNodeInto(archivo4, carpeta2, 1);
        modelo.insertNodeInto(archivo5, carpeta2, 2);
        modelo.insertNodeInto(archivo6, carpeta2, 3);
	}

	
	/**
	 * Metodo para facilitar la organizacion, tan solo lo llamamos
	 * para inicializar los paneles que necesitamos
	 */
	private void definePaneles() {
        
		/*Cada metodo posee las propiedades
		 *y codigo necesario para la creacion de un panel*/
	    componentesPanel1();
	   	componentesPanel2();
	   	componentesPanel3();
	   	componentesPanel4();
	   	componentesPanel5();
	   	componentesPanel6();
        
	}

	/**propiedades Panel1*/
	private void componentesPanel1() {
		panel1 = new JPanel();
		panel1.setBounds(160, 80, 150, 130);
		panel1.setBackground(Color.red);
		panel1.setVisible(false);
		tituloPanel1= new JLabel();
		tituloPanel1.setText("Titulo Panel1");
		tituloPanel1.setBounds(40, 20, 90, 23);
		panel1.add(tituloPanel1);
	}
	
	void metod(){
		
	}

	/**propiedades Panel2*/
	private void componentesPanel2() {
		panel2 = new JPanel();
		panel2.setBounds(160, 80, 150, 130);
		
	
		Color color= new Color(0, 0, 0);
		panel2.setBackground(color);
		panel2.setVisible(false);
		tituloPanel2= new JLabel();
		tituloPanel2.setText("Titulo Panel1");
		tituloPanel2.setBounds(40, 20, 90, 23);
		panel2.add(tituloPanel2);
	}
	
	/**propiedades Panel3*/
	private void componentesPanel3() {
		panel3 = new JPanel();
		panel3.setBounds(160, 80, 150, 130);
		panel3.setBackground(Color.green);
		panel3.setVisible(false);
		tituloPanel3= new JLabel();
		tituloPanel3.setText("Titulo Panel3");
		tituloPanel3.setBounds(40, 20, 90, 23);
		panel3.add(tituloPanel3);
	}
	
	/**propiedades Panel4*/
	private void componentesPanel4() {
		panel4 = new JPanel();
		panel4.setBounds(160, 80, 150, 130);
		panel4.setBackground(Color.white);
		panel4.setVisible(false);
		tituloPanel4= new JLabel();
		tituloPanel4.setText("Titulo Panel4");
		tituloPanel4.setBounds(40, 20, 90, 23);
		panel4.add(tituloPanel4);
	}
	
	/**propiedades Panel5*/
	private void componentesPanel5() {
		panel5 = new JPanel();
		panel5.setBounds(160, 80, 150, 130);
		panel5.setBackground(Color.cyan);
		panel5.setVisible(false);
		tituloPanel5= new JLabel();
		tituloPanel5.setText("Titulo Panel5");
		tituloPanel5.setBounds(40, 20, 90, 23);
		panel5.add(tituloPanel5);
	}

	/**propiedades Panel6*/
	private void componentesPanel6() {
		panel6 = new JPanel();
		panel6.setBounds(160, 80, 150, 130);
		panel6.setBackground(Color.yellow);
		panel6.setVisible(false);
		tituloPanel6= new JLabel();
		tituloPanel6.setText("Titulo Panel6");
		tituloPanel6.setBounds(40, 20, 90, 23);
		panel6.add(tituloPanel6);
	}

	
	

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		
		 DefaultMutableTreeNode nodoSeleccionado;
		 nodoSeleccionado = (DefaultMutableTreeNode) arbol.getLastSelectedPathComponent();
		 
		 eventosNodoSeleccionado(nodoSeleccionado);
		 s+="Ruta: ";
		 areaDeTexto.setText("\n");
		 areaDeTexto.setText("hola");
		    /**Obtenemos la ruta seleccionada*/
			TreePath rutaSeleccionada = e.getPath();
			Object [] nodos = rutaSeleccionada.getPath();
			
			for (int i = 0; i < nodos.length; i++){
				Object nodo=nodos[i];
				s+=nodo.toString() + " / ";
			}
			s+="\n";
			areaDeTexto.setText(s);
	}

	/**
	 * Permite validar cual fue la hoja seleccionada para mostrar el
	 * panel correspondiente
	 * @param nodo
	 */
	private void eventosNodoSeleccionado(DefaultMutableTreeNode nodo) {
		
		if (nodo.getUserObject().equals("Archivo1"))
		{
		  System.out.println("Selecciona : "+nodo.toString());
		  defineVisibilidad(true,false,false,false,false,false);
		}
		
		if (nodo.getUserObject().equals("Archivo2"))
		{
			System.out.println("Selecciona : "+nodo.toString());
			defineVisibilidad(false,true,false,false,false,false);
		}
		
		if (nodo.getUserObject().equals("Archivo3"))
		{
			System.out.println("Selecciona : "+nodo.toString());
			defineVisibilidad(false,false,true,false,false,false);
		}
		
		if (nodo.getUserObject().equals("Archivo4"))
		{
			System.out.println("Selecciona : "+nodo.toString());
			defineVisibilidad(false,false,false,true,false,false);
		}
		
		if (nodo.getUserObject().equals("Archivo5"))
		{
			System.out.println("Selecciona : "+nodo.toString());
			defineVisibilidad(false,false,false,false,true,false);
		}
		
		if (nodo.getUserObject().equals("Archivo6"))
		{
			System.out.println("Selecciona : "+nodo.toString());
			defineVisibilidad(false,false,false,false,false,true);
		}
		
	}


	/**
	 * recibe como parametro un booleano para determinar
	 * cual panel se muestra
	 * @param b1 booleano para el panel1
	 * @param b2 booleano para el panel2
	 * @param b3 booleano para el panel3
	 * @param b4 booleano para el panel4
	 * @param b5 booleano para el panel5
	 * @param b6 booleano para el panel6
	 */
	private void defineVisibilidad(boolean b1, boolean b2, boolean b3, boolean b4,	boolean b5, boolean b6) {
		 panel1.setVisible(b1);
		 panel2.setVisible(b2);
		 panel3.setVisible(b3);
		 panel4.setVisible(b4);
		 panel5.setVisible(b5);
		 panel6.setVisible(b6);		
	}
 }
 
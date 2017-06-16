package ventana;

import java.awt.Container;
import java.awt.color.CMMException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class VentanaPrincipal extends JFrame implements ActionListener {
	
	private Container contenedor;/*declaramos el contenedor*/
	private JButton agregar, eliminar, borrar;/*declaramos el objeto Boton*/
	private JLabel labelTitulo, mensaje;/*declaramos el objeto Label*/
	private JTextField campo;
	private JList listaNombres;/*declaramos La Lista*/
	private DefaultListModel modelo;/*declaramos el Modelo*/
	private JScrollPane scrollLista;
	
	public VentanaPrincipal(){
		/*permite iniciar las propiedades de los componentes*/
		iniciarComponentes();
   		/*Asigna un titulo a la barra de titulo*/
		setTitle("CoDejaVu : JList");
		/*tamaño de la ventana*/
		setSize(280,330);
		/*pone la ventana en el Centro de la pantalla*/
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void iniciarComponentes() {
		contenedor=getContentPane();/*instanciamos el contenedor*/
		/*con esto definmos nosotros mismos los tamaños y posicion
		 * de los componentes*/
		contenedor.setLayout(null);
		
		campo= new JTextField();
		campo.setBounds(20, 80, 135, 23);
		
		
		/*Propiedades del boton, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		agregar= new JButton();
		agregar.setText("Agregar");
		agregar.setBounds(160, 80, 80, 23);
		agregar.addActionListener(this);
		
		eliminar= new JButton();
		eliminar.setText("Eliminar");
		eliminar.setBounds(20, 210, 80, 23);
		eliminar.addActionListener(this);
		
		borrar= new JButton();
		borrar.setText("Borrar Lista");
		borrar.setBounds(120, 210, 120, 23);
		borrar.addActionListener(this);
		
		/*Propiedades del Label, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		labelTitulo= new JLabel();
		labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 28));
		labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		labelTitulo.setText("JList");
		labelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		labelTitulo.setBounds(40, 20, 180, 43);
		
		mensaje= new JLabel();
		mensaje.setBounds(20, 250, 280, 23);
		
		//instanciamos la lista
		listaNombres = new JList();
		listaNombres.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
		
		//instanciamos el modelo
		modelo = new DefaultListModel();
	   	
		//instanciamos el Scroll que tendra la lista
	    scrollLista = new JScrollPane();
		scrollLista.setBounds(20, 120,220, 80);
	    scrollLista.setViewportView(listaNombres);
		
		/*Agregamos los componentes al Contenedor*/
		contenedor.add(labelTitulo);
		contenedor.add(campo);
		contenedor.add(agregar);
		contenedor.add(eliminar);
		contenedor.add(borrar);
		contenedor.add(mensaje);
		contenedor.add(scrollLista);
		//contenedor.add(botonCam);
	}


	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource()==agregar)
		{
			agregarNombre();
			mensaje.setText("Se agregó un nuevo elemento");
		}
		if (evento.getSource()==eliminar)
		{
			eliminarNombre(listaNombres.getSelectedIndex() );
		}
		if (evento.getSource()==borrar)
		{
			borrarLista();
			mensaje.setText("Se borró toda la lista");
		}
	}

	private void agregarNombre() {
		String nombre=campo.getText();
		modelo.addElement(nombre);
		listaNombres.setModel(modelo);
		campo.setText("");
	}
	
	private void eliminarNombre(int indice) {
		if (indice>=0) {
			modelo.removeElementAt(indice);	
			mensaje.setText("Se eliminó un elemento en la posición "+indice);
		}else{
			JOptionPane.showMessageDialog(null, "Debe seleccionar un indice"
					,"Error", JOptionPane.ERROR_MESSAGE);
			
				mensaje.setText("NO se seleccionó ningún elemento");
		}
		
	}
	
	private void borrarLista() {
		modelo.clear();
	}

}

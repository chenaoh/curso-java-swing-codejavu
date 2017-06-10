package aplicacion;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame implements ActionListener
{
	JLabel labelTitulo;/*declaramos el objeto Label*/
	private JPanel miPanelPrincipal;//contenedor de los componentes
	private JPanel panelColor;//paneles de ejemplo
	private JButton botonColor;
	private Color color;
	
	public Ventana()//constructor
	{
		iniciaComponentes();
   		//Asigna un titulo a la barra de titulo
		setTitle("CoDejaVu : Ventana JColorChooser");
		//tamaño de la ventana
		setSize(550,540);
		//pone la ventana en el Centro de la pantalla
		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void iniciaComponentes() {
		miPanelPrincipal = new JPanel();
		miPanelPrincipal.setLayout(null);
		
		/*Propiedades del label*/
		labelTitulo= new JLabel();
		labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 28));
		labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		labelTitulo.setText("Componente JColorChooser");
		labelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		labelTitulo.setBounds(40, 20, 450, 40);
		
	    /*propiedades Panel1*/
	    componentesPanel1();
		
		botonColor = new JButton();
		botonColor.setText("Seleccionar Color");
		botonColor.setBounds(190, 460, 150, 23);
		botonColor.addActionListener(this);
		
		/*Agregamos los componentes al Contenedor*/
		miPanelPrincipal.add(labelTitulo);
		miPanelPrincipal.add(panelColor);
		miPanelPrincipal.add(botonColor);
		add(miPanelPrincipal);
	}


	private void componentesPanel1() {
		panelColor = new JPanel();
		panelColor.setBounds(10, 80, 510, 350);
		panelColor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		/*El siguiente codigo define cuando se presiona el boton 
		entonces instancia la clase JColorChooser y luego el color
		seleccionado se asigna en un objeto de tipo awt.Color por medio
		del metodo showDialog, le asignamos un titulo y un color por defecto.*/
		if (e.getSource()==botonColor)
		{
			 JColorChooser ventanaDeColores=new JColorChooser();
             color=ventanaDeColores.showDialog(null, "Seleccione un Color", Color.gray);
             panelColor.setBackground(color);
		}
	}
	
}
package ventanas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame implements ActionListener {
	
	private Container contenedor;/*declaramos el contenedor*/
	JButton botonMensajeSimple;
	JButton botonMensajeAdvertencia;
	JButton botonMensajeError;
	JButton botonMensajeConfirmacion;
	JButton botonInputText;
	JButton botonInputOption;
	JButton botonOption;
	JButton botonConfirm;
	
	
	JLabel labelTitulo;/*declaramos el objeto Label*/
	private VentanaPrincipal miVentanaPrincipal;
	
	public VentanaPrincipal(){
		/*permite iniciar las propiedades de los componentes*/
		iniciarComponentes();
   		/*Asigna un titulo a la barra de titulo*/
		setTitle("CoDejaVu : JFrame VentanaPrincipal");
		/*tamaño de la ventana*/
		setSize(480,250);
		/*pone la ventana en el Centro de la pantalla*/
		setLocationRelativeTo(null);
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
		
		/*Propiedades del boton, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		botonMensajeSimple= new JButton();
		botonMensajeSimple.setText("Información");
		botonMensajeSimple.setBounds(10, 80, 110, 23);
		botonMensajeSimple.addActionListener(this);
		
		botonMensajeAdvertencia= new JButton();
		botonMensajeAdvertencia.setText("Advertencia");
		botonMensajeAdvertencia.setBounds(130, 80, 110, 23);
		botonMensajeAdvertencia.addActionListener(this);
		
		botonMensajeError= new JButton();
		botonMensajeError.setText("Error");
		botonMensajeError.setBounds(250, 80, 80, 23);
		botonMensajeError.addActionListener(this);
		
		botonMensajeConfirmacion= new JButton();
		botonMensajeConfirmacion.setText("Confirmación");
		botonMensajeConfirmacion.setBounds(340, 80, 110, 23);
		botonMensajeConfirmacion.addActionListener(this);
		
		botonInputText= new JButton();
		botonInputText.setText("Texto");
		botonInputText.setBounds(10, 120, 110, 23);
		botonInputText.addActionListener(this);
		
		botonInputOption= new JButton();
		botonInputOption.setText("Combo");
		botonInputOption.setBounds(130, 120, 110, 23);
		botonInputOption.addActionListener(this);
		
		botonConfirm= new JButton();
		botonConfirm.setText("Mas");
		botonConfirm.setBounds(250, 120, 80, 23);
		botonConfirm.addActionListener(this);
		
		botonOption= new JButton();
		botonOption.setText("Opciones");
		botonOption.setBounds(340, 120, 110, 23);
		botonOption.addActionListener(this);
		
				
		/*Propiedades del Label, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		labelTitulo= new JLabel();
		labelTitulo.setText("VENTANA PRINCIPAL");
		labelTitulo.setBounds(180, 20, 180, 23);
		
		/*Agregamos los componentes al Contenedor*/
		contenedor.add(labelTitulo);
		contenedor.add(botonMensajeSimple);
		contenedor.add(botonMensajeAdvertencia);
		contenedor.add(botonMensajeError);
		contenedor.add(botonMensajeConfirmacion);
		contenedor.add(botonInputText);
		contenedor.add(botonInputOption);
		contenedor.add(botonOption);
		contenedor.add(botonConfirm);
	}

	/*Agregamos el evento al momento de llamar la otra ventana*/
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource()==botonMensajeSimple)
		{
		 JOptionPane.showMessageDialog(null, "Este es un mensaje Simple tipo Información");
		 JOptionPane.showMessageDialog(null, "Otro mensaje Simple" +
			" tipo Información pero con titulo", "INFORMATION_MESSAGE",
											JOptionPane.INFORMATION_MESSAGE);
		}
		if (evento.getSource()==botonMensajeAdvertencia)
		{
			JOptionPane.showMessageDialog(null, "Este es un mensaje de Advertencia",
					"WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
		}
		if (evento.getSource()==botonMensajeError)
		{
			JOptionPane.showMessageDialog(null, "Este es un mensaje de Error",
					"ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
		}
		if (evento.getSource()==botonMensajeConfirmacion)
		{
			JOptionPane.showMessageDialog(null, "Este es un mensaje de confirmación o pregunta\n" +
					"Aunque realmente en este caso no tendria\n mucha aplicación",
					"QUESTION_MESSAGE", JOptionPane.QUESTION_MESSAGE);
			
			JOptionPane.showInputDialog("");
		}
		if (evento.getSource()==botonInputText)
		{
			try {
				int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un" +
						" numero para multiplicarlo por 2"));
				//imprimimos el resultado con otro
				JOptionPane.showMessageDialog(null, "el resultado es: "+numero+"*2 ="+(numero*2));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "El Valor ingresado debe ser númerico","ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		if (evento.getSource()==botonInputOption)
		{
			
			Object color = JOptionPane.showInputDialog(null,"Seleccione Un Color",
					"COLORES",  JOptionPane.QUESTION_MESSAGE, null,
			   new Object[] {"Seleccione","Amarillo", "Azul", "Rojo" },"Seleccione");
					
			JOptionPane.showMessageDialog(null,"Color Seleccionado "+color);
			  
		}
		if (evento.getSource()==botonConfirm)
		{
			int confirmado = JOptionPane.showConfirmDialog(null,"Usas mucho el JOptionPane?");
			if (JOptionPane.OK_OPTION == confirmado){
				System.out.println("Selecciona opción Afirmativa");
			}
			else{
			   System.out.println("No selecciona una opción afirmativa");
			  }
			
			 confirmado = JOptionPane.showConfirmDialog(null, "Este es un ejemplo con ", "YES_NO_CANCEL_OPTION", 
				  		JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
					if (JOptionPane.OK_OPTION == confirmado)
						System.out.println("Selecciona opción Afirmativa");
				   else
					   System.out.println("Selecciona opción Negativa");
					
					
		    confirmado = JOptionPane.showConfirmDialog(null, "Este es otro ejemplo de 2 opciones", "YES_OPTION", 
		    		 JOptionPane.YES_OPTION,JOptionPane.WARNING_MESSAGE );
				if (JOptionPane.OK_OPTION == confirmado)
					System.out.println("Selecciona opción Afirmativa");
				else
					System.out.println("Selecciona opción Negativa");
				
			    confirmado = JOptionPane.showConfirmDialog(null, "mensaje", "NO_OPTION", 
			    		JOptionPane.NO_OPTION,JOptionPane.WARNING_MESSAGE );
					if (JOptionPane.OK_OPTION == confirmado)
						System.out.println("Selecciona opción Afirmativa");
					else
						System.out.println("Selecciona opción Negativa");
					
		
		 confirmado = JOptionPane.showConfirmDialog(null, "mensaje", "CANCEL_OPTION", 
				 JOptionPane.CANCEL_OPTION,JOptionPane.WARNING_MESSAGE );
			if (JOptionPane.OK_OPTION == confirmado)
				System.out.println("Selecciona opción Afirmativa");
			else
				System.out.println("Selecciona opción Negativa");
					
			 confirmado = JOptionPane.showConfirmDialog(null, "mensaje", "OK_OPTION", 
					 JOptionPane.OK_OPTION,JOptionPane.WARNING_MESSAGE );
					if (JOptionPane.OK_OPTION == confirmado)
						System.out.println("Selecciona opción Afirmativa");
					else
						System.out.println("Selecciona opción Negativa");
					
					
					
					
		confirmado = JOptionPane.showConfirmDialog(null, "mensaje", "CLOSED_OPTION", 
				 JOptionPane.CLOSED_OPTION ,JOptionPane.WARNING_MESSAGE);
			if (JOptionPane.OK_OPTION == confirmado)
				System.out.println("Selecciona opción Afirmativa");
		   else
			   System.out.println("Selecciona opción Negativa");	
			
		}
		if (evento.getSource()==botonOption)
		{
			
			JCheckBox chec=new JCheckBox("Prueba");
						
			int seleccion = JOptionPane.showOptionDialog( null,"Seleccione una opcion",
			    "Selector de opciones",
				 JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,
				    null,// null para icono por defecto.
					new Object[] { "opcion 1", "opcion 2", "opcion 3",chec },"opcion 1");
					 
			if (seleccion != -1){
				System.out.println("seleccionada opcion " + (seleccion + 1));
			}
			if (chec.isSelected()){
				System.out.println("Selecciona el Chec");
			}   
					
					
					seleccion = JOptionPane.showOptionDialog(
							   null,
							   "Seleccione opcion",
							   "Selector de opciones",
							   JOptionPane.YES_NO_CANCEL_OPTION,
							   JOptionPane.QUESTION_MESSAGE,
							   null,    // null para icono por defecto.
							   new JCheckBox[] { new JCheckBox("opcion1"),new JCheckBox("opcion2"),new JCheckBox("opcion3") }, "opcion1"  // null para YES, NO y CANCEL
							   );
							 
							if (seleccion != -1)
							   System.out.println("seleccionada opcion " + (seleccion + 1));			
					
		}
	}
}

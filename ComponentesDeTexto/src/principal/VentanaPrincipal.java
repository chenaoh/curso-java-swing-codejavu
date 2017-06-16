package principal;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.MaskFormatter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

/**
 * @author HENAO
 * Calse que permite presentar la ventana con los componentes de texto
 * en funcionamiento
 * codejavu.blogspot.com
 *
 */
public class VentanaPrincipal extends JFrame implements ActionListener {
	
	private Container contenedor;/**declaramos el contenedor*/
	JLabel labelTitulo;/**declaramos el objeto Label*/
	/**declaramos los objetos JLabels*/
	JLabel etiquetaTextField;
	JLabel etiquetaFormattedTextField;
	JLabel etiquetaCampoContraseña;
	JLabel etiquetaRadioButton;
	JLabel etiquetaCombo;
	JLabel etiquetaJtextArea;
	JLabel etiquetaJEditorPane;
	JLabel etiquetaJTextPane;
		
	JTextField cajaDeTexto;
	JFormattedTextField cajaDeTextoConFormato;
	MaskFormatter mascara;
	JPasswordField campoContraseña;

	JTextArea areaDeTexto;
	JEditorPane areaEditorPane;
	JTextPane areaTextPane;
	JCheckBox check1, check2;
	
	JButton boton;
		
	
	public VentanaPrincipal(){
		/*permite iniciar las propiedades de los componentes*/
		iniciarComponentes();
   		/*Asigna un titulo a la barra de titulo*/
		setTitle("CoDejaVu : JFrame Componentes De Texto");
		/*tamaño de la ventana (x,y)*/
		setSize(660, 510);
		/*pone la ventana en el Centro de la pantalla*/
		setLocationRelativeTo(null);
		/*impide que la ventana cambie de tamaño*/
		setResizable(false);
	}

	private void iniciarComponentes() {
		contenedor=getContentPane();/*instanciamos el contenedor*/
		/*con esto definmos nosotros mismos los tamaños y posicion
		 * de los componentes*/
		contenedor.setLayout(null);
				
		/*Definimos las propiedades de los componentes*/
		labelTitulo= new JLabel();
		labelTitulo.setText("Componentes De Texto Java Swing");
		labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 20));
		labelTitulo.setBounds(160, 5, 380, 40);
		
		etiquetaTextField= new JLabel();
		etiquetaTextField.setText("JTextField : ");
		etiquetaTextField.setBounds(20, 60, 280, 23);
		
		cajaDeTexto = new JTextField();
		cajaDeTexto.setBounds(90, 60, 90, 23);
		
		etiquetaFormattedTextField= new JLabel();
		etiquetaFormattedTextField.setText("JFormattedTextField : ");
		etiquetaFormattedTextField.setBounds(200, 60, 140, 23);
		
		try {
			/*Creamos la mascara con la que trabajaremos*/
			mascara= new MaskFormatter("########");
			/*Le enviamos la mascara a el componente*/
			cajaDeTextoConFormato= new JFormattedTextField(mascara);
			/*Importante definir el foco del componente, para que almacene el valor*/
			cajaDeTextoConFormato.setFocusLostBehavior(cajaDeTextoConFormato.COMMIT);
			cajaDeTextoConFormato.setBounds(330, 60, 80, 23);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		etiquetaCampoContraseña= new JLabel();
		etiquetaCampoContraseña.setText("JPasswordField : ");
		etiquetaCampoContraseña.setBounds(430, 60, 120, 23);
		
		campoContraseña = new JPasswordField();
		campoContraseña.setBounds(530, 60, 80, 23);
		
		etiquetaJtextArea= new JLabel();
		etiquetaJtextArea.setText("JTextArea: ");
		etiquetaJtextArea.setBounds(20, 90, 100, 23);
		
		areaDeTexto = new JTextArea();
		areaDeTexto.setBounds(90, 90, 520, 103);
		
		etiquetaJEditorPane= new JLabel();
		etiquetaJEditorPane.setText("JEditorPane: ");
		etiquetaJEditorPane.setBounds(10, 200, 100, 23);
		
		areaEditorPane = new JEditorPane();
		areaEditorPane.setBounds(90, 200, 520, 103);
		/*Definimos el tipo de texto que utiliza*/
		areaEditorPane.setContentType("text/html"); 
		areaEditorPane.setText("<h1><b>Texto En Negrilla y etiqueta H1</b></h1>" +
						" Texto normal" + 
						"<font color=\"blue\"> Texto con color azul</font>"+
						"<font face=\"verdana\"> fuente verdana</font>");
		
		etiquetaJTextPane= new JLabel();
		etiquetaJTextPane.setText("JTextPane: ");
		etiquetaJTextPane.setBounds(20, 310, 100, 23);
		
		/*usamos StyleContext para definir el estilo a usar*/
		StyleContext estilo = new StyleContext();
		/*creamos el estilo, no definimos nombre ni estilo padre...*/
		Style estiloRojo = estilo.addStyle(null, null);
		StyleConstants.setForeground( estiloRojo, Color.red );
		/*definimos el estilo a usar*/
		DefaultStyledDocument estiloPorDefecto = new DefaultStyledDocument( estilo );
		areaTextPane = new JTextPane(estiloPorDefecto);
		areaTextPane.setCharacterAttributes(estiloRojo, false);
		areaTextPane.setBounds(90, 310, 520, 103);


		// Se inserta
		try {
			areaTextPane.getStyledDocument().insertString(
					areaTextPane.getStyledDocument().getLength(), "Texto con estilo rojo, seleccione un check  ", estiloRojo);
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		/*Definimos el Foco del componente, para que se inserte de ultimo en el area*/
		areaTextPane.setCaretPosition(areaTextPane.getStyledDocument().getLength());
		check1 = new JCheckBox("check1");
		areaTextPane.insertComponent(check1);
		areaTextPane.setCaretPosition(areaTextPane.getStyledDocument().getLength());
		check2 = new JCheckBox("check2");
		areaTextPane.insertComponent(check2);
		
		boton = new JButton();
		boton.setText("Enviar");
		boton.setBounds(530, 430, 80, 23);
		boton.addActionListener(this);
		
				
		/*Agregamos los componentes al Contenedor*/
		contenedor.add(labelTitulo);
		contenedor.add(etiquetaTextField);
		contenedor.add(etiquetaFormattedTextField);
		contenedor.add(etiquetaJtextArea);
		
		contenedor.add(boton);
		contenedor.add(cajaDeTexto);
		contenedor.add(cajaDeTextoConFormato);
		contenedor.add(etiquetaCampoContraseña);
		contenedor.add(campoContraseña);
		contenedor.add(areaDeTexto);
		contenedor.add(etiquetaJEditorPane);
		contenedor.add(areaEditorPane);
		contenedor.add(etiquetaJTextPane);
		contenedor.add(areaTextPane);
		
	}

	/**Agregamos los eventos de presionar*/
	@Override
	public void actionPerformed(ActionEvent evento) {
		String retorno="";
	
		retorno+="JTextField = "+cajaDeTexto.getText()+"\n";
		retorno+="JFormattedTextField = "+cajaDeTextoConFormato.getText()+"\n";
		/*getText() es deprecated, sin embargo podemos usarlo */
		retorno+="JPasswordField = "+campoContraseña.getText()+"\n";
		/*getpassword permite obtener el valor encriptado, para desencriptarlo se maneja
		 * con tipos de datos char*/
		retorno+="JPasswordField Encriptado= "+campoContraseña.getPassword()+"\n";
		
		/*Evento cuando presiona el boton*/
		if (evento.getSource()==boton) {
			if (check1.isSelected()) {
				retorno+="check1 seleccionado\n";
			}
			if (check2.isSelected()) {
				retorno+="check2 seleccionado\n";
			}

			JOptionPane.showMessageDialog(null, retorno);
			/*Enviamos el valor de retorno al JTextArea*/
			areaDeTexto.setText(retorno);
		}
		
	}

}

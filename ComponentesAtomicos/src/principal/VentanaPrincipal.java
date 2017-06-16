package principal;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @author HENAO
 *
 */
public class VentanaPrincipal extends JFrame implements ActionListener,ChangeListener {
	
	private Container contenedor;/**declaramos el contenedor*/
	JLabel labelTitulo;/**declaramos el objeto Label*/
	/**declaramos los objetos JLabels*/
	JLabel etiquetaLabel;
	JLabel etiquetaBoton;
	JLabel etiquetaToogleButton;
	JLabel etiquetaCheckbox;
	JLabel etiquetaRadioButton;
	JLabel etiquetaCombo;
	JLabel etiquetaSeparator;
	JLabel etiquetaSpinner;
	JLabel etiquetaDeslizador;
	JLabel etiquetaBarra;
	JButton boton;/**declaramos el objeto Boton*/
	JCheckBox checkbox1,checkbox2;/**declaramos los objetos checkbox*/
	ButtonGroup grupoRadios;/**declaramos un grupo de radioButtons*/
	JRadioButton radio1,radio2;/**declaramos los objetos radioButtons*/
	JToggleButton toggleButton;/**declaramos el objeto ToggleButton*/
	JComboBox combo;/**declaramos el objeto Combo*/
	JSeparator separadorVertical, separadorHorizontal;/**declaramos los separadores*/
	JSpinner spinner;/**declaramos el objeto spinner*/
	JSlider deslizador;/**declaramos el objeto deslizador*/
	JProgressBar barra;/**declaramos el objeto barra*/
	
	
	public VentanaPrincipal(){
		/*permite iniciar las propiedades de los componentes*/
		iniciarComponentes();
   		/*Asigna un titulo a la barra de titulo*/
		setTitle("CoDejaVu : JFrame Componentes Atomicos");
		/*tamaño de la ventana*/
		setSize(630, 250);
		/*pone la ventana en el Centro de la pantalla*/
		setLocationRelativeTo(null);
		setResizable(false);
	}

	private void iniciarComponentes() {
		contenedor=getContentPane();/*instanciamos el contenedor*/
		/*con esto definmos nosotros mismos los tamaños y posicion
		 * de los componentes*/
		contenedor.setLayout(null);
				
		/*Definimos las propiedades de los componentes*/
		labelTitulo= new JLabel();
		labelTitulo.setText("Componentes Atomicos");
		labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 20));
		labelTitulo.setBounds(180, 5, 380, 40);
		
		etiquetaLabel= new JLabel();
		etiquetaLabel.setText("JLabel :     Esto es un Label o Etiqueta");
		etiquetaLabel.setBounds(20, 50, 280, 23);
		
		etiquetaBoton= new JLabel();
		etiquetaBoton.setText("JButton : ");
		etiquetaBoton.setBounds(20, 80, 80, 23);
		

		boton= new JButton();
		boton.setText("Boton");
		boton.setBounds(80, 80, 80, 23);
		boton.addActionListener(this);
		
		etiquetaCheckbox= new JLabel();
		etiquetaCheckbox.setText("JCheckBox : ");
		etiquetaCheckbox.setBounds(20, 110, 80, 23);
		
		checkbox1 = new JCheckBox();
		checkbox1.setText("Check1");
		checkbox1.setBounds(100, 110, 80, 23);
		
		checkbox2 = new JCheckBox();
		checkbox2.setText("Check2");
		checkbox2.setBounds(180, 110, 80, 23);
		
		etiquetaRadioButton= new JLabel();
		etiquetaRadioButton.setText("JRadioButton : ");
		etiquetaRadioButton.setBounds(20, 140, 100, 23);
		
		grupoRadios = new ButtonGroup();
		radio1 = new JRadioButton();
		radio1.setText("Radio1");
		radio1.setBounds(110, 140, 80, 23);
		
		radio2 = new JRadioButton();
		radio2.setText("Radio2");
		radio2.setBounds(190, 140, 80, 23);
		
		grupoRadios.add(radio1);
		grupoRadios.add(radio2);
		
		etiquetaToogleButton= new JLabel();
		etiquetaToogleButton.setText("JToogleButton : ");
		etiquetaToogleButton.setBounds(20, 180, 100, 23);
		
		toggleButton = new JToggleButton();
		toggleButton.setText("Activar");
		toggleButton.setBounds(120, 180, 80, 23);
		
		etiquetaCombo= new JLabel();
		etiquetaCombo.setText("JComboBox : ");
		etiquetaCombo.setBounds(350, 50, 100, 23);
		
		combo = new JComboBox();
		combo.addItem("Opciones");
		combo.addItem("Opcion1");
		combo.addItem("Opcion2");
		combo.addItem("Opcion3");
		combo.addItem("Opcion4");
		combo.setBounds(430, 50, 100, 23);
		combo.setSelectedIndex(0);
		
		separadorVertical = new JSeparator();
		separadorVertical.setOrientation(javax.swing.SwingConstants.VERTICAL);
		separadorVertical.setBounds(300, 60, 10, 200);
		
		etiquetaSeparator= new JLabel();
		etiquetaSeparator.setText("JSeparator : ");
		etiquetaSeparator.setBounds(350, 80, 100, 23);
		
		separadorHorizontal = new JSeparator();
		separadorHorizontal.setBounds(430, 92, 100, 5);
		
		etiquetaSpinner= new JLabel();
		etiquetaSpinner.setText("JSpinner : ");
		etiquetaSpinner.setBounds(350, 110, 100, 23);
		
		spinner = new JSpinner();
		spinner.setBounds(430, 110, 50, 23);
		spinner.addChangeListener(this);
		
		etiquetaDeslizador= new JLabel();
		etiquetaDeslizador.setText("JSlider : ");
		etiquetaDeslizador.setBounds(350, 140, 100, 23);
		
		deslizador = new JSlider(JSlider.HORIZONTAL, 0, 100, 30);
		deslizador.setBounds(430, 140, 100, 30);
		deslizador.setPaintTicks(true);
		deslizador.setMajorTickSpacing(50);
		deslizador.setMinorTickSpacing(5);
		deslizador.setBorder(new TitledBorder(""));
		deslizador.setValue(0);
		deslizador.addChangeListener(this);
		
		etiquetaBarra= new JLabel();
		etiquetaBarra.setText("JProgressBar : ");
		etiquetaBarra.setBounds(350, 180, 100, 23);
		
		barra = new JProgressBar();
		barra.setBounds(450, 180, 110, 20);
		
		/*Agregamos los componentes al Contenedor*/
		contenedor.add(labelTitulo);contenedor.add(etiquetaLabel);
		contenedor.add(etiquetaBoton);
		contenedor.add(etiquetaCheckbox);
		contenedor.add(checkbox1);
		contenedor.add(checkbox2);
		contenedor.add(etiquetaRadioButton);
		contenedor.add(radio1);
		contenedor.add(radio2);
		contenedor.add(etiquetaToogleButton);
		contenedor.add(toggleButton);
		contenedor.add(etiquetaCombo);
		contenedor.add(separadorVertical);
		contenedor.add(etiquetaSeparator);
		contenedor.add(separadorHorizontal);
		contenedor.add(etiquetaSpinner);
		contenedor.add(spinner);
		contenedor.add(etiquetaDeslizador);
		contenedor.add(deslizador);
		contenedor.add(etiquetaBarra);
		contenedor.add(barra);
		contenedor.add(combo);
		contenedor.add(boton);
	}

	/**Agregamos los eventos de presionar*/
	@Override
	public void actionPerformed(ActionEvent evento) {
		/**Evento cuando presiona el boton*/
		if (evento.getSource()==boton)
		{
			String salida="";
			salida=validaEventos();
			JOptionPane.showMessageDialog(null, salida);
		}
		
	}

	/**permite validar cuando se selecciona un check
	 * un radioButton, una opción del combo o se
	 * presiona el ToogleButton y se */
	private String validaEventos() {
		String cad="Selecciona : \n";
		if (checkbox1.isSelected()) {
			cad+="check1\n";
		}
		if (checkbox2.isSelected()) {
			cad+="check2\n";
		}
		if (radio1.isSelected()) {
			cad+="radio1\n";
		}
		if (radio2.isSelected()) {
			cad+="radio2\n";
		}
		if (toggleButton.isSelected()) {
			cad+="Toogle Activo\n";
		}else{
			cad+="Toogle InActivo\n";
		}
		cad+=combo.getSelectedItem()+"\n";
		return cad;
	}

	/**Permite definir los eventos del deslizador y el spinner*/
	@Override
	public void stateChanged(ChangeEvent evento) {
		int valor;
		if (evento.getSource() == deslizador) {
			valor = deslizador.getValue();
			barra.setValue(valor);
			spinner.setValue(valor);
		}
		
		if (evento.getSource() == spinner) {
			valor =  (Integer) spinner.getValue();
			deslizador.setValue(valor);
			barra.setValue(valor);
		}
	}
}

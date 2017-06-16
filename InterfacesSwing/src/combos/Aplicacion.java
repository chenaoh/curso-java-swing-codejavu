package combos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Aplicacion {
	public static void main(String args[]) {
		Ventana ventana;
		ventana = new Ventana();
	}
}

class Ventana extends JFrame implements ItemListener {
	// Se declara una lista desplegable que contendrá varios deportes
	JComboBox deportes;
	/*
	 * En pantalla aparecerán tres casillas de verificacion que permitirán
	 * seleccionar el nivel de estudios de la persona
	 */
	JCheckBox primaria;
	JCheckBox secundaria;
	JCheckBox universidad;
	/* Finalmente se seleccionará el sexo */
	ButtonGroup sexo;
	JRadioButton femenino;
	JRadioButton masculino;
	JLabel titulo;
	JTextArea salida;
	String seleccion = "";
	String d = "", p = "", s = "", u = "", se = "";

	Ventana() {
		titulo = new JLabel();
		deportes = new JComboBox();
		salida = new JTextArea();
		primaria = new JCheckBox("Primaria");
		secundaria = new JCheckBox("Secundaria");
		universidad = new JCheckBox("Universidad");
		sexo = new ButtonGroup();
		femenino = new JRadioButton("Femenino");
		masculino = new JRadioButton("Masculino");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setText("Seleccione el deporte que más le agrada, su nivel de estudios y sexo");
		titulo.setBounds(10, 20, 400, 30);
		deportes.setBounds(100, 50, 150, 20);
		deportes.removeAllItems();
		deportes.addItem("Baloncesto");
		deportes.addItem("Voleibol");
		deportes.addItem("Natación");
		deportes.addItem("Futbol");
		deportes.addItem("Ciclismo");
		deportes.setSelectedIndex(0);
		primaria.setBounds(10, 80, 150, 16);
		secundaria.setBounds(10, 110, 150, 16);
		universidad.setBounds(10, 140, 150, 16);
		femenino.setBounds(10, 180, 150, 16);
		masculino.setBounds(10, 200, 150, 16);
		salida.setBounds(170, 150, 300, 80);
		setLayout(null);
		add(titulo);
		add(deportes);
		add(salida);
		add(primaria);
		add(secundaria);
		add(universidad);
		add(femenino);
		add(masculino);
		sexo.add(femenino);
		sexo.add(masculino);
		setTitle("Eventos en JComboBox,JCheckBox y JRadioButton");
		setSize(700, 300);
		setResizable(false);
		show();
		deportes.addItemListener(this);
		primaria.addItemListener(this);
		secundaria.addItemListener(this);
		universidad.addItemListener(this);
		femenino.addItemListener(this);
		masculino.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent e) {
		seleccion = "";
		d = " El deporte seleccionado es: "
				+ (String) deportes.getSelectedItem() + "\n";
		if (e.getSource() == primaria) {
			if (primaria.isSelected())
				p = " Primaria" + "\n";
			else
				p = "";
		}
		if (e.getSource() == secundaria) {
			if (secundaria.isSelected())
				s = " Secundaria" + "\n";
			else
				s = "";
		}
		if (e.getSource() == universidad) {
			if (universidad.isSelected())
				u = " Universidad" + "\n";
			else
				u = "";
		}
		if (e.getSource() == femenino) {
			if (femenino.isSelected())
				se = " Sexo Femenino" + "\n";
		}
		if (e.getSource() == masculino) {
			if (masculino.isSelected())
				se = " Sexo Masculino" + "\n";
		}
		seleccion = d + p + s + u + se;
		salida.setText(seleccion);
	}
}
package pestañas.hojadevida;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aplicacion {
	public static void main(String args[]) {
		Ventana ventana;
		ventana = new Ventana();
	}
}

class Ventana extends JFrame {
	Ventana() {
		JTabbedPane fichas;
		PanelDatosPersonales datosPersonales;
		PanelEstudios estudios;
		PanelHoja hoja;
		fichas = new JTabbedPane();
		Coordinador miCoordinador;
		datosPersonales = new PanelDatosPersonales();
		estudios = new PanelEstudios();
		hoja = new PanelHoja();
		miCoordinador = new Coordinador(datosPersonales, estudios, hoja);
		fichas.addTab("Datos Personales", datosPersonales);
		fichas.addTab("Estudios", estudios);
		fichas.addTab("Hoja Completa", hoja);
		getContentPane().add(fichas);
		setTitle("Hoja de vida");
		hoja.setCoordinador(miCoordinador);
		datosPersonales.setCoordinador(miCoordinador);
		estudios.setCoordinador(miCoordinador);
		hoja.mostrar();
		setSize(330, 170);
		show();
	}
}

class PanelDatosPersonales extends JPanel implements ActionListener {
	JTextField direccion, nombre, telefono;
	JLabel textodireccion, textotelefono, textonombre;
	public static JLabel res, res1, res2;
	String resultado = "";
	Coordinador coordinador;

	public PanelDatosPersonales() {
		nombre = new JTextField("", 20);
		direccion = new JTextField("", 20);
		telefono = new JTextField("", 15);
		textodireccion = new JLabel();
		res = new JLabel();
		res1 = new JLabel();
		res2 = new JLabel();
		textotelefono = new JLabel();
		textonombre = new JLabel();
		textodireccion.setText("Direccion");
		textotelefono.setText("Telefono");
		textonombre.setText("Nombre ");
		add(textonombre);
		add(nombre);
		add(textodireccion);
		add(direccion);

		add(textotelefono);
		add(telefono);
		nombre.addActionListener(this);
		direccion.addActionListener(this);
		telefono.addActionListener(this);
	}

	public String getRes() {
		if (res.getText() != null)
			return res.getText();
		else
			return " ";
	}

	public String getRes1() {
		if (res1.getText() != null)
			return res1.getText();
		else
			return " ";
	}

	public String getRes2() {
		if (res2.getText() != null)
			return res2.getText();
		else
			return " ";
	}

	void setCoordinador(Coordinador miCoordinador) {
		coordinador = miCoordinador;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == nombre) {
			resultado = "Nombre: " + nombre.getText();
			res.setText(resultado);
		}
		if (e.getSource() == direccion) {
			resultado = "Direccion: " + direccion.getText();
			res1.setText(resultado);
		}
		if (e.getSource() == telefono) {
			resultado = "Telefono: " + telefono.getText();
			res2.setText(resultado);
		}
		coordinador.mostrarPanelHojas();
	}
}

class PanelEstudios extends JPanel implements ItemListener {
	JCheckBox opcion1, opcion2, opcion3, opcion4;
	JComboBox posgrado;
	public JLabel salida;
	Coordinador coordinador;

	PanelEstudios() {
		salida = new JLabel();
		opcion1 = new JCheckBox("Primarios");
		opcion2 = new JCheckBox("Secundarios");
		opcion3 = new JCheckBox("Universitarios");
		opcion4 = new JCheckBox("Postgrado ");
		posgrado = new JComboBox();
		posgrado.removeAllItems();
		posgrado.addItem("Especializacion");
		posgrado.addItem("Maestria");
		posgrado.addItem("Doctorado");
		posgrado.show(false);

		add(opcion1);
		add(opcion2);
		add(opcion3);
		add(opcion4);
		add(posgrado);
		add(salida);
		opcion1.addItemListener(this);
		opcion2.addItemListener(this);
		opcion3.addItemListener(this);
		opcion4.addItemListener(this);
	}

	void setCoordinador(Coordinador miCoordinador) {
		coordinador = miCoordinador;
	}

	public void itemStateChanged(ItemEvent evento) {
		String seleccion = " ";
		posgrado.show(false);
		if (opcion1.isSelected() == true)
			seleccion = seleccion + "Primaria ";
		if (opcion2.isSelected() == true)
			seleccion = seleccion + "Secundaria ";
		if (opcion3.isSelected() == true)
			seleccion = seleccion + "Universitario ";
		if (opcion4.isSelected() == true) {
			posgrado.show(true);
			seleccion = seleccion + "Posgrado ";
			posgrado.addItemListener(this);
			String opcion;
			opcion = (String) posgrado.getSelectedItem();
			seleccion += opcion;
		}
		if (opcion4.isSelected() == false) {
			posgrado.show(false);
			repaint();
		}
		salida.setText(seleccion);
		coordinador.mostrarPanelHojas();
	}

	public String getSalida() {
		return salida.getText();
	}
}

class PanelHoja extends JPanel {
	Coordinador coordinador;
	JLabel res, res1, res2, salida;
	JLabel estudio;

	PanelHoja() {
		res = new JLabel();
		res1 = new JLabel();
		res2 = new JLabel();
		salida = new JLabel();
		estudio = new JLabel("Usted ha cursado estudios de: ");
	}

	void setCoordinador(Coordinador miCoordinador) {
		coordinador = miCoordinador;

	}

	void mostrar() {
		coordinador.mostrarPanelHojas();
	}

	void setDatos(String res, String res1, String res2, String salida) {
		this.res.setText(res);
		this.res2.setText(res2);
		this.res1.setText(res1);
		this.salida.setText(salida);
		add(this.res);
		add(this.res1);
		add(this.res2);
		add(estudio);
		add(this.salida);
	}
}

class Coordinador {
	PanelDatosPersonales miPanelPersona;
	PanelEstudios miPanelEstud;
	PanelHoja miPanelH;

	Coordinador(PanelDatosPersonales miPanelPersonal,
			PanelEstudios miPanelEstudios, PanelHoja miPanelHoja) {
		miPanelPersona = miPanelPersonal;
		miPanelEstud = miPanelEstudios;
		miPanelH = miPanelHoja;
	}

	void mostrarPanelHojas() {
		miPanelH.setDatos(miPanelPersona.getRes(), miPanelPersona.getRes1(),
				miPanelPersona.getRes2(), miPanelEstud.getSalida());
	}
}

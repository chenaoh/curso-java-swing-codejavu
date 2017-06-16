package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import dao.PersonaDao;

import vo.PersonaVo;

public class VentanaRegistro extends JFrame implements ActionListener {

	private JLabel labelTitulo, labelTabla1, labelTabla2;
	private JTextField textCod, textNombre, textEdad, textTelefono,
			textProfesion;
	private JLabel cod, nombre, edad, telefono, profesion;
	private JButton botonGuardar, botonCancelar;
	JTable mitabla1, miTabla2;
	JScrollPane mibarra1, miBarra2;

	/**
	 * constructor de la clase donde se inicializan todos los componentes de la
	 * ventana de registro
	 */
	public VentanaRegistro() {
		botonGuardar = new JButton();
		botonGuardar.setBounds(110, 200, 120, 25);
		botonGuardar.setText("Registrar");

		botonCancelar = new JButton();
		botonCancelar.setBounds(250, 200, 120, 25);
		botonCancelar.setText("Cancelar");

		labelTitulo = new JLabel();
		labelTitulo.setText("REGISTRO DE PERSONAS");
		labelTitulo.setBounds(120, 20, 380, 30);
		labelTitulo.setFont(new java.awt.Font("Verdana", 1, 18));

		labelTabla1 = new JLabel();
		labelTabla1.setText("Tabla Usando Matriz de datos");
		labelTabla1.setBounds(40, 250, 380, 50);

		labelTabla2 = new JLabel();
		labelTabla2.setText("Tabla Usando Table Model");
		labelTabla2.setBounds(40, 430, 380, 50);

		cod = new JLabel();
		cod.setText("Codigo");
		cod.setBounds(20, 80, 80, 25);
		add(cod);

		nombre = new JLabel();
		nombre.setText("Nombre");
		nombre.setBounds(20, 120, 80, 25);
		add(nombre);

		telefono = new JLabel();
		telefono.setText("telefono");
		telefono.setBounds(290, 160, 80, 25);
		add(telefono);

		edad = new JLabel();
		edad.setText("Edad");
		edad.setBounds(290, 120, 80, 25);
		add(edad);

		profesion = new JLabel();
		profesion.setText("Profesion");
		profesion.setBounds(20, 160, 80, 25);
		add(profesion);

		textCod = new JTextField();
		textCod.setBounds(80, 80, 80, 25);
		add(textCod);

		textNombre = new JTextField();
		textNombre.setBounds(80, 120, 190, 25);
		add(textNombre);

		textTelefono = new JTextField();
		textTelefono.setBounds(340, 160, 80, 25);
		add(textTelefono);

		textEdad = new JTextField();
		textEdad.setBounds(340, 120, 80, 25);
		add(textEdad);

		textProfesion = new JTextField();
		textProfesion.setBounds(80, 160, 190, 25);
		add(textProfesion);

		botonGuardar.addActionListener(this);
		botonCancelar.addActionListener(this);
		// ////////////////////////////////////////////
		mibarra1 = new JScrollPane();
		mibarra1.setBounds(40, 300, 400, 130);
		mostrarDatosUsandoLogica();// mostramos la tabla

		miBarra2 = new JScrollPane();
		miBarra2.setBounds(40, 480, 400, 130);
		mostrarDatosConTableModel();// mostramos la tabla

		add(botonCancelar);
		add(botonGuardar);
		add(labelTitulo);
		add(labelTabla1);
		add(labelTabla2);
		add(mibarra1);
		add(miBarra2);
		limpiar();
		setSize(480, 650);
		setTitle("CoDejaVu : Componentes JTable");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
	}

	/**
	 * Permite el llenado de la tabla1 usando sin utilizar el table model, para
	 * esto usamos logica de programación por medio de la captura de información
	 * en una lista y luego en una matriz para llenar la tabla
	 */
	public void mostrarDatosUsandoLogica() {

		String titulos[] = { "Codigo", "Nombre", "Edad", "Profesión",
				"Telefono" };
		String información[][] = obtieneMariz();// obtenemos la informacion de
												// la BD

		mitabla1 = new JTable(información, titulos);
		mitabla1.setEnabled(false);
		mitabla1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		mibarra1.setViewportView(mitabla1);
	}

	/**
	 * Metodo que permite hacer el llenado de la tabla2 usando Table Model
	 */
	private void mostrarDatosConTableModel() {
		DefaultTableModel model;
		model = new DefaultTableModel();// definimos el objeto tableModel
		miTabla2 = new JTable();// creamos la instancia de la tabla
		miTabla2.setModel(model);
		model.addColumn("Nº Documento");
		model.addColumn("Nombre");
		model.addColumn("Edad");
		model.addColumn("Profesión");
		model.addColumn("Telefono");

		miTabla2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		miTabla2.getTableHeader().setReorderingAllowed(false);

		PersonaDao miPersonaDao2 = new PersonaDao();
		/*
		 * enviamos el objeto TableModel, como mandamos el objeto podemos
		 * manipularlo desde el metodo
		 */
		miPersonaDao2.buscarUsuariosConTableModel(model);
		miBarra2.setViewportView(miTabla2);

	}

	/**
	 * Metodo que permite retornar la matriz con información de la BD
	 * 
	 * @return
	 */
	private String[][] obtieneMariz() {
		PersonaDao miPersonaDao = new PersonaDao();
		/*
		 * llamamos al metodo que retorna la info de la BD y la almacena en la
		 * lista
		 */
		ArrayList<PersonaVo> miLista = miPersonaDao.buscarUsuariosConMatriz();
		/*
		 * como sabemos que son 5 campos, definimos ese valor por defecto para
		 * las columnaslas filas dependen de los registros retornados
		 */
		String informacion[][] = new String[miLista.size()][5];

		for (int x = 0; x < informacion.length; x++) {
			informacion[x][0] = miLista.get(x).getIdPersona() + "";
			informacion[x][1] = miLista.get(x).getNombrePersona() + "";
			informacion[x][2] = miLista.get(x).getProfesionPersona() + "";
			informacion[x][3] = miLista.get(x).getEdadPersona() + "";
			informacion[x][4] = miLista.get(x).getTelefonoPersona() + "";
		}
		return informacion;
	}

	/**
	 * Limpia el formulario de Registro
	 */
	private void limpiar() {
		textCod.setText("");
		textNombre.setText("");
		textEdad.setText("");
		textTelefono.setText("");
		textProfesion.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonGuardar) {

			PersonaDao miPersonaDao = new PersonaDao();
			try {
				PersonaVo miPersona = new PersonaVo();
				miPersona.setIdPersona(Integer.parseInt(textCod.getText()));
				miPersona.setNombrePersona(textNombre.getText());
				miPersona.setTelefonoPersona(Integer.parseInt(textTelefono
						.getText()));
				miPersona.setEdadPersona(Integer.parseInt(textEdad.getText()));
				miPersona.setProfesionPersona(textProfesion.getText());

				miPersonaDao.registrarPersona(miPersona);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null,
						"Error en el Ingreso de Datos", "Error",
						JOptionPane.ERROR_MESSAGE);
			} finally {
				/* Actualizamos siempre las tablas despues del registro */
				mostrarDatosUsandoLogica();
				mostrarDatosConTableModel();
				limpiar();
			}
		}
		if (e.getSource() == botonCancelar) {
			limpiar();
		}
	}

}

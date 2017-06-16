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

	private JLabel labelTitulo;
	private JTextField textCod, textNombre, textEdad, textTelefono,
			textProfesion;
	private JLabel cod, nombre, edad, telefono, profesion;
	private JButton botonGuardar, botonCancelar;
	JTable mitabla1, miTabla2;
	JScrollPane mibarra1, miBarra2;
	////////
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane scrollTablaPruebas;
    private javax.swing.JTable tablaPruebas;

	/**
	 * constructor de la clase donde se inicializan todos los componentes de la
	 * ventana de registro
	 */
	public VentanaRegistro() {
		///////////
		
	    scrollTablaPruebas = new javax.swing.JScrollPane();
	    jPanel1 = new javax.swing.JPanel();
	    jScrollPane1 = new javax.swing.JScrollPane();
	    tablaPruebas = new javax.swing.JTable();

       
        tablaPruebas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaPruebas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1367, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap()));
        

        scrollTablaPruebas.setViewportView(jPanel1);

        scrollTablaPruebas.setBounds(40, 650, 400, 130);
        metodo3();
	    
		////////

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
		mibarra1.setBounds(40, 250, 400, 130);
		mostrarDatos();
		
		miBarra2 = new JScrollPane();
		miBarra2.setBounds(40, 450, 400, 130);
		mostrarDatos2();
		
		add(botonCancelar);
		add(botonGuardar);
		add(labelTitulo);
		add(mibarra1);
		add(miBarra2);
		add(scrollTablaPruebas);
		limpiar();
		setSize(480, 850);
		setTitle("CoDejaVu : Componentes JTable");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

	}

	
	private void metodo3() {
		DefaultTableModel model;
		model = new DefaultTableModel();
		tablaPruebas.setModel(model);
		model.addColumn("Nº Documento");
		model.addColumn("Nombre");
		model.addColumn("Edad");
		model.addColumn("Telefono");
		model.addColumn("Profesión");
		PersonaDao miPersonaDao3 = new PersonaDao();
		miPersonaDao3.buscarUsuarios(model);
	}


	private void mostrarDatos2() {
		 DefaultTableModel model;
		 model = new DefaultTableModel();
		 miTabla2 = new JTable();
		 miTabla2.setModel(model);
		 model.addColumn("Nº Documento");
		 model.addColumn("Nombre");
		 model.addColumn("Edad");
		 model.addColumn("Telefono");
		 model.addColumn("Profesión");
		 miTabla2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		 miTabla2.getTableHeader().setReorderingAllowed(false);

		PersonaDao miPersonaDao2 = new PersonaDao();
		miPersonaDao2.buscarUsuarios(model);
		miBarra2.setViewportView(miTabla2);

	}

	public void mostrarDatos() {
		
		String titulos[] = { "Codigo", "Nombre", "Edad", "Profesión","Telefono" };

		String información[][] = obtieneMariz();

		mitabla1 = new JTable(información, titulos);
		mitabla1.setEnabled(false);
		mitabla1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		mibarra1.setViewportView(mitabla1);
		
		//////////////////////////////////////////////////////
		
	}

	private String[][] obtieneMariz() {
		PersonaDao miPersonaDao = new PersonaDao();

		ArrayList<PersonaVo> miLista = miPersonaDao.buscarUsuariosPersona();
		String informacion[][] = new String[miLista.size()][5];

		for (int x = 0; x < informacion.length; x++) {
			informacion[x][0]=miLista.get(x).getIdPersona()+"";
			informacion[x][1]=miLista.get(x).getNombrePersona()+"";
			informacion[x][2]=miLista.get(x).getProfesionPersona()+"";
			informacion[x][3]=miLista.get(x).getEdadPersona()+"";
			informacion[x][4]=miLista.get(x).getTelefonoPersona()+"";
		}
		return informacion;
	}

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
			
			PersonaDao miPersonaDao= new PersonaDao();
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
			}
			finally{
				mostrarDatos();
			}
		}
		if (e.getSource() == botonCancelar) {
			this.dispose();
		}
	}

}

package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Logica;
import clases.PersonaVO;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.acl.Permission;

import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel panelPpal;
	private JTextField txtDocumento;
	private JTextField txtTxtnombre;
	private JTextField txtEdad;
	private JTextField txtPeso;
	private JTextField txtTalla;
	JButton btnRegistrar,btnCalcularPromedio,btnConsultarLista;
	JTextArea areaTexto;
	Logica miLogica;
	
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(816,586);
		setLocationRelativeTo(null);
		miLogica=new Logica();
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		panelPpal = new JPanel();
		panelPpal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPpal);
		panelPpal.setLayout(null);
		
		JLabel lblCalcularImc = new JLabel("CALCULAR IMC");
		lblCalcularImc.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblCalcularImc.setBounds(303, 13, 272, 47);
		panelPpal.add(lblCalcularImc);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(238, 110, 79, 16);
		panelPpal.add(lblNombre);
		
		JLabel lblDocumento = new JLabel("Documento: ");
		lblDocumento.setBounds(35, 110, 167, 16);
		panelPpal.add(lblDocumento);
		
		JLabel lblPeso = new JLabel("Peso: ");
		lblPeso.setBounds(35, 187, 115, 16);
		panelPpal.add(lblPeso);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(640, 110, 56, 16);
		panelPpal.add(lblEdad);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(110, 107, 116, 22);
		panelPpal.add(txtDocumento);
		txtDocumento.setColumns(10);
		
		txtTxtnombre = new JTextField();
		txtTxtnombre.setBounds(294, 107, 319, 22);
		panelPpal.add(txtTxtnombre);
		txtTxtnombre.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(682, 107, 91, 22);
		panelPpal.add(txtEdad);
		txtEdad.setColumns(10);
		
		JLabel lblDatosBsicos = new JLabel("Datos B\u00E1sicos");
		lblDatosBsicos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDatosBsicos.setBounds(35, 73, 167, 16);
		panelPpal.add(lblDatosBsicos);
		
		JLabel lblDatosImc = new JLabel("Datos IMC");
		lblDatosImc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDatosImc.setBounds(35, 158, 167, 16);
		panelPpal.add(lblDatosImc);
		
		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		txtPeso.setBounds(110, 184, 116, 22);
		panelPpal.add(txtPeso);
		
		JLabel lblTalla = new JLabel("Talla: ");
		lblTalla.setBounds(251, 184, 115, 16);
		panelPpal.add(lblTalla);
		
		txtTalla = new JTextField();
		txtTalla.setColumns(10);
		txtTalla.setBounds(294, 181, 148, 22);
		panelPpal.add(txtTalla);
		
		areaTexto=new JTextArea();
		areaTexto.setLineWrap(true);
		areaTexto.setText("Info");
		
		JScrollPane scrollArea = new JScrollPane();
		scrollArea.setViewportView(areaTexto);
		scrollArea.setBounds(35, 249, 739, 215);
		panelPpal.add(scrollArea);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(191, 491, 186, 25);
		btnRegistrar.addActionListener(this);
		panelPpal.add(btnRegistrar);
		
				
	    btnCalcularPromedio = new JButton("Calcular Promedio IMC");
		btnCalcularPromedio.setBounds(587, 491, 186, 25);
		btnCalcularPromedio.addActionListener(this);
		panelPpal.add(btnCalcularPromedio);
		
		btnConsultarLista = new JButton("Consultar Lista");
		btnConsultarLista.setBounds(389, 491, 186, 25);
		btnConsultarLista.addActionListener(this);
		panelPpal.add(btnConsultarLista);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultado.setBounds(35, 220, 167, 16);
		panelPpal.add(lblResultado);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(btnRegistrar==e.getSource()){
			PersonaVO miPersona=new PersonaVO();
			miPersona.setDocumento(txtDocumento.getText());
			miPersona.setNombre(txtTxtnombre.getText());
			miPersona.setEdad(Integer.parseInt(txtEdad.getText()));
			miPersona.setTalla(Double.parseDouble(txtTalla.getText()));
			miPersona.setPeso(Double.parseDouble(txtPeso.getText()));
			
			
			String res=miLogica.registrarPersona(miPersona);
			areaTexto.setText(res);
		}
		
		if(btnConsultarLista==e.getSource()){
			String res=miLogica.consultarListaPersonas();
			areaTexto.setText(res);
		}
		
		if(btnCalcularPromedio==e.getSource()){
			String res=miLogica.consultarPromedio();
			areaTexto.setText(res);
		}
		
	}
}

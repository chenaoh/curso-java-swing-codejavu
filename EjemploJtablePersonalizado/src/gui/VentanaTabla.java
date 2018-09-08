package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;

import utilidades.GestionCeldas;
import utilidades.GestionEncabezadoTabla;
import utilidades.ModeloTabla;
import utilidades.Utilidades;
import vo.PersonaVo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VentanaTabla extends JFrame implements MouseListener{

	private JPanel contentPane;
	private JScrollPane scrollPaneTabla;
	private JTable tablaPersonas;
	ArrayList<PersonaVo> listaPersonas;//lista que simula la información de la BD
	
	ModeloTabla modelo;//modelo definido en la clase ModeloTabla
	private int filasTabla;
	private int columnasTabla;

	/**
	 * Create the frame.
	 */
	public VentanaTabla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1121, 453);
		
		iniciarComponentes();
		setLocationRelativeTo(null);
		construirTabla();
	}

	private void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTablaPersonas = new JLabel("Tabla Personas");
		lblTablaPersonas.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblTablaPersonas, BorderLayout.NORTH);
		
		scrollPaneTabla = new JScrollPane();
		contentPane.add(scrollPaneTabla);
		
		tablaPersonas = new JTable();
		tablaPersonas.setBackground(Color.WHITE);
		tablaPersonas.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tablaPersonas.addMouseListener(this);
		//tablaSeguimiento.addKeyListener(this);
		tablaPersonas.setOpaque(false);
		scrollPaneTabla.setViewportView(tablaPersonas);
		
	}
	
	/**
	 * Metodo que permite construir la tabla de personas
	 * se crean primero las columnas y luego se asigna la información
	 */
	private void construirTabla() {
		
		listaPersonas=consultarListaPersonas();
		
		ArrayList<String> titulosList=new ArrayList<>();
		
		titulosList.add("Documento");
		titulosList.add("Nombre");
		titulosList.add("Direccion");
		titulosList.add("Telefono");
		titulosList.add("Profesion");
		titulosList.add("Edad");
		titulosList.add("Nota1");
		titulosList.add("Nota2");
		titulosList.add("Nota3");
		titulosList.add("Promedio");
		titulosList.add(" ");
		titulosList.add(" ");
				
		//se asignan las columnas al arreglo para enviarse al momento de construir la tabla
		String titulos[] = new String[titulosList.size()];
		for (int i = 0; i < titulos.length; i++) {
			titulos[i]=titulosList.get(i);
		}
		/*obtenemos los datos de la lista y los guardamos en la matriz
		 * que luego se manda a construir la tabla
		 */
		Object[][] data =obtenerMatrizDatos(titulosList);
		construirTabla(titulos,data);
		
	}

	/**
	 * Permite simular el llenado de personas en una lista
	 * que posteriormente alimentará la tabla
	 * @return
	 */
	private ArrayList<PersonaVo> consultarListaPersonas() {
		ArrayList<PersonaVo> lista=new ArrayList<>();
		
		lista.add(new PersonaVo("1234", "Cristian David Henao", "Calle 2# 23-09 Armenia", "7564323", "Ingeniero",23, 2.5, 4.3, 3.0, (2.5+4.3+3)/33));
		lista.add(new PersonaVo("3455", "Juan Camilo Perez", "Calle 2# 23-09 Armenia", "7564323", "Ingeniero",0, 0, 0,0,0));
		lista.add(new PersonaVo("3214", "Marlon Guapacha", "Calle 2# 23-09 Armenia", "7564323", "Ingeniero",0, 0, 0,0,0));
		lista.add(new PersonaVo("7886", "Marina Marin", "Calle 2# 23-09 Armenia", "7564323", "Ingeniero",0, 0, 0,0,0));
		lista.add(new PersonaVo("4331", "Juliana Henao", "Calle 2# 23-09 Armenia", "7564323", "Ingeniero",0, 0, 0,0,0));
		lista.add(new PersonaVo("98675", "David Henao", "Calle 2# 23-09 Armenia", "7564323", "Ingeniero",0, 0, 0,0,0));
		lista.add(new PersonaVo("1221", "Cristian mendez Henao", "Calle 2# 23-09 Armenia", "7564323", "Ingeniero",0, 0, 0,0,0));
		
		return lista;
	}

	/**
	 * Llena la información de la tabla usando la lista de personas trabajada 
	 * anteriormente, guardandola en una matriz que se retorna con toda 
	 * la información para luego ser asignada al modelo
	 * @param titulosList
	 * @return
	 */
	private Object[][] obtenerMatrizDatos(ArrayList<String> titulosList) {
		
		/*se crea la matriz donde las filas son dinamicas pues corresponde
		 * a todos los usuarios, mientras que las columnas son estaticas
		 * correspondiendo a las columnas definidas por defecto
		 */
		String informacion[][] = new String[listaPersonas.size()][titulosList.size()];
		
		for (int x = 0; x < informacion.length; x++) {
			
			informacion[x][Utilidades.DOCUMENTO] = listaPersonas.get(x).getDocumento()+ "";
			informacion[x][Utilidades.NOMBRE] = listaPersonas.get(x).getNombre()+ "";
			informacion[x][Utilidades.DIRECCION] = listaPersonas.get(x).getDireccion()+ "";
			informacion[x][Utilidades.TELEFONO] = listaPersonas.get(x).getTelefono()+ "";
			informacion[x][Utilidades.PROFESION] = listaPersonas.get(x).getProfesion()+ "";
			informacion[x][Utilidades.EDAD] = listaPersonas.get(x).getEdad()+ "";
			informacion[x][Utilidades.NOTA1] = listaPersonas.get(x).getNota1()+ "";
			informacion[x][Utilidades.NOTA2] = listaPersonas.get(x).getNota2()+ "";
			informacion[x][Utilidades.NOTA3] = listaPersonas.get(x).getNota3()+ "";
			informacion[x][Utilidades.PROMEDIO] = listaPersonas.get(x).getPromedio()+ "";
			//se asignan las plabras clave para que en la clase GestionCeldas se use para asignar el icono correspondiente
			informacion[x][Utilidades.PERFIL] = "PERFIL";
			informacion[x][Utilidades.EVENTO] = "EVENTO";
		}
		
		return informacion;
	}
	
	/**
	 * Con los titulos y la información a mostrar se crea el modelo para 
	 * poder personalizar la tabla, asignando tamaño de celdas tanto en ancho como en alto
	 * así como los tipos de datos que va a poder soportar.
	 * @param titulos
	 * @param data
	 */
	private void construirTabla(String[] titulos, Object[][] data) {
		modelo=new ModeloTabla(data, titulos);
		//se asigna el modelo a la tabla
		tablaPersonas.setModel(modelo);
		
		filasTabla=tablaPersonas.getRowCount();
		columnasTabla=tablaPersonas.getColumnCount();
		
		//se asigna el tipo de dato que tendrán las celdas de cada columna definida respectivamente para validar su personalización
		tablaPersonas.getColumnModel().getColumn(Utilidades.EDAD).setCellRenderer(new GestionCeldas("numerico"));
		tablaPersonas.getColumnModel().getColumn(Utilidades.NOTA1).setCellRenderer(new GestionCeldas("numerico"));
		tablaPersonas.getColumnModel().getColumn(Utilidades.NOTA2).setCellRenderer(new GestionCeldas("numerico"));
		tablaPersonas.getColumnModel().getColumn(Utilidades.NOTA3).setCellRenderer(new GestionCeldas("numerico"));
		tablaPersonas.getColumnModel().getColumn(Utilidades.PROMEDIO).setCellRenderer(new GestionCeldas("numerico"));
		tablaPersonas.getColumnModel().getColumn(Utilidades.PERFIL).setCellRenderer(new GestionCeldas("icono"));
		tablaPersonas.getColumnModel().getColumn(Utilidades.EVENTO).setCellRenderer(new GestionCeldas("icono"));
		
		//se recorre y asigna el resto de celdas que serian las que almacenen datos de tipo texto
		for (int i = 0; i < titulos.length-7; i++) {//se resta 7 porque las ultimas 7 columnas se definen arriba
			System.out.println(i);
			tablaPersonas.getColumnModel().getColumn(i).setCellRenderer(new GestionCeldas("texto"));
		}
		
		tablaPersonas.getTableHeader().setReorderingAllowed(false);
		tablaPersonas.setRowHeight(25);//tamaño de las celdas
		tablaPersonas.setGridColor(new java.awt.Color(0, 0, 0)); 
		//Se define el tamaño de largo para cada columna y su contenido
		tablaPersonas.getColumnModel().getColumn(Utilidades.DOCUMENTO).setPreferredWidth(130);//documento
		tablaPersonas.getColumnModel().getColumn(Utilidades.NOMBRE).setPreferredWidth(380);//nombre
		tablaPersonas.getColumnModel().getColumn(Utilidades.DIRECCION).setPreferredWidth(350);//direccion
		tablaPersonas.getColumnModel().getColumn(Utilidades.TELEFONO).setPreferredWidth(130);//telefono
		tablaPersonas.getColumnModel().getColumn(Utilidades.PROFESION).setPreferredWidth(280);//profesion
		tablaPersonas.getColumnModel().getColumn(Utilidades.EDAD).setPreferredWidth(80);//edad
		tablaPersonas.getColumnModel().getColumn(Utilidades.NOTA1).setPreferredWidth(100);//nota1
		tablaPersonas.getColumnModel().getColumn(Utilidades.NOTA2).setPreferredWidth(100);//nota2
		tablaPersonas.getColumnModel().getColumn(Utilidades.NOTA3).setPreferredWidth(100);//nota3
		tablaPersonas.getColumnModel().getColumn(Utilidades.PROMEDIO).setPreferredWidth(130);//promedio
		tablaPersonas.getColumnModel().getColumn(Utilidades.PERFIL).setPreferredWidth(30);//accion perfil
		tablaPersonas.getColumnModel().getColumn(Utilidades.EVENTO).setPreferredWidth(30);//accion evento
		
		//personaliza el encabezado
		JTableHeader jtableHeader = tablaPersonas.getTableHeader();
	    jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
	    tablaPersonas.setTableHeader(jtableHeader);
	    
	    //se asigna la tabla al scrollPane
	    scrollPaneTabla.setViewportView(tablaPersonas);


	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//capturo fila o columna dependiendo de mi necesidad
		int fila = tablaPersonas.rowAtPoint(e.getPoint());
		int columna = tablaPersonas.columnAtPoint(e.getPoint());
		
		/*uso la columna para valiar si corresponde a la columna de perfil garantizando
		 * que solo se produzca algo si selecciono una fila de esa columna
		 */
		if (columna==Utilidades.PERFIL) {
			//sabiendo que corresponde a la columna de perfil, envio la posicion de la fila seleccionada
			validarSeleccionMouse(fila);
		}else if (columna==Utilidades.EVENTO){//se valida que sea la columna del otro evento
			JOptionPane.showMessageDialog(null, "Evento del otro icono");
		}
		
	}

	/**
	 * Este metodo simularia el proceso o la acción que se quiere realizar si 
	 * se presiona alguno de los botones o iconos de la tabla
	 * @param fila
	 */
	private void validarSeleccionMouse(int fila) {
		Utilidades.filaSeleccionada=fila;
		
		
		//teniendo la fila entonces se obtiene el objeto correspondiente para enviarse como parammetro o imprimir la información
		PersonaVo miPersona=new PersonaVo();
		miPersona.setDocumento(tablaPersonas.getValueAt(fila, Utilidades.DOCUMENTO).toString());
		miPersona.setNombre(tablaPersonas.getValueAt(fila, Utilidades.NOMBRE).toString());
		
		String info="INFO PERSONA\n";
		info+="Documento: "+miPersona.getDocumento()+"\n";
		info+="Nombre: "+miPersona.getNombre()+"\n";
		
		JOptionPane.showMessageDialog(null, info);
	}

	
	//estos metododos pueden ser usados dependiendo de nuestra necesidad, por ejemplo para cambiar el tamaño del icono al ser presionado
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}

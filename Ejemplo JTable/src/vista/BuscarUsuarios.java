package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;

import controlador.Coordinador;

/**
 * Clase para la ventana de buscar usuarios donde se permite la
 * realizacion del proceso de busqueda de todos los usuarios registrados.
 * @author Cristian David Henao Hoyos
 * @author German David Camelo Garcia
 * @version 1.0
 */
public class BuscarUsuarios extends JDialog implements ActionListener{

    /**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	Coordinador miCoordinador;

	
    /**
     * constructor de la clase
     * @param parent
     * @param modal
     */
    public BuscarUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(942, 512);
        this.setLocationRelativeTo(null);
        setTitle("Usuarios Registrados");
        setResizable(false);
    }

  
    /**
     * Inicialización de Componentes
     */
    private void initComponents() {
    	
        jPanel2 = new javax.swing.JPanel();
        scrollTablaPruebas = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPruebas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
       
        setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

       
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

        jPanel2.add(scrollTablaPruebas);
        scrollTablaPruebas.setBounds(20, 120, 870, 230);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USUARIOS");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(170, 20, 630, 60);

        botonAceptar.setText("Salir");
        jPanel2.add(botonAceptar);
        botonAceptar.setBounds(800, 400, 90, 23);
        botonAceptar.addActionListener(this);
        add(jPanel2);
        jPanel2.setBounds(10, 10, 910, 460);
        
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        }catch(ClassNotFoundException e){
			System.out.println(e.getMessage());
		}
        
    }// </editor-fold>


    private javax.swing.JButton botonAceptar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane scrollTablaPruebas;
    private javax.swing.JTable tablaPruebas;
	
	/**
	 * permite la consulta de todos los usuarios registrados dentro del sistema
	 */
	public void consulta()
    {
		DefaultTableModel model;
		model = new DefaultTableModel();
		tablaPruebas.setModel(model);
		model.addColumn("Nº Documento");
		model.addColumn("Nombre");
		model.addColumn("Edad");
		model.addColumn("Telefono");
	    model.addColumn("Profesión");
	    miCoordinador.buscarUsuarios(model);
    }

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==botonAceptar)
		{
			dispose();//para confirmar el cierre de ventana
		}		
	}

	public void setCoordinador(Coordinador coordinador) {
		miCoordinador=coordinador;
	}


	
}

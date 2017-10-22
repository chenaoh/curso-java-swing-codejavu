package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import controlador.Coordinador;

/**
 *
 * @author User
 */
public class VentanaLogin extends JDialog implements ActionListener{

    // Variables declaration - do not modify                     
    private javax.swing.JButton botonAceptar;
    private javax.swing.JPasswordField campoPass;
    private javax.swing.JComboBox comboUsuarios;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelUser;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JLabel tituloLogin;
    
    private Coordinador miCoordinador;
    // End of variables declaration  
	
    /**
     * Creates new form VentanaLogin
     */
    public VentanaLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Login");
        setSize(275,330);
        setLocationRelativeTo(null);
        setResizable(false);
        
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        addWindowListener(new WindowAdapter() {
        	
        	@Override
        	public void windowClosing(WindowEvent e) {
        		Object[] options = {"Continuar", "Cerrar"};
            	int n = JOptionPane.showOptionDialog(null,
                        "Seleccione un tipo de Usuario.\nSi sale el sistema se Cerrara","Confirmación",JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE,null,options,options[0]);
		       
            	if (n == JOptionPane.YES_OPTION){}
		        else if (n == JOptionPane.NO_OPTION) 
		        {
		        	System.exit(0);//Cerrar todo el sistema
		        }
        	}
        });
  
    }

    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        tituloLogin = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        labelPass = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        comboUsuarios = new javax.swing.JComboBox();
        campoPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelLogin.setBackground(new java.awt.Color(204, 204, 204));
        panelLogin.setLayout(null);

        tituloLogin.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        tituloLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLogin.setText("Ventana Login");
        tituloLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelLogin.add(tituloLogin);
        tituloLogin.setBounds(10, 0, 250, 60);

        imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/candado.png"))); // NOI18N
        imagen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelLogin.add(imagen);
        imagen.setBounds(10, 70, 250, 100);

        labelUser.setText("Usuario");
        panelLogin.add(labelUser);
        labelUser.setBounds(10, 190, 70, 20);

        labelPass.setText("Pass");
        panelLogin.add(labelPass);
        labelPass.setBounds(10, 220, 70, 14);
        labelPass.setVisible(false);

        botonAceptar.setText("Aceptar");
        panelLogin.add(botonAceptar);
        botonAceptar.setBounds(150, 260, 110, 30);
        botonAceptar.addActionListener(this);

        comboUsuarios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Administrador", "Usuario"}));
        panelLogin.add(comboUsuarios);
        comboUsuarios.setBounds(70, 190, 190, 20);
        comboUsuarios.addActionListener(this);
        
        panelLogin.add(campoPass);
        campoPass.setBounds(70, 220, 190, 20);
        campoPass.setVisible(false);

        getContentPane().add(panelLogin);
        panelLogin.setBounds(0, 0, 270, 300);

        pack();
    }// </editor-fold>                        

   
/////////////            
    
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource()==comboUsuarios) {
			mostrarElementos();
		}
		
		if (evento.getSource()==botonAceptar) {
			String resp=miCoordinador.validarIngreso(comboUsuarios.getSelectedIndex(),campoPass.getText());
			
			if (resp.equals("error")) {
				JOptionPane.showMessageDialog(null, "No ha seleccionado un usuario","Advertencia",JOptionPane.WARNING_MESSAGE);
			}else{
				if (resp.equals("invalido")) {
					JOptionPane.showMessageDialog(null, "El pass no corresponde","Advertencia",JOptionPane.WARNING_MESSAGE);
				}else{
					if (resp.equals("desconectado")) {
						JOptionPane.showMessageDialog(null, "No se pudo conectar a la BD, "
								+ "verifique que se encuentre el linea","Error de Conexion",JOptionPane.ERROR_MESSAGE);
					}else{
						miCoordinador.asignarPrivilegios(resp);
						miCoordinador.cerrarVentanaLogin();
					}
				}
			}
			
			
		}
	}
	
	public void limpiar(){
		comboUsuarios.setSelectedIndex(0);
		campoPass.setText("");
	}

	private void mostrarElementos() {
		String seleccion=(String) comboUsuarios.getSelectedItem();
		int index=comboUsuarios.getSelectedIndex();
		
		if (index==0) {
			labelPass.setVisible(false);
			campoPass.setVisible(false);
		}else{
			labelPass.setVisible(true);
			campoPass.setVisible(true);
		}
	}
}
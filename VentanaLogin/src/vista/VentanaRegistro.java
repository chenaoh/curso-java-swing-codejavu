package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import modelo.vo.UsuarioVo;

import controlador.Coordinador;

/**
 *
 * @author User
 */
public class VentanaRegistro extends JDialog  implements ActionListener{

    /**
     * Creates new form VentanaRegistro
     */
    public VentanaRegistro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(705,330);
        setResizable(false);
        setLocationRelativeTo(null);
    }

     private void initComponents() {

        panelRegistro = new javax.swing.JPanel();
        tituloRegistro = new javax.swing.JLabel();
        labelProfesion = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelTexto = new javax.swing.JLabel();
        labelDocumento = new javax.swing.JLabel();
        labelEdad = new javax.swing.JLabel();
        LabelDireccion = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        separadorInferior = new javax.swing.JSeparator();
        campoNombre = new javax.swing.JTextField();
        campoDireccion = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoProfesion = new javax.swing.JTextField();
        campoDocumento = new javax.swing.JTextField();
        campoEdad = new javax.swing.JTextField();
        separadorSuperior = new javax.swing.JSeparator();
        btonCancelar = new javax.swing.JButton();
        btonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
       // getContentPane().setLayout(null);

        panelRegistro.setBackground(new java.awt.Color(204, 204, 204));
        panelRegistro.setLayout(null);

        tituloRegistro.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        tituloRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistro.setText("Registro de Usuario");
        tituloRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelRegistro.add(tituloRegistro);
        tituloRegistro.setBounds(20, 10, 660, 60);

        labelProfesion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelProfesion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelProfesion.setText("Profesión:");
        panelRegistro.add(labelProfesion);
        labelProfesion.setBounds(0, 170, 90, 20);

        labelTelefono.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTelefono.setText("Telefono:");
        panelRegistro.add(labelTelefono);
        labelTelefono.setBounds(400, 200, 100, 20);

        labelTexto.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labelTexto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTexto.setText("Diligencie el Formulario para registrar el Usuario en el Sistema");
        panelRegistro.add(labelTexto);
        labelTexto.setBounds(0, 90, 510, 20);

        labelDocumento.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelDocumento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelDocumento.setText("* Documento:");
        panelRegistro.add(labelDocumento);
        labelDocumento.setBounds(400, 140, 100, 20);

        labelEdad.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelEdad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEdad.setText("Edad:");
        panelRegistro.add(labelEdad);
        labelEdad.setBounds(400, 170, 100, 20);

        LabelDireccion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        LabelDireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelDireccion.setText("Dirección:");
        panelRegistro.add(LabelDireccion);
        LabelDireccion.setBounds(0, 200, 90, 20);

        labelNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNombre.setText("* Nombre:");
        
        panelRegistro.add(labelNombre);
        labelNombre.setBounds(0, 140, 90, 20);
        panelRegistro.add(separadorInferior);
        separadorInferior.setBounds(20, 240, 660, 10);
        panelRegistro.add(campoNombre);
        campoNombre.setBounds(100, 140, 300, 20);
        panelRegistro.add(campoDireccion);
        campoDireccion.setBounds(100, 200, 300, 20);
        panelRegistro.add(campoTelefono);
        campoTelefono.setBounds(510, 200, 170, 20);
        panelRegistro.add(campoProfesion);
        campoProfesion.setBounds(100, 170, 300, 20);
        panelRegistro.add(campoDocumento);
        campoDocumento.setBounds(510, 140, 170, 20);
        panelRegistro.add(campoEdad);
        campoEdad.setBounds(510, 170, 170, 20);
        panelRegistro.add(separadorSuperior);
        separadorSuperior.setBounds(20, 120, 660, 10);

        btonCancelar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btonCancelar.setText("Cancelar");
        panelRegistro.add(btonCancelar);
        btonCancelar.setBounds(570, 260, 110, 30);
        btonCancelar.addActionListener(this);

        btonAceptar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btonAceptar.setText("Aceptar");
        panelRegistro.add(btonAceptar);
        btonAceptar.setBounds(450, 260, 110, 30);
        btonAceptar.addActionListener(this);

        getContentPane().add(panelRegistro);
        panelRegistro.setBounds(0, 0, 690, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDireccion;
    private javax.swing.JButton btonAceptar;
    private javax.swing.JButton btonCancelar;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoEdad;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoProfesion;
    private javax.swing.JLabel tituloRegistro;
    private javax.swing.JLabel labelDocumento;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelProfesion;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTexto;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JSeparator separadorInferior;
    private javax.swing.JSeparator separadorSuperior;
	private Coordinador miCoordinador;

	
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btonAceptar) {
			registrar();
		}
		if (e.getSource()==btonCancelar) {
			dispose();
		}
	}

	private void registrar() {
		
		Integer edad=miCoordinador.validarEdad(campoEdad.getText().trim());
		
		if (edad!=null) {
			
			UsuarioVo miUsuarioVo=new UsuarioVo();
			miUsuarioVo.setDocumento(campoDocumento.getText().trim());
			miUsuarioVo.setNombre(campoNombre.getText().trim());
			miUsuarioVo.setEdad(edad);
			miUsuarioVo.setProfesion(campoProfesion.getText().trim());
			miUsuarioVo.setDireccion(campoDireccion.getText().trim());
			miUsuarioVo.setTelefono(campoTelefono.getText().trim());		
			
			String retorno="";
			if (miCoordinador.validarCampos(miUsuarioVo)) {
				 retorno=miCoordinador.registrarUsuario(miUsuarioVo);	
			}else{
				retorno="mas_datos";
			}
			
			if (retorno.equals("ok")) {
				JOptionPane.showMessageDialog(null, "El usuario fue registrado con exito!!!");
			}else{
				if (retorno.equals("error")) {
					JOptionPane.showMessageDialog(null, "El usuario no pudo ser registrado, verifique la traza del error!!!");	
				}else{
					JOptionPane.showMessageDialog(null, "Se necesitan diligenciar los campos obligatorios (*) !!!","Advertencia",JOptionPane.WARNING_MESSAGE);
				}
			
		}
		
		}else{
			JOptionPane.showMessageDialog(null, "Debe ingresar una edad Valida!!!","Advertencia",JOptionPane.ERROR_MESSAGE);
		}
		
	}

}

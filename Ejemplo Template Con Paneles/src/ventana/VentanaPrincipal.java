package ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import paneles.PanelIntroduccion;
import paneles.PanelMensaje;
import principal.Coordinador;


public class VentanaPrincipal extends JDialog implements ActionListener {

	private static final long	serialVersionUID	= 1L;
	JLabel labelTitulo;/*declaramos el objeto Label*/

	public JButton salir;
	public JButton botonPanelInicial,botonPanelDos;
	public JButton botonInicio;
	public javax.swing.JScrollPane scrollPaneles;

	Coordinador miCoorDinador;

    public VentanaPrincipal() {
        initComponents();
        setSize      ( 693, 518 );
        setTitle("Trabajo con Paneles Java Swing");
        this.setLocationRelativeTo(null);
        setResizable(false);
     }

    private void initComponents() {
    	scrollPaneles = new javax.swing.JScrollPane();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        salir=new JButton();
		salir.setBounds(610,455,60,30);
		salir.setIcon(new ImageIcon(getClass().getResource("/imagenes/salir.gif")));
		salir.addActionListener(this);
		getContentPane().add(salir);
		
		botonPanelInicial=new JButton();
        botonPanelInicial.setText("Panel Inicial");
        botonPanelInicial.setBounds(20, 80, 180, 50);
        botonPanelInicial.addActionListener(this);
        getContentPane().add(botonPanelInicial);
        
        botonPanelDos=new JButton();
        botonPanelDos.setText("Panel Secundario");
        botonPanelDos.setBounds(220, 80, 180, 50);
        botonPanelDos.addActionListener(this);
        getContentPane().add(botonPanelDos);
        
        botonInicio=new JButton();
        botonInicio.setText("Inicio");
        botonInicio.setBounds(780, 80, 180, 50);
        botonInicio.addActionListener(this);
        getContentPane().add(botonInicio);
        
        /*Propiedades del Label, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		labelTitulo= new JLabel();
		labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 28));
		labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		labelTitulo.setText("CONTENEDORES JAVA SWING");
		labelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(
				javax.swing.border.BevelBorder.LOWERED));
	    labelTitulo.setBounds(90, 10, 500, 40);
	    getContentPane().add(labelTitulo);
        
        scrollPaneles.setAutoscrolls(true);
        scrollPaneles.setPreferredSize(new java.awt.Dimension(990, 1915));
        scrollPaneles.setWheelScrollingEnabled(false);
        getContentPane().add(scrollPaneles);
        scrollPaneles.setBounds(20, 150, 650, 300);
        pack();
    }
    
    /**
	 * Define el panel introduccion para mostrar en la ventana
	 * @param introduccion
	 */
	public void definirPanel(PanelIntroduccion introduccion) {
		scrollPaneles.setViewportView(introduccion);
	}
	
	/**
	 * Define el panel Mensaje para mostrar en la ventana
	 * @param miPanelMensaje
	 */
	public void definirPanel(PanelMensaje miPanelMensaje) {
		scrollPaneles.setViewportView(miPanelMensaje);
	}    

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==botonPanelInicial){
			miCoorDinador.cargarPaneles(1);
		}
		
		if (e.getSource()==botonPanelDos){
			miCoorDinador.cargarPaneles(2);
		}
		
		if (e.getSource()==salir){
			int respuesta = JOptionPane.showConfirmDialog(this,
					"Esta seguro que desea salir?", "Confirmación",
					JOptionPane.YES_NO_OPTION);
			if (respuesta == JOptionPane.YES_NO_OPTION){
				System.exit(0);
			}
		}
	}

	public void setCoordinador(Coordinador coordinador) {
		miCoorDinador=coordinador;
	}
}
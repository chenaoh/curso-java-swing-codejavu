package ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import paneles.PanelIntroduccion;
import paneles.PanelMensaje;
import principal.Coordinador;


public class VentanaPrincipal extends JFrame implements ActionListener, MouseListener {

	private static final long	serialVersionUID	= 1L;
	JLabel labelTitulo;/*declaramos el objeto Label*/

	public JButton salir;
	private JLabel botonLabelPanel1,botonLabelPanel2;
	public JScrollPane scrollPaneles;

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
		
		botonLabelPanel1= new JLabel();
        botonLabelPanel1.setBounds(20, 65, 200, 90);
        botonLabelPanel1.setHorizontalAlignment(SwingConstants.CENTER);
        botonLabelPanel1.setIcon(new ImageIcon(
        		getClass().getResource("/imagenes/imagen1Boton1.png")));
        botonLabelPanel1.addMouseListener(this);
        getContentPane().add(botonLabelPanel1);
        
        botonLabelPanel2= new JLabel();
        botonLabelPanel2.setBounds(220, 65, 200, 90);
        botonLabelPanel2.setHorizontalAlignment(SwingConstants.CENTER);
        botonLabelPanel2.setIcon(new ImageIcon(
        		getClass().getResource("/imagenes/imagen1Boton2.png")));
        botonLabelPanel2.addMouseListener(this);
        getContentPane().add(botonLabelPanel2);
        
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

	
	//EVENTOS DEL MOUSE
	@Override
	public void mouseClicked(MouseEvent e) {
		
		if (e.getSource()==botonLabelPanel1){
			botonLabelPanel1.setIcon(new javax.swing.ImageIcon(
					getClass().getResource("/imagenes/imagen2Boton1.png")));
			miCoorDinador.cargarPaneles(1);
		}
		
		if (e.getSource()==botonLabelPanel2){
			botonLabelPanel2.setIcon(new javax.swing.ImageIcon(
					getClass().getResource("/imagenes/imagen2Boton2.png")));
			miCoorDinador.cargarPaneles(2);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	
		if (e.getSource()==botonLabelPanel1){
			botonLabelPanel1.setIcon(new ImageIcon(
					getClass().getResource("/imagenes/imagen2Boton1.png")));
		}
		if (e.getSource()==botonLabelPanel2){
			botonLabelPanel2.setIcon(new ImageIcon(
					getClass().getResource("/imagenes/imagen2Boton2.png")));
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource()==botonLabelPanel1){
			botonLabelPanel1.setIcon(new ImageIcon(
					getClass().getResource("/imagenes/imagen1Boton1.png")));	
		}
		if (e.getSource()==botonLabelPanel2){
			botonLabelPanel2.setIcon(new ImageIcon(
					getClass().getResource("/imagenes/imagen1Boton2.png")));
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource()==botonLabelPanel1){
			botonLabelPanel1.setIcon(new ImageIcon(
					getClass().getResource("/imagenes/imagen3Boton1.png")));
		}
		
		if (e.getSource()==botonLabelPanel2){
			botonLabelPanel2.setIcon(new ImageIcon(
					getClass().getResource("/imagenes/imagen3Boton2.png")));
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getSource()==botonLabelPanel1){
			botonLabelPanel1.setIcon(new ImageIcon(
					getClass().getResource("/imagenes/imagen1Boton1.png")));
		}
		if (e.getSource()==botonLabelPanel2){
			botonLabelPanel2.setIcon(new ImageIcon(
					getClass().getResource("/imagenes/imagen1Boton2.png")));
		}
		
	}
}
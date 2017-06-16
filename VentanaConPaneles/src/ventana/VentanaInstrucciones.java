package ventana;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import paneles.PanelIntroduccionAbstracta;
import paneles.PanelIntroduccionEspacial;
import paneles.PanelIntroduccionMatematica;
import paneles.PanelIntroduccionVerbal;
import principal.Coordinador;

/**
 * Clase para la ventana de Instrucciones
 * @author Cristian David Henao Hoyos
 * @author German David Camelo Garcia
 * @version 1.0
 */
public class VentanaInstrucciones extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	JLabel labelTitulo;/*declaramos el objeto Label*/

	public JButton salir;
	public JButton botonPanelMatematicas;
	public JButton botonPanelEspacial;
	public JButton botonPanelAbstracta;
	public JButton botonPanelVerbal;
	public JButton botonInicio;
	public javax.swing.JScrollPane scrollPaneles;
	Coordinador miCoorDinador;

    /**
     * Constructor de Clase
     * @param parent
     * @param modal
     */
    public VentanaInstrucciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize      ( 993, 718 );
        setTitle("Ayuda Pruebas de Razonamiento");
        this.setLocationRelativeTo(null);
        setResizable(false);
     }
     
    /**
     * Inicialización de Componentes
     */
    private void initComponents() {

    	scrollPaneles = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        salir=new JButton();
		salir.setBounds(890,30,60,30);
		salir.setIcon(new ImageIcon(getClass().getResource("/imagenes/salir.gif")));
		salir.addActionListener(this);
		getContentPane().add(salir);
		
		botonPanelAbstracta=new JButton();
        botonPanelAbstracta.setText("Pensamiento Abstracto");
        botonPanelAbstracta.setBounds(20, 80, 180, 50);
        botonPanelAbstracta.addActionListener(this);
        getContentPane().add(botonPanelAbstracta);
        
        botonPanelEspacial=new JButton();
        botonPanelEspacial.setText("Pensamiento Espacial");
        botonPanelEspacial.setBounds(210, 80, 180, 50);
        botonPanelEspacial.addActionListener(this);
        getContentPane().add(botonPanelEspacial);
        
        botonPanelMatematicas=new JButton();
        botonPanelMatematicas.setText("Pensamiento Matematico");
        botonPanelMatematicas.setBounds(400, 80, 180, 50);
        botonPanelMatematicas.addActionListener(this);
        getContentPane().add(botonPanelMatematicas);
        
        botonPanelVerbal=new JButton();
        botonPanelVerbal.setText("Pensamiento Verbal");
        botonPanelVerbal.setBounds(590, 80, 180, 50);
        botonPanelVerbal.addActionListener(this);
        getContentPane().add(botonPanelVerbal);
        
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
		labelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
	    labelTitulo.setBounds(110, 10, 500, 40);
	    getContentPane().add(labelTitulo);
        
        scrollPaneles.setAutoscrolls(true);
        scrollPaneles.setPreferredSize(new java.awt.Dimension(990, 1915));
        scrollPaneles.setWheelScrollingEnabled(false);
        getContentPane().add(scrollPaneles);
        scrollPaneles.setBounds(10, 150, 970, 530);
        pack();
    }                   
    

	/*SobreCarga de metodos para definir cual es el panel enviado como parametro*/
	/////////////////////////////////////////////////////////////////////
    /**
     * Define el panel introduccionEspacial para mostrar en la ventana
     * @param introduccionEspacial
     */
    public void definirPanel(PanelIntroduccionEspacial introduccionEspacial) {
        scrollPaneles.setViewportView(introduccionEspacial);
     }
    
	/**
	 * Define el panel introduccionAbstracta para mostrar en la ventana
	 * @param introduccionAbstracta
	 */
	public void definirPanel(PanelIntroduccionAbstracta introduccionAbstracta) {
		scrollPaneles.setViewportView(introduccionAbstracta);
		
	}
	/**
	 * Define el panel introduccionNumerica para mostrar en la ventana
	 * @param introduccionNumerica
	 */
	public void definirPanel(PanelIntroduccionMatematica introduccionNumerica)	{
		scrollPaneles.setViewportView(introduccionNumerica);	
	}

	/**
	 * Define el panel introduccionVerbal para mostrar en la ventana
	 * @param introduccionVerbal
	 */
	public void definirPanel(PanelIntroduccionVerbal introduccionVerbal) {
		scrollPaneles.setViewportView(introduccionVerbal);		
	}
	//////////////////////////////////////////////////////////////////////////

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==salir)
		{
			if (e.getSource()==salir)
			{
				int respuesta = JOptionPane.showConfirmDialog(this,
						"Esta seguro que desea salir?", "Confirmación",
						JOptionPane.YES_NO_OPTION);
				if (respuesta == JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		}
		if (e.getSource()==botonPanelEspacial)
		{
			miCoorDinador.cargarPaneles(1);
		}
		if (e.getSource()==botonPanelAbstracta)
		{
			miCoorDinador.cargarPaneles(2);
		}
		if (e.getSource()==botonPanelMatematicas)
		{
			miCoorDinador.cargarPaneles(3);
		}
		if (e.getSource()==botonPanelVerbal)
		{
			miCoorDinador.cargarPaneles(4);
		}
	}

	 public void setCoordinador(Coordinador coordinador) {
			miCoorDinador=coordinador;
		} 
}

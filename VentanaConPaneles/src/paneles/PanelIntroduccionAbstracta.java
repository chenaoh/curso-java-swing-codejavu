package paneles;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import principal.Coordinador;


/**
 * Es la clase que contiene los componentes gráficos para 
 * visualizar las instrucciones de realización la prueba
 * de razonamiento Abstracto.
 * @author Cristian David Henao Hoyos
 * @author German David Camelo Garcia
 * @version 1.0
 */
public class PanelIntroduccionAbstracta extends javax.swing.JPanel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	Coordinador miCoorDinador;
    private JTextArea areaEspacial, areaEspacial1, areaEspacial2;
    private JLabel jLabel1, jLabel13, jLabel14;
    private JScrollPane jScrollPane1, jScrollPane2,jScrollPane3;
    private JRadioButton opcionA1, opcionA2,opcionB1, opcionB2, opcionC1,opcionC2, opcionD1, opcionD2, opcionE1,opcionE2;
    private JPanel panelIntroduccionEspacial2;
    
    /**
     * Metodo Constructor de Clase
     */
    public PanelIntroduccionAbstracta() {
        initComponents();
    }
            
    /**
     * Inicialización de Componentes
     */
    private void initComponents() {

    	 panelIntroduccionEspacial2 = new javax.swing.JPanel();
         jScrollPane1 = new javax.swing.JScrollPane();
         areaEspacial = new javax.swing.JTextArea();
         jLabel13 = new javax.swing.JLabel();
         opcionA1 = new javax.swing.JRadioButton();
         opcionB1 = new javax.swing.JRadioButton();
         opcionC1 = new javax.swing.JRadioButton();
         opcionD1 = new javax.swing.JRadioButton();
         opcionE1 = new javax.swing.JRadioButton();
         jScrollPane2 = new javax.swing.JScrollPane();
         areaEspacial1 = new javax.swing.JTextArea();
         jScrollPane3 = new javax.swing.JScrollPane();
         areaEspacial2 = new javax.swing.JTextArea();
         jLabel14 = new javax.swing.JLabel();
         opcionA2 = new javax.swing.JRadioButton();
         opcionB2 = new javax.swing.JRadioButton();
         opcionC2 = new javax.swing.JRadioButton();
         opcionD2 = new javax.swing.JRadioButton();
         opcionE2 = new javax.swing.JRadioButton();
         jLabel1 = new javax.swing.JLabel();

         setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
         setPreferredSize(new java.awt.Dimension(940, 800));
         setLayout(null);

         panelIntroduccionEspacial2.setOpaque(false);
         panelIntroduccionEspacial2.setLayout(null);

         areaEspacial.setColumns(20);
         areaEspacial.setEditable(false);
         areaEspacial.setFont(new java.awt.Font("Verdana", 0, 16));
         areaEspacial.setLineWrap(true);
         areaEspacial.setRows(5);
         areaEspacial.setText("EJEMPLO 2.\n\nEstudie la posición del circulo. Observe que se mueve dentro del cuadrado en el sentido de las agujas del reloj: esquina superior izquierda, esquina superior derecha, esquina inferior derecha, esquina inferior izquierda. ¿En que posición se vera luego? Regresará a la esquina superior izquierda. por consiguiente, B es la respuesta y usted deberá seleccionar esta opción.");
         areaEspacial.setWrapStyleWord(true);
         areaEspacial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, new java.awt.Color(0, 0, 0)));
         areaEspacial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
         jScrollPane1.setViewportView(areaEspacial);

         panelIntroduccionEspacial2.add(jScrollPane1);
         jScrollPane1.setBounds(10, 630, 900, 140);

         jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
         jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ejemploAbstracto1.png"))); // NOI18N
         jLabel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EJEMPLO 1.", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 14))); // NOI18N
         panelIntroduccionEspacial2.add(jLabel13);
         jLabel13.setBounds(70, 200, 810, 110);

         opcionA1.setText("A");
         opcionA1.setOpaque(false);
         panelIntroduccionEspacial2.add(opcionA1);
         opcionA1.setBounds(510, 310, 33, 23);

         opcionB1.setText("B");
         opcionB1.setOpaque(false);
         panelIntroduccionEspacial2.add(opcionB1);
         opcionB1.setBounds(590, 310, 40, 23);

         opcionC1.setText("C");
         opcionC1.setOpaque(false);
         panelIntroduccionEspacial2.add(opcionC1);
         opcionC1.setBounds(670, 310, 33, 23);

         opcionD1.setSelected(true);
         opcionD1.setText("D");
         opcionD1.setOpaque(false);
         panelIntroduccionEspacial2.add(opcionD1);
         opcionD1.setBounds(740, 310, 40, 23);

         opcionE1.setText("E");
         opcionE1.setOpaque(false);
         panelIntroduccionEspacial2.add(opcionE1);
         opcionE1.setBounds(810, 310, 40, 23);

         areaEspacial1.setColumns(20);
         areaEspacial1.setEditable(false);
         areaEspacial1.setFont(new java.awt.Font("Verdana", 0, 16));
         areaEspacial1.setLineWrap(true);
         areaEspacial1.setRows(5);
         areaEspacial1.setText("En este Test encontrara 50 series de diseños o mas figuras como las que se presentan aquí, cada serie es un problema.\n\nCada serie consta de cuatro figuras llamadas Figuras Problema, y cinco llamadas Figuras Respuesta. Las cuatro Figuras Problema forman una serie o progresión. Usted tiene que averiguar cual de las figuras Respuesta es la siguiente (o quinta) en la serie.");
         areaEspacial1.setWrapStyleWord(true);
         areaEspacial1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, new java.awt.Color(0, 0, 0)));
         areaEspacial1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
         jScrollPane2.setViewportView(areaEspacial1);

         panelIntroduccionEspacial2.add(jScrollPane2);
         jScrollPane2.setBounds(10, 50, 900, 140);

         areaEspacial2.setColumns(20);
         areaEspacial2.setEditable(false);
         areaEspacial2.setFont(new java.awt.Font("Verdana", 0, 16));
         areaEspacial2.setLineWrap(true);
         areaEspacial2.setRows(5);
         areaEspacial2.setText("EJEMPLO 1.\n\nObserve que las líneas de las Figuras Problema se van inclinando. En el primer cuadro la línea esta vertical; a medida que usted pasa de cuadro a cuadro, las líneas se inclinan cada vez mas hacia la derecha. En el quinto cuadro la línea debe estar horizontal. Así, la respuesta es D, lo que se confirma al usted seleccionar esta opción.");
         areaEspacial2.setWrapStyleWord(true);
         areaEspacial2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, new java.awt.Color(0, 0, 0)));
         areaEspacial2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
         jScrollPane3.setViewportView(areaEspacial2);

         panelIntroduccionEspacial2.add(jScrollPane3);
         jScrollPane3.setBounds(10, 340, 900, 140);

         jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ejemploAbstracto2.png"))); // NOI18N
         jLabel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EJEMPLO 2.", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 14))); // NOI18N
         panelIntroduccionEspacial2.add(jLabel14);
         jLabel14.setBounds(70, 490, 810, 110);

         opcionA2.setText("A");
         opcionA2.setOpaque(false);
         panelIntroduccionEspacial2.add(opcionA2);
         opcionA2.setBounds(510, 600, 33, 23);

         opcionB2.setSelected(true);
         opcionB2.setText("B");
         opcionB2.setOpaque(false);
         panelIntroduccionEspacial2.add(opcionB2);
         opcionB2.setBounds(590, 600, 40, 23);

         opcionC2.setText("C");
         opcionC2.setOpaque(false);
         panelIntroduccionEspacial2.add(opcionC2);
         opcionC2.setBounds(670, 600, 33, 23);

         opcionD2.setText("D");
         opcionD2.setOpaque(false);
         panelIntroduccionEspacial2.add(opcionD2);
         opcionD2.setBounds(740, 600, 40, 23);

         opcionE2.setText("E");
         opcionE2.setOpaque(false);
         panelIntroduccionEspacial2.add(opcionE2);
         opcionE2.setBounds(810, 600, 40, 23);

         jLabel1.setFont(new java.awt.Font("Verdana", 1, 20));
         jLabel1.setText("INSTRUCCIONES");
         panelIntroduccionEspacial2.add(jLabel1);
         jLabel1.setBounds(360, 0, 200, 40);

         add(panelIntroduccionEspacial2);
         panelIntroduccionEspacial2.setBounds(10, 11, 920, 810);
    	
    }

	public void setCoordinador(Coordinador coordinador) {
		miCoorDinador=coordinador;
	}
                
                 
////////////////////////////////////////////////////////////////////////////
    

}

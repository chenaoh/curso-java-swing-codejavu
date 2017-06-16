package paneles;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import principal.Coordinador;


/**
 * Es la clase que contiene los componentes gráficos para 
 * visualizar las instrucciones de realización la prueba
 * de razonamiento Espacial.
 * @author Cristian David Henao Hoyos
 * @author German David Camelo Garcia
 * @version 1.0
 */
public class PanelIntroduccionEspacial extends javax.swing.JPanel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;


	
    private JTextArea areaEspacial;
    private JLabel jLabel10,jLabel11,jLabel1;
    private JCheckBox jRadioButton1,jRadioButton11,jRadioButton12,jRadioButton13,jRadioButton14,jRadioButton15;
    private JCheckBox jRadioButton2,jRadioButton3,jRadioButton4,jRadioButton6;
    private JScrollPane jScrollPane1;
    private JPanel panelIntroduccionEspacial2;



	Coordinador miCoorDinador;
	
    /**
     * Metodo Constructor de Clase
     */
    public PanelIntroduccionEspacial() {
        initComponents();
    }
                         
    /**
     * Inicialización de Componentes
     */
    private void initComponents() {
    	
    	 panelIntroduccionEspacial2 = new JPanel();
         jRadioButton1 = new JCheckBox();
         jRadioButton2 = new JCheckBox();
         jRadioButton3 = new JCheckBox();
         jRadioButton4 = new JCheckBox();
         jRadioButton6 = new JCheckBox();
         jScrollPane1 = new JScrollPane();
         areaEspacial = new JTextArea();
         jLabel10 = new JLabel();
         jRadioButton11 = new JCheckBox();
         jRadioButton12 = new JCheckBox();
         jRadioButton13 = new JCheckBox();
         jRadioButton14 = new JCheckBox();
         jRadioButton15 = new JCheckBox();
         jLabel11 = new javax.swing.JLabel();
         jLabel1 = new javax.swing.JLabel();

         setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
         setLayout(null);

         panelIntroduccionEspacial2.setOpaque(false);
         panelIntroduccionEspacial2.setLayout(null);

         jRadioButton1.setText("A");
         jRadioButton1.setOpaque(false);
         panelIntroduccionEspacial2.add(jRadioButton1);
         jRadioButton1.setBounds(130, 150, 33, 23);

         jRadioButton2.setText("B");
         jRadioButton2.setOpaque(false);
         panelIntroduccionEspacial2.add(jRadioButton2);
         jRadioButton2.setBounds(190, 150, 40, 23);

         jRadioButton3.setText("C");
         jRadioButton3.setOpaque(false);
         panelIntroduccionEspacial2.add(jRadioButton3);
         jRadioButton3.setBounds(250, 150, 33, 23);

         jRadioButton4.setText("D");
         jRadioButton4.setOpaque(false);
         panelIntroduccionEspacial2.add(jRadioButton4);
         jRadioButton4.setBounds(330, 150, 40, 23);

         jRadioButton6.setText("E");
         jRadioButton6.setOpaque(false);
         panelIntroduccionEspacial2.add(jRadioButton6);
         jRadioButton6.setBounds(390, 150, 40, 23);

         areaEspacial.setColumns(20);
         areaEspacial.setEditable(false);
         areaEspacial.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
         areaEspacial.setLineWrap(true);
         areaEspacial.setRows(5);
         areaEspacial.setText("INSTRUCCIONES.\n\nEn la figura 1. Observe que todos los sólidos hechos con este patrón tienen la forma debida, pero los lados que se ven son diferentes.\nDe estos sólidos, algunos pueden hacerse con este patrón, mientras otros  no, mirémoslos.\n\nEl sólido A si se puede hacer. Si la superficie gris es mayor, aparecera en la parte superior, entonces podemos ver la superficie menor.\n\nEl sólido B no se puede hacer. El lado largo y angosto no es gris en el patrón.\n\nEl sólido C si se puede hacer. Las  dos superficies grises no se ven al colocar la superficie gris mayor como la parte inferior y la superficie gris menor hacia atrás.\n\nEl sólido D no se puede hacer. El extremo gris esta bien pero no hay una superficie lateral larga y gris en el patrón.\n\nEl sólido E si se puede hacer.  Al estar en la superficie gris mayor hacia abajo, puede aparecer el extremo gris al frente.\n\nComo usted ve hay tres sólidos (A, C y E) que pueden hacerse con el patrón del EJEMPLO, y dos sólidos (B y D) que no pueden hacerse con este patrón.\n\nRecuerde que la superficie que se ve en el patrón siempre debe ser la superficie EXTERIOR del sólido ya hecho.\n\nUsted  debe seleccionar las opciones que considere correctas, en  el ejemplo los sólidos A, C y E son los apropiados,  por eso se debería seleccionar dichas opciones como se muestra en la figura 2.\n\nRECOMENDACIONES.\n\nEstudie bien cada patrón.\nDecida cual o cuales de los sólidos pueden ser hechos con el patrón.\nAnalice bien sus respuestas, ya que al dar clic en el botón “Enviar“ no podrá realizar ninguna corrección.\n ");
         areaEspacial.setWrapStyleWord(true);
         areaEspacial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, new java.awt.Color(0, 0, 0)));
         areaEspacial.setCaretPosition(1);
         areaEspacial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
         jScrollPane1.setViewportView(areaEspacial);

         panelIntroduccionEspacial2.add(jScrollPane1);
         jScrollPane1.setBounds(10, 190, 920, 240);

         jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        // jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenesEspacial/ejemploEspacial2.jpg"))); // NOI18N
         jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Figura 2.", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 14))); // NOI18N
         panelIntroduccionEspacial2.add(jLabel10);
         jLabel10.setBounds(500, 20, 440, 132);

         jRadioButton11.setSelected(true);
         jRadioButton11.setText("E");
         jRadioButton11.setOpaque(false);
         panelIntroduccionEspacial2.add(jRadioButton11);
         jRadioButton11.setBounds(870, 150, 40, 23);

         jRadioButton12.setText("D");
         jRadioButton12.setOpaque(false);
         panelIntroduccionEspacial2.add(jRadioButton12);
         jRadioButton12.setBounds(810, 150, 40, 23);

         jRadioButton13.setSelected(true);
         jRadioButton13.setText("C");
         jRadioButton13.setOpaque(false);
         panelIntroduccionEspacial2.add(jRadioButton13);
         jRadioButton13.setBounds(730, 150, 33, 23);

         jRadioButton14.setText("B");
         jRadioButton14.setOpaque(false);
         panelIntroduccionEspacial2.add(jRadioButton14);
         jRadioButton14.setBounds(670, 150, 40, 23);

         jRadioButton15.setSelected(true);
         jRadioButton15.setText("A");
         jRadioButton15.setOpaque(false);
         panelIntroduccionEspacial2.add(jRadioButton15);
         jRadioButton15.setBounds(610, 150, 33, 23);

         jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
         //jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenesEspacial/ejemploEspacial2.jpg"))); // NOI18N
         jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Figura 1.", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 14))); // NOI18N
         panelIntroduccionEspacial2.add(jLabel11);
         jLabel11.setBounds(10, 20, 440, 132);

         add(panelIntroduccionEspacial2);
         panelIntroduccionEspacial2.setBounds(10, 30, 957, 478);

         jLabel1.setFont(new java.awt.Font("Verdana", 1, 20));
         jLabel1.setText("INSTRUCCIONES");
         add(jLabel1);
         jLabel1.setBounds(390, 0, 200, 40);
    
    }

    public void setCoordinador(Coordinador coordinador) {
		miCoorDinador=coordinador;
	}                     
               

///////////////////////////////////////////////////////////////////////////////////////                   


}

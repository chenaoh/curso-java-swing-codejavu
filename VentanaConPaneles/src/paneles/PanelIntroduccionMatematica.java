package paneles;

import principal.Coordinador;

/**
 * Es la clase que contiene los componentes gráficos para 
 * visualizar las instrucciones de realización la prueba
 * de razonamiento Matematico.
 * @author Cristian David Henao Hoyos
 * @author German David Camelo Garcia
 * @version 1.0
 */
public class PanelIntroduccionMatematica extends javax.swing.JPanel {

   /**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;


    /**
     * Metodo Constructor de Clase
     */
    public PanelIntroduccionMatematica() {
        initComponents();
    }
                      
    /**
     * Inicialización de Componentes
     */
    private void initComponents() {

        panelIntroduccionNumerica = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaEspacial = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        opcionD29 = new javax.swing.JRadioButton();
        opcionC29 = new javax.swing.JRadioButton();
        opcionB29 = new javax.swing.JRadioButton();
        opcionA29 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaEspacial1 = new javax.swing.JTextArea();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        setLayout(null);

        panelIntroduccionNumerica.setOpaque(false);
        panelIntroduccionNumerica.setLayout(null);

        areaEspacial.setColumns(20);
        areaEspacial.setEditable(false);
        areaEspacial.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        areaEspacial.setLineWrap(true);
        areaEspacial.setRows(5);
        areaEspacial.setText("En el EJEMPLO 1 se pregunta sobre el resultado de multiplicar 3 por su doble y se presentan 4 opciones de respuesta.\nla respuesta correcta es la 18, ya que el doble de 3 es 6 y al realizar la operación requerida se obtiene:\n\n\t\t\t\t3x6=18\npor tanto usted debe seleccionar la opción A. 18");
        areaEspacial.setWrapStyleWord(true);
        areaEspacial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, new java.awt.Color(0, 0, 0)));
        areaEspacial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(areaEspacial);

        panelIntroduccionNumerica.add(jScrollPane1);
        jScrollPane1.setBounds(20, 360, 920, 100);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 20));
        jLabel1.setText("INSTRUCCIONES");
        panelIntroduccionNumerica.add(jLabel1);
        jLabel1.setBounds(380, 0, 200, 40);

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("EJEMPLO 1.   ¿Cuál es el resultado de multiplicar 3 por su doble?:");
        panelIntroduccionNumerica.add(jLabel55);
        jLabel55.setBounds(200, 270, 510, 30);

        opcionD29.setText("D. 54");
        opcionD29.setOpaque(false);
        panelIntroduccionNumerica.add(opcionD29);
        opcionD29.setBounds(560, 320, 70, 23);

        opcionC29.setText("C. 27");
        opcionC29.setOpaque(false);
        panelIntroduccionNumerica.add(opcionC29);
        opcionC29.setBounds(470, 320, 60, 23);

        opcionB29.setText("B. 9");
        opcionB29.setOpaque(false);
        panelIntroduccionNumerica.add(opcionB29);
        opcionB29.setBounds(370, 320, 80, 23);

        opcionA29.setSelected(true);
        opcionA29.setText("A. 18");
        opcionA29.setOpaque(false);
        panelIntroduccionNumerica.add(opcionA29);
        opcionA29.setBounds(270, 320, 100, 23);

        areaEspacial1.setColumns(20);
        areaEspacial1.setEditable(false);
        areaEspacial1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        areaEspacial1.setLineWrap(true);
        areaEspacial1.setRows(5);
        areaEspacial1.setText("Resuelva las siguientes operaciones para determinar su aptitud matemática, la prueba consta de 50 ejercicios matemáticos de selección múltiple con única respuesta, posee problemas sencillos, donde podrás encontrar reglas de tres, ejercicios con porcentajes, planteamientos con letras, listados de operaciones recordando el orden de prioridades (primero los paréntesis y corchetes si los hay, luego potenciación y radicación, multiplicación y división en el orden que aparezcan, por ultimo suma y resta).\n\nse hacen necesarios conocimientos de matemática elemental, por lo tanto al no requerir conocimientos de un nivel elevado, no se permiten el uso de elementos de ayuda tales como teléfonos celulares o calculadoras, esto con el fin de obtener resultados mas exactos.\n\nLea bien los enunciados y seleccione la opción que considere correcta.");
        areaEspacial1.setWrapStyleWord(true);
        areaEspacial1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, new java.awt.Color(0, 0, 0)));
        areaEspacial1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(areaEspacial1);

        panelIntroduccionNumerica.add(jScrollPane2);
        jScrollPane2.setBounds(20, 50, 920, 210);

        add(panelIntroduccionNumerica);
        panelIntroduccionNumerica.setBounds(5, 11, 950, 480);
    }
    
    private javax.swing.JTextArea areaEspacial;
    private javax.swing.JTextArea areaEspacial1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton opcionA29;
    private javax.swing.JRadioButton opcionB29;
    private javax.swing.JRadioButton opcionC29;
    private javax.swing.JRadioButton opcionD29;
    private javax.swing.JPanel panelIntroduccionNumerica;
	Coordinador miCoorDinador;


    public void setCoordinador(Coordinador coordinador) {
		miCoorDinador=coordinador;
	} 
    

}

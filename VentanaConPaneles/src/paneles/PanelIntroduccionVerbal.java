package paneles;

import principal.Coordinador;

/**
 * Es la clase que contiene los componentes gráficos para 
 * visualizar las instrucciones de realización la prueba
 * de razonamiento Verbal.
 * @author Cristian David Henao Hoyos
 * @author German David Camelo Garcia
 * @version 1.0
 */
public class PanelIntroduccionVerbal extends javax.swing.JPanel {

   /**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	
    /**
     * Metodo Constructor de Clase
     */
    public PanelIntroduccionVerbal() {
        initComponents();
    }

                         
    /**
     * Inicialización de Componentes
     */
    private void initComponents() {

    	   panelIntroduccionVerbal2 = new javax.swing.JPanel();
           jScrollPane2 = new javax.swing.JScrollPane();
           areaEspacial1 = new javax.swing.JTextArea();
           jScrollPane3 = new javax.swing.JScrollPane();
           areaEspacial2 = new javax.swing.JTextArea();
           jLabel1 = new javax.swing.JLabel();
           jLabel15 = new javax.swing.JLabel();
           opcionUno_1 = new javax.swing.JRadioButton();
           opcionDos_1 = new javax.swing.JRadioButton();
           opcionTres_1 = new javax.swing.JRadioButton();
           opcionCuatro_1 = new javax.swing.JRadioButton();
           opcionD1 = new javax.swing.JRadioButton();
           opcionC1 = new javax.swing.JRadioButton();
           opcionB1 = new javax.swing.JRadioButton();
           opcionA1 = new javax.swing.JRadioButton();

           setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
           setLayout(null);

           panelIntroduccionVerbal2.setOpaque(false);
           panelIntroduccionVerbal2.setLayout(null);

           areaEspacial1.setColumns(20);
           areaEspacial1.setEditable(false);
           areaEspacial1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
           areaEspacial1.setLineWrap(true);
           areaEspacial1.setRows(5);
           areaEspacial1.setText("A cada una de las cincuenta oraciones de esta prueba le falta la primera y la última palabra. Complete cada oración para que tenga sentido y sea verdadera, encontrando las palabras faltantes. \n\nDespués de cada oración incompleta hay dos líneas de palabras: la primera línea tiene un número antes de cada palabra, y la segunda, una letra.\n\nPara el primera espacio en blanco, escoja una palabra numerada: 1, 2, 3, 4. Para el espacio del final de la oración, escoja una de las palabras con letras: A, B, C, D. Combine el número y la letra que usted haya escogido seleccionando las opciones correspondientes.");
           areaEspacial1.setWrapStyleWord(true);
           areaEspacial1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, new java.awt.Color(0, 0, 0)));
           areaEspacial1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
           jScrollPane2.setViewportView(areaEspacial1);

           panelIntroduccionVerbal2.add(jScrollPane2);
           jScrollPane2.setBounds(10, 40, 940, 170);

           areaEspacial2.setColumns(20);
           areaEspacial2.setEditable(false);
           areaEspacial2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
           areaEspacial2.setLineWrap(true);
           areaEspacial2.setRows(5);
           areaEspacial2.setText("EJEMPLO 1.\n\nbeber es a agua lo que comer es a alimento. beber lleva el número 2, y alimento, la letra C; 2 y C  combinan y forman 2C.\n\nTenga en cuenta que para cada problema hay solo una respuesta correcta, por eso debe seleccionar solo una combinación posible y no dejar opciones sin seleccionar. ");
           areaEspacial2.setWrapStyleWord(true);
           areaEspacial2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, new java.awt.Color(0, 0, 0)));
           areaEspacial2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
           jScrollPane3.setViewportView(areaEspacial2);

           panelIntroduccionVerbal2.add(jScrollPane3);
           jScrollPane3.setBounds(10, 320, 940, 140);

           jLabel1.setFont(new java.awt.Font("Verdana", 1, 20));
           jLabel1.setText("INSTRUCCIONES");
           panelIntroduccionVerbal2.add(jLabel1);
           jLabel1.setBounds(370, 0, 200, 40);

           jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14));
           jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
           jLabel15.setText("EJEMPLO 1. ........ es a agua lo que comer es a ........");
           panelIntroduccionVerbal2.add(jLabel15);
           jLabel15.setBounds(280, 220, 380, 30);

           opcionUno_1.setText("1.) continuar");
           opcionUno_1.setOpaque(false);
           panelIntroduccionVerbal2.add(opcionUno_1);
           opcionUno_1.setBounds(290, 260, 90, 23);

           opcionDos_1.setSelected(true);
           opcionDos_1.setText("2.) beber");
           opcionDos_1.setOpaque(false);
           panelIntroduccionVerbal2.add(opcionDos_1);
           opcionDos_1.setBounds(400, 260, 100, 23);

           opcionTres_1.setText("3.) pie");
           opcionTres_1.setOpaque(false);
           panelIntroduccionVerbal2.add(opcionTres_1);
           opcionTres_1.setBounds(510, 260, 80, 23);

           opcionCuatro_1.setText("4.) niña");
           opcionCuatro_1.setOpaque(false);
           panelIntroduccionVerbal2.add(opcionCuatro_1);
           opcionCuatro_1.setBounds(610, 260, 100, 23);

           opcionD1.setText("D.) industria");
           opcionD1.setOpaque(false);
           panelIntroduccionVerbal2.add(opcionD1);
           opcionD1.setBounds(610, 280, 100, 23);

           opcionC1.setSelected(true);
           opcionC1.setText("C.) alimento");
           opcionC1.setOpaque(false);

           panelIntroduccionVerbal2.add(opcionC1);
           opcionC1.setBounds(510, 280, 90, 23);

           opcionB1.setText("B.) enemigo");
           opcionB1.setOpaque(false);
           panelIntroduccionVerbal2.add(opcionB1);
           opcionB1.setBounds(400, 280, 100, 23);

           opcionA1.setText("A.) manejar");
           opcionA1.setOpaque(false);
           panelIntroduccionVerbal2.add(opcionA1);
           opcionA1.setBounds(290, 280, 90, 23);

           add(panelIntroduccionVerbal2);
           panelIntroduccionVerbal2.setBounds(10, 20, 957, 478);
    }// </editor-fold>                        
            
    private javax.swing.JTextArea areaEspacial1;
    private javax.swing.JTextArea areaEspacial2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton opcionA1;
    private javax.swing.JRadioButton opcionB1;
    private javax.swing.JRadioButton opcionC1;
    private javax.swing.JRadioButton opcionCuatro_1;
    private javax.swing.JRadioButton opcionD1;
    private javax.swing.JRadioButton opcionDos_1;
    private javax.swing.JRadioButton opcionTres_1;
    private javax.swing.JRadioButton opcionUno_1;
    private javax.swing.JPanel panelIntroduccionVerbal2;
	Coordinador miCoorDinador;


    public void setCoordinador(Coordinador coordinador) {
		miCoorDinador=coordinador;
	} 


}

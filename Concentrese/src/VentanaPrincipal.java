import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.crypto.spec.PSource;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHENAO
 */
public class VentanaPrincipal extends javax.swing.JFrame implements MouseListener{

    private javax.swing.JLabel etiImagen1;
    private javax.swing.JLabel etiImagen10;
    private javax.swing.JLabel etiImagen11;
    private javax.swing.JLabel etiImagen12;
    private javax.swing.JLabel etiImagen2;
    private javax.swing.JLabel etiImagen3;
    private javax.swing.JLabel etiImagen4;
    private javax.swing.JLabel etiImagen5;
    private javax.swing.JLabel etiImagen6;
    private javax.swing.JLabel etiImagen7;
    private javax.swing.JLabel etiImagen8;
    private javax.swing.JLabel etiImagen9;
    private javax.swing.JLabel etiquetaAbajo;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel lblPuntaje;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelImagenes;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelSuperior;
    private JButton botonInicia;      
    
    int arregloNumeroImagenes[]=new int[12];//Arreglo que contendrà el numero correspondiente al nombre de las imagenes
    JLabel arregloLabelImagenes[]=new JLabel[12];//Arreglo con los componentes JLabel donde se pintan las imagenes
    int arregloControlRepeticiones[]=new int[6];//Arreglo que evitarà que un numero se repita mas de 2 veces
    int arregloControlParejas[]=new int[12];//Arreglo que permitirà llevar el control de las parejas encontradas
    int arregloCantClic[]=new int[12];//Arreglo que permitirà controlar los eventos producidos cada que se de clic en una imagen
	
    int clic=0;//Variable que determinarà cuantos clic se han dado antes de validar las parejas
    int vista1,vista2;//variables que indicaràn cuales son las imagenes que se han mostrado
    int puntaje=0;//Variable que permitirà llevar un conteo de los puntos 
    

    public VentanaPrincipal() {
    	
        initComponents();
        inicializarArreglos();
        setSize(574, 517);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

  
	@SuppressWarnings("unchecked")                        
    private void initComponents() {

        etiquetaTitulo = new JLabel();
        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        etiquetaTitulo.setText("CONCENTRESE!!!");
        etiquetaTitulo.addMouseListener(this);
        etiquetaTitulo.setVisible(true);
        
        etiquetaAbajo = new JLabel();
        etiquetaAbajo.setFont(new java.awt.Font("Chiller", 0, 22)); 
        etiquetaAbajo.setText("http://codejavu.blogspot.com/");
        
        botonInicia=new JButton();
        botonInicia.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonInicia.setText("Reinicia");
        botonInicia.setBounds(10, 310, 230, 80);
        botonInicia.addMouseListener(this);
        
        lblPuntaje = new JLabel();
        lblPuntaje.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblPuntaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntaje.setText("Puntaje");
        lblPuntaje.setBounds(50, 0, 170, 120);
        
        lblPuntos = new JLabel();
        lblPuntos.setFont(new java.awt.Font("Tahoma", 0, 120)); // NOI18N
        lblPuntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntos.setText("0");
        
        lblPuntos.setBounds(40, 120, 170, 130);

        etiImagen1 = new JLabel();
        etiImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/quien.jpg"))); // NOI18N
        etiImagen1.setBounds(5, 0, 100, 100);
       
        etiImagen2 = new JLabel();
        etiImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/quien.jpg"))); // NOI18N
        etiImagen2.setBounds(113, 0, 100, 100);

        etiImagen3 = new JLabel();
        etiImagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/quien.jpg"))); // NOI18N
        etiImagen3.setBounds(220, 0, 100, 100);

        etiImagen4 = new JLabel();
        etiImagen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/quien.jpg"))); // NOI18N
        etiImagen4.setBounds(5, 100, 100, 100);

        etiImagen5 = new JLabel();
        etiImagen5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/quien.jpg"))); // NOI18N
        etiImagen5.setBounds(113, 100, 100, 100);

        etiImagen6 = new JLabel();
        etiImagen6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/quien.jpg"))); // NOI18N
        etiImagen6.setBounds(220, 100, 100, 100);

        etiImagen7 = new JLabel();
        etiImagen7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/quien.jpg"))); // NOI18N
        etiImagen7.setBounds(5, 200, 100, 100);

        etiImagen8 = new JLabel();
        etiImagen8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/quien.jpg"))); // NOI18N
        etiImagen8.setBounds(113, 200, 100, 100);

        etiImagen9 = new JLabel();
        etiImagen9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/quien.jpg"))); // NOI18N
        etiImagen9.setBounds(220, 200, 100, 100);

        etiImagen10 = new JLabel();
        etiImagen10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/quien.jpg"))); // NOI18N
        etiImagen10.setBounds(5, 300, 100, 100);

        etiImagen11 = new JLabel();
        etiImagen11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/quien.jpg"))); // NOI18N
        etiImagen11.setBounds(113, 300, 100, 100);
        
        etiImagen12 = new JLabel();
        etiImagen12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/quien.jpg"))); // NOI18N
        etiImagen12.setBounds(220, 300, 100, 100);

        panelImagenes = new JPanel();
        panelImagenes.setBackground(new java.awt.Color(255, 204, 0));
        panelImagenes.setLayout(null);
        panelImagenes.setBounds(0, 0, 320, 465);
        panelImagenes.add(etiImagen1);
        panelImagenes.add(etiImagen2);
        panelImagenes.add(etiImagen3);
        panelImagenes.add(etiImagen4);
        panelImagenes.add(etiImagen5);
        panelImagenes.add(etiImagen6);
        panelImagenes.add(etiImagen7);
        panelImagenes.add(etiImagen8);
        panelImagenes.add(etiImagen9);
        panelImagenes.add(etiImagen10);
        panelImagenes.add(etiImagen11);
        panelImagenes.add(etiImagen12);
        
        panelSuperior = new JPanel();
        panelSuperior.setBackground(new java.awt.Color(204, 204, 0));
        panelSuperior.add(etiquetaTitulo);
        
        panelInfo = new JPanel();
        panelInfo.setBackground(new java.awt.Color(102, 153, 0));
        panelInfo.setLayout(null);
        panelInfo.setBounds(320, 0, 260, 420);
        panelInfo.add(botonInicia);
        panelInfo.add(lblPuntaje);
        panelInfo.add(lblPuntos);
        
        panelCentral = new JPanel();
        panelCentral.setBackground(new java.awt.Color(102, 102, 0));
        panelCentral.setLayout(null);
        panelCentral.add(panelImagenes);
        panelCentral.add(panelInfo);
        
        panelInferior = new JPanel();
        panelInferior.setBackground(new java.awt.Color(204, 204, 0));
        FlowLayout miLayout=new FlowLayout(FlowLayout.RIGHT);
        panelInferior.setLayout(miLayout);
        panelInferior.add(etiquetaAbajo);

        add(panelCentral, java.awt.BorderLayout.CENTER);
        add(panelInferior, java.awt.BorderLayout.PAGE_END);
        add(panelSuperior, java.awt.BorderLayout.PAGE_START);

        pack();
    }  
        
	
	
	//======================================================================================================//
	//												Logica del juego
	//======================================================================================================//

		/**
		 * Permite inicializar todos los arreglos utilizados
		 */
		private void inicializarArreglos() {
			
			inicializaArregloImagenes();
			
			//inicializa los arreglos en cero
			llenaArreglosConCeros(arregloControlRepeticiones);
			llenaArreglosConCeros(arregloNumeroImagenes);
			llenaArreglosConCeros(arregloControlParejas);
			llenaArreglosConCeros(arregloCantClic);
						
			 Random r=new Random();//permite la generacion de numeros aleatorios
			 int posicionImagen;
			  for (int i = 0; i < 12; i++) {
				
				 posicionImagen=r.nextInt(6);//la posicionImagen tendra un valor aleatorio entre 0 y 5, es decir, 6 valores posibles
	            /*Se valida que el numero aleatorio solo se repita 2 veces*/
	            if(arregloControlRepeticiones[posicionImagen]<2){
	                arregloNumeroImagenes[i]=posicionImagen+1;//almacena el valor que representa cada imagen (la imagen se llama con su numero), se suma 1 porq si el numero es 0 entonces queda en 1
	                System.out.print(arregloNumeroImagenes[i]+" , ");
	            	arregloControlRepeticiones[posicionImagen]++;//si se almacena el numero entonces se aumenta el valor para que sepamos que ya existe 1 vez
	            }else{
	                i--;//en caso de que el numero se repita entonces se devuelve una iteraciòn para que pueda continuar pidiendo numeros
	            }
			}
			 
		}
		
		 /**
		 *Metodo que permite inicializar el arreglo de JLabels con los objetos labels de las imagenes 
		 *y asignarle a cada uno la imagen inicial de incognita
		 */
		private void inicializaArregloImagenes() {
			arregloLabelImagenes[0]=etiImagen1;  arregloLabelImagenes[1]=etiImagen2;   arregloLabelImagenes[2]=etiImagen3;
			arregloLabelImagenes[3]=etiImagen4;  arregloLabelImagenes[4]=etiImagen5;   arregloLabelImagenes[5]=etiImagen6;
			arregloLabelImagenes[6]=etiImagen7;  arregloLabelImagenes[7]=etiImagen8;   arregloLabelImagenes[8]=etiImagen9;
			arregloLabelImagenes[9]=etiImagen10; arregloLabelImagenes[10]=etiImagen11; arregloLabelImagenes[11]=etiImagen12;
			
			for (int i = 0; i < 12; i++) {
				 arregloLabelImagenes[i].setIcon(new ImageIcon(getClass().getResource("/imagenes/quien.jpg")));
				 arregloLabelImagenes[i].addMouseListener(this);
			 }
		}

	    /**
	     * Inicializa los arreglos con ceros
	     * @param arreglo
	     */
	    private void llenaArreglosConCeros(int[] arreglo) {
			for (int i = 0; i < arreglo.length; i++) {
				arreglo[i]=0;
			}
		}


	/**
	 * Permite validar las parejas comparando las posiciones almacenadas al momento
	 * de mostrar las imagenes
	 * @param vista1
	 * @param vista2
	 * @param i
	 */
	private void validaParejas(int vista1, int vista2, int i) {
		/*valida si el valor en la posicion obtenida al encontrar la imagen 1 es igual al valor 
		 * en la posicion obtenida al encontrar la imagen 2*/
		if (arregloNumeroImagenes[vista1]==arregloNumeroImagenes[vista2]) {
			//si esto se cumple se suman 10 puntos y se asigna un 1 para determinar que en esas posiciones ya se encontraron parejas
				puntaje+=10;
				lblPuntos.setText(puntaje+"");
				arregloControlParejas[vista1]=1;
				arregloControlParejas[vista2]=1;	
		}else{
			/*si no son iguales entonces se vuelve a poner la imagen de incognita y se reinicia 
			 * el valor de la posicion en el arreglo que cuenta cuantos clic se han dado en cada label*/ 
			arregloLabelImagenes[vista1].setIcon(new ImageIcon(getClass().getResource("/imagenes/quien.jpg")));
			arregloLabelImagenes[vista2].setIcon(new ImageIcon(getClass().getResource("/imagenes/quien.jpg")));
			arregloCantClic[vista1]=0;
			arregloCantClic[vista2]=0;
		}
	}

	//======================================================================================================//
	//Eventos del Mouse
	//======================================================================================================//
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		/*Logica para el evento del botòn iniciar*/
		if (e.getSource()==botonInicia) {
	        inicializarArreglos();
	        clic=0;
	        puntaje=0;
	        lblPuntos.setText("0");
		}
		
		/*Ciclo que permite recorrer todos los JLabel del arreglo y determinar cuando uno fue presionado*/
		for (int i = 0; i < 12; i++) {
			/*Con esta validacion nos damos cuenta de cual label se presionò y validamos que
			 *si es un label que ya esta descubierto porque su pareja fue encontrada, entonces no
			 *lo tenga en cuenta para validar mas parejas, pues esta ya fue encontrada */
			if (e.getSource()==arregloLabelImagenes[i] && verificaParejasEncontradas(i)) {
				arregloCantClic[i]++;//si se presiona 2 veces seguidas un label, se incrementa la posicion del arreglo
				/*se valida que el mismo label no se presionara mas de dos veces seguidas, si esto es asì
				 * el sistema espera hasta que se presione otro label para poder validar parejas*/
				if (arregloCantClic[i]<2) {
					/*si lleva menos de 2 clic en un mismo label entonces se muestra la imagen*/
					clic++;
					arregloLabelImagenes[i].setIcon(new ImageIcon(getClass().getResource("/imagenes/"+arregloNumeroImagenes[i]+".jpg")));
					if (clic==1) {
						vista1=i;//si se lleva 1 clic se almacena en una variable la posicion de la imagen para luego ser comparada con la posicion de la segunda
					}else{
						 vista2=i;//si se llevan 2 clic se almacena en una variable la posicion de la segunda imagen para luego compararla con la primera	
						}
					}
				}
							
			}
		}
	
	/**
	 * El arregloControlParejas almacena 0 o 1, 0 indica que no hay parejas encontradas aùn para esa posicion, 1 indica que en esa posicion
	 * ya se encuentrò pareja, se habla de posiciones ya que en estas es donde se encuentran las imagenes.
	 * @param i
	 * @return
	 */
	private boolean verificaParejasEncontradas(int i) {
		
		if (arregloControlParejas[i]!=1) {
			return true;
		}else{
			return false;	
		}
	}
	
	
	@Override
	public void mouseExited(MouseEvent e) {
		/*Cuando se ejecuta este evento se permite realizar la validacion de parejas, solo cuando ya se han descubierto 2*/
		for (int i = 0; i < 12; i++) {
			if (e.getSource()==arregloLabelImagenes[i]) {
				if (clic==2) {
					validaParejas(vista1,vista2,i);
					clic=0;
				}				
			}
		}
	}
	
	@Override
	public void mouseEntered(MouseEvent arg0) { }

	@Override
	public void mousePressed(MouseEvent arg0) { }

	@Override
	public void mouseReleased(MouseEvent arg0) { }
}

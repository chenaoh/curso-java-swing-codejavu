package jsplitpane;

import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class prog8 {

	// declaracion, creacion e inicializacion de componentes, objetos y
	// variables

	static JFrame ventana = new JFrame();

	// abajo se creando con orientacion vertical u horizontal

	static JSplitPane panel1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

	static JLabel jl1 = new JLabel("en split1 label1");

	static JLabel jl2 = new JLabel("en split2 label2");

	// parte principal de programa

	public static void main(String[] args)

	{ // area de definicion de propiedades de el objeto

		ventana.setTitle("mi programa");

		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);

		// cargando splitpanel panel1 con sus dos componentes

		panel1.add(jl1);
		panel1.add(jl2);

		// cargando la ventana con splitpanel

		ventana.getContentPane().add(panel1, BorderLayout.CENTER);

		ventana.pack();

		ventana.setVisible(true);

		// area de asociacion de objeto-eventos

	}; // termina main

} // termina clase
package jdesktoppane;

import java.awt.FlowLayout;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 * Instancia un JFrame con un JDesktopPane y dentro de este
 * un JInternalFrame.
 * @author chuidiang
 *
 */
public class PruebaInternalFrame {

	/** Instancia esta clase */
	public static void main(String[] args) {
		new PruebaInternalFrame();
	}
	
	/**
	 * Crea el JFrame, el JDesktopPane, un JInternalFrame de
	 * muestra y lo visualiza.
	 */
	public PruebaInternalFrame()
	{
		// El JFrame con el JDesktopPane
		JFrame v = new JFrame("Prueba JInternalFrame");
		JDesktopPane dp = new JDesktopPane();
		v.getContentPane().add(dp);
		
		// Se construye el panel que ira dentro del JInternalFrame
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		p.add (new JLabel("Una etiqueta"));
		p.add (new JTextField(10));
		
		// Se construye el JInternalFrame
		JInternalFrame internal = new JInternalFrame("Un Internal Frame");
		internal.add(p);
		
		// Es importante darle tamaño -pack()- al JInternalFrame,
		// porque si no, tendrá tamaño 0,0 y no lo veremos.
		internal.pack();
		
		// Por defecto el JInternalFrame no es redimensionable ni
		// tiene el botón de cerrar, así que se lo ponemos.
		internal.setResizable(true);
		internal.setClosable(true);
		
		// Se mete el internal en el JDesktopPane
		dp.add(internal);
		
		// Se visualiza todo.
		v.setSize(500,500);
		v.setVisible(true);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// Se visualiza el JInternalFrame 
		internal.setVisible(true);
	}

}
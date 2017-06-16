package paneles;

import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

import principal.Coordinador;

public class PanelIntroduccion extends JPanel {

	private static final long	serialVersionUID= 1L;

	Coordinador miCoorDinador;
    private JTextArea areaIntroduccion;
    private JLabel titulo, imagen;
    private JScrollPane scrollArea;
    private JPanel panel;
    
    public PanelIntroduccion() {
        initComponents();
        setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,
        		null, null, null, new java.awt.Color(0, 0, 0)));
        setPreferredSize(new Dimension(540, 700));
        setLayout(null);
    }
            
    private void initComponents() {
     	 panel = new JPanel();
    	 panel.setBounds(10, 11, 600, 810);
         
         imagen = new JLabel();
         scrollArea = new JScrollPane();
         areaIntroduccion = new JTextArea();
         titulo = new JLabel();
         
         titulo.setFont(new java.awt.Font("Verdana", 1, 20));
         titulo.setText("Ejemplo CoDejaVu");
         panel.add(titulo);
         titulo.setBounds(200, 0, 250, 40);

         panel.setOpaque(false);
         panel.setLayout(null);
               			  
         String texto="\nEste es un ejemplo del trabajo con paneles en Java Swing, como\n";
         	    texto+="podemos ver se creó un panel en una clase independiente con sus\n";
         	    texto+="propios componentes y este fue cargado en una ventana principal";
         areaIntroduccion.setColumns(20);
         areaIntroduccion.setEditable(false);
         areaIntroduccion.setFont(new java.awt.Font("Verdana", 0, 16));
         areaIntroduccion.setLineWrap(true);
         areaIntroduccion.setRows(5);
         areaIntroduccion.setText(texto);
         areaIntroduccion.setWrapStyleWord(true);
         areaIntroduccion.setBorder(BorderFactory.createBevelBorder(
        		 javax.swing.border.BevelBorder.LOWERED, null, null, null, 
        		 new java.awt.Color(0, 0, 0)));
         areaIntroduccion.setCursor(new Cursor(java.awt.Cursor.DEFAULT_CURSOR));
         scrollArea.setViewportView(areaIntroduccion);
         scrollArea.setBounds(10, 50, 585, 115);
         
         imagen.setHorizontalAlignment(SwingConstants.CENTER);
         imagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/java.jpg")));
         imagen.setBorder(BorderFactory.createTitledBorder(null, "EJEMPLO 1.", 
        		 TitledBorder.LEFT, TitledBorder.TOP, 
        		 new java.awt.Font("Verdana", 1, 14))); 
         imagen.setBounds(120, 200, 410, 412);
         
         panel.add(imagen);
         panel.add(scrollArea);
         add(panel);	
    }

	public void setCoordinador(Coordinador coordinador) {
		miCoorDinador=coordinador;
	}
}

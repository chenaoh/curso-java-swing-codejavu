package paneles;

import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;

import principal.Coordinador;

public class PanelMensaje extends JPanel {

	private static final long	serialVersionUID= 1L;

	Coordinador miCoorDinador;
    private JTextArea areaIntroduccion;
    private JLabel titulo;
    private JScrollPane scrollArea;
    private JPanel panel;
    
    public PanelMensaje() {
    	
        initComponents();
        
        setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,
        		null, null, null, new java.awt.Color(0, 0, 0)));
        setPreferredSize(new Dimension(540, 250));
        setLayout(null);
    }
            
    private void initComponents() {

    	 panel = new JPanel();
    	 panel.setBounds(10, 11, 600, 410);

         scrollArea = new JScrollPane();
         areaIntroduccion = new JTextArea();
         titulo = new JLabel();
         
         titulo.setFont(new java.awt.Font("Verdana", 1, 20));
         titulo.setText("Sobre CoDejaVu");
         panel.add(titulo);
         titulo.setBounds(200, 0, 250, 40);

         panel.setOpaque(false);
         panel.setLayout(null);
               			  
         String texto="\nSi estas leyendo esto es porque descargaste la aplicación " +
         		"y porque de una u otra forma te interesó el articulo, si esta " +
         		"entrada te sirvió y generó esa curiosidad en ti, te invito a compartir " +
         		"o a dejar tu comentario, ayudando a que este y otros articulos " +
         		"llegen a mas personas.\n";

         texto+="\nSobre El Blog... \n\n" +
          		"CoDejaVu es un blog personal con el objetivo de compartir conocimiento " +
          		"y vivencias en torno al desarrollo de Software, todo ha sido con base " +
          		"en mi experiencia como Ingeniero de Sistemas y Desarrollador, es un espacio " +
          		"donde se puede brindar ayuda por medio de lecciones aprendidas.";
         
         areaIntroduccion.setColumns(20);
         areaIntroduccion.setEditable(false);
         areaIntroduccion.setFont(new java.awt.Font("Verdana", 0, 16));
         areaIntroduccion.setLineWrap(true);
         areaIntroduccion.setRows(5);
         areaIntroduccion.setText(texto);
         areaIntroduccion.setWrapStyleWord(true);
         areaIntroduccion.setBorder(BorderFactory.createBevelBorder(
        		 javax.swing.border.BevelBorder.LOWERED, null,
        		 null, null, new java.awt.Color(0, 0, 0)));
         areaIntroduccion.setCursor(new Cursor(java.awt.Cursor.DEFAULT_CURSOR));
         scrollArea.setViewportView(areaIntroduccion);
         scrollArea.setBounds(10, 50, 585, 210);

         panel.add(scrollArea);
         add(panel);
    }

	public void setCoordinador(Coordinador coordinador) {
		miCoorDinador=coordinador;
	}
}

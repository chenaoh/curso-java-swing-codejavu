package jfilechooser;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ClaseFrame extends JFrame implements ActionListener
	{
		private Container contenedor;
		JLabel labelTitulo;/*declaramos el objeto Label*/
		JTextArea areaDeTexto;
		String texto;
		JButton botonAbrir;/*declaramos el objeto Boton*/
		JButton botonGuardar;/*declaramos el objeto Boton*/
		JScrollPane scrollPaneArea;
		
		public ClaseFrame()//constructor
		{
			contenedor=getContentPane();
			contenedor.setLayout(null);
			
			/*Propiedades del Label, lo instanciamos, posicionamos y
			 * activamos los eventos*/
			labelTitulo= new JLabel();
			labelTitulo.setText("CONTENEDOR JFRAME");
			labelTitulo.setBounds(120, 20, 180, 23);
			
			areaDeTexto = new JTextArea();
			areaDeTexto.setLineWrap(true);//para que el texto se ajuste al area
		   	scrollPaneArea = new JScrollPane();
			scrollPaneArea.setBounds(20, 50, 350, 270);
	        scrollPaneArea.setViewportView(areaDeTexto);
	       	
			/*Propiedades del boton, lo instanciamos, posicionamos y
			 * activamos los eventos*/
			botonAbrir= new JButton();
			botonAbrir.setText("Abrir");
			botonAbrir.setBounds(90, 330, 80, 23);
			botonAbrir.addActionListener(this);
			
			botonGuardar= new JButton();
			botonGuardar.setText("Guardar");
			botonGuardar.setBounds(210, 330, 80, 23);
			botonGuardar.addActionListener(this);
			
			/*Agregamos los componentes al Contenedor*/
			contenedor.add(labelTitulo);
			contenedor.add(scrollPaneArea);
			contenedor.add(botonAbrir);
			contenedor.add(botonGuardar);
       		//Asigna un titulo a la barra de titulo
			setTitle("CoDejaVu : Ventana JFrame");
			//tamaño de la ventana
			setSize(400,400);
			//pone la ventana en el Centro de la pantalla
			setLocationRelativeTo(null);

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		@Override
		public void actionPerformed(ActionEvent evento) {
			if (evento.getSource()==botonAbrir)
			{
				String archivo=abrirArchivo();
				areaDeTexto.setText(archivo);
			}
			
			if (evento.getSource()==botonGuardar)
			{
				guardarArchivo();
			}
		}

		private String abrirArchivo() {
			
			JFileChooser file=new JFileChooser(); 
			String texto;
	    
			String aux=""; 		
	 		texto="";
		
	 		try
			{
	    		file.showOpenDialog(this);
	 			File abre=file.getSelectedFile();

	 			if(abre!=null)
	 			{ 				
	 				FileReader archivos=new FileReader(abre);
	 				BufferedReader lee=new BufferedReader(archivos);
	 				while((aux=lee.readLine())!=null)
	 					{
	 					 texto+= aux+ "\n";
	 					}

	 		  		lee.close();
	 			} 			
	 		}
	 		catch(IOException ex)
			{
			  JOptionPane.showMessageDialog(null,ex+"\nNo se ha encontrado el archivo","ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
			}
				return texto;
		}
		
		private void guardarArchivo() {

	 		try
	 		{
				String nombre="";
				JFileChooser file=new JFileChooser();
				file.showSaveDialog(this);
				File guarda =file.getSelectedFile();
		
				if(guarda !=null)
				{
		 			nombre=file.getSelectedFile().getName();
		 			FileWriter  save=new FileWriter(guarda+".doc");
		 			save.write(areaDeTexto.getText());
		 			save.close();
		 			JOptionPane.showMessageDialog(null,"El archivo se a guardado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
			    }
	 		 }
	 	   catch(IOException ex)
		   {
			 JOptionPane.showMessageDialog(null,"Su archivo no se ha guardado","Advertencia",JOptionPane.WARNING_MESSAGE);
		   }
		}
	}
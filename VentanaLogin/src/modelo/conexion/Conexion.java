package modelo.conexion;

import java.sql.*;

import javax.swing.JOptionPane;

public class Conexion {
	private String nombreBd="usuario_bd";
	private String usuario="root";
	private String password="";
	private String url="jdbc:mysql://localhost/"+nombreBd;

	Connection conn=null;
	//constructor de la clase
	public Conexion(){
		try {
			//obtener el driver
			Class.forName("com.mysql.jdbc.Driver");
			//obtener la conexion
			conn=DriverManager.getConnection(url,usuario,password);
			if (conn!=null) {
				System.out.println("Conexion Exitosa  a la BD: "+nombreBd);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("ocurre una ClassNotFoundException : "+e.getMessage());
		} catch (SQLException e) {
			System.out.println("ocurre una SQLException: "+e.getMessage());
		}
	}
	public Connection getConnection(){
		return conn;
	}
	public void desconectar(){
		conn=null;
	}
}


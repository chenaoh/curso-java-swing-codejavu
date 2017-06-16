package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import vo.PersonaVo;

import conexion.Conexion;





/**
 * Clase que permite el acceso a la base de datos
 * @author chenao
 *
 */
public class PersonaDao
{

	public void registrarPersona(PersonaVo miPersona)
	{
		Conexion conex= new Conexion();
		
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO persona VALUES ('"+miPersona.getIdPersona()+"', '"
					+miPersona.getNombrePersona()+"', '"+miPersona.getEdadPersona()+"', '"
					+miPersona.getProfesionPersona()+"', '"+miPersona.getTelefonoPersona()+"')");
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Registro");
		}
	}

	public PersonaVo buscarPersona(int codigo) 
	{
		Conexion conex= new Conexion();
		PersonaVo persona= new PersonaVo();
		boolean existe=false;
		try {
			PreparedStatement consulta;
			consulta = conex.getConnection().prepareStatement("SELECT * FROM persona where id = ? ");
			consulta.setInt(1, codigo);
			ResultSet res = consulta.executeQuery();
			while(res.next()){
				existe=true;
				persona.setIdPersona(Integer.parseInt(res.getString("id")));
				persona.setNombrePersona(res.getString("nombre"));
				persona.setEdadPersona(Integer.parseInt(res.getString("edad")));
				persona.setProfesionPersona(res.getString("profesion"));
				persona.setTelefonoPersona(Integer.parseInt(res.getString("telefono")));
			 }
			res.close();
			conex.desconectar();					
			} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Error, no se conecto");
					System.out.println(e);
			}
		
			if (existe) {
				return persona;
			}
			else return null;				
	}

	public void modificarPersona(PersonaVo miPersona) {
		
		Conexion conex= new Conexion();
		try{
			String consulta="UPDATE persona SET id= ? ,nombre = ? , edad=? , profesion=? , telefono= ? WHERE id= ? ";
			PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);
			
            estatuto.setInt(1, miPersona.getIdPersona());
            estatuto.setString(2, miPersona.getNombrePersona());
            estatuto.setInt(3, miPersona.getEdadPersona());
            estatuto.setString(4, miPersona.getProfesionPersona());
            estatuto.setInt(5,miPersona.getTelefonoPersona());
            estatuto.setInt(6, miPersona.getIdPersona());
            estatuto.executeUpdate();

          JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ","Confirmación",JOptionPane.INFORMATION_MESSAGE);
         

        }catch(SQLException	 e){

            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al Modificar","Error",JOptionPane.ERROR_MESSAGE);

        }
	}

	public void eliminarPersona(String codigo)
	{
		Conexion conex= new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("DELETE FROM persona WHERE id='"+codigo+"'");
            JOptionPane.showMessageDialog(null, " Se ha Eliminado" +
            		" Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Elimino");
		}
	}

	public void buscarUsuarios(DefaultTableModel model) {
		System.out.println("Ingresa");
		Conexion conex= new Conexion();
		try{
			Statement estatuto = conex.getConnection().createStatement();
            ResultSet rs = estatuto.executeQuery("SELECT * FROM persona ");
           
            while(rs.next()){
          	    // es para obtener los datos y almacenar las filas
                Object [] fila = new Object[5];
                // para llenar cada columna con lo datos almacenados
                for (int i=0;i<5;i++)
                    fila[i] = rs.getObject(i+1);
                // es para cargar los datos en filas a la tabla modelo
                model.addRow(fila);
             
            }
            rs.close();
       	estatuto.close();
       	conex.desconectar();
		
	}catch(SQLException	 e){
		System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "Error al consultar","Error",JOptionPane.ERROR_MESSAGE);
		
	}
	}
	
	public ArrayList<PersonaVo> buscarUsuariosPersona() {
		System.out.println("Ingresa");
		Conexion conex= new Conexion();
		ArrayList<PersonaVo> miLista= new ArrayList<PersonaVo>();
		PersonaVo persona;
		try{
			Statement estatuto = conex.getConnection().createStatement();
            ResultSet rs = estatuto.executeQuery("SELECT * FROM persona ");
           
            while(rs.next()){
          	    persona= new PersonaVo();
                persona.setIdPersona(Integer.parseInt(rs.getString("id")));
				persona.setNombrePersona(rs.getString("nombre"));
				persona.setEdadPersona(Integer.parseInt(rs.getString("edad")));
				persona.setProfesionPersona(rs.getString("profesion"));
				persona.setTelefonoPersona(Integer.parseInt(rs.getString("telefono")));
				miLista.add(persona);
            }
        rs.close();
       	estatuto.close();
       	conex.desconectar();
  		
	}catch(SQLException	 e){
		System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "Error al consultar","Error",JOptionPane.ERROR_MESSAGE);
		
	}
		return miLista;
	}
}

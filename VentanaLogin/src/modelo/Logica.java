package modelo;

import javax.swing.JOptionPane;

import modelo.vo.UsuarioVo;
import controlador.Coordinador;

public class Logica {
	
	final int SELECCION=0;
	final int ADMINISTRADOR=1;
	final int USUARIO=2;
	
//	final String PASS_ADMIN="admin";
//	final String PASS_USER="1234";
	
	   private Coordinador miCoordinador;
	    // End of variables declaration               
	    
		public void setCoordinador(Coordinador miCoordinador) {
			this.miCoordinador=miCoordinador;
		}
		
		public String validarIngreso(int index, String pass){
			
			String retorno="";
			
			if (index==SELECCION) {//seleccion es 0
				retorno="error";
			}else{
				retorno=validarPass(index, pass);
			}
				
			return retorno;
		}

		private String validarPass(int index, String pass) {
			UsuarioVo miUsuarioVo=miCoordinador.consultarUsuario(pass);
			String retorno="";
			
			if (miUsuarioVo!=null) {
				if ( (index==ADMINISTRADOR && index==miUsuarioVo.getTipo() )|| (index==USUARIO && index==miUsuarioVo.getTipo() )) {
					if (pass.equals(miUsuarioVo.getDocumento())) {
						retorno=miUsuarioVo.getNombre();
					}else{
						retorno="invalido";
					}
				}else{
					retorno="invalido";
				}
			}else{
				retorno="desconectado";
			}
			   return retorno;
		}

		public boolean validarCampos(UsuarioVo miUsuarioVo) {
			boolean validarNombre=false;
			boolean validarDocumento=false;
			
			String documento=miUsuarioVo.getDocumento();
			String nombre=miUsuarioVo.getNombre();
			
			if (documento!=null && !documento.equals("")) {
				validarDocumento=true;
			}
			
			if (nombre!=null && !nombre.equals("")) {
				validarNombre=true;
			}
			
			if (validarDocumento==true && validarNombre==true) {
				return true;
			}else{
				return false;	
			}
		}

		public Integer validarEdad(String edadIngresada) {
			Integer edad=null;
			try {
				edad=Integer.parseInt(edadIngresada);
			} catch (Exception e) {
				edad=null;
			}			
			return edad;
		}



}

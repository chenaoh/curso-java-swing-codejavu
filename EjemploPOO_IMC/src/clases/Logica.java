package clases;

import java.util.ArrayList;

public class Logica {
	
	double imc;
	ArrayList<PersonaVO> listaPersonas;
	
	public Logica(){
		listaPersonas=new ArrayList<>();
	}
	
	
	public String registrarPersona(PersonaVO persona){
		String resultado="Persona Registrada Con Exito!\n";
		resultado+="Documento: "+persona.getDocumento()+"\n";
		resultado+="Nombre: "+persona.getNombre()+"\n";
		resultado+="Edad: "+persona.getEdad()+"\n";
		resultado+="Talla: "+persona.getTalla()+"\n";
		resultado+="Peso: "+persona.getPeso()+"\n";
		imc=persona.getPeso()/(persona.getTalla()*persona.getTalla());
	
		String imcMsj=calcularIMC(imc);
		
		persona.setImcMsj(imcMsj);
		resultado+=""+imcMsj+"\n";
		persona.setImc(imc);
		
		listaPersonas.add(persona);
		
		return resultado;
	}

	public String calcularIMC(double imc){
		
		String msj="";
		if (imc<18) {
			msj="Anorexia";
		}else{
			if(imc>=18 && imc<20){
				msj="Delgadez";
			}else{
				if(imc>=20 && imc<27){
					msj="Normalidad";
				}else{
					if(imc>=27 && imc<30){
						msj="Obesidad Grado 1";
					}else{
						if(imc>=30 && imc<35){
							msj="Obesidad Grado 2";
						}else{
							if(imc>=35 && imc<40){
								msj="Obesidad Grado 3";
							}else{
								msj="Obesidad Morbida";
							}
						}	
					}
				}	
			}
		}
		
		
		
		return "IMC: "+imc+"\nsu imc indica que tiene: "+msj;
	}
	
	public String consultarListaPersonas(){
		
		String resultado="";
		PersonaVO p=null;
		for (int i = 0; i < listaPersonas.size(); i++) {
			p=listaPersonas.get(i);
			resultado+="Documento: "+p.getDocumento()+"\n";
			resultado+="Nombre: "+p.getNombre()+"\n";
			resultado+="Edad: "+p.getEdad()+"\n";
			resultado+="Talla: "+p.getTalla()+"\n";
			resultado+="Peso: "+p.getPeso()+"\n";
			resultado+=""+p.getImcMsj()+"\n";
			resultado+="***********************\n";
		}
		
		return resultado;
	}


	public String consultarPromedio() {
		String resultado="";
		double suma=0;
		for (int i = 0; i < listaPersonas.size(); i++) {
			suma=suma+listaPersonas.get(i).getImc();
		}
		
		double prom=suma/listaPersonas.size();
		resultado=calcularIMC(prom);
		
		return resultado;
	}
	
	
}

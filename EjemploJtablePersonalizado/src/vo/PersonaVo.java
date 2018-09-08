package vo;

public class PersonaVo {
	
	private String documento;
	private String nombre;
	private String direccion;
	private String telefono;
	private String profesion;
	private int edad;
	private double nota1;
	private double nota2;
	private double nota3;
	private double promedio;
	
	public PersonaVo(){
		
	}
	
	public PersonaVo(String documento, String nombre, String direccion, String telefono, String profesion, int edad,
			double nota1, double nota2, double nota3, double promedio) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.profesion = profesion;
		this.edad = edad;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.promedio = promedio;
	}
	
	
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	
	

}

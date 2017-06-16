
public class Carro extends Vehiculo{
	
	@Override
	protected String prender(){
		
		return "encendido en la clase hija";
		
	}
	
	public void sumar(int a, int b)
	{
		int suma=a+b;
		System.out.println("la suma es: "+suma);
	}
	
	public void Numeros(double a, double b)
	{	
		double suma=a+b;
		System.out.println("la suma es: "+suma);
	}
	
	

}

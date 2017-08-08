package calculadora;

public class Operar {
	
	Ejecutar suma, resta, multiplica, divide;

	public static double resultado;
	
	public Operar(Ejecutar sum, Ejecutar res, Ejecutar mul, Ejecutar div) {
		this.suma = sum;
		this.resta = res;
		this.multiplica = mul;
		this.divide = div;
	}
	
	public void sumar(double numero) {
		suma.ejecutar(numero);
	}
	
	public void restar(double numero) {
		resta.ejecutar(numero);
	}
	
	public void multiplicar(double numero) {
		multiplica.ejecutar(numero);
	}
	
	public void dividir(double numero) {
		divide.ejecutar(numero);
	}
}

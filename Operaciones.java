package calculadora;

public class Operaciones {

	//public static double resultado = Separar.numerosfin.get(0);
	
	public static void separacion(String cadena) {
		
	}
	
	public void sumar(double numero1, double numero2) {
		Separar.resultado = numero1 + numero2;
	}
	
	public void restar(double numero1, double numero2) {
		Separar.resultado = numero1 - numero2;
	}
	
	public void multiplicar(double numero1, double numero2) {
		Separar.resultado = numero1 * numero2;
	}
	
	public void division(double numero1, double numero2) {
		if(numero1 >= numero2) {
			Separar.resultado = numero1 / numero2;
		}else {
			Separar.resultado = numero2 / numero1;
		}
	}
}

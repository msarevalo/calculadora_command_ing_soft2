package calculadora;

import java.util.ArrayList;

public class Separar {
	public static String[] operadores = null;
	public static String[] numeros = null;
	int contador = 1;
	static double numeroarreglo = 0;
	//Double resultado = 0.0;
	char respuesta = 's';
	public static ArrayList<Double> numerosfin = new ArrayList<Double>();
	
	public static double resultado;
	
	public static void separa(String cadena) {
		operadores = cadena.split("[0-9]");
		numeros = cadena.split("[-*/+]");

		//contador = numeros[0].length();

		for (int i = 0; i < numeros.length; i++) {
			//numero = Integer.parseInt(numeros[i]);
			numeroarreglo = Double.parseDouble(numeros[i]);
			//System.out.println(numeroarreglo);
			numerosfin.add(i, numeroarreglo);
			// System.out.println(numerosfin.get(i));
		}
		resultado = numerosfin.get(0);
	}
}

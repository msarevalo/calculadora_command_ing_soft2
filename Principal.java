package calculadora;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 1;

		Operaciones opes = new Operaciones();

		Ejecutar sumar = new Suma(opes);
		Ejecutar restar = new Resta(opes);
		Ejecutar multi = new Multiplicacion(opes);
		Ejecutar dividir = new Division(opes);

		Operar ope = new Operar(sumar, restar, multi, dividir);

		Scanner teclado = new Scanner(System.in);
		String cadena = null;
		String ciclo = null;

		int respuesta = 0;

		System.out.println("Escriba la operacion que desea realizar:");
		cadena = teclado.nextLine();
		ciclo = cadena;

		if(!ciclo.equals("Exit")) {
			Separar.separa(cadena);
		}else {
			System.out.println("Gracias por usar la calculadora...");
			respuesta = 1;
		}

		while (respuesta != 1) {
			for (int j = 0; j < Separar.operadores.length; j++) {
				if (Separar.operadores[j].equals("+")) {
					ope.sumar(Separar.numerosfin.get(contador));
					contador++;
				} else {
					if (Separar.operadores[j].equals("-")) {
						ope.restar(Separar.numerosfin.get(contador));
						contador++;
					} else {
						if (Separar.operadores[j].equals("*")) {
							ope.multiplicar(Separar.numerosfin.get(contador));
							contador++;
						} else {
							if (Separar.operadores[j].equals("/")) {
								ope.dividir(Separar.numerosfin.get(contador));
								contador++;
							}
						}
					}
				}
			}
			System.out.printf("\nEl resultado de " + cadena + " es: %.2f", Separar.resultado);
			
			System.out.println("\n\nEscriba la operacion que desea realizar (Exit para salir):");
			cadena = teclado.nextLine();
			ciclo = cadena;
			
			if(!ciclo.equals("Exit")) {
				Separar.separa(cadena);
			}else {
				System.out.println("Gracias por usar la calculadora...");
				respuesta = 1;
			}
		}
	}

}

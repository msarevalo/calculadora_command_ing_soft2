package calculadora;

public class Suma implements Ejecutar{

	Operaciones misOperaciones;
	
	public Suma(Operaciones opes) {
		// TODO Auto-generated constructor stub
		this.misOperaciones = opes;
	}

	@Override
	public void ejecutar(double numero) {
		// TODO Auto-generated method stub
		misOperaciones.sumar(Separar.resultado, numero);
	}

}

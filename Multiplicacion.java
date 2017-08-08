package calculadora;

public class Multiplicacion implements Ejecutar{

	Operaciones misOperaciones;
	
	public Multiplicacion(Operaciones opes) {
		// TODO Auto-generated constructor stub
		this.misOperaciones = opes;
	}

	@Override
	public void ejecutar(double numero) {
		// TODO Auto-generated method stub
		misOperaciones.multiplicar(Separar.resultado, numero);
	}

}

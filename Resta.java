package calculadora;

public class Resta implements Ejecutar{

	Operaciones misOperaciones;
	
	public Resta(Operaciones opes) {
		// TODO Auto-generated constructor stub
		this.misOperaciones = opes;
	}

	@Override
	public void ejecutar(double numero) {
		// TODO Auto-generated method stub
		misOperaciones.restar(Separar.resultado, numero);
	}

}

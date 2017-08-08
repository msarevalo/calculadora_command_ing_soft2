package calculadora;

public class Division implements Ejecutar{

	Operaciones misOperaciones;
	
	public Division(Operaciones opes) {
		// TODO Auto-generated constructor stub
		this.misOperaciones = opes;
	}
	
	@Override
	public void ejecutar(double numero) {
		// TODO Auto-generated method stub
		misOperaciones.division(Separar.resultado, numero);
	}

}

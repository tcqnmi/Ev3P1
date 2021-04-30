package e4;

public class Entrenador extends Componente {
	
	private String federacion = "no asignado";

	public Entrenador(String nombre, String federacion) {
		super(nombre);
		this.federacion = federacion;
	}

	public String getFederacion() {
		return federacion;
	}
	public String entrenando() {
		return "Estoy entrenando";
	}
	@Override
	public String toString() {
		return String.format("Entrenador %s de la federacion %s",super.getNombre(), federacion);
	}
	
	

}

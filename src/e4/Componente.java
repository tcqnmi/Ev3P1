package e4;

public class Componente {
	
	private String nombre = "no definido";

	public Componente(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return String.format("%s", nombre);
	}

	
	
	

}

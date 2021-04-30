package e4;

public class Jugador extends Componente {

	private int dorsal = 0;
	private String posicion = "no definido";
	
	public Jugador(String nombre, int dorsal, String posicion) {
		super(nombre);
		this.dorsal = dorsal;
		this.posicion = posicion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public String getPosicion() {
		return posicion;
	}
	
	public String jugando() {
		return String.format("Estoy jugando de %s",this.posicion);
	}

	@Override
	public String toString() {
		return String.format("Jugador %s dorsal: %d posicion %s",super.getNombre(), this.dorsal, this.posicion);
	}
	
	

}

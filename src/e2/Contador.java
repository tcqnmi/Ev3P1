package e2;


public class Contador {
	private int cont = 0;
	private int inicial = 0;
	
	public Contador(int inicial) {
		this.inicial = inicial;
		this.cont = this.inicial;
		
	}
	
	public Contador() {
		
	}
	public Contador(Contador copia) {
		this.inicial = copia.inicial;
		this.cont = this.inicial ;
		
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public int getInicial() {
		return inicial;
	}

	public void setInicial(int inicial) {
		this.inicial = inicial;
	}
	
	public void inc(int cantidad) {
		this.cont+=cantidad;
	}
	public void inc() {
		this.cont++;
	}
	public void dec(int cantidad) {
		this.cont-=cantidad;
	}
	public void dec() {
		this.cont--;
	}
	public void reset() {
		this.cont=this.inicial;
	}

	@Override
	public String toString() {
		return String.format("El contador  se inició con %s y se encuentra en %s", inicial, cont);
	}
	
	
	
}

package e3;

public class Reloj {
	
	private int horas = 0;
	private int minutos = 0;
	private int segundos = 0;
	
	public Reloj(int horas, int minutos, int segundos) throws Exception {
		fijarHora(horas, minutos, segundos);
	}
	public Reloj() throws Exception {
		fijarHora(0, 0 ,0);
	}
	public Reloj(Reloj otro) throws Exception {
		fijarHora(otro.horas, otro.minutos, otro.segundos);
	}
	public Reloj(int segundostotal) throws Exception {
		int horasprov=0, minutosprov=0, segundosprov=0; 
		if(segundostotal>59) {
		segundosprov = segundostotal%60;
		minutosprov=segundostotal/60;
			if(minutosprov>59) {
				horasprov=minutosprov/60;
				minutosprov=minutosprov%60;
			}	
		}else {
			segundosprov=segundostotal;
		}
		fijarHora(horasprov,minutosprov,segundosprov);
		
	}

	public int getHoras() {
		return horas;
	}

	public int setHoras(int horas) throws Exception {
		if(horas<0) 
			throw new Exception("No puede ser una hora negativa");
		if(horas>23)
			throw new Exception("La hora no puede ser superior a 23");
		
		return horas;
	}

	public int getMinutos(){
		return minutos;
	}

	public int setMinutos(int minutos) throws Exception {
		if(minutos<0) 
			throw new Exception("No puede ser un minuto negativo");
		if(minutos>59)
			throw new Exception("No puede ser un minuto superior a 59");
		
		return minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public int setSegundos(int segundos) throws Exception {
		if(segundos<0) 
			throw new Exception("No puede ser un segundo negativo");
		if(segundos>59)
			throw new Exception("No puede ser un segundo superior a 59");
		
		return segundos;
	}
	
	public void fijarHora(int horas,int minutos,int segundos) throws Exception {
		this.horas = setHoras(horas);
		this.minutos = setMinutos(minutos);
		this.segundos = setSegundos(segundos);
		
	}
	
	public void avanza() {
		this.segundos+=1;
		if(this.segundos>59) {
			this.segundos=0;
			this.minutos+=1;
			if(this.minutos>59) {
				this.minutos=0;
				this.horas+=1;
				if(this.horas>23) {
					this.horas=0;
				}
			}
		}
	}
	public void retrasa() {
		this.segundos-=1;
		if(this.segundos<0) {
			this.segundos=59;
			this.minutos-=1;
			if(this.minutos<0) {
				this.minutos=59;
				this.horas-=1;
				if(this.horas<0) {
					this.horas=23;
				}
			}
		}
	}
	
	public void reset() throws Exception {
		fijarHora(0,0,0);
	}
	@Override
	public String toString() {
		return String.format("Hora: %02d:%02d:%02d", this.horas, this.minutos, this.segundos);
	}
	
	public double enSegundos() {
		return horas/120+minutos/60+segundos;
	}
	
	public int compareTo(Reloj r) {
		if(enSegundos() == r.enSegundos()) {
			return 0;
		}else if(enSegundos() < r.enSegundos() ) {
			return -1;
		}else {
			return 1;
		}
	}
	public String doceHoras() {
		String mens= "";
		int horasdoce= 0;
		if(this.horas>12) {
			this.horas-=12;
			mens="PM";
		}else {
			horasdoce = this.horas;
			mens="AM";
		}
		return String.format("Hora: %2d:%2d:%2d %s",horasdoce,this.minutos,this.segundos, mens);
	}

}

package e9;

public class Conversor {
	
	private int numero = 1;

	public Conversor(int numero) throws Exception {
		setNumero(numero);
	}
	
	public Conversor() {
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) throws Exception {
		if(numero<0) {
			throw new Exception("No puede ser negativo");
		}
		this.numero = numero;
	}
	
	private String conversorBase(int base) {
		
		int cociente= this.numero; 
		int residuo=  0;
		String resultado="";
		System.out.printf("%-7s|%7s\n","Residuo","Cociente");
		while(cociente>0){
			residuo = cociente%base;
			cociente/=base;
			if(base== 16) {
				switch(residuo) {
				case 10: residuo='A';
					resultado = String.format("%c%s",residuo,resultado);
					break;
				case 11: residuo='B';
					resultado = String.format("%c%s",residuo,resultado);
					break;
				case 12: residuo='C';
					resultado = String.format("%c%s",residuo,resultado);
					break;
				case 13: residuo='D';
					resultado = String.format("%c%s",residuo,resultado);
					break;
				case 14: residuo='E';
					resultado = String.format("%c%s",residuo,resultado);
					break;
				case 15: residuo='F';
					resultado = String.format("%c%s",residuo,resultado);
					break;
				default:
					resultado = String.format("%d%s",residuo,resultado);
					break;
				}
			
			}else {
				resultado = String.format("%d%s",residuo,resultado);
			}
			
			System.out.printf("%-7d|%7d\n",residuo,cociente);
		}
		
		return resultado;
	}
	public String toBin() {
		return conversorBase(2);
	}
	public String toOct() {
		return conversorBase(8);
	}
	public String toHex() {
		return conversorBase(16);
	}
	
	
	

}

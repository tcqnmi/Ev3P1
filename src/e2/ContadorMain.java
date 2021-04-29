package e2;

import java.util.Scanner;

public class ContadorMain {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Con qué valor desea iniciar el contador?");
		int inic = Integer.parseInt(teclado.nextLine());
		
		Contador cont = new Contador(inic);
		
		
		char resp = ' ';
		do {
			System.out.println("1.-Entra una persona");
			System.out.println("2.-Entran varias personas");
			System.out.println("3.-Sale una persona");
			System.out.println("4.- Salen varias personas");
			System.out.println("5.- Reset");
			System.out.println("6.- Estado del aforo");
			System.out.println("S.- Salir");
			resp = teclado.nextLine().toLowerCase().trim().charAt(0);
			switch (resp) {
				case '1':
					cont.inc();
					break;
				case '2':
					System.out.println("¿Cuántas han entrado?");
					int cantidad = Integer.parseInt(teclado.nextLine());
					cont.inc(cantidad);
					break;
				case '3':
					cont.dec();
					break;
				case '4':
					System.out.println("¿Cuántas han salido?");
					cantidad= Integer.parseInt(teclado.nextLine());
					cont.dec(cantidad);
					break;
				case '5':
					cont.reset();
					break;
				case '6':
					System.out.println(cont);
					break;
			}
				
		}while(resp!='s');
		System.out.println("ADIOS");

	}

}

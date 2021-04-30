package e8;

import java.util.Scanner;

public class TablaMultiplicar {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println("Dame un n�mero de 0 a 10");
				int num = Integer.parseInt(teclado.nextLine());

				if (num > 10)
					throw new Exception("No son v�lidos n�meros mayores de 10");
				if (num < 0)
					throw new Exception("No son v�lidos n�meros negativos");

				System.out.printf("Tablad del %d \n", num);
				for (int i = 0; i <= 10; i++) {
					System.out.printf("%2d x %2d = %3d \n", i, num, i * num);

				}
				
				break;

			} catch (NumberFormatException e) {
				System.out.println("Valores no num�ricos");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		}
		
		
	}

}

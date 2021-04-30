package e7;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println("Dame un número mayor que 0: ");
				int num = Integer.parseInt(teclado.nextLine());

				if (num < 0)
					throw new Exception("Valor menor de 0");
				double res = 1;
				for (int i = 1; i <= num; i++) {
					res += res * i;
				}
				System.out.println(res);
				break;

			} catch (NumberFormatException e) {
				System.out.println("Valor no numérico");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		}
		
		
		

	}

}

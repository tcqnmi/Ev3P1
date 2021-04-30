package e9;

import java.util.Scanner;

public class MainConversor {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println("Dame un número ");
				int num = Integer.parseInt(teclado.nextLine());

				Conversor c1 = new Conversor(num);

				System.out.printf("\nBase binaria: %s \n", c1.toBin());
				System.out.printf("\nBase octal: %s \n", c1.toOct());
				System.out.printf("\nBase hexadecimal: %s \n", c1.toHex());
				break;

			} catch (NumberFormatException e) {
				System.out.println("Valor no numérico");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		}
		
		
	}

}

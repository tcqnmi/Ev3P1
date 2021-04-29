package e1;

import java.util.Scanner;

public class MainQuadraticEquation {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Valor para a:");
		int a = Integer.parseInt(teclado.nextLine());
		System.out.println("Valor para b:");
		int b = Integer.parseInt(teclado.nextLine());
		System.out.println("Valor para c:");
		int c = Integer.parseInt(teclado.nextLine());
		
		QuadraticEquation f1 = new QuadraticEquation(a,b,c);
		
		System.out.println(f1.getDiscriminant());
		
		if(f1.getDiscriminant()>0) {
			System.out.printf("Root 2 = %.2f \n",f1.getRoot2());
			System.out.printf("Root 1 = %.2f \n",f1.getRoot1());

		}else if(f1.getDiscriminant()==0) {
			System.out.printf("Root 1 = %.2f \n",f1.getRoot1());
			
		}else {
			System.out.println("The equation has no roots");
		}

	}

}

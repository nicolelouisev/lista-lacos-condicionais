package Lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		int a = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		int b = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		int c = leia.nextInt();
		
		int somaAB = a + b;
		
		if(somaAB > c) {
			System.out.println("A soma de A + B é maior que C");
		} 
		if (somaAB < c) {
			System.out.println("A soma de A + B é menor que C");
		} 
		if (somaAB == c) {
			System.out.println("A soma de A + B é igual a C");
		}

		leia.close();
	}

}

package Lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o nome do doador: ");
		String nomeDoador = leia.nextLine();
		System.out.println("Digite a idade: ");
		int idadeDoador = leia.nextInt();
		System.out.println("É a primeira doação? Digite TRUE ou FALSE");
		boolean primeiraDoacao = leia.nextBoolean();
		
				
		if (idadeDoador >= 18 && idadeDoador <= 69) {
            if (idadeDoador >= 60 && primeiraDoacao == true) {
                System.out.println(nomeDoador + " NÃO está APTO para doar sangue!");
            } else {
                System.out.println(nomeDoador + " está APTO para doar sangue!");
            }
        } else {
            System.out.println(nomeDoador + " NÃO está APTO para doar sangue!");
        }
		
		leia.close();
	}
}

package Lista2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o nome do colaborador: ");
		String nomeColaborador = leia.nextLine();
		System.out.println("Digite o código do colaborador de 1 a 6: ");
		int opcao = leia.nextInt();
		System.out.println("Digite o valor do salário: ");
		float salario = leia.nextFloat();
		
		String cargoColaborador = "";
        double reajuste = 0.0;
		
		switch (opcao) {
			case 1:
				cargoColaborador = "Gerente";
				reajuste = 0.1;
	            break;
			case 2:
				cargoColaborador = "Vendedor";
				reajuste = 0.07;
	            break;
			case 3:
				cargoColaborador = "Supervisor";
				reajuste = 0.09;
	            break;
			case 4:
				cargoColaborador = "Motorista";
				reajuste = 0.06;
	            break;
			case 5:
				cargoColaborador = "Estoquista";
				reajuste = 0.05;
	            break;
			case 6:
				cargoColaborador = "Técnico de TI";
				reajuste = 0.08;
	            break;
			default:
            System.out.println("Código de cargo inválido.");
		}

	    double salarioReajustado = salario + (reajuste * salario);
	
	    System.out.println("Nome do colaborador: " + nomeColaborador);
	    System.out.println("Cargo: " + cargoColaborador);
	    System.out.println("Novo salário: R$ " + salarioReajustado);
		
		leia.close();
	}

}

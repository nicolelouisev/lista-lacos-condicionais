package Lista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o código de 1 a 6: ");
		int opcao = leia.nextInt();
		System.out.println("Digite a quantidade comprada do produto: ");
		int quantidade = leia.nextInt();
		
		String nomeProduto = "";
        double precoUnitario = 0.0;
		
		switch (opcao) {
		case 1:
            nomeProduto = "Cachorro Quente";
            precoUnitario = 10.00;
            break;
        case 2:
            nomeProduto = "X-Salada";
            precoUnitario = 15.00;
            break;
        case 3:
            nomeProduto = "X-Bacon";
            precoUnitario = 18.00;
            break;
        case 4:
            nomeProduto = "Bauru";
            precoUnitario = 12.00;
            break;
        case 5:
            nomeProduto = "Refrigerante";
            precoUnitario = 8.00;
            break;
        case 6:
            nomeProduto = "Suco de laranja";
            precoUnitario = 13.00;
            break;
        default:
            System.out.println("Código de produto inválido.");
		}

	    double valorTotal = quantidade * precoUnitario;
	
	    System.out.println("\nResumo da compra:");
	    System.out.println("Produto escolhido: " + nomeProduto);
	    System.out.println("Valor Total: R$ " + valorTotal);
		
		leia.close();
	}

}

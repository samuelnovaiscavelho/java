package lacoscondicionaisEx;

import java.util.Scanner;

public class LacoCondicionalSwitchEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int codigoProduto, quantidade;
		double cachorroQuente = 10, xSalada = 15, xBacon = 18, bauru = 12;
		double refrigerante = 8, sucoLaranja = 13;
		
		System.out.println("============ Digite o número desejado abaixo ============");
		System.out.println("1) Cachorro Quente -> R$ 10.00");
		System.out.println("2) X-Salada -> R$ 15.00");
		System.out.println("3) X-Bacon -> R$ 18.00");
		System.out.println("4) Bauru -> R$ 12.00");
		System.out.println("5) Refrigerante -> R$ 8.00");
		System.out.println("6) Suco de laranja -> 13.00");
		System.out.println("##########################################################");
		
		
		
		System.out.println("Código do Produto: ");
		codigoProduto = sc.nextInt();
		
		System.out.println("Quantidade: ");
		quantidade = sc.nextInt();
		
		switch(codigoProduto) {
		
		case 1:
			System.out.println("\nProduto: Cachorro Quente");
			System.out.printf("Valor total: %.2f", (quantidade*cachorroQuente));
			break;
			
		case 2:
			System.out.println("\nProduto: X-Salada");
			System.out.printf("Valor total: %.2f", (quantidade*xSalada));
			break;
			
		case 3:
			System.out.println("\nProduto: X-Bacon");
			System.out.printf("Valor total: %.2f", (quantidade*xBacon));
			break;
			
		case 4:
			System.out.println("\nProduto: Bauru");
			System.out.printf("Valor total: %.2f", (quantidade*bauru));
			break;
			
		case 5:
			System.out.println("\nProduto: Refrigerante");
			System.out.printf("Valor total: %.2f", (quantidade*refrigerante));
			break;
			
		case 6:
			System.out.println("\nProduto: Suco de laranja");
			System.out.printf("Valor total: %.2f", (quantidade*sucoLaranja));
			break;
			
		default:
			System.out.println("\nDigite um código existente de 1 a 6");
		}
		sc.close();		
			
		
	}

}

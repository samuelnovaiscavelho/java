package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionSetEx1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Queue<String> clientes = new LinkedList<>();

		int opcao = 6;
		do {
			System.out.println("##############################");
			System.out.println("1- Adicionar cliente na Fila: ");
			System.out.println("2- Listar todos os clientes: ");
			System.out.println("3- Retirar cliente da Fila");
			System.out.println("0- Sair");
			System.out.print("Digite uma opção: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.print("Digite o nome: ");
				sc.skip("\\R?");
				String nome = sc.nextLine();
				clientes.add(nome);
				System.out.println("\nFila: ");
				clientes.forEach(System.out::println);
				System.out.println("Cliente adicionado!\n");
				break;
			case 2:
				System.out.println("Lista de clientes na fila:");
				clientes.forEach(System.out::println);
				break;
			case 3:
				if (!clientes.isEmpty()) {
					System.out.println("Fila: ");
					System.out.println(clientes.poll());
					System.out.println("O cliente foi chamado!");
				} else {
					System.out.println("\nA Fila está vazia!\n");
				}
				break;
			default:
				System.out.println("Programa finalizado!");
			}
		} while (opcao != 0);
	}
}

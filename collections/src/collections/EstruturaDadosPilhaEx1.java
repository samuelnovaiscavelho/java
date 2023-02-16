package collections;

import java.util.Scanner;
import java.util.Stack;

public class EstruturaDadosPilhaEx1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> livros = new Stack<>();

        int opcao = 6;
        do {
        	System.out.println("###########################");
            System.out.println("1- Adicionar Livro na pilha");
            System.out.println("2- Lista todos os Livros");
            System.out.println("3- Retirar Livro da pilha");
            System.out.println("0- Sair");
            System.out.print("Digite a opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    sc.skip("\\R?");
                    String nome = sc.nextLine();
                    livros.push(nome);
                    System.out.println("Pilha: ");
                    livros.forEach(System.out::println);
                    System.out.println("Livro adicionado!");
                    break;
                case 2:
                    System.out.println("Lista de livros na pilha: ");
                    livros.forEach(System.out::println);
                    break;
                case 3:
                    if (livros.isEmpty()){
                        System.out.println("A pilha está vazia!");
                    } else {
                        System.out.println("Pilha: ");
                        System.out.println(livros.pop());
                    }
                    break;
                default:
                    System.out.println("Programa Finalizado!");
                    break;
            }
        }while (opcao != 0) ;

	}

}

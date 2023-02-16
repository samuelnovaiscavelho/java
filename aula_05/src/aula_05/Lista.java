package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<Double>();
		
		int opcao = 0;
		double nota = 0.0;
		
		do {
			System.out.println("1- Cadastra nota");
			System.out.println("2- Cadastra nota");
			System.out.println("3- Buscar uma nota");
			System.out.println("4- Remover uma nota");
			System.out.println("5- Atualizar uma nota");
			System.out.println("6- Para sair do sistema");
			System.out.println("Digite a opção desejada: ");
			opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Digite uma nota entre 1 e 10");
				nota = sc.nextDouble();
				notas.add(nota);
				break;
			case 2:	
				System.out.println("Digite uma nota entre 1 e 10");
				for(var listaNota : notas) 
					System.out.println(listaNota);
				break;
			case 3:
				System.out.println("Procurar um Nota");
				System.out.println("Digite uma nota: ");
				nota = sc.nextDouble();				
				System.out.println("A nota " + nota + " existe?" + notas.contains(nota));
				System.out.println("O índice da minha nota é: " + notas.indexOf(nota));
				break;
			case 4:
				System.out.println("Remove uma nota: ");
				System.out.println("Digite a nota: ");
				nota = sc.nextDouble();
				notas.remove(nota);// Nota		 
				break;
			case 5:
				System.out.println("Atualizar uma nota");
				System.out.println("Digite a nota atual: ");
				nota = sc.nextDouble();
				System.out.println("Digite a nova nota: ");
				double notaNova= sc.nextDouble();
				notas.set(notas.indexOf(notas), notaNova);
				break;
			default:
				if(opcao > 6)
					System.out.println("Opação Maior que 6");
			}		
	
		}while(opcao!=6);
		
		notas.add(9.0);
		notas.add(8.0);
		notas.add(7.0);
				
	}

}

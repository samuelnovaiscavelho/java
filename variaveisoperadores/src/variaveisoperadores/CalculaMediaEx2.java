package variaveisoperadores;

import java.util.Scanner;

public class CalculaMediaEx2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite as suas 4 notas, por favor " + nome);
		System.out.printf("Nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.printf("Nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.printf("Nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.printf("Nota 4: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("Média final:  %.1f", media);
		
	}

}

package aula_01;

import java.text.DecimalFormat; //Objeto de formatação
import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###.##");
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		String nome;
		double area;
		
		System.out.println("Digite um numero inteiro: ");
		numero = leia.nextInt();
		
		System.out.println("Digite um nome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Digite um numero real: ");
		area = leia.nextDouble();
		
		
		System.out.println("O nome da partecipante é: " + nome);
		System.out.println("O numero é: " + numero); //Concatenando
		System.out.printf("O numero é: %.2f", area); //Subtituindo %.2f pela variavel
		
		System.out.println("\nO número é: " + df.format(area));
		
	}

}

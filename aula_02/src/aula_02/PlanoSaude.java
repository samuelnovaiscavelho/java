package aula_02;

import java.util.Scanner;

public class PlanoSaude {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite a sua idade: ");
		idade = sc.nextInt();
		
		if(idade >= 0 && idade <= 10) {
			System.out.println("O Valor do seu Plano de Saúde será de R$ 100,00");
		}
		
		else if(idade > 10 && idade <= 29) {
			System.out.println("O Valor do seu Plano de Saúde será de R$ 200,00");
		}
		else if(idade > 29 && idade <= 45) {
			System.out.println("O Valor do seu Plano de Saúde será de R$ 300,00");
			
		}
			
		else if(idade > 45 && idade <= 59) {
			System.out.println("O Valor do seu Plano de Saúde será de R$ 500,00");
			
		}
			
		else if(idade > 59 && idade <= 65) {
			System.out.println("O Valor do seu Plano de Saúde será de R$ 600,00");
			
		}
		else if(idade > 65){
			System.out.println("O valor do seu Plano de Saúse será de R$ 1000,00");
		}
		else
			System.out.println("Idade Inválida!");
			
		sc.close();
		
	}

}

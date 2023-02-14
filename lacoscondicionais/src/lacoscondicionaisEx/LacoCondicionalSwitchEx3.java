package lacoscondicionaisEx;

import java.util.Locale;
import java.util.Scanner;

public class LacoCondicionalSwitchEx3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float numero1, numero2;
		int operacao;
		
		System.out.println("============ Escolha a Operação deseja de 1 a 4 ===================");
		System.out.println("1) Soma");
		System.out.println("2) Subtração");
		System.out.println("3) Multiplicação");
		System.out.println("4) Divisão");
		System.out.println("###################################################################\n");

		System.out.println("\nDigite o 1º número: ");
		numero1 = sc.nextFloat();
		System.out.println("Digite o 2º número: ");
		numero2 = sc.nextFloat();
		System.out.println("Operação: ");
		operacao = sc.nextInt();
		
		switch(operacao) {
		
		case 1:
			float soma = numero1+numero2;
			System.out.println(numero1 + " + " + numero2 + " = " + soma);
			break;			
		case 2:
			float subtracao = numero1-numero2;
			System.out.println(numero1 + " - " + numero2 + " = " + subtracao);
			break;				
			
		case 3:
			float multiplicacao = numero1*numero2;
			System.out.println(numero1 + " * " + numero2 + " = " + multiplicacao);
			break;	
			
		case 4:
			float divisao = numero1/numero2;
			System.out.println(numero1 + " / " + numero2 + " = " + divisao);
			break;
		
		default:
			System.out.println("Operação Inválida!");
		}

	}

}

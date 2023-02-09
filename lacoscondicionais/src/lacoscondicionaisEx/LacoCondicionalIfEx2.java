package lacoscondicionaisEx;

import java.util.Scanner;

public class LacoCondicionalIfEx2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if((numero % 2) == 1) {
			System.out.println("O Número " + numero + " é Ímpar e positivo!");
			
		}
		if((numero % 2) < 0) {
			System.out.println("O Número " + numero + " é Ímpar e negativo!");
			
		}
		
		if((numero % 2) == 0 && (numero >= 0)) {
			System.out.println("O Número "+ numero +" é Par e positivo");
			
		}
		
		if((numero % 2) == 0 && (numero < 0)) {
			System.out.println("O Número "+ numero +" é Par e negativo");
			
		}
		
	}

}

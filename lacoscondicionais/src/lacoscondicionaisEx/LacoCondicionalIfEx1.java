package lacoscondicionaisEx;

import java.util.Scanner;

public class LacoCondicionalIfEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, soma;
		
		System.out.println("Digite o número A: ");
		a = sc.nextInt();
		
		System.out.println("Digite o número B: ");
		b = sc.nextInt();
		
		System.out.println("Digite o número C: ");
		c = sc.nextInt();
		
		soma = a + b;
		
//		é maior, 
//		menor
//		igual C

		if (soma > c) {
			System.out.println("Soma de A + B = " + soma + " é Maior do que C = " + c);
		}
		
		if (soma < c) {
			System.out.println("Soma de A + B = " + soma + " é Menor do que C = " + c);
		}
		
		if (soma == c){
			System.out.println("Soma de A + B = " + soma + " é Igual do que C = " + c);
			
		}
		
		
		
	}

}

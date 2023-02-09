package aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		DecimalFormat df = new DecimalFormat("###.##");
	
		double n1, n2;
		
		System.out.println("Digite o 1º numero: ");
		n1 = sc.nextDouble();

		System.out.println("Digite o 2º numero: ");
		n2 = sc.nextDouble();
		
		System.out.println("O numero " + n1 + " somado " + n2 + " é igual a " + (n1 + n2)); 
		System.out.println("O numero " + n1 + " subtraido " + n2 + " é igual a " + (n1 - n2)); 
		System.out.println("O numero " + n1 + " multiplicado " + n2 + " é igual a " + (n1 * n2));
		if (n2 > 0)
			System.out.println("O numero " + n1 + " dividido " + n2 + " é igual a " + (n1 / n2)); 
		else {
			System.out.println("Não é possivel dividir um numero, por zero!");
		}
		System.out.println("O numero " + n1 + " elevado " + n2 + " é igual a " + Math.pow(n1, n2)); 

		System.out.println("O numero " + n1 + " elevado ao numero " + n2 + " é igual a " + Math.sqrt(n1));
		
		System.out.println("Pré Incremento");
		System.out.println(n1);
		System.out.println(++ n1);

		System.out.println("Pós Incremento");
		System.out.println(n2);
		System.out.println(n2 ++);
		System.out.println(n2); 
		
		//System.out.println(n1 = n1 + n2); 
		
		/*System.out.println("A soma de n1 + n2 é igual a: " + (n1 += n2)); 
		System.out.println("O novo valor de n1 é igual a: " + n1);*/
		
		
				
				
		sc.close();
		
		
	}

}

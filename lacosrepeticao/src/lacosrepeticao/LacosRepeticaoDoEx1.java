package lacosrepeticao;

import java.util.Scanner;

public class LacosRepeticaoDoEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, cont = 0;
		
		
		do {
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			
			if(num > 0) {
				cont = cont + num;
				
			}
			
		}while(num != 0);

		
		System.out.println("A soma dos números positivos é: " + cont);

	}

}

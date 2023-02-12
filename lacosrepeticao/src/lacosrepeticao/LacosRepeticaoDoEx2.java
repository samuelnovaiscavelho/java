package lacosrepeticao;

import java.util.Locale;
import java.util.Scanner;

public class LacosRepeticaoDoEx2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num, cont = 0, quantidadeMultiplos = 0;
		
		
		do {
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			
			if((num % 3)== 0) {
				cont = cont + num;
				if(num != 0) {
					quantidadeMultiplos = quantidadeMultiplos + 1;
				}				
			}
			
		}while(num != 0);
		
		float convertendoCont = (float)cont;
		float convertendoQuantidadeMultiplos = (float)quantidadeMultiplos;
		
		float resultado = (convertendoCont/convertendoQuantidadeMultiplos);
		System.out.printf("A média de todos os números múltiplos de 3 é: %.1f", resultado);		
	}

}

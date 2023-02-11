package lacosrepeticao;

import java.util.Scanner;

public class LacosRepeticaoForEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeros, par = 0, impar = 0;
		
		//primeiro número deve ser menor do que o segundo número
	
			for(int contador = 1; contador <= 10; contador++) {
				
				System.out.println("Digite o "+ contador +"º número: ");
				numeros = sc.nextInt();
				contador = contador + 0;
				
				if((numeros % 2) == 0) {
					par = par + 1;		
					
				}else{
					impar++;
					 
				}

			}		
			
			System.out.println("Total de números pares: " + par);
			System.out.println("Total de números ímpares: " + impar);			
			
			
		sc.close();
		
	}

}

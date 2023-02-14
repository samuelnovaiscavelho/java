package lacosrepeticao;

import java.util.Scanner;

public class LacosRepeticaoForEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intervaloPrimeiro, intervaloUltimo;
		//primeiro número deve ser menor do que o segundo número
		
		System.out.println("Digite o primeiro número do intervalo: ");
		intervaloPrimeiro = sc.nextInt();
		
		
		
		System.out.println("Digite o último número do intervalo: ");
		intervaloUltimo = sc.nextInt();
		
		if(intervaloPrimeiro < intervaloUltimo) {
			
			for(int contador = 1; contador <= intervaloUltimo; contador++) {
				contador = intervaloPrimeiro + 1;
				System.out.println(contador);
			}
			
		}else if(intervaloPrimeiro > intervaloUltimo) {
			System.out.println("Intervalo inválido!");
			
		}
		
		sc.close();
		
	}

}

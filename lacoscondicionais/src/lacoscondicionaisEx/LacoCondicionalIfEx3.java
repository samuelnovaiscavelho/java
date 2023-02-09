package lacoscondicionaisEx;

import java.util.Scanner;

public class LacoCondicionalIfEx3 {

	public static void main(String[] args) {
		//Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação
		
		Scanner sc = new Scanner(System.in);
		String nomeDoador;
		int idadeDoador;
		boolean verdadeiro;
		
		System.out.println("Digite o Nome do doador:");
		sc.skip("\\R?");
		nomeDoador = sc.nextLine();
		
		System.out.println("Digite a Idade do doador:");
		idadeDoador = sc.nextInt();
		
		System.out.println("Primeira doação de sangue?");
		verdadeiro = sc.nextBoolean();
		
		if(idadeDoador >= 18 && idadeDoador <= 69) {
			
			if((idadeDoador >= 60 && idadeDoador <= 69) && verdadeiro != true ) {
				System.out.println(nomeDoador + " está Apto para doar sangue! ");
								
			}
			
			if((idadeDoador >= 60 && idadeDoador <= 69) && verdadeiro == true ) {
				
				System.out.println(nomeDoador + " não está apto para doar sangue! ");
				
			}
			if ((idadeDoador >= 18 && idadeDoador <= 59) && verdadeiro == true ) {
				System.out.println(nomeDoador + " está Apto para doar sangue! ");
			}
						
		}
		else {			
			System.out.println(nomeDoador + " não está apto para doar sangue! ");
			
		}	
		

		
		
	}

}

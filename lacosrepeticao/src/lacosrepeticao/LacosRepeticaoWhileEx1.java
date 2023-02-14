package lacosrepeticao;

import java.util.Scanner;

public class LacosRepeticaoWhileEx1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idadePessoa=0, cont=0, menores21=0, maiores50=0;
		
		while(cont >= 0 && idadePessoa >= 0) {

				System.out.println("Digite uma idade: ");
				idadePessoa = sc.nextInt();
				cont = cont + 1;				
			
			if((idadePessoa <= 21)&&(idadePessoa >= 0)) {
				menores21 =  menores21 + 1;
		
			}
			else if(idadePessoa >= 50){
				maiores50 = maiores50 + 1;	
		
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: " + menores21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);
		
		sc.close();
		
	}

}

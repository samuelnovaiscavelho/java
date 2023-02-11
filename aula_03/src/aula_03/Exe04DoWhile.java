package aula_03;

import java.util.Scanner;

public class Exe04DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idade, sexo, categoria;
		String continua = "S";
		
	    while(continua.equals("S")) {
			System.out.println("Digita a idade: ");
			idade = sc.nextInt();
			
			System.out.println("Digita a  sexo: ");
			sexo = sc.nextInt();
			
			System.out.println("Digita a categoria: ");
			categoria = sc.nextInt();
			
			System.out.println("Deseja continuar(S/N): ");
			sc.skip("\\R?");
			continua = sc.nextLine().toUpperCase();
	    }
	
		
	}

}

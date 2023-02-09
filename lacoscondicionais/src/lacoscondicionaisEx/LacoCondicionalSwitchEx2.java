package lacoscondicionaisEx;

import java.util.Scanner;

public class LacoCondicionalSwitchEx2 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner (System.in);

		String nomeColaborador;
		int codigoCargoColaborador;
		float salario;
		
		System.out.println("============ Digite o número desejado abaixo ============");
		System.out.println("1) Gerente -> Percentual do Reajuste 10%");
		System.out.println("2) Vendedor -> Percentual do Reajuste 7%");
		System.out.println("3) Supervisor -> Percentual do Reajuste 9%");
		System.out.println("4) Motorista -> Percentual do Reajuste 6%");
		System.out.println("5) Estoquista -> Percentual do Reajuste 5%");
		System.out.println("6) Técnico de TI -> Percentual do Reajuste 8%");
		System.out.println("##########################################################");
		
		
		
		System.out.println("Nome do colaborador: ");
		nomeColaborador = sc.nextLine();
		
		System.out.println("Cargo: ");
		codigoCargoColaborador = sc.nextInt();

		System.out.println("Salário: ");
		salario = sc.nextFloat();
		
		switch(codigoCargoColaborador) {
		
		case 1:
			System.out.println("\nNome do colaborador: " + nomeColaborador);
			System.out.println("Cargo:  Gerente");
			System.out.printf("Salário: %.2f", (salario + (0.1*salario)));
			break;
			
		case 2:
			System.out.println("\nNome do colaborador: " + nomeColaborador);
			System.out.println("Cargo:  Vendedor");
			System.out.printf("Salário: %.2f", (salario + (0.07*salario)));
			break;
			
		case 3:
			System.out.println("\nNome do colaborador: " + nomeColaborador);
			System.out.println("Cargo:  Supervisor");
			System.out.printf("Salário: %.2f", (salario + (0.09*salario)));
			break;
			
		case 4:
			System.out.println("\nNome do colaborador: " + nomeColaborador);
			System.out.println("Cargo:  Motorista");
			System.out.printf("Salário: %.2f", (salario + (0.06*salario)));
			break;
			
		case 5:
			System.out.println("\nNome do colaborador: " + nomeColaborador);
			System.out.println("Cargo:  Estoquista");
			System.out.printf("Salário: %.2f", (salario + (0.05*salario)));
			break;
			
		case 6:
			System.out.println("\nNome do colaborador: " + nomeColaborador);
			System.out.println("Cargo:  Técnico de TI");
			System.out.printf("Salário: %.2f", (salario + (0.08*salario)));
			break;
			
		default:
			System.out.println("\nDigite um código existente de 1 a 6");
		}
		sc.close();	
	}

}

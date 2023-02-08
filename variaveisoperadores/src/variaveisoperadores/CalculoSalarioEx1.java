package variaveisoperadores;

import java.util.Scanner;

public class CalculoSalarioEx1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono;
		
		
		System.out.println("Digite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
		float novoSalario =  salario + abono;
		
		System.out.printf("Salário: %.2f \n", salario);
		System.out.printf("Abono: %.2f \n", abono);
		System.out.printf("Novo Salário: %.2f", novoSalario);
		
	}

}

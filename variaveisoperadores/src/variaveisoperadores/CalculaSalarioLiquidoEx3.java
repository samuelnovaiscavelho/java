package variaveisoperadores;

import java.util.Scanner;

public class CalculaSalarioLiquidoEx3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		float salarioBruto, salarioLiquido, adicionalNoturno, horasExtras, descontos;
		
		System.out.println("Salário Bruto: ");
		salarioBruto = leia.nextFloat();

		System.out.println("Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Horas Extras: ");
		horasExtras = leia.nextFloat();		
		
		System.out.println("Descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
	
		System.out.printf("Salário Líquido: %.2f", salarioLiquido);	
		
		
	}

}

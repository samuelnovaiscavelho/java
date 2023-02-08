package variaveisoperadores;

import java.util.Scanner;

public class CalculoDiferencaEx4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float n1, n2, n3, n4, diferenca;
		
		System.out.println("numero1: ");
		n1 = leia.nextFloat();
		
		System.out.println("numero2: ");
		n2 = leia.nextFloat();
		
		System.out.println("numero3: ");
		n3 = leia.nextFloat();
		
		System.out.println("numero4: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("Diferença: " + diferenca);
		
	}

}

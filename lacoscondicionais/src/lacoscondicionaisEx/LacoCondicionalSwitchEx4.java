package lacoscondicionaisEx;

import java.util.Locale;
import java.util.Scanner;

public class LacoCondicionalSwitchEx4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float saldo = 1000, valor = 0;
		int operacao;

		System.out.println("============ Escolha a Operação deseja de 1 a 3 ===================");
		System.out.println("1) Saldo");
		System.out.println("2) Saque");
		System.out.println("3) Depósito");
		System.out.println("###################################################################\n");

		System.out.print("Operação: ");
		operacao = sc.nextInt();

		if (operacao != 1) {
			System.out.print("Valor: R$ ");
			valor = sc.nextFloat();

		}

		switch (operacao) {

		case 1:
			System.out.println("\nOperação - Saldo\n");
			System.out.printf("Saldo: R$ %.2f", saldo);
			break;

		case 2:
			if (valor > saldo) {
				System.out.println("\nOperação - Saque\n");
				System.out.println("Saldo Insuficiente!");
				break;
			}
			if (valor <= saldo) {
				float saque = saldo - valor;
				System.out.println("\nOperação - Saque\n");
				System.out.printf("Novo Saldo: R$ %.2f", saque);

				break;
			}

		case 3:
			if (valor > saldo) {
				float deposito = valor;
				System.out.println("\nOperação - Depósito\n");
				System.out.printf("Novo Saldo: R$ %.2f", deposito + saldo);
				break;
			}

		default:
			System.out.println("\nOperação Inválida!\n");

		}
		sc.close();
	}
}

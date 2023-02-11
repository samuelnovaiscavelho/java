package lacoscondicionaisEx;

import java.util.Scanner;

public class LacoCondicionalIfEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String animal1, animal2, animal3;

		System.out.println("Digite o 1º animal");
		sc.skip("\\R?");
		animal1 = sc.nextLine();

		System.out.println("Digite o 2º animal");
		sc.skip("\\R?");
		animal2 = sc.nextLine();

		System.out.println("Digite o 3º animal");
		sc.skip("\\R?");
		animal3 = sc.nextLine();

		if (animal1.equals("vertebrado")) {
			if (animal2.equals("ave")) {
				if (animal3.equals("carnivoro"))
					System.out.println("águia");
				else
					System.out.println("pomba");
			} else {
				if (animal3.equals("onivoro"))
					System.out.println("homem");
				else
					System.out.println("vaca");
			}
		} else {
			if (animal2.equals("inseto")) {
				if (animal3.equals("hematofago"))
					System.out.println("pulga");
				else
					System.out.println("lagarta");
			} else {
				if (animal3.equals("hematofago"))
					System.out.println("sanguessuga");
				else
					System.out.println("minhoca");
			}
		}

		sc.close();
	}

}

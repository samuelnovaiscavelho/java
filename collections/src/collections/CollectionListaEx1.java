package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CollectionListaEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> cores = new ArrayList<>();

		System.out.println("Informe 5 cores: ");
		for (int i = 0; i < 5; i++) {
			String cor = sc.nextLine();
			cores.add(cor);
		}

		System.out.println("\nListar todas as cores: \n");
		cores.forEach(System.out::println);

		System.out.println();
		System.out.println("Ordenar as cores: \n");
		Comparator<String> compare = String::compareTo;
		cores.sort(compare);

		cores.forEach(System.out::println);

	}

}

package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EstruturaDadosFilaEx1 {

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
        Comparator<String> comp = String::compareTo;
        cores.sort(comp);

        cores.forEach(System.out::println);
    }
}
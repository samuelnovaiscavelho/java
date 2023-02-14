package aula_04;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		int vetorInteiros[] = {1,2,3,4,5};
		var x = 2.0;
		
		Scanner sc = new Scanner (System.in);
		float[] vetorFloat = new float[5];
		
		for(int contador=0; contador < vetorInteiros.length; contador++)
			System.out.println("Posição "+ contador + " = " + vetorInteiros[contador]);
		
		for(int indice = 0; indice < vetorFloat.length; indice ++) {
			System.out.println("Digite um valor para a posição [" + indice + "]");
			vetorFloat[indice] = sc.nextFloat();
		}
		Arrays.sort(vetorFloat); //Em ordem crescente;
		
		for(var numero : vetorFloat)//for it
			System.out.println(numero);
			
		sc.close();
	}

}

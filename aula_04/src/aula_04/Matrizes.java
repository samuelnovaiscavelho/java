package aula_04;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int matrizInteiros[][] = {{10, 15, 35}, {70, 120, 140}, {50, 100, 150}};
		float[][] matriz = new float[2][2];
		
		// Ler as linhas
		for(int indiceL = 0; indiceL < matrizInteiros.length; indiceL ++) {
			
			// ler as colunas
			for(int indiceC = 0; indiceC < matrizInteiros.length; indiceC ++) {
				
				System.out.println(matrizInteiros[indiceL][indiceC]);
				
			}
		for(int indiceI = 0; indiceI < matriz.length; indiceI ++) {
			for(int indiceJ = 0; indiceJ < matriz.length; indiceJ ++) {
				System.out.println("Digite um valor Real: ");
				matriz[indiceI][indiceJ] = sc.nextFloat();
					
			}
		}
		
		for(float[] vetor : matriz) {
			for(var elemento : vetor) {
				System.out.println(elemento);
			}
		}	
			sc.close();
		}

	}

}

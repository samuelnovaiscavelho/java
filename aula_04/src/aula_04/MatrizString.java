package aula_04;

import java.util.Scanner;

public class MatrizString {

	public static void main(String[] args) {
		    int[][] matrizNomes = new int[2][3];
		    Scanner leia = new Scanner(System.in);
		        
	        for (int linha = 0; linha < matrizNomes[linha].length; linha++) {
	            for (int coluna = 0; coluna < 3; coluna++) {
	                System.out.println(
	                    "Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
	                matrizNomes[linha][coluna] = leia.next();
	            }
	        }
	        for (int linha = 0; linha < matrizNomes.length; linha++) {
	            for (int coluna = 0; coluna < 3; coluna++) {
	                System.out.println(
	                    "O valor armazenado na posição [" + linha + "][" + coluna + "] é: "
	                        + matrizNomes[linha][coluna]);
            }
	       leia.close();     
        }
    }
}



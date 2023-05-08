package logica.exercicios09;

import java.util.Random;

public class Exercicio09 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][4];
		Random ale = new Random();
		
		for(int l = 0; l <= matriz.length-1; l++) {
			for(int c = 0; c <= matriz[1].length-1; c++) {
				matriz[l][c] = ale.nextInt(1,11);
			}
		}
		for(int[] linha: matriz) {
			for(int elemento: linha) {
				System.out.print("[" + elemento + "]");				
			}
			System.out.println();
		}
	}

}

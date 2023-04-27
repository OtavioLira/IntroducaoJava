package logica.exercicios08;

import java.util.Random;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Random ale = new Random();
		
		int[] numeros = new int[100]; 
		
		// Gerar lista com numeros aleatorios
		for(int i = 0; i < 101; i++) {
			numeros[i] = ale.nextInt(0,101);	
			//System.out.println("Pos:" + i + "\nNumero:" + numeros[i]);
			System.out.print(numeros[i] + ", ");
		}

	}

}

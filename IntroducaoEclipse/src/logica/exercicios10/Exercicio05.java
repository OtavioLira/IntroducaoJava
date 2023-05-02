package logica.exercicios10;

import java.util.Scanner;

public class Exercicio05 {
	
	static void conversao(int valor, String tipo) {
		float c=0,f=0,k=0;
		
		switch(tipo) {
			case "c":
				c = valor;
				f = (c * 9 / 5) + 32;
				k = c + 273;
				break;
			case "f":
				f = valor;
				c = (f - 32) * 5 / 9;
				k = (f - 32) * 5 / 9 + 237;
				break;
			case "k":
				k = valor;
				f = k - 237;
				c = (k - 237) * 9 / 5 + 32;
				break;
		}
		System.out.printf("Temperatura em 3 escalas"
				+ "Celsius: %.1f"
				+ "Fahrenheint: %.1f"
				+ "Kelvin: %.1f", c, f, k);
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o numero: ");
		int num = entrada.nextInt();

		System.out.print("Temperatura (C)elsius,(F)fahrenheint,(K)elvin: ");
		String t = entrada.nextLine().toLowerCase();
	}

}

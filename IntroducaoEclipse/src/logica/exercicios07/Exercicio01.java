package logica.exercicios07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String sair;
		do {
			System.out.println("Olá Mundo");
			System.out.println("Desaja Sair? [s]/[n] ");
			sair = entrada.nextLine();
		} while(!sair.equals("sair".toLowerCase()) && !sair.equals("s".toLowerCase()));
		
		System.out.println("Programa encerrado");
		entrada.close();
	}

}

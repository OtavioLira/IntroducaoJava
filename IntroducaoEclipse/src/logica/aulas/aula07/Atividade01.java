package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, soma = 0;
		
		System.out.println("Digite um numero: ");
		num = entrada.nextInt();
		soma += num;
		
		System.out.println("Digite um numero: ");
		num = entrada.nextInt();
		soma += num;
		
		System.out.println("Digite um numero: ");
		num = entrada.nextInt();
		soma += num;
		
		System.out.println("A soma � " + soma);
		
		entrada.close();
	}

}

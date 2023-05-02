package logica.exercicios10;

import java.util.Scanner;

public class Exercicio03 {

	static void votacao(int idade) {
		if(idade >= 18 && idade <= 70) {
			System.out.println("A votação é obrigatoria");
		} else if (idade >= 16 || idade > 70) {
			System.out.println("A votação é opcional");
		}else {
			System.out.println("A votação é proibida");
		}
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		votacao(entrada.nextInt());
		
		entrada.close();
	}

}

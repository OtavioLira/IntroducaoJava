package logica.aula07;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos");
		int qtdProdutos = entrada.nextInt();
		
		for(int i = 1; i <= qtdProdutos; i++) {
			System.out.println("Produto " + i);
		}

		entrada.close();
	}

}

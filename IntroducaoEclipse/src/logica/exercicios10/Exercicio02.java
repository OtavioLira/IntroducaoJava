package logica.exercicios10;

import java.util.Scanner;

public class Exercicio02 {

	static void calcularArea(float largura, float comprimento) {
		System.out.printf("A area do terreno é %.1f",largura*comprimento);
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a largura: ");
		float largura = entrada.nextFloat();
		
		System.out.print("Digite o comprimento: ");
		float comprimento = entrada.nextFloat();
		
		calcularArea(largura, comprimento);
		
		entrada.close();
	}

}

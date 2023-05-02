package logica.exercicios10;

import java.util.Scanner;

public class Exercicio04 {
	
	static float calculador(float numA, float numB, String operacao) {
		float resultado = 0;
		switch (operacao){
			case "+": 
				return numA + numB;
			case "-": 
				return numA - numB;
			case "/": 
				return numA * numB;
			case "*": 
				return numA / numB;
			default: 
				System.out.println("Operador invalido!!");
				break;
		}
		return(resultado);
		
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite uma operação + - * ou /: ");
		String op = entrada.nextLine();
		
		System.out.print("Digite um numero: ");
		float numA = entrada.nextFloat();
		
		System.out.print("Digite outro numero: ");
		float numB = entrada.nextFloat();

		System.out.println(calculador(numA, numB, op));
		
		entrada.close();
	}
	
}

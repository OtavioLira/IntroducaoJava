package logica.aulas;

import java.util.Scanner;

public class MaisUmPrograma {
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		System.out.println("========================================================");
		System.out.println("Bem vindo ao sistema " + nome);
		System.out.println("Suas informações\n idade: " + idade);
		System.out.println(" Cargo: CTO");
		System.out.println(" Salario: R$10.000");
		System.out.println("========================================================");
	}
}

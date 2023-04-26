package logica.exercicios08;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Calendar calendario = Calendar.getInstance();
		int hora = calendario.get(Calendar.HOUR_OF_DAY);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome ");
		String nome = entrada.nextLine();
		
		
		System.out.println(hora);
		if (hora >= 6) {
			System.out.println("Bom dia " + nome);
		} else if (hora >= 12) {
			System.out.println("Boa tarde" + nome);
		} else if (hora >= 18) { 
			System.out.println("Boa noite " + nome);
		} else {
			System.out.println("Erro " + hora);
		}
		
		entrada.close();

	}

}

package logica.exercicios08;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		//Entrada do usuario
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um frase");
		String frase = entrada.nextLine();
		
		// Declaração de Variaveis
		int tamanhoFrase = frase.length();
		int qtdM = 0, qtdMin = 0, qtdNumericos = 0, qtdEspaco = 0;
		String numeros = "1234567890";
		
		//Verificar cada caracter da frase
		for(int i = 0; i < tamanhoFrase; i++) {
			for(int j = 0; j < numeros.length(); j++) {
				if(frase.charAt(i) == numeros.charAt(j)) {
					qtdNumericos += 1;
					qtdM -=1;
					qtdMin -=1;
				}
			}
			if(frase.charAt(i) == frase.toUpperCase().charAt(i)) {
				qtdM += 1;
			}
			if (frase.charAt(i) == frase.toLowerCase().charAt(i)) {
				qtdMin += 1;
			}
			if(frase.charAt(i) == ' ') { // Não coloque aspas dupla, pois ele reconhecera como uma String
				qtdEspaco += 1;
			}
		
		}
		
		System.out.printf("=-=-=-=-=Resultado Final=-=-=-=-="
				+ "\nQuantidade de maiúsculos: %d"
				+ "\nQuantidade de minúsculos: %d"
				+ "\nQuantidade de numéricos: %d"
				+ "\nQuantidade de espaços: %d", qtdM, qtdMin, qtdNumericos, qtdEspaco);
		
		entrada.close();
		
		
	}

}

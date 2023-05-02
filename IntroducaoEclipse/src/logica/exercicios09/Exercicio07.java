package logica.exercicios09;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String[] nomes = new String[3];
		//preencher vetor
		for(int i = 0; i <= nomes.length - 1; i++){
			System.out.printf("\nDigite o %d° nome: ", i+1);
			nomes[i] = entrada.nextLine();
			if(nomes[i] == "") {
				break;
			}
			String nomeInvertido = "";
			//inverter elemento do vetor
			for(int c = nomes[i].length()-1; c >= 0; c--) {
				nomeInvertido += String.valueOf(nomes[i].charAt(c));
			}
			nomes[i] = nomeInvertido;//substituir valor antigo
		}
		//imprimir vetor
		System.out.println("=-=-=-=-=-Nomes invertidos-=-=-=-=-=");
		for(String nome: nomes) {
			if(nome != null) {
				System.out.println(nome);				
			}
		}
		
		entrada.close();
	}

}

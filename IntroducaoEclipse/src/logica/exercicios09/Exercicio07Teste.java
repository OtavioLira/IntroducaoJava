package logica.exercicios09;

import java.util.Scanner;

public class Exercicio07Teste {

	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		String[] nomes = new String[1];
		String n = "";
		do {
			n = entrada.nextLine();	
			for(int i = nomes.length-1; i <= nomes.length - 1; i++){
				nomes[i] = n;		
			}
			//Fazer backup
			String[] save = new String[nomes.length+1];

			for(int i = nomes.length-1; i <= nomes.length - 1; i++){
				save[i] = nomes[i];			
			}
			nomes = save;

			System.out.println("Conteudo do array nomes");
			//imprimir o array nomes
			for(String nome: nomes){
				if(nome != null){
					System.out.println(nome);
				}			
			}
			System.out.println("Conteudo do array temp");
			//imprimir o array save
			for(String nome: save){
				if(nome != null){				
					System.out.println(nome);			
				}		
			}
		} while (n != "");

		entrada.close();
	}

}
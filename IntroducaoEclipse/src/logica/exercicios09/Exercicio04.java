package logica.exercicios09;

import java.util.Scanner;

public class Exercicio04 {
	public static void main (String args[]){
		Scanner entrada = new Scanner(System.in);		
		
		System.out.println("Digite a quantidade alunos: ");
		int qtdAlunos = entrada.nextInt();
		
		float[] notas = new float[qtdAlunos];
		float media = 0;
		
		for(int i = 0;i <= notas.length - 1; i++){
			System.out.printf("Digite a nota do aluno %d°: ", i+1);
			notas[i] = entrada.nextFloat();
			
			media += notas[i];
		}
		media = media / qtdAlunos;
		
		//Verificar notas iguais,acima e abaixo da media
		int nAcima = 0, nMedia = 0, nAbaixo = 0;		
		for(int i = 0; i <= notas.length - 1; i++){
			if(notas[i] > media){
				nAcima +=1;			
			} else if (notas[i] == media){
				nMedia +=1;			
			} else {
				nAbaixo +=1;			
			}
		}		
		
		System.out.printf("Resultado das notas"
		+ "\nMedia: %.1f"
		+ "\nquantidade acima da media: %d"
		+ "\nquantidade na media: %d"
		+ "\nquantidade abaixo da media: %d", media, nAcima, nMedia, nAbaixo);
		
		System.out.println();
		entrada.close();
		
	}
}
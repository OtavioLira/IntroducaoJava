package logica.exercicios07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a media da turma: ");
		double media = entrada.nextDouble();
		
		double nota;
		int qtdMaior = 0, qtdMenor = 0;
		
		for(int i = 0; i <= 20; i++) {
			System.out.printf("Nota do %d° aluno: ", i);
			nota = entrada.nextDouble();
			
			if(nota > media) {
				qtdMaior +=1;
			} else if (nota < media) {
				qtdMenor +=1;
			}
		}
		
		System.out.println("Quantidade de alunos com nota superior a media: " + qtdMaior);
		System.out.println("Quantidade de alunos com nota inferior a media: " + qtdMenor);
		
		
		entrada.close();

	}

}

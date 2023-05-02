package logica.exercicios09;

public class Exercicio05 {
	
	public static void main (String args[]){
		
		String[] meses = {"Janeiro", "Fevereiro", "Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
		int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 			
		
		for(int i = 0;i <= meses.length - 1; i++){
			System.out.printf("\nO Mês de %s tem %d dias ao todo", meses[i], dias[i]);		
		}
		System.out.println();
	}	
	
}
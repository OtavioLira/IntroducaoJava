package logica.exercicios07;

public class Exercicio10 {

	public static void main(String[] args) {
		
		for(int i = 2; i <= 2000;i++) {
			for(int j = 2; j <= 2000; j++) {
				if(i % j == 0) {
					break; //Se o resto da divis�o for 0 n�o � primo
				}
				
				System.out.print(i + " ");
				break;
			}
		}
		
		
	}

}

package logica.exercicios07;

public class Exercicio10 {

	public static void main(String[] args) {
		
		for(int i = 2; i <= 2000;i++) {
			for(int j = 2; j <= 2000; j++) {
				if(i % j == 0) {
					break; //Se o resto da divisão for 0 não é primo
				}
				
				System.out.print(i + " ");
				break;
			}
		}
		
		
	}

}

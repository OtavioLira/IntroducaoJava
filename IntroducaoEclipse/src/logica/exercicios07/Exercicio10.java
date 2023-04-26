package logica.exercicios07;

public class Exercicio10 {

	public static void main(String[] args) {
		
		for(int i = 2; i <= 2000; i++) {
			for(int j = 2; j <= 2000;) {
				int c = 0;
				
				if(c > 2) { //Possibilidades divido 1 ou ele mesmo, mais que isso pula
					break; 
				}
				
				if(i % j == 0) {//Se o resto da divisão for 0 não é primo
					c++;
				}
				
				System.out.print(i + " ");
				break;
			}
		}
		
		
	}

}

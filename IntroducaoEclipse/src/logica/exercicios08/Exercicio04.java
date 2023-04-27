package logica.exercicios08;

public class Exercicio04 {

	public static void main(String[] args) {
		
		double x = Math.sqrt(81);
		System.out.printf("Valor de X: %f", x);
				
		System.out.println();
		
		double y = ( (5 * x) + (2 * Math.pow(x, 2)) + Math.cbrt(8) - (Math.PI * x)) / (Math.pow(3, 4) + x);
		System.out.printf("Valor de y: %f", y);
		

	}

}

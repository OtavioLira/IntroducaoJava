package logica.aulas.aula08;

public class MathOperadores {

	public static void main(String[] args) {
		
		double PI = Math.PI;
		System.out.println("PI: "+ PI);
		
		System.out.println("Raiz quadrada: " + Math.sqrt(25));
		System.out.println("Raiz quadrada: " + Math.sqrt(-225));
		
		System.out.println("Valor absoluto: " + Math.abs(-50));
		
		double num = 3.05;
		
		System.out.println("Arredondar para cima: " + Math.ceil(num));
		System.out.println("Arredondar para baixo: " + Math.floor(num));
		System.out.println("Arredondar: " + Math.round(num));
		
		// Random
		System.out.println();
		double random = Math.random();
		System.out.println(random);
		
		double min = 5;
		double max = 25;
		
		double preparoIntervalo = random * (max - min);
		System.out.println("Preparando intervalo: " + preparoIntervalo);
		
		double intervalo = min + random * (max - min);
		System.out.println("Intervalo: " + intervalo);
		
//		double multiplica = random * 5;
//		System.out.println(Math.round(multiplica));

	}

}

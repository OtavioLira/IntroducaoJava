package logica.exercicios06;

public class Exercicio7 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		int c = 4;
		int d = 8;
		
		System.out.print((a <= b) && (b < d));
		System.out.print((a == b) || (c != b));
		System.out.println((d > a) && (c >= b));
		System.out.println((a <= b) || (c <= d));
		System.out.println(((b > c) || (c < a)) && (d <= b));
	}

}

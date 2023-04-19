package logica.exercicios05;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int numeroInt = 20;
		float numeroFloat = 13.3f;
		double numeroDouble = 0932.9;
		System.out.println("Valores como numeros"
				+ "\nNumero Inteiro: " + numeroInt
				+ "\nNumero Float: " + numeroFloat
				+ "\nNumero Double: " + numeroDouble);
		String intTexto = Integer.toString(numeroInt);
		String floatTexto = Float.toString(numeroFloat);
		String doubleTexto = Double.toString(numeroDouble);
		
		System.out.println("Valores convertidos em String"
				+ "\nNumero Inteiro: " + intTexto
				+ "\nNumero Float: " + floatTexto
				+ "\nNumero Double: " + doubleTexto);

	}

}

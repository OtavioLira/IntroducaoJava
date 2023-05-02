package logica.exercicios09;

public class Exercicio01 {

	public static void main (String args[]){
	
		int matriz[][] = new int[1][1];

		int valorRecebido = 0;

		for (int[] vetor : matriz) {
    		for (int elemento : vetor) {
    			System.out.print(valorRecebido);
        		valorRecebido = elemento;
    		}
		}
	}
}
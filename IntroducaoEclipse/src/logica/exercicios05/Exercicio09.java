package logica.exercicios05;

import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
		
		int centena = numero / 100;
		int dezena = (numero % 100) / 10;
		int unidade = numero % 10;
		
		JOptionPane.showMessageDialog(null, String.format("Centena: %d"
				+ "\nDezena: %d"
				+ "\nUnidade: %d", centena*100,dezena*10,unidade));

	}

}

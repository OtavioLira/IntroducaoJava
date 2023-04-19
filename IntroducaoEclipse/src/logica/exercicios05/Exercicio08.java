package logica.exercicios05;

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {
		float real = Float.parseFloat(JOptionPane.showInputDialog("Digite uma quantia de dinheiro: "));
		float dollar = 5.07f;
		float euro = 5.55f;
		float peso = 0.023f;
		float libra = 6.31f;
		float iene = 0.038f;
		JOptionPane.showMessageDialog(null, String.format("Real: %.2f"
				+ "\nDollar: %.2f"
				+ "\nEuro: %.2f"
				+ "\nPeso: %.2f"
				+ "\nLibra: %.2f"
				+ "\nIene: %.2f", real, real/dollar, real/euro, real/peso, real/libra, real/iene));
		

	}

}

package logica.exercicios05;

import javax.swing.JOptionPane;

public class Exercicio07 {
	
	public static void main (String args[]) {
		
		float valorProduto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto: "));
		float valorPago = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor pago: "));
		float troco = (valorProduto - valorPago) * -1;
		
		JOptionPane.showMessageDialog(null, String.format("Valor do troco: %.2f",troco));
		System.out.printf("Valor do troco: %.2f",troco);
	}

}

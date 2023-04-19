package logica.exercicios05;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		
		String peca1 = JOptionPane.showInputDialog("Digite o nome da peça1: ");
		String peca2 = JOptionPane.showInputDialog("Digite o nome da peça2: ");
		int qtdpeca1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade da peça1: "));
		int qtdpeca2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade da peça2: "));
		float valorpeca1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da peça1: "));
		float valorpeca2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da peça2: "));
		
		float total = (qtdpeca1 * valorpeca1) + (qtdpeca2 * valorpeca2);
		JOptionPane.showMessageDialog(null, String.format("O valor total a ser pago das peças %s,%s: %.2f", peca1,peca2,total));
	}

}

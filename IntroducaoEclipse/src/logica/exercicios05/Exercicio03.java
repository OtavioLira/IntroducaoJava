package logica.exercicios05;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		char genero = JOptionPane.showInputDialog("Digite seu genero "
				+ "\n[M] para masculino"
				+ "\n[f] para feminino"
				+ "\n[0] outro"
				+ "\n[n] n�o responder").charAt(0);
		
		JOptionPane.showMessageDialog(null, "Ol�, " + nome + " Voc� escolheu a seguinte op��o de g�nero: " + genero);
		
		
	}

}

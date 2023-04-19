package logica.exercicios05;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		char genero = JOptionPane.showInputDialog("Digite seu genero "
				+ "\n[M] para masculino"
				+ "\n[f] para feminino"
				+ "\n[0] outro"
				+ "\n[n] não responder").charAt(0);
		
		JOptionPane.showMessageDialog(null, "Olá, " + nome + " Você escolheu a seguinte opção de gênero: " + genero);
		
		
	}

}

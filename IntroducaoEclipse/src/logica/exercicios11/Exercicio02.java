package logica.exercicios11;

import javax.swing.JOptionPane;

public class Exercicio02 {
	
	public static int Votacao(int idade) {
		return idade;
	}
	
	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade","Verificar vota��o obrigatoria",-1));
		JOptionPane.showMessageDialog(null,"A �rea do terreno � " + Votacao(idade), "Calcular Area", -1);;
		
	}
	
}

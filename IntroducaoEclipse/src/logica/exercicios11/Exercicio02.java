package logica.exercicios11;

import javax.swing.JOptionPane;

public class Exercicio02 {
	
	public static int Votacao(int idade) {
		return idade;
	}
	
	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade","Verificar votação obrigatoria",-1));
		JOptionPane.showMessageDialog(null,"A área do terreno é " + Votacao(idade), "Calcular Area", -1);;
		
	}
	
}

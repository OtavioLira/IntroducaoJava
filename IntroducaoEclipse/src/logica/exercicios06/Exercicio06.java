package logica.exercicios06;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite seu ano de nascimento","Requerimento para Votar",-1));
		int idade = 2023 - ano;
		
		if (idade < 16 || idade >= 70) {
			JOptionPane.showMessageDialog(null, "O voto é proibido este ano.","Requerimento para Votar",-1);
		} else if (idade >= 16 && idade < 18) {
			JOptionPane.showMessageDialog(null, "O voto é opcional este ano.","Requerimento para Votar",-1);
		} else if (idade >= 18 && idade < 70) {
			JOptionPane.showMessageDialog(null, "O voto é obrigatorio este ano.","Requerimento para Votar",-1);
		}
	}

}

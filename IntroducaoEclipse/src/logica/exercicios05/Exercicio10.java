package logica.exercicios05;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
		int anos = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade (anos): "));
		int meses = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade (meses): "));
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade (dias): "));
		
		int diasVividos = (anos * 365) + (meses * 30) + dias;
		
		JOptionPane.showMessageDialog(null, String.format("Total de dias vividos: %d", diasVividos));
		
	}

}

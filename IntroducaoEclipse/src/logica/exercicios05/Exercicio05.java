package logica.exercicios05;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {

		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
		
		float media = (nota1 * 4) + (nota2 * 6) / 10;
		
		JOptionPane.showMessageDialog(null, String.format("Primeira Nota: %.1f "
				+ "\nSegunda Nota: %.1f"
				+ "\nMedia: %.1f", nota1,nota2,media));

	}

}

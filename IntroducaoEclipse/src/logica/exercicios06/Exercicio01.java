package logica.exercicios06;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero: ", "Impar ou Par?", -1));
		
		if (numero % 2 == 1) {
			JOptionPane.showMessageDialog(null, String.format("O numero %d é impar", numero), "Impar ou Par?", -1);
		} else {
			JOptionPane.showMessageDialog(null, String.format("O numero %d é par", numero), "Impar ou Par?", -1);
		}
		
	}

}

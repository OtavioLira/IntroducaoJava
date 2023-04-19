package logica.exercicios06;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
	
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero: ","Múltiplos", -1));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro numero: ","Múltiplos", -1));
		
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			JOptionPane.showMessageDialog(null, String.format("%d e %d São Múltiplos", num1, num2),"Múltiplos",-1);
		} else {
			JOptionPane.showMessageDialog(null, String.format("%d e %d Não São Múltiplos", num1, num2),"Múltiplos",-1);
		}

	}

}

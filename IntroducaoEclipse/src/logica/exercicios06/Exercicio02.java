package logica.exercicios06;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		
		float num1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um numero: ","Maior, Menor ou Igual", -1));
		float num2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite outro numero: ","Maior, Menor ou Igual", -1));
		
		if(num1 > num2) {
			JOptionPane.showMessageDialog(null, String.format("O numero %.1f é maior que %.1f", num1, num2),"Maior, Menor ou Igual", -1);
		} else if(num1 < num2){
			JOptionPane.showMessageDialog(null, String.format("O numero %.1f é menor que %.1f", num1, num2),"Maior, Menor ou Igual", -1);
		} else {
			JOptionPane.showMessageDialog(null, String.format("O numero %.1f é igual a %.1f", num1, num2),"Maior, Menor ou Igual", -1);
		}

	}

}

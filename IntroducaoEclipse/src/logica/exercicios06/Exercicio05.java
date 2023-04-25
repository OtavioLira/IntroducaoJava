package logica.exercicios06;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero: ","Calculadora", -1));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro numero: ","Calculadora", -1));
		String operacao = JOptionPane.showInputDialog(null,"Digite a operacao\n + (Somar),  - (Subtrair),  * (Multiplicar),  / (dividir) ","Calculadora", -1);
		
		switch (operacao) {
			case "+": 
				JOptionPane.showMessageDialog(null, String.format("Resultado da soma: %d", num1 + num2),"Calculadora",-1); 
				break;
			case "-": 
				JOptionPane.showMessageDialog(null, String.format("Resultado da soma: %d", num1 - num2),"Calculadora",-1);
				break;
			case "*": 
				JOptionPane.showMessageDialog(null, String.format("Resultado da soma: %d", num1 * num2),"Calculadora",-1);
				break;
			case "/": 
				JOptionPane.showMessageDialog(null, String.format("Resultado da soma: %d", num1 / num2),"Calculadora",-1);
				break;
			default: 
				JOptionPane.showMessageDialog(null,"Valor invalido","Calculadora",0);
				break;
		
		}
	}

}

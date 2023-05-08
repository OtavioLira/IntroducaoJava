package logica.exercicios10;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio05 {
	
	static void conversao(int valor, char tipo) {
		float c=0,f=0,k=0;
		
		switch(tipo) {
			case 'c':
				c = valor;
				f = (c * 9 / 5) + 32;
				k = c + 273;
				break;
			case 'f':
				f = valor;
				c = (f - 32) * 5 / 9;
				k = (f - 32) * 5 / 9 + 237;
				break;
			case 'k':
				k = valor;
				f = k - 237;
				c = (k - 237) * 9 / 5 + 32;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida", "Conversão de Temperatura", JOptionPane.ERROR_MESSAGE);
		}
		System.out.printf("Temperatura em 3 escalas"
				+ "\nCelsius: %.1f"
				+ "\nFahrenheint: %.1f"
				+ "\nKelvin: %.1f", c, f, k);
	}
	
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero: ", "Conversão de Temperatura", -1));
		char temp = JOptionPane.showInputDialog(null, "Temperatura \n(C)elsius \n(F)fahrenheint \n(K)elvin", "Conversão de Temperatura", -1).toLowerCase().charAt(0);
		
		conversao(num, temp);
	}

}

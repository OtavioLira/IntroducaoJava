package logica.exercicios11;

import javax.swing.JOptionPane;

public class Exercicio01 {
	
	public static float calcularArea(float base, float altura) {
		return base * altura;
	}
	
	public static void main(String[] args) {
		float largura = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a largura","Calcular Area",-1));
		float comprimento = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o comprimento","Calcular Area",-1));
		JOptionPane.showMessageDialog(null,"A área do retângulo é " + calcularArea(largura,comprimento), "Calcular Area", -1);;
		
	}
	
}

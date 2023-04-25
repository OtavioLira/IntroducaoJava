package logica.exercicios06;

import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {
		
		float valorA = Float.parseFloat(JOptionPane.showInputDialog(null, "Lado A: ","Tipo de triângulo",-1));
		float valorB = Float.parseFloat(JOptionPane.showInputDialog(null, "Lado B: ","Tipo de triângulo",-1));
		float valorC = Float.parseFloat(JOptionPane.showInputDialog(null, "Lado A: ","Tipo de triângulo",-1));
		
		if(valorA >= valorB + valorC) {
			JOptionPane.showMessageDialog(null, "Não apresenta triângulo", "Tipo de triângulo",2);
		} else {
			if(valorA*valorA == valorB*valorB + valorC*valorC) { //math.pow(valor,pontecia)
				JOptionPane.showMessageDialog(null, "TRIANGULO RETANGULO", "Tipo de triângulo",-1);
			}
			if(valorA*valorA > valorB*valorB + valorC*valorC) {
				JOptionPane.showMessageDialog(null, "TRIANGULO OBTUSANGULO", "Tipo de triângulo",-1);
			}
			if(valorA*valorA < valorB*valorB + valorC*valorC) {
				JOptionPane.showMessageDialog(null, "TRIANGULO ACUTANGULO", "Tipo de triângulo",-1);
			}
			if(valorA == valorB && valorA == valorC) {
				JOptionPane.showMessageDialog(null, "TRIANGULO EQUILATERO;", "Tipo de triângulo",-1);
			}
			if(valorA == valorB || valorA == valorC || valorB == valorC) {
				JOptionPane.showMessageDialog(null, "TRIANGULO ISOSCELES;;", "Tipo de triângulo",-1);
			}
		}
		
	}

}

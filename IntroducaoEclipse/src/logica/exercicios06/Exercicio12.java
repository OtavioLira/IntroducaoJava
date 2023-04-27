package logica.exercicios06;

import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {
		
		float valorA = Float.parseFloat(JOptionPane.showInputDialog(null, "Lado A: ","Tipo de triângulo",-1));
		float valorB = Float.parseFloat(JOptionPane.showInputDialog(null, "Lado B: ","Tipo de triângulo",-1));
		float valorC = Float.parseFloat(JOptionPane.showInputDialog(null, "Lado A: ","Tipo de triângulo",-1));
		
		//lado maior; trocar de posição
		if(valorA < valorB) { 
			float aux = valorA;
			valorA = valorB;
			valorB = aux;
		} 
		if (valorA < valorC) {
			float aux = valorA;
			valorA = valorC;
			valorC = aux;
		} 
		if(valorB < valorC) {
			float aux = valorB;
			valorB = valorC;
			valorC = aux;
		}
		//Descobrir tipo do triângulo
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
			if(valorA == valorB && valorB == valorC) {
				JOptionPane.showMessageDialog(null, "TRIANGULO EQUILATERO;", "Tipo de triângulo",-1);
			}
			if((valorA == valorB && valorC != valorA) || (valorB == valorC && valorB != valorA)) {
				JOptionPane.showMessageDialog(null, "TRIANGULO ISOSCELES;;", "Tipo de triângulo",-1);
			}
		}
		
	}

}

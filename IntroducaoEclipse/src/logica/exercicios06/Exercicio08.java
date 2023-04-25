package logica.exercicios06;

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {
		
		float distancia = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a distancia percorrida","Consumo do Combustivel",3));
		float combustivel = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o total de combustivel gasto","Consumo do Combustivel",3));
		
		float kmLitro = distancia / combustivel;
		
		if(kmLitro < 8) {
			JOptionPane.showMessageDialog(null,"“Esse carro bebe hein!”","Consumo do Combustivel",2);			
		} else {
			JOptionPane.showMessageDialog(null,"Autonomia legal","Consumo do Combustivel",4);
		}
		
	
	}

}

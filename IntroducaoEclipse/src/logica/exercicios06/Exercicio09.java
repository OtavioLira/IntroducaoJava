package logica.exercicios06;

import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {
		
		int residencia = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a residencia \n1.Residencia\n2.Comercio\n3.Industria","Conta de luz",3));
		float gasto = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o total de kW gasto","Conta de Luz",3));
		
		switch (residencia) {
		case 1:  //Residencia
			JOptionPane.showMessageDialog(null, String.format("Valor total: %.2f", gasto * 0.60), "Conta de luz",-1);
			break;
		case 2:  //Comercio
			JOptionPane.showMessageDialog(null, String.format("Valor total: %.2f", gasto * 0.48), "Conta de luz",-1);
			break;
		case 3:  //Empresa
			JOptionPane.showMessageDialog(null, String.format("Valor total: %.2f", gasto * 1.29), "Conta de luz",-1);
	}
		
		
	
	}

}

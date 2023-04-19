package logica.exercicios05;

import javax.swing.JOptionPane;

public class Exercicios11 {

	public static void main(String[] args) {
		
		int anos = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade (anos): "));
		int meses = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade (meses): "));
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade (dias): "));
		
		anos = anos / 365;
		anos %= 365;
		meses = meses / 30;
		meses %= meses;
		
		JOptionPane.showMessageDialog(null, String.format("Total de dias vividos: %d"
				+ "\nMeses: %d"
				+ "\nAnos: %d", dias, meses, anos));
		
	
	
	
	}

}

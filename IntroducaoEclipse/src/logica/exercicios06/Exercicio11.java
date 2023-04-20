package logica.exercicios06;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {

		int estado = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o codigo de estado (1 a 5)","Caminhões"));
		double carga = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a quantidade de toneladas", "Caminhões"));
		int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo da carga (10 a 40)", "Caminhões"));
		
		double cargaK = carga * 1000;
		JOptionPane.showMessageDialog(null, String.format("Peso da carga em quilos: %.2f", cargaK));

		//Calcular o preco da carga por kilos
		double precoCarga, imposto = 0;
		
		if(codigo >= 10 || codigo <= 20) {
			precoCarga = cargaK * 100;
		} else if (codigo >= 21 || codigo <= 30) {
			precoCarga = cargaK * 250;
		} else {
			precoCarga = cargaK * 340;
		}
		JOptionPane.showMessageDialog(null, String.format("Preço da carga pelo codigo de carga: %.2f", precoCarga));
		
		//R̶O̶U̶B̶O̶  Imposto
		//Aplicando o valor da carga com o imposto por estado
		
		switch (estado) {
			case 1:
				imposto = precoCarga * 0.35;
				JOptionPane.showMessageDialog(null, String.format("Preco da carga com imposto %.2f\n",imposto));
				break;
			case 2:
				imposto = precoCarga * 0.25;
				JOptionPane.showMessageDialog(null, String.format("Preco da carga com imposto %.2f\n",imposto));
				break;
			case 3:
				imposto = precoCarga * 0.15;
				JOptionPane.showMessageDialog(null, String.format("Preco da carga com imposto %.2f\n",imposto));
				break;
			case 4:
				imposto = precoCarga * 0.05;
				JOptionPane.showMessageDialog(null, String.format("Preco da carga com imposto %.2f\n",imposto));
			case 5:
				imposto = precoCarga * 0;
				JOptionPane.showMessageDialog(null, String.format("Preco da carga com imposto %.2f\n",imposto));
			default:
				System.out.println("Digito invalido");
		}
		
		double total = precoCarga + imposto;
		JOptionPane.showMessageDialog(null, String.format("Total %.2f",total),"Caminhões",-1);
	}

}

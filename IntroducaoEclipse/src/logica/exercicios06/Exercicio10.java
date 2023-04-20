package logica.exercicios06;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {

		double salario = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o salario do colaborador: ","Reajuste", 1));
		double percentual,novoSalario,aumento;
		
		if (salario <= 280) {
			percentual = 0.20;
			novoSalario = salario + salario * percentual;
			aumento = novoSalario - salario;
			JOptionPane.showMessageDialog(null, String.format("Reajuste"
					+ "\nSalario: %.2f"
					+ "\nPercentual: %.2f"
					+ "\nAumento: %.2f"
					+ "\nNovo Salario: %.2f", salario, percentual, aumento, novoSalario),"Reajuste",1);
		} else if (salario <= 700) {
			percentual = 0.15;
			novoSalario = salario + salario * percentual;
			aumento = novoSalario - salario;
			JOptionPane.showMessageDialog(null, String.format("Reajuste"
					+ "\nSalario: %.2f"
					+ "\nPercentual: %.2f"
					+ "\nAumento: %.2f"
					+ "\nNovo Salario: %.2f", salario, percentual, aumento, novoSalario),"Reajuste",1);
		} else if (salario <= 1500) {
			percentual = 0.10;
			novoSalario = salario + salario * percentual;
			aumento = novoSalario - salario;
			JOptionPane.showMessageDialog(null, String.format("Reajuste"
					+ "\nSalario: %.2f"
					+ "\nPercentual: %.2f"
					+ "\nAumento: %.2f"
					+ "\nNovo Salario: %.2f", salario, percentual, aumento, novoSalario),"Reajuste",1);
		} else {
			percentual = 0.05;
			novoSalario = salario + salario * percentual;
			aumento = novoSalario - salario;
			JOptionPane.showMessageDialog(null, String.format("Reajuste"
					+ "\nSalario: %.2f"
					+ "\nPercentual: %.2f"
					+ "\nAumento: %.2f"
					+ "\nNovo Salario: %.2f", salario, percentual, aumento, novoSalario),"Reajuste",1);
		}


	}

}

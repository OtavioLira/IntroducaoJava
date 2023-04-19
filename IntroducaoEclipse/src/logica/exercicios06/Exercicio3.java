package logica.exercicios06;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		float nota = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a primeira nota: ","Notas",-1));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a primeira nota: ","Notas",-1));
		float nota3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a primeira nota: ","Notas",-1));
		float nota4 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a primeira nota: ","Notas",-1));

		float media = (nota + nota2 + nota3 + nota4) / 4;
		
		if(media >= 7) {
			JOptionPane.showMessageDialog(null, String.format("%.1f - Aprovado", media),"Notas",-1);
		} else if(media > 4 && media < 7) {
			JOptionPane.showMessageDialog(null, String.format("%.1f - Recuperação", media),"Notas",-1);
		} else {
			JOptionPane.showMessageDialog(null, String.format("%.1f - Reprovado", media),"Notas",-1);
		}
	}

}

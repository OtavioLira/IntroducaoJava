package logica.exercicios08;

import java.util.Calendar;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Calendar calendario = Calendar.getInstance();
		
		int dia = calendario.get(Calendar.DAY_OF_WEEK);
		// Day of week retorna valores inteiros
		// Ordem (Sunday, monday tuesday, wednesday, thursday, friday, saturday)
		// Domingo, segunda, ter�a, quarta, quinta, sexta, sabado
		switch (dia){
			case 1: System.out.printf("Hoje � Domingo" ); break;
			case 2: System.out.printf("Hoje � Segunda" ); break;
			case 3: System.out.printf("Hoje � Ter�a e ter� feira na Rua" ); break;
			case 4: System.out.printf("Hoje � Quarta" ); break;
			case 5: System.out.printf("Hoje � Quinta" ); break;
			case 6: System.out.printf("Hoje � Sexta" ); break;
			case 7: System.out.printf("Hoje � Sabado" ); break;
			default: System.out.println("Valor invalido"); break;
		}
		
		
	}

}

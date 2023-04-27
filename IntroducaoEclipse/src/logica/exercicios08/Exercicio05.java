package logica.exercicios08;

import java.util.Calendar;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Calendar calendario = Calendar.getInstance();
		
		int dia = calendario.get(Calendar.DAY_OF_WEEK);
		// Day of week retorna valores inteiros
		// Ordem (Sunday, monday tuesday, wednesday, thursday, friday, saturday)
		// Domingo, segunda, terça, quarta, quinta, sexta, sabado
		switch (dia){
			case 1: System.out.printf("Hoje é Domingo" ); break;
			case 2: System.out.printf("Hoje é Segunda" ); break;
			case 3: System.out.printf("Hoje é Terça e terá feira na Rua" ); break;
			case 4: System.out.printf("Hoje é Quarta" ); break;
			case 5: System.out.printf("Hoje é Quinta" ); break;
			case 6: System.out.printf("Hoje é Sexta" ); break;
			case 7: System.out.printf("Hoje é Sabado" ); break;
			default: System.out.println("Valor invalido"); break;
		}
		
		
	}

}

package logica.aulas.aula08;

import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		
		Date data = new Date();
		System.out.println("Data agora: " + data);
		
		Calendar calendario = Calendar.getInstance();
		
		System.out.println("Data e hora atual: " + calendario.getTime());
		
		System.out.println("Ano: " + calendario.get(Calendar.YEAR));
		System.out.println("Mês: " + calendario.get(Calendar.MONTH));
		System.out.println("Dia do mês: " + calendario.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("Dia da semana: " + calendario.get(Calendar.DAY_OF_WEEK));
		
		int hora = calendario.get(Calendar.HOUR_OF_DAY);
		int minuto = calendario.get(Calendar.MINUTE);
		
		System.out.println(); //breakline
		
		System.out.println("Hora Atual: " + hora);
		System.out.println("Minutos: " + minuto);
	}

}

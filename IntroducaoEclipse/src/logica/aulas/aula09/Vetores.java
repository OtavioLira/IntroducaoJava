package logica.aulas.aula09;

public class Vetores {

	public static void main(String[] args) {
		
		String[] listaFrutas = new String[4];
		
		listaFrutas[0] = "Kiwi";
		listaFrutas[1] = "Jabuticaba";
		listaFrutas[2] = "Maracuja doce";
		listaFrutas[3] = "Pitaia";
		
//		System.out.println("1° Fruta: " + listaFrutas[0]);
//		System.out.println("2° Fruta: " + listaFrutas[1]);
//		System.out.println("3° Fruta: " + listaFrutas[2]);
//		System.out.println("4° Fruta: " + listaFrutas[3]);
		
		System.out.println("Fruta pos 1: " + listaFrutas[1]);
		
		String[] listaFrutas2 = {"Manga", "Jaca", "Tangeria", "Pitomba"};
		
		int tamanhoLista = listaFrutas2.length;
		System.out.println(tamanhoLista);
		
		for(int i = 0; i < tamanhoLista; i++) {
			System.out.println(listaFrutas2[i]);
		}
		
		int[] numeros = {0, 5, 20, 30};
		
		//for indexado
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.printf("Pos: %d -- Valor: %d \n", i, numeros[i]);
		}

	}

}

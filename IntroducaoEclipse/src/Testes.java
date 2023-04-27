
public class Testes {

	public static void main(String[] args) {
		
		String frase = "Ot4vio";
		String numeros = "1234567890";
		
		for(int i = 0; i < frase.length(); i ++) {
			for(int j = 0; j < numeros.length(); j++) {
				System.out.println(frase.charAt(i) == numeros.charAt(j));						
			}
		}

	}

}

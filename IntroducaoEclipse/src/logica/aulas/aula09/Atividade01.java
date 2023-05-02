package logica.aulas.aula09;

public class Atividade01 {

	public static void main (String arg[]){
		
		String[] nomes = {"Ana","Bia", "Rodrigo", "Davi","John"};
		
		for(int j = 0; j < nomes.length - 1; j++){
			String str = nomes[j];
			
			for(int i = j + 1; i < nomes.length;i++){
				System.out.println(str + ", " + nomes[i]);			
			}
		}		
		
	}
	
}
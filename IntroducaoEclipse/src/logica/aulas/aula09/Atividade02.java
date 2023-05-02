package logica.aulas.aula09;

public class Atividade02 {
	public static void main (String args[]){
		int[][] matriz = new int[4][5];
		int num = 1;
		
		//num de linhas e colunas
		int linhaT = matriz.length;
		int colunaT = matriz[0].length;	
		
		//Preencher
		for(int l = 0; l < linhaT; l++){
			for(int c = 0; c < colunaT; c++){
				matriz[l][c] = num;
				num++;		
			}		
		}	
		//Exibir
		for(int l = 0; l < linhaT; l++){
			for(int c = 0; c < colunaT; c++){
				System.out.println(matriz[l][c]);			
			}
		}
		
	}
}
package logica.aula.aula11;

public class Operacoes {

	static float operacao(char op, float numA, float numB) {
		switch (op){
		case '+': 
			return numA + numB;
		case '-': 
			return numA - numB;
		case '/': 
			return numA * numB;
		case '*': 
			return numA / numB;
		default: 
			System.out.println("Operador invalido!!");
			break;
		}
		return 0;
	}

}

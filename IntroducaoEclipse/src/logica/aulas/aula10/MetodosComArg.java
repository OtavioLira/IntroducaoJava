package logica.aulas.aula10;

import java.util.Scanner;

public class MetodosComArg {
	
	static void saudacao(String usuario) {
		System.out.println("Bem vindo ao Sistema GAIA " + usuario);
	}

	static void login() {
		Scanner entrada = new Scanner(System.in);
		String usuario, senha;
		
		System.out.print("Digite seu usuario: ");
		usuario = entrada.nextLine();
		
		System.out.print("Digite sua senha: ");
		senha = entrada.nextLine();
		
		if(usuario.equals("otaviox18") && senha.equals("2020")) {
			saudacao("Otavio");
		}else {
			System.out.println("Usuario desconhecido");
		}
		entrada.close();
	}
	
	public static void main(String[] args) {
		login();
	}

}

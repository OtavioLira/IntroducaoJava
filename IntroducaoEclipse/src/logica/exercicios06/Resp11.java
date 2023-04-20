package logica.exercicios06;
import javax.swing.*;

public class Resp11 {

	public static void main(String[] args) {

		int cod_origem = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o código do estado de origem da carga? (1-5)"));
		double peso_carga = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o peso da carga em toneladas?"));
		int cod_carga = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o código da carga? (10-40)"));
		double preco_carga = 0, preco_total = 0, imposto = 0;

		
		JOptionPane.showMessageDialog(null,"Peso da carga convertido em quilos: "+(peso_carga*1000));

		//_______________________________________________________PRECO CODIGO CARGA

		if(cod_carga>=10 && cod_carga<=20) {

			preco_carga = (peso_carga*1000)*100.0;
			JOptionPane.showMessageDialog(null, "Preço da carga de acordo com o código da carga: R$"+preco_carga);

		}else if(cod_carga>=21 && cod_carga<=30) {

			preco_carga = (peso_carga*1000)*250.0;
			JOptionPane.showMessageDialog(null, "Preço da carga de acordo com o código da carga: R$"+preco_carga);

		}else if(cod_carga>=31 && cod_carga<=40){

			preco_carga = (peso_carga*1000)*340.0;
			JOptionPane.showMessageDialog(null, "Preço da carga de acordo com o código da carga: R$"+preco_carga);

		}else {

			JOptionPane.showMessageDialog(null, "Código inválido.");
		}



		//_________________________________________________________ PRECO CODIGO CARGA

		//_________________________________________________________ VALOR IMPOSTO

		switch(cod_origem) {

		case 1:

			imposto = preco_carga*0.35;
			JOptionPane.showMessageDialog(null, "Valor do imposto de acordo com\no código do estado e o código de carga: "+imposto);
			break;
		case 2:
			imposto = preco_carga*0.25;
			JOptionPane.showMessageDialog(null, "Valor do imposto de acordo com\no código do estado e o código de carga: "+imposto);
			break;
		case 3:
			imposto = preco_carga*0.15;
			JOptionPane.showMessageDialog(null, "Valor do imposto de acordo com\no código do estado e o código de carga: "+imposto);
			break;
		case 4:
			imposto = preco_carga*0.05;
			JOptionPane.showMessageDialog(null, "Valor do imposto de acordo com\no código do estado e o código de carga: "+imposto);
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Houve isenção de imposto de acordo com seu estado");
		default:
			JOptionPane.showMessageDialog(null, "Código de estado inválido");

		}

//		//________________________________________________________ VALOR IMPOSTO
//
//		//________________________________________________________ VALOR TOTAL

		preco_total = preco_carga+imposto;
		JOptionPane.showMessageDialog(null, "Valor do total da carga: R$"+preco_total);
	}


}
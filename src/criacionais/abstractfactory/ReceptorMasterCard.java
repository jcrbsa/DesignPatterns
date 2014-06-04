package abstractfactory;

import main.Receptor;

public class ReceptorMasterCard implements Receptor {

	public String recebe() {
		System.out.println("Recebendo mensagem da Mastercard.");
		String mensagem = "Mensagem da Mastercard";
		return mensagem;
	}
}

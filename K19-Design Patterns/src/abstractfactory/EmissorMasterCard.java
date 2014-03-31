package abstractfactory;

import main.Emissor;

public class EmissorMasterCard implements Emissor {
	public void envia(String mensagem) {
		 System.out.println( " Enviando a seguinte mensagem para a Mastercard : " );
		 System.out.println(mensagem);
		}

}

package abstractfactory;

import main.Emissor;
import main.Receptor;

public class TestaMasterCardComunicadorFactory {
	
	public static void main(String[] args){
		 ComunicadorFactory comunicadorFactory = new MasterCardComunicadorFactory();
		 String transacao = "Valor=560; Senha =123 " ;
		 Emissor emissor = comunicadorFactory.createEmissor();
		 emissor.envia(transacao);
		 Receptor receptor = comunicadorFactory.createReceptor();
		 String mensagem = receptor.recebe();
		 System.out.println(mensagem);
		 }

}

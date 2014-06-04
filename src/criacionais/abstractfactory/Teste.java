package abstractfactory;

import main.Emissor;
import main.Receptor;

public class Teste {
	
	
	 public static ComunicadorFactory getComunicadorFactory(Cartao cartao) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		  String bandeira = cartao.getBandeira();
		  
		  return (ComunicadorFactory) Class.forName(bandeira + "ComunicadorFactory" ).newInstance();
		 }

	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		
				//Cartao cartao = new Visa();
				Cartao cartao = new MasterCard();
				ComunicadorFactory factory = getComunicadorFactory(cartao);
				String transacao = "test";
				Emissor emissor = factory.getEmissor();
				emissor.envia(transacao);
				Receptor receptor = factory.getReceptor();
				String resposta = receptor.recebe();
				System.out.println("Resposta: " + resposta);
		
		
		
	}
}

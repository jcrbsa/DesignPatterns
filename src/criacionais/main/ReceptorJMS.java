package main;

public class ReceptorJMS implements Receptor {
	
	public String recebe() {
		 //System.out.println( "Recebendo por Email a mensagem : " );
		return "Recebendo por JMS a mensagem" ;
		 }
}

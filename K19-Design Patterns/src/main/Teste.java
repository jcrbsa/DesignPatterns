package main;

public class Teste {
	public static void main(String[] args) {
		
		Emissor emissor = new EmissorSMS();
		emissor.envia( " K19 - Treinamentos " );
		
		emissor = new EmissorEmail();
		emissor.envia( " K19 - Treinamentos " );
		
		emissor = new EmissorJMS();
		emissor.envia( " K19 - Treinamentos " );
		
		EmissorCreator creator = new EmissorAssincronoCreator();
		 emissor = creator.create(EmissorCreator.SMS);
		emissor.envia( " K19 - Treinamentos " );
		
		
		 creator = new EmissorAssincronoCreator();
		 emissor = creator.create(EmissorCreator.EMAIL);
		emissor.envia( " K19 - Treinamentos " );
		
		
		 creator = new EmissorSincronoCreator();
		 emissor = creator.create(EmissorCreator.JMS);
		emissor.envia( " K19 - Treinamentos " );
		
	}
}

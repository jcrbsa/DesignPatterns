package main;

public class ReceptorCreator {
	
	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;
	public Receptor create( int tipoDeEmissor) {
	if (tipoDeEmissor == EmissorCreator.SMS) {
	return new ReceptorSMS();
	 } else if (tipoDeEmissor == EmissorCreator.EMAIL) {
	return new ReceptorEmail();
	 } else if (tipoDeEmissor == EmissorCreator.JMS) {
	return new ReceptorJMS();
	 } else {
	throw new IllegalArgumentException( " Tipo de emissor não suportado " );
	 }
	 }
	

}

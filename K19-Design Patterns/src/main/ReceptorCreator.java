package main;

import abstractfactory.ReceptorMasterCard;
import abstractfactory.ReceptorVisa;

public class ReceptorCreator {
	
	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;
	public static final int MASTERCARD = 4;
	public static final int VISA = 5;
	public Receptor create( int tipoDeEmissor) {
	if (tipoDeEmissor == EmissorCreator.SMS) {
	return new ReceptorSMS();
	 } else if (tipoDeEmissor == EmissorCreator.EMAIL) {
	return new ReceptorEmail();
	 } else if (tipoDeEmissor == EmissorCreator.JMS) {
	return new ReceptorJMS();
	 } else if (tipoDeEmissor == EmissorCreator.MASTECARD) {
	return new ReceptorMasterCard();
	 } else if (tipoDeEmissor == EmissorCreator.VISA) {
	return new ReceptorVisa();
	 }
	 else {
	throw new IllegalArgumentException( " Tipo de emissor não suportado " );
	 }
	 }
	

}

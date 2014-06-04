package main;

import abstractfactory.EmissorMasterCard;
import abstractfactory.EmissorVisa;

public class EmissorCreator {
	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;
	public static final int MASTECARD = 4;
	public static final int VISA = 5;

	public Emissor create(int tipoDeEmissor) {
		if (tipoDeEmissor == EmissorCreator.SMS) {
			return new EmissorSMS();
		} else if (tipoDeEmissor == EmissorCreator.EMAIL) {
			return new EmissorEmail();
		} else if (tipoDeEmissor == EmissorCreator.JMS) {
			return new EmissorJMS();
		} else if (tipoDeEmissor == EmissorCreator.MASTECARD) {
			return new EmissorMasterCard();
		} else if (tipoDeEmissor == EmissorCreator.VISA) {
			return new EmissorVisa();
		} else {
			throw new IllegalArgumentException(
					" Tipo de emissor não suportado ");
		}
	}
}
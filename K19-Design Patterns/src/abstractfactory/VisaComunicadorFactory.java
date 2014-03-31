package abstractfactory;

import main.Emissor;
import main.EmissorCreator;
import main.Receptor;
import main.ReceptorCreator;

public class VisaComunicadorFactory implements ComunicadorFactory {


	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();
	
	@Override
	public Emissor createEmissor() {
		// TODO Aut\o-generated method stub
		
		return emissorCreator.create(EmissorCreator.VISA);
	}

	@Override
	public Receptor createReceptor() {
		// TODO Auto-generated method stub
		
		return receptorCreator.create(EmissorCreator.VISA) ;
	}

	@Override
	public Emissor getEmissor() {
		// TODO Auto-generated method stub
		return createEmissor();
	}

	@Override
	public Receptor getReceptor() {
		// TODO Auto-generated method stub
		return createReceptor();
	}

}

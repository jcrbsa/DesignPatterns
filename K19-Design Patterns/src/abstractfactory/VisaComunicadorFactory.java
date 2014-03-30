package abstractfactory;

import main.Emissor;
import main.EmissorCreator;
import main.Receptor;
import main.ReceptorCreator;

public class VisaComunicadorFactory implements ComunicadorFactory {

	private Emissor emissor;
	private Receptor receptor;
	@Override
	public Emissor createEmissor() {
		// TODO Aut\o-generated method stub
		emissor = new EmissorCreator().create(0);
		return emissor;
	}

	@Override
	public Receptor createReceptor() {
		// TODO Auto-generated method stub
		receptor = new ReceptorCreator().create(0);
		return receptor ;
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

package abstractfactory;

import main.Emissor;
import main.Receptor;

public interface ComunicadorFactory {
	
	Emissor createEmissor();
	 Receptor createReceptor();
	
	 
	 Emissor getEmissor();

	 Receptor getReceptor();
	 


}

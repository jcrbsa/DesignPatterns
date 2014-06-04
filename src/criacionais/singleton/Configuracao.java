package singleton;

import java.util.HashMap;
import java.util.Map;

public class Configuracao {
	private static Configuracao instance;
	private Map<String, String> propriedades = new HashMap<String, String>();

	private Configuracao() {
		// carrega as propriedades obtidas do arquivo de configuracao
		this .propriedades = new HashMap <String , String >();
		this .propriedades.put( " time - zone " , " America / Sao_Paulo " );
		this .propriedades.put( " currency - code " , " BRL " );
	}

	public static Configuracao getInstance() {
		if (Configuracao.instance == null) {
			Configuracao.instance = new Configuracao();
		}
		return Configuracao.instance;
	}

	public String getPropriedade(String nomeDaPropriedade) {
		return this.propriedades.get(nomeDaPropriedade);
	}
}
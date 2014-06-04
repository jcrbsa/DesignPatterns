/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentais.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jcrbsa
 */
public class ListaDeComandos {

    private List<Comando> comandos = new ArrayList<Comando>();

    public void adiciona(Comando comando) {
        this.comandos.add(comando);
    }

    public void executa() {
        for (Comando comando : this.comandos) {
            comando.executa();
        }
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentais.visitor;

/**
 *
 * @author jcrbsa
 */
public interface Atualizavel {

    void aceita(AtualizadorDeFuncionario atualizador);
}

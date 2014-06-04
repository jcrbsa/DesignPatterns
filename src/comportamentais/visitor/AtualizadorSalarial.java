/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentais.visitor;
import comportamentais.visitor.AtualizadorDeFuncionario;
/**
 *
 * @author jcrbsa
 */
public class AtualizadorSalarial implements AtualizadorDeFuncionario {

    public void atualiza(Gerente g) {
        g.setSalario(g.getSalario() * 1.43);
    }

    public void atualiza(Telefonista t) {
        t.setSalario(t.getSalario() * 1.27);
    }
}
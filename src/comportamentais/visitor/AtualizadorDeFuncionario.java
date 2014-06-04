/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentais.visitor;

/**
 *
 * @author jcrbsa
 */
public interface  

   AtualizadorDeFuncionario {

        void atualiza(Gerente g);

        void atualiza(Telefonista t);
    }

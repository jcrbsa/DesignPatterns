/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compartamentais.observer;

/**
 *
 * @author jcrbsa
 */
public class TestaObserver {

    public static void main(String[] args) {
        Acao acao = new Acao(" VALE3 ", 45.27);
        Corretora corretora1 = new Corretora(" Corretora1 ");
        Corretora corretora2 = new Corretora(" Corretora2 ");
        acao.registraInteressado(corretora1);
        acao.registraInteressado(corretora2);
        acao.setValor(50);
    }
}
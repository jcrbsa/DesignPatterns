/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturais.decorator;

/**
 *
 * @author bruno.andrade
 */
public abstract class EmissorDecorator implements Emissor {

    private Emissor emissor;

    public EmissorDecorator(Emissor emissor) {
        this.emissor = emissor;
    }

    public abstract void envia(String mensagem);

    public Emissor getEmissor() {
        return this.emissor;
    }
}
    
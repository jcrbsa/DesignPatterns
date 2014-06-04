/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentais.mediator;

/**
 *
 * @author jcrbsa
 */
public class Passageiro implements Runnable {

    private String nome;
    private CentralDeTaxi central;

    public Passageiro(String nome, CentralDeTaxi central) {
        this.nome = nome;
        this.central = central;
    }

    public String getNome() {
        return nome;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            this.central.pedeTaxi(this);
        }
    }
}
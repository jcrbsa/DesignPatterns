/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentais.state;

/**
 *
 * @author jcrbsa
 */
public class Bandeira2 implements Bandeira {

    public double calculaValorDaCorrida(double tempo, double distancia) {
        return 10.0 + tempo * 3.0 + distancia * 4.0;
    }
}

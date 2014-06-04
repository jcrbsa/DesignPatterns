/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentais.state;

/**
 *
 * @author jcrbsa
 */
public class Taximetro {

    private Bandeira bandeira;

    public Taximetro(Bandeira bandeira) {
        this.bandeira = bandeira;
    }

    public void setBandeira(Bandeira bandeira) {
        this.bandeira = bandeira;
    }

    public void calculaValorDaCorrida(double tempo, double distancia) {
        System.out.println(this.bandeira.calculaValorDaCorrida(tempo, distancia));
    }
}

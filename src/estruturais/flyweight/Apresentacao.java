/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jcrbsa
 */
public class Apresentacao {

    private List<Slide> slides = new ArrayList<Slide>();

    public void adicionaSlide(Slide slide) {
        slides.add(slide);
    }

    public void imprime() {
        for (Slide slide : this.slides) {
            slide.imprime();
            System.out.println();
        }
    }
}
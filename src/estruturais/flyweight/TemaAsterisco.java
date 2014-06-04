/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturais.flyweight;

import java.util.Arrays;

/**
 *
 * @author jcrbsa
 */
public class TemaAsterisco implements TemaFlyweight {

    public void imprime(String titulo, String texto) {
        System.out.println(" ********** " + titulo + " ********** ");
        System.out.println(texto);
        char[] rodape = new char[22 + titulo.length()];
        Arrays.fill(rodape, '*');
        System.out.println(rodape);
    }
}
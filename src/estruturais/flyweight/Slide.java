/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturais.flyweight;

/**
 *
 * @author jcrbsa
 */
public class Slide {

    private TemaFlyweight tema;
    private String titulo;
    private String texto;

    public Slide(TemaFlyweight tema, String titulo, String texto) {
        this.tema = tema;
        this.titulo = titulo;
        this.texto = texto;
    }

    public void imprime() {
        this.tema.imprime(titulo, texto);
    }
}

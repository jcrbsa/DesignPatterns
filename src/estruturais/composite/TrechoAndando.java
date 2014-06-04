/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturais.composite;

/**
 *
 * @author bruno.andrade
 */
public class TrechoAndando implements Trecho {

    private String direcao;
    private double distancia;

    public TrechoAndando(String direcao, double distancia) {
        this.direcao = direcao;
        this.distancia = distancia;
    }

    public void imprime() {
        System.out.println("Vá Andando: ");
        System.out.println(this.direcao);
        System.out.println("A distância percorrida será de : " + this.distancia + "metros");
    }
}

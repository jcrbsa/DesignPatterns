/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturais.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno.andrade
 */
public class Caminho implements Trecho {

    private List< Trecho> trechos;

    public Caminho() {
        this.trechos = new ArrayList< Trecho>();
    }

    public void adiciona(Trecho trecho) {
        this.trechos.add(trecho);
    }

    public void remove(Trecho trecho) {
        this.trechos.remove(trecho);
    }

    public void imprime() {
        for (Trecho trecho : this.trechos) {
            trecho.imprime();
        }
    }
}

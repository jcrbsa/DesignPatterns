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
public class EmissorBasico implements Emissor {

    public void envia(String mensagem) {
        System.out.println(" Enviando uma mensagem : ");
        System.out.println(mensagem);
    }
}

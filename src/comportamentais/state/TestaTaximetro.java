/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentais.state;

/**
 *
 * @author jcrbsa
 */
public class TestaTaximetro {

    public static void main(String[] args) {
        Bandeira b1 = new Bandeira1();
        Bandeira b2 = new Bandeira2();
        Taximetro taximetro = new Taximetro(b1);
        //double valor1 = taximetro.calculaValorDaCorrida(10, 20);
    taximetro.calculaValorDaCorrida(10, 20);
        //System.out.println(" Valor da corrida em bandeira 1: " + valor1);
        taximetro.setBandeira(b2);
        taximetro.calculaValorDaCorrida(5, 30);
        //double valor2 = taximetro.calculaValorDaCorrida(5, 30);
       //  System.out.println(" Valor da corrida em bandeira 2: " + valor2);
    }
}
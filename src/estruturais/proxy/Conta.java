/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturais.proxy;

/**
 *
 * @author jcrbsa
 */
public interface Conta {

    void deposita(double valor);

    void saca(double valor);

    double getSaldo();
}

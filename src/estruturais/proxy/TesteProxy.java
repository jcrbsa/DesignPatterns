/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturais.proxy;

import estruturais.proxy.Conta;
import estruturais.proxy.ContaPadrao;
import estruturais.proxy.ContaProxy;
/**
 *
 * @author jcrbsa
 */
public class TesteProxy {

    public static void main(String[] args) {
        Conta contaPadrao = (Conta) new ContaPadrao();
        Conta contaProxy = (Conta) new ContaProxy(contaPadrao);
        contaProxy.deposita(100);
        contaProxy.saca(59);
        System.out.println(" Saldo : " + contaProxy.getSaldo());
        System.out.println(" Saldo : " + contaPadrao.getSaldo());
    }
}
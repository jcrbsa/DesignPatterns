/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentais.templatemethod;

/**
 *
 * @author jcrbsa
 */
public class TestesConta {

    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();
        contaCorrente.deposita(100);
        contaCorrente.saca(10);
        contaPoupanca.deposita(100);
        contaPoupanca.saca(10);
        System.out.println(" Saldo da Conta Corrente : "
                + contaCorrente.getSaldo());
        System.out.println(" Saldo da Conta Poupança : "
                + contaPoupanca.getSaldo());
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturais.proxy;

/**
 *
 * @author jcrbsa
 */
public class ContaPadrao implements Conta {
private double saldo;
public void deposita( double valor) {
this .saldo += valor;
 }
public void saca( double valor) {
this .saldo -= valor;
 }
public double getSaldo() {
return this .saldo;
 }
}
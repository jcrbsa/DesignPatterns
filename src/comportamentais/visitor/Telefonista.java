/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentais.visitor;

/**
 *
 * @author jcrbsa
 */
public class Telefonista extends Funcionario {
private int ramal;
public Telefonista(String nome , double salario , int ramal) {
super (nome , salario);
this .ramal = ramal;
 }
public int getRamal() {
return ramal;
 }
public void aceita(AtualizadorDeFuncionario atualizador) {
 atualizador.atualiza( this );
 }
}
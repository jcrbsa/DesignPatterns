/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentais.visitor;

/**
 *
 * @author jcrbsa
 */
public abstract class Funcionario implements Atualizavel{

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
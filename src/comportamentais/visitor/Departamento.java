/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentais.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jcrbsa
 */
public class Departamento {

    private String nome;
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void aceita(AtualizadorDeFuncionario atualizador) {
        for (Funcionario f : this.funcionarios) {
            f.aceita(atualizador);
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturais.facade;

/**
 *
 * @author bruno.andrade
 */
public class PedidoFacade {

    private Estoque estoque;
    private Financeiro financeiro;
    private PosVenda posVenda;

    public PedidoFacade(Estoque estoque, Financeiro financeiro, PosVenda posVenda) {
        this.estoque = estoque;
        this.financeiro = financeiro;
        this.posVenda = posVenda;
    }

    public void registraPedido(Pedido p) {
        this.estoque.enviaProduto(p.getProduto(), p.getEnderecoDeEntrega());
        this.financeiro.fatura(p.getCliente(), p.getProduto());
        this.posVenda.agendaContato(p.getCliente(), p.getProduto());
    }
}
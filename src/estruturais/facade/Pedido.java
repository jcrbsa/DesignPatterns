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
public class Pedido {

    private String produto;
    private String cliente;
    private String enderecoDeEntrega;

    public Pedido(String produto, String cliente, String enderecoDeEntrega) {
        this.produto = produto;
        this.cliente = cliente;
        this.enderecoDeEntrega = enderecoDeEntrega;
    }

    public String getProduto() {
        return produto;
    }

    public String getCliente() {
        return cliente;
    }

    public String getEnderecoDeEntrega() {
        return enderecoDeEntrega;
    }
}

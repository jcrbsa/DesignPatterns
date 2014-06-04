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
public class TestePedidoFacade {
public static void main ( String [] args ) {
 Estoque estoque = new Estoque () ;
 Financeiro financeiro = new Financeiro () ;
 PosVenda posVenda = new PosVenda () ;
 PedidoFacade facade = new PedidoFacade ( estoque , financeiro , posVenda ) ;
 Pedido pedido = new Pedido ( " Notebook " , " Rafael Cosentino " ,
" Av Brigadeiro Faria Lima , 1571 , São Paulo , SP " ) ;
 facade . registraPedido ( pedido ) ;
 }
}
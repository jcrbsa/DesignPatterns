/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturais.decorator;

/**
 *
 * @author bruno.andrade
 */
public class TesteEmissorDecorator {

    public static void main(String[] args) {
        String mensagem = "Richardson Bruno da Silva Andrade ";
        Emissor emissorCript = new EmissorDecoratorComCriptografia(new EmissorBasico());
        emissorCript.envia(mensagem);
        Emissor emissorCompr = new EmissorDecoratorComCompressao(new EmissorBasico());
        emissorCompr.envia(mensagem);
        Emissor emissorCriptCompr = new EmissorDecoratorComCriptografia(new EmissorDecoratorComCompressao(new EmissorBasico()));
        emissorCriptCompr.envia(mensagem);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturais.bridge;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 * @author bruno.andrade
 */
public class GeradorDeArquivoTXT implements GeradorDeArquivo {

    public void gera(String conteudo) {
        try {
            PrintStream saida = new PrintStream("arquivo.txt ");
            saida.println(conteudo);
            saida.close();
        } catch (FileNotFoundException e) {
            e . printStackTrace () ;
        }
    }
}

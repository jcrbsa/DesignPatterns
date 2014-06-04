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
public class Recibo implements Documento {

    private String emissor;
    private String favorecido;
    private double valor;
    //Interface
    private GeradorDeArquivo geradorDeArquivo;

    public Recibo(String emissor, String favorecido, double valor) {
        this.emissor = emissor;
        this.favorecido = favorecido;
        this.valor = valor;
    }
//Construtor Bridge 
    public Recibo(String emissor, String favorecido, double valor,
            GeradorDeArquivo geradorDeArquivo) {
        this.emissor = emissor;
        this.favorecido = favorecido;
        this.valor = valor;
        this.geradorDeArquivo = geradorDeArquivo;
    }

    public void geraArquivo() {
        try {
            PrintStream saida = new PrintStream("recibo.txt");
            saida.println(" Recibo : ");
            saida.println(" Empresa : " + this.emissor);
            saida.println(" Cliente : " + this.favorecido);
            saida.println(" Valor : " + this.valor);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

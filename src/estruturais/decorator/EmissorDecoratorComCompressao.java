package estruturais.decorator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bruno.andrade
 */
public class EmissorDecoratorComCompressao extends EmissorDecorator {

    public EmissorDecoratorComCompressao(Emissor emissor) {
        super(emissor);
    }

    @Override
    public void envia(String mensagem) {
        System.out.println(" Enviando mensagem comprimida : ");
        String mensagemComprimida;
        try {
            mensagemComprimida = comprime(mensagem);
        } catch (IOException e) {
            mensagemComprimida = mensagem;
        }
        this.getEmissor().envia(mensagemComprimida);
    }

    private String comprime(String mensagem) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DeflaterOutputStream dout = new DeflaterOutputStream(out, new Deflater());

        dout.write(mensagem.getBytes());
        dout.close();
        return new String(out.toByteArray());
    }
}

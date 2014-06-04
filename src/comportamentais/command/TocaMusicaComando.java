/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentais.command;

/**
 *
 * @author jcrbsa
 */
public class TocaMusicaComando implements Comando {

    private Player player;
    private String file;

    public TocaMusicaComando(Player player, String file) {
        this.player = player;
        this.file = file;
    }

   

    @Override
    public void executa() {
      try {
            this.player.play(this.file);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }    }
}
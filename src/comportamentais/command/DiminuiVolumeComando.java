/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentais.command;

/**
 *
 * @author jcrbsa
 */
public class DiminuiVolumeComando implements Comando {

    private Player player;
    private int levels;

    public DiminuiVolumeComando(Player player, int levels) {
        this.player = player;
        this.levels = levels;
    }

    public void executa() {
        this.player.decreaseVolume(this.levels);

    }
}

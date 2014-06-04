/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentais.strategy;

import java.util.List;

/**
 *
 * @author jcrbsa
 */
public interface Sorter {

    <T extends Comparable<? super T>> List<T> sort(List<T> list);
}
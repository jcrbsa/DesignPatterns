/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jcrbsa
 */
public class TemaFlyweightFactory {

    private static Map<Class<? extends TemaFlyweight>, TemaFlyweight> temas = new HashMap<Class<? extends TemaFlyweight>, TemaFlyweight>();
    public static final Class<TemaAsterisco> ASTERISCO = TemaAsterisco.class;
    public static final Class<TemaHifen> HIFEN = TemaHifen.class;
    public static final Class<Temak19> K19 = Temak19.class;

    public static TemaFlyweight getTema(Class<? extends TemaFlyweight> clazz) {
        if (!temas.containsKey(clazz)) {
            try {
                temas.put(clazz, clazz.newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return temas.get(clazz);
    }
}
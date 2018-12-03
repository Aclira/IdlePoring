package expurgobelzebobo.flyweight;

import expurgobelzebobo.elementos.racas.Raca;
import expurgobelzebobo.flyweight.InterfaceFlyweight;
import expurgobelzebobo.personagens.Inimigo;
import java.util.HashMap;

public class FlyweightFactory {
    private static final HashMap<Raca, InterfaceFlyweight > inimigoMap = new HashMap();
    
    public static InterfaceFlyweight getInimigo(Raca raca){
        Inimigo inimigo = (Inimigo)inimigoMap.get(raca);
    
        if(inimigo == null){
            inimigo = new Inimigo(raca);
            inimigoMap.put(raca, (InterfaceFlyweight) inimigo);   
        }
        return (InterfaceFlyweight) inimigo;
    }
}
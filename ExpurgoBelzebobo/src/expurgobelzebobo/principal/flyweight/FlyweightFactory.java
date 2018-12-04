package expurgobelzebobo.principal.flyweight;

import expurgobelzebobo.elementos.racas.Raca;
import expurgobelzebobo.personagens.Inimigo;
import java.util.HashMap;

public class FlyweightFactory {
    private static final HashMap<Raca, InterfaceFlyweight > inimigoMap = new HashMap();
    
    public static InterfaceFlyweight getInimigo(Raca raca){
        Inimigo inimigo = (Inimigo)inimigoMap.get(raca);
    
        if(inimigo == null){
            inimigo = new Inimigo(raca);
            inimigoMap.put(raca, inimigo);  
            System.out.println("\nCRIANDO INIMIGO : " + raca.getNome());

        }
        return inimigo;
    }
}
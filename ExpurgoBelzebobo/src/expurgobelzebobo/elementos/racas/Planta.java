/*
1. Planta:
1. Ataques:
1. Chicote de hera: físico
2. Folha navalha: distância
2. Resistência: distância
3. Vulnerável: máfico
4. Indiferente a ataques físicos.
*/

package expurgobelzebobo.elementos.racas;

import expurgobelzebobo.elementos.Atributo;
import expurgobelzebobo.elementos.Habilidade;

public class Planta extends Raca {
   
    public Planta(){
        //Teste de como vai funcionar
        super("planta",atb.getDistancia(),atb.getFisico(),atb.getMagico());
    }
}

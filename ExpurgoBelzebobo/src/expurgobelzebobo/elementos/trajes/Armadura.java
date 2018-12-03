// Contém a definição de Armadura.
// Bônus de 30% à defesa do personagem que possui classe com o mesmo atributo.

package expurgobelzebobo.elementos.trajes;

public class Armadura extends Traje {
    
    public Armadura(boolean liberado) {        
        super("Armadura", atb.getFisico(), 0.3, liberado);
    }
}

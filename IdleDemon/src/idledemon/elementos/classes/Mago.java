// Contém a definição de Mago.
// Bônus de 30% na inteligência.
// Resistente a distância.
// Vulnerável a físico.

package idledemon.elementos.classes;

public class Mago extends Classe {
    
    public Mago() {
        super("Mago", atb.getMagico(), atb.getDistancia(), atb.getFisico(), 0.0, 0.0, 0.3);
    }
}

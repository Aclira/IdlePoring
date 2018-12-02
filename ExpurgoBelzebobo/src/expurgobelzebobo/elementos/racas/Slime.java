// Contém a definição de Slime.
// Habilidade do tipo distância.
// Resistente a físico.
// Vulnerável a mágico.

package expurgobelzebobo.elementos.racas;

public class Slime extends Raca {
    
    public Slime() {
        super("Slime", atb.getDistancia(), atb.getFisico(), atb.getMagico(), "Cuspe Ácido");
    }
}

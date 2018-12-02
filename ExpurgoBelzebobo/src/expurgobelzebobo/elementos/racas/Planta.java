// Contém da definição de Planta.
// Habilidade do tipo distância.
// Resistente a físico.
// Vulnerável a mágico.

package expurgobelzebobo.elementos.racas;

public class Planta extends Raca {
   
    public Planta(){
        super("Planta", atb.getDistancia(), atb.getFisico(), atb.getMagico(), "Chicote de Hera");
    }
}

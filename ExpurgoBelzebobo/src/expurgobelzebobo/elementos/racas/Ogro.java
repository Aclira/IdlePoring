// Contém da definição de Ogro.
// Habilidade do tipo físico.
// Resistente a mágico.
// Vulnerável a distância.

package expurgobelzebobo.elementos.racas;

public class Ogro extends Raca {
   
    public Ogro(){
        super("Ogro", atb.getFisico(), atb.getMagico(), atb.getDistancia(), "Pancada de Porrete");
    }
}

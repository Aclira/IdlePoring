// Contém da definição de Elfo.
// Habilidade do tipo mágico.
// Resistente a distância.
// Vulnerável a físico.

package expurgobelzebobo.elementos.racas;

public class Elfo extends Raca {
   
    public Elfo(){
        super("Elfo", atb.getMagico(), atb.getDistancia(), atb.getFisico(), "Feixe de Energia");
    }
}

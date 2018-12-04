// Contém da definição de Demônio.
// Resistente a distância.
// Vulnerável a mágico.

package idledemon.elementos.racas;

public class Demonio extends Raca {
    
    // Cria as habilidades da raça
    
    private void habilidades() {
        novaHabilidade("Arte Marcial", atb.getFisico());
        novaHabilidade("Navalha de Vento", atb.getDistancia());
        novaHabilidade("Ataque Demoníaco", atb.getMagico());
    }
    
    public Demonio(){
        super("Demônio", atb.getDistancia(), atb.getMagico());
        habilidades();
    }
}

// Contém da definição de Demônio.
// Resistente a geral.
// Vulnerável a nenhum.

package expurgobelzebobo.elementos.racas;

public class Demonio extends Raca {
    
    // Cria as habilidades da raça
    
    private void habilidades() {
        novaHabilidade("Arte Marcial", atb.getFisico());
        novaHabilidade("Navalha de Vento", atb.getDistancia());
        novaHabilidade("Ataque Demoníaco", atb.getMagico());
    }
    
    public Demonio(){
        super("Demônio", "geral", "geral");
        habilidades();
    }
}

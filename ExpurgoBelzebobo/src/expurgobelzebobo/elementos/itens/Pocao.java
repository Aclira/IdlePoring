// Contem a definição de Poção.
// Recupera pelo menos 5% do HP do personagem a cada utilização.

package expurgobelzebobo.elementos.itens;

public class Pocao extends Item {
    
    public Pocao(int nivel, boolean liberado) {
        super("Pocao", 0, 0, 5/100, nivel, liberado);
    }
    
}

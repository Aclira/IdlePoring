// Contem a definição de Poção.
// Recupera pelo menos 5% do HP do personagem a cada utilização.

package idledemon.elementos.itens;

public class Pocao extends Item {
    
    public Pocao(int nivel, boolean liberado) {
        super("Poção", 0.0, 0.0, 0.05, nivel, liberado);
    }
}

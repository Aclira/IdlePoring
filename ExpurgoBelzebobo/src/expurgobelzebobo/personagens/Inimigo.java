// Contém a definição de inimigo

package expurgobelzebobo.personagens;

import expurgobelzebobo.elementos.racas.Raca;

public class Inimigo extends Personagem {
    
    // Características do inimigo
    
    private final Raca raca;    // Raça do inimigo
    private final boolean boss; // Determina se o inimigo é um chefe de fase
        
    // Constutor para criação do inimigo
    
    public Inimigo(Raca raca, boolean boss, int nivel) {        
        super(nivel);
        this.boss = boss;
        this.raca = raca;
    }
    
    // Getters para leitura das características
    
    public Raca getRaca() {
        return raca;
    }

    public boolean getBoss() {
        return boss;
    }
    
}

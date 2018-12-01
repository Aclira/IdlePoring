// Contém a definição de inimigo

package expurgobelzebobo.personagens;

import expurgobelzebobo.elementos.racas.Raca;

public class Inimigo extends Personagem{
    
    // Características do inimigo
    
    private Raca raca;
    private boolean boss;

    public Inimigo(String nome, Raca raca, boolean boss) {
        super(nome);
        this.boss = boss;
        this.raca = raca;
    }

    public Raca getRaca() {
        return raca;
    }


    public boolean getBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }
    
    

    
}

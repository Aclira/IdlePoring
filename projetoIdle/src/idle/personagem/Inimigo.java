package idle.personagem;

import idle.elementos.Raca;

public class Inimigo extends Personagem {
    private Raca raca;
    private boolean boss;
    
    public Inimigo(Raca raca){
        this.raca = raca;
        this.boss = false;
    }
    
    public Inimigo(String nome, Raca raca){
        super(nome);
        this.raca = (raca);
        this.boss = false;
    }
    
    public boolean getBoss() {
        return this.boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }
    
    public Raca getRaca() {
        return this.raca;
    }
    
    public void setRaca(Raca raca) {
        this.raca = raca;
    }
}
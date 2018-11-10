package idle.personagem;

import idle.elementos.Raca;

public class Inimigo extends Monstro{
    private boolean Boss;
    
    public Inimigo(String nome, Raca raca){
        super(nome,raca);
    }
    
    public Inimigo(Raca raca){
        super(raca);
    }
    
    public boolean getBoss() {
        return Boss;
    }

    public void setBoss(boolean Boss) {
        this.Boss = Boss;
    }
}
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
    
    // Ação de batalha do inimigo
    
    public void batalha(Inimigo inimigo, Heroi heroi){
        int dano = (heroi.getAtaque()*heroi.getInteligencia() + heroi.getSorte())/inimigo.getDefesa();
        int hp = inimigo.getHp() - dano;
        inimigo.setHp(hp); 
        System.out.println("Hp do inimigo " + inimigo.getHp());
    }
}
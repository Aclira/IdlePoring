package idle.personagem;

<<<<<<< HEAD
import idle.personagem.Monstro;
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
=======
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
>>>>>>> 0ca24bdffd2174d1a84ed119e2c80a2955a5f0cf
    }
}
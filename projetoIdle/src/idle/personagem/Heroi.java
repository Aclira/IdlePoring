package idle.personagem;
import idle.elementos.Classe;

public class Heroi extends Personagem{
    private int exp, poder, dest, agil, sorte, intelig, critico;
    private Classe classe;

    public Heroi(Classe classe){
        this.classe = classe;
        this.exp = 0;
        this.poder = 0;
        this.dest = 0;
        this.agil = 0;
        this.sorte = 0;
        this.intelig = 0;
    }

    public Heroi(String nome,Classe classe){
        super(nome);
        this.classe = classe;
        this.exp = 0;
        this.poder = 0;
        this.dest = 0;
        this.agil = 0;
        this.sorte = 0;
        this.intelig = 0;
    }
       

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        if(this.limiteBase(exp))
            this.exp = exp;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        if(this.limiteBase(poder))
            this.poder = poder;
    }

    public int getDest() {
        return dest;
    }

    public void setDest(int dest) {
        if(this.limiteBase(dest))
            this.dest = dest;
    }

    public int getAgil() {
        return agil;
    }

    public void setAgil(int agil) {
        if(this.limiteBase(agil))
            this.agil = agil;
    }

    public int getSorte() {
        return sorte;
    }

    public void setSorte(int sorte) {
        if(this.limiteBase(sorte))
            this.sorte = sorte;
    }

    public int getIntelig() {
        return intelig;
    }

    public void setIntelig(int intelig) {
        if(this.limiteBase(intelig))
            this.intelig = intelig;
    }


    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    
    public void ataque(Heroi heroi, Inimigo inimigo){
        heroi.hp = heroi.hp - (inimigo.getAtq() - heroi.getDefesa());    
        //heroi.setHp(heroi.getDefesa() - inimigo.getAtq());
            
            System.out.println("Hp do heroi " + heroi.getHp());
        }
    
}
package idle.personagem;
import idle.elementos.Classe;

public class Heroi extends Personagem{
    private int exp;
    private Classe classe;

    public Heroi(Classe classe){
        this.classe = classe;
        this.exp = 0;
    }

    public Heroi(String nome,Classe classe){
        super(nome);
        this.classe = classe;
        this.exp = 0;
    }

    public int getExp() {
        return this.exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public Classe getClasse() {
        return this.classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
}
package idle.personagem;

import idle.elementos.Profissao;

public class Heroi extends Personagem {
    private int exp;
    private Profissao classe;

    public Heroi(Profissao classe){
        this.classe = classe;
        this.exp = 0;
    }

    public Heroi(String nome, Profissao classe){
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

    public Profissao getClasse() {
        return this.classe;
    }

    public void setClasse(Profissao classe) {
        this.classe = classe;
    }
}
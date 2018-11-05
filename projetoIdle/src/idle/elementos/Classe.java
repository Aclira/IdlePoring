
package idle.elementos;

public class Classe {
    private String nome;
    private float fintelig;
    private float fdest;
    private float fagil;
    private float fsorte;
    public static final float FATOR_NEUTRO = (float) 1.2;

    public Classe(String nome, float fintelig, float fdest, float fagil, float fsorte) {
        this.nome = nome;
        this.fintelig = fintelig;
        this.fdest = fdest;
        this.fagil = fagil;
        this.fsorte = fsorte;
    }

    public Classe(String nome) {
        this.nome = nome;
        this.fintelig = this.FATOR_NEUTRO;
        this.fdest = this.FATOR_NEUTRO;
        this.fagil = this.FATOR_NEUTRO;
        this.fsorte = this.FATOR_NEUTRO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getFintelig() {
        return fintelig;
    }

    public void setFintelig(float fintelig) {
        this.fintelig = fintelig;
    }

    public float getFdest() {
        return fdest;
    }

    public void setFdest(float fdest) {
        this.fdest = fdest;
    }

    public float getFagil() {
        return fagil;
    }

    public void setFagil(float fagil) {
        this.fagil = fagil;
    }

    public float getFsorte() {
        return fsorte;
    }

    public void setFsorte(float fsorte) {
        this.fsorte = fsorte;
    }
    
    
    
}

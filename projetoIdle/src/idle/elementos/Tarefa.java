package idle.elementos;

public class Tarefa{
    private String nome;
    private int exp_dado;
    private String objetivo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getExp_dado() {
        return exp_dado;
    }

    public void setExp_dado(int exp_dado) {
        this.exp_dado = exp_dado;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
}
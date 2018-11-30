package idle.elementos;

public abstract class Profissao {
    
    // Atributos de profissão: alterados apenas através de métodos
    
    private String nome; // Nome da profissão
    private String fatorArma; // Nome da arma específica para essa profissão
    private String fatorTraje; // Nome do traje específico para essa profissão
    
    private float fatorAtaque; // Bônus de ataque da profissão, se houver
    private float fatorDefesa; // Bônus de defesa da profissão, se houver
    private float fatorInteligencia; // Bônus de inteligência da profissão, se houver

    // Construtor da classe profissão: os parâmetros são setados nas classes específicas
    
    public Profissao(String nome, String arma, String traje, float ataque, float defesa, float inteligencia) {
        this.nome = nome;
        this.fatorArma = arma;
        this.fatorTraje = traje;
        
        this.fatorAtaque = ataque;
        this.fatorDefesa = defesa;
        this.fatorInteligencia = inteligencia;
    }
    
    // Definição de getters e setters em função das variáveis privadas

    // Atributo nome
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Atributo fatorArma
    
    public String getFatorArma() {
        return fatorArma;
    }

    public void setFatorArma(String fatorArma) {
        this.fatorArma = fatorArma;
    }

    // Atributo fatorTraje
    
    public String getFatorTraje() {
        return fatorTraje;
    }

    public void setFatorTraje(String fatorTraje) {
        this.fatorTraje = fatorTraje;
    }

    // Atributo fatorAtaque
    
    public float getFatorAtaque() {
        return fatorAtaque;
    }

    public void setFatorAtaque(float fatorAtaque) {
        this.fatorAtaque = fatorAtaque;
    }

    // Atributo fatorDefesa
    
    public float getFatorDefesa() {
        return fatorDefesa;
    }
    
    public void setFatorDefesa(float fatorDefesa) {
        this.fatorDefesa = fatorDefesa;
    }

    // Atributo fatorInteligencia
    
    public float getFatorInteligencia() {
        return fatorInteligencia;
    }

    public void setFatorInteligencia(float fatorInteligencia) {
        this.fatorInteligencia = fatorInteligencia;
    }
}
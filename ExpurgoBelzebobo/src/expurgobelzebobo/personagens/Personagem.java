// Contém a definição genérica de personagem.

package expurgobelzebobo.personagens;

public abstract class Personagem {
    
    // Características do personagem
    
    private String nome;      // Nome do personagem
    private int nivel;
    private int hp;           // Pontos de vida do personagem
    private int ataque;       // Pontos de ataque do pesonagem
    private int defesa;       // Pontos de defesa do personagem
    private int inteligencia; // Pontos de inteligência do personagem
    private final int sorte;  // Pontos de sorte do personagem
    
    // Nivel máximo de personagem
    
    private final int NIVEL_MAX = 10;
    
    // Construtor para criação do personagem

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
        this.hp = nivel*1000;
        this.ataque = nivel*100;
        this.defesa = nivel*100;
        this.inteligencia = nivel*10;
        this.sorte = 0; // Definido como zero por que receberá um valor aleatório no momento da criação
    }
    public Personagem(String nome){
        this.nome = nome;
        this.nivel = 1;
        this.hp = nivel*1000;
        this.ataque = nivel*100;
        this.defesa = nivel*100;
        this.inteligencia = nivel*10;
        this.sorte = 0;
    }
    
    
    // Getters e setters para leitura e manipulação das características
    
    // Atributo nome

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Atributo nivel

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if(nivel > NIVEL_MAX) {
            this.nivel = NIVEL_MAX;
        } else {
            this.nivel = nivel;
        }        
    }
            
    // Atributo hp

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    // Atributo ataque

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    // Atributo defesa

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    
    // Atributo inteligencia

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    
    // Atributo sorte

    public int getSorte() {
        return sorte;
    }    
    
}
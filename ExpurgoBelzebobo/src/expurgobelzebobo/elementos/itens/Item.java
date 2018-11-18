// Contém a definição genérica de Item.

package expurgobelzebobo.elementos.itens;

public abstract class Item {
    
    // Características do item
    
    private final String nome;       // Nome do item
    private final float fatorAtaque; // Bonus de ataque concedido ao personagem
    private final float fatorDefesa; // Bonus de defesa concedido ao personagem
    private final float fatorHp;     // recuperação de HP concedida ao personagem
    private int nivel;               // Nível do item
    private boolean liberado;        // Liberdade para utilização
    
    // Construtor para criação do item

    public Item(String nome, float fatorAtq, float fatorDef, float fatorHp, int nivel, boolean liberado) {
        this.nome = nome;
        this.fatorAtaque = nivel*fatorAtq;
        this.fatorDefesa = nivel*fatorDef;
        this.fatorHp = nivel*fatorHp;
        this.nivel = nivel;
        this.liberado = liberado;
    }
    
    // Setters para manipulação do nível e do fator liberado

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setLiberado(boolean liberado) {
        this.liberado = liberado;
    }
    
}

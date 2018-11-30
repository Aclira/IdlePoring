package idle.personagem;

public abstract class Personagem {
    
    // Atributos de personagem: alterados apenas através de métodos
	
    private String nome;
	
    private int nivel;
    private int hp;
	
    private int ataque;
    private int defesa;
    private int inteligencia;
    private int sorte;
	
    // Valores limite que não podem ser modificados (finais) para os atributos da classe
	
    public static final int NIVEL_MAX = 10;

    // Construtor vazio: utilizado em caso de demonstração de criação de novo personagem
	
    public Personagem() {
        this.nome = "";
		
	this.nivel = 1;
	this.hp = nivel*1000;
		
	this.ataque = nivel*100;
	this.defesa = nivel*100;
	this.inteligencia = nivel*10;
	this.sorte = 0;	// Definido como 0 por que deve receber um valor aleatório calculado na hora da criação
    }
    
    // Construtor com parâmetro "nome": exemplo de sobrecarga de métodos
    
    public Personagem(String nome) {
	this.nome = nome;
		
	this.nivel = 1;
	this.hp = nivel*100;
		
	this.ataque = nivel*100;
	this.defesa = nivel*100;
	this.inteligencia = nivel*10;
	this.sorte = 0;	// Definido como 0 por que deve receber um valor aleatório calculado na hora da criação	
    }

    // Método limiteNivel: responsável por verificar se o valor atribuído à variável nível é válido

    public boolean limiteNivel(int valor) {
        if(valor >= 0 && valor <= this.NIVEL_MAX)
            return true;
        else
            return false;
    }
    
    // Definição de getters e setters em função das variáveis privadas
    
    // Atributo nível
    
    public int getNivel() {
    	return this.nivel;
    }
    
    public void setNivel(int nivel) {
    	if(this.limiteNivel(nivel))
            this.nivel = nivel; // Receberá o valor atribuído pelo usuário apenas se a condição for verdadeira
    	else
            this.nivel = NIVEL_MAX; // Caso contrário, receberá o máximo permitido
    }
    
    // Atributo nome
     
    public String getNome() {
    	return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
		
    // Atributo hp

    public int getHp() {
	return this.hp;
    }
        
    public void setHp(int hp) {
	this.hp = hp;
    }
	
    // Atributo ataque
	
    public int getAtaque() {
	return this.ataque;
    }
		
    public void setAtaque(int ataque) {
	this.ataque = ataque;
    }
		
    // Atributo defesa

    public int getDefesa() {
	return this.defesa;
    }

    public void setDefesa(int defesa) {
	this.defesa = defesa;
    }
		
    // Atributo inteligencia
		
    public int getInteligencia() {
        return this.inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    
    // Atributo sorte
    
    public int getSorte() {
        return this.sorte;
    }
       
    /* Mudança de comportamento no método toString (é chamado ao printar). Aqui foi decidido a forma que ele deve
    se comportar ao printar. Exemplo de polimorfismo. */
 
    @Override
    public String toString() {
        String print = this.getNome().toUpperCase() + "\n";
        print += "NÍVEL: " + this.getNivel() + "\n";
        print += "HP: " + this.getHp() + "\n";
        print += "ATAQUE: " + this.getAtaque() + "\n";
        print += "DEFESA: " + this.getDefesa() + "\n";
        print += "INTELIGÊNCIA: " + this.getInteligencia() + "\n";
        print += "SORTE: " + this.sorte + "\n";           
        return print;
    }
}

package idle.personagem;

public abstract class Personagem {
        //Definição de variáveis privadas para que só sejam alteradas por meio 
        //de métodos
	private String nome;
	private int nivel, defesa, esquiva, atq, atqsp;
        //Var hp public para que seja possivel usar diretamente no metodo ataque
        //em heroi e inimigo
        public int hp;
        //Definição de valores limites que não podem ser modificados (final)
        //para os atributos da classe
	public static final int HP_MAX = 100000;
	public static final int BASE_MAX = 1000;
	public static final int NIVEL_MAX = 100;

        //Definido construtor vazio
	public Personagem() {
		this.nome = "";
		this.hp = 0;
		this.nivel = 0;
		this.defesa = 0;
		this.esquiva = 0;
		this.atq = 0;
		this.atqsp = 0;	
	}
        //Definido outro construtor, mas que recebe 1 parametro apenas.
        //Exxemplo de sobre carga de métodos, porque já tem um construtor declarado.
	public Personagem(String nome) {
		this.nome = nome;
		this.hp = 0;
		this.nivel = 0;
		this.defesa = 0;
		this.esquiva = 0;
		this.atq = 0;
		this.atqsp = 0;	
	}	
        
        //A partir daqui são definidos os métodos getters e setters, por conta
        //das variáveis privadas
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getHp() {
		return this.hp;
	}
        
        //Os métodos responsáveis por "enviar" valores para as variáveis estão
        //dentro da condição de valores estabelecidos nas variaveis de classe(static final)
	public void setHp(int hp) {
                //O método limiteHP está declarado logo abaixo
		if(this.limiteHP(hp))
                        //Se a condição for verdadeira, então o atributo recebe o valor.
			this.hp = hp;
	}
        
        //O mesmo acontece nos setters seguintes.
        
	public int getNivel() {
		return this.nivel;
	}
        
	public void setNivel(int nivel) {
		if(this.limiteNivel(nivel))
			this.nivel = nivel;
	}

	public int getDefesa() {
		return this.defesa;
	}

	public void setDefesa(int defesa) {
		if(this.limiteBase(defesa))
			this.defesa = defesa;
	}

	public int getEsquiva() {
		return this.esquiva;
	}

	public void setEsquiva(int esquiva) {
		if(this.limiteBase(esquiva))
			this.esquiva = esquiva;
	}

	public int getAtq() {
		return this.atq;
	}

	public void setAtq(int atq) {
		if(this.limiteBase(atq))
			this.atq = atq;
	}

	public int getAtqSp() {
		return this.atqsp;
	}

	public void setAtqSp(int atqsp) {
		if(this.limiteBase(atqsp))
			this.atqsp = atqsp;
	}
        
	public boolean limiteHP(int valor) {
		if(valor >= 0 && valor <= this.HP_MAX)
			return true;
		else
			return false;
	}

	public boolean limiteBase(int valor) {
		if(valor >= 0 && valor <= this.BASE_MAX)
			return true;
		else
			return false;
	}

	public boolean limiteNivel(int valor) {
		if(valor >= 0 && valor <= this.NIVEL_MAX)
			return true;
		else
			return false;
	}
        
        //Mudança de comportamento no método toString(é chamado ao printar).
        //Aqui foi decidido a forma que ele deve se comportar ao printar.
        //Exemplo de polimorfismo
        @Override
        public String toString() {
            String print = this.getNome().toUpperCase() + "\n";
            print += "NÍVEL: " + this.getNivel() + "\n";
            print += "HP: " + this.getHp() + "\n";
            print += "ATQ: " + this.getAtq() + "\n";
            print += "DEF: " + this.getDefesa() + "\n";
            print += "ATQ SP: " + this.getAtqSp() + "\n";
            print += "ESQUIVA: " + this.getEsquiva() + "\n";
            return print;
        }
}
package idle.personagem;

public abstract class Personagem {
	private String nome;
	private int hp, nivel, defesa, esquiva, atq, atqsp;
	public static final int HP_MAX = 100000;
	public static final int BASE_MAX = 1000;
	public static final int NIVEL_MAX = 100;

	/*public Personagem(String nome, int hp, int nivel, int defesa, int esquiva, int atq, int atqsp) {
		this.nome = nome;
		if(this.limiteHP(hp))
			this.hp = hp;
		else
			this.hp = 0;
		if(this.limiteNivel(nivel))
			this.nivel = nivel;
		else
			this.nivel = 0;
		if(this.limiteBase(defesa))
			this.defesa = defesa;
		else
			this.defesa = 0;
		if(this.limiteBase(esquiva))
			this.esquiva = esquiva;
		else
			this.esquiva = 0;
		if(this.limiteBase(atq))
			this.atq = atq;
		else
			this.atq = 0;
		if(this.limiteBase(atqsp))
			this.atqsp = atqsp;
		else
			this.atqsp = 0;
	}*/

	public Personagem() {
		this.nome = "";
		this.hp = 0;
		this.nivel = 0;
		this.defesa = 0;
		this.esquiva = 0;
		this.atq = 0;
		this.atqsp = 0;	
	}

	public Personagem(String nome) {
		this.nome = nome;
		this.hp = 0;
		this.nivel = 0;
		this.defesa = 0;
		this.esquiva = 0;
		this.atq = 0;
		this.atqsp = 0;	
	}	

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		if(this.limiteHP(hp))
			this.hp = hp;
	}

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
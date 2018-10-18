public class Hero extends Personagem{
	public String classe;
	public int exp;
	public int forca;
	public int vit;
	public int dest;
	public int agil;
	public int sorte;
	public int intelig;


	public Hero(int forca, int vit, int dest, int agil, int sorte, int intelig, int exp, String classe, String nome, String raca, int hp, int mp){
    
		super(nome, raca, hp, mp);
		this.classe = classe;
		this.exp = exp;
		this.forca = forca;
		this.vit = vit;
		this.dest = dest;
		this.agil = agil;
		this.sorte = sorte;
		this.intelig = intelig;
	}

	public int getForca(){
		return this.forca;
	}

	public int getVit(){
		return this.vit;
	}

	public int getDest(){
		return this.dest;
	}

	public int getAgil(){
		return this.agil;
	}

	public int getSorte(){
		return this.sorte;
	}

	public int getIntelig(){
		return this.intelig;
	}

	public String getClasse(){
		return this.classe;
	}

	public int getExp(){
		return this.exp;
	}	

	public String getNome(){
		return super.getNome();
	}

	public String getRaca(){
		return super.getRaca();
	}

	public int getHp(){
		return super.getHp();
	}

	public int getMp(){
		return super.getMp();
	}

	/*
	3 metodos para ser implementados:
	Atributos
	Bolsa
	Habilidade
	*/
}
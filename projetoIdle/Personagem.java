public abstract class Personagem{
	private String nome;
	private String raca;
	private int hp;
	private int mp;

	public Personagem(String nome, String raca, int hp, int mp ){
		this.nome = nome;
		this.raca = raca;
		this.hp = hp;
		this.mp = mp;
	}

	public String getNome(){
		return this.nome;
	}

	public String getRaca(){
		return this.raca;
	}

	public int getHp(){
		return this.hp;
	}

	public int getMp(){
		return this.mp;
	}




}
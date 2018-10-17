public class Hero extends Personagem{
	//Tentei inserir novos atributos e passar para o construtor, mas não deu certo porque não to sabendo como fazer.

	/*,  int exp, int vital, int destreza, int agil, int sorte, int intlg
	public int exp;
	public int vital;
	public int destreza;
	public int agil;
	public int sorte;
	public int intlg;
	*/
	public Hero(String nome, String raca, int hp, int mp){
		super(nome, raca, hp, mp);
		/*this.exp = exp;
		this.vital = vital;
		this.destreza = destreza;
		this.agil = agil;
		this.sorte = sorte;
		this.intlg = intlg;*/
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
	public int getExp(int exp){
		return this.exp;
	}

	public int getVital(int vital){
		return this.vital;
	}

	public int getDestreza(int destreza){
		return this.destreza;
	}

	public int getAgil(int agil){
		return this.agil;
	}

	public int getSorte(int sorte){
		return this.sorte;
	}

	public int getIntlg(int intlg){
		return this.intlg;
	}
*/
}
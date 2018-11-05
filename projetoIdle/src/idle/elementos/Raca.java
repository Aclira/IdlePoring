package idle.elementos;

public class Raca {
	private String nome;
	private float fatq;
	private float fdefesa;
	private float fatqsp;
	private float fesquiva;
	private float fhp;
	public static final float FATOR_NEUTRO = (float) 1.2;

	public Raca(String nome) {
		this.nome = nome;
		this.fatq = this.FATOR_NEUTRO;
		this.fatqsp = this.FATOR_NEUTRO;
		this.fdefesa = this.FATOR_NEUTRO;
		this.fesquiva = this.FATOR_NEUTRO;
		this.fhp = this.FATOR_NEUTRO;
	}

	public Raca(String nome, float hp, float fatq, float fdefesa, float fatqsp, float fesquiva) {
		this.nome = nome;
		this.fatq = fatq;
		this.fatqsp = fatqsp;
		this.fdefesa = fdefesa;
		this.fesquiva = fesquiva;
		this.fhp = fhp;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setFatorHp(float fhp) {
		this.fhp = fhp;
	}

	public float getFatorHp() {
		return this.fhp;
	}

	public void setFatorAtq(float fatq) {
		this.fatq = fatq;
	}

	public float getFatorAtq() {
		return this.fatq;
	}

	public void setFatorAtqSp(float fatqsp) {
		this.fatqsp = fatqsp;
	}

	public float getFatorAtqSp() {
		return this.fatqsp;
	}

	public void setFatorDefesa(float fdefesa) {
		this.fdefesa = fdefesa;
	}

	public float getFatorDefesa() {
		return this.fdefesa;
	}

	public void setFatorEsquiva(float esquiva) {
		this.fesquiva = fesquiva;
	}

	public float getFatorEsquiva() {
		return this.fesquiva;
	}
        
        @Override
        public String toString() {
            return "RAÇA: " + this.getNome();
        }
}
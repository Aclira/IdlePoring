package idle.personagem;

import idle.elementos.Raca;

public abstract class Monstro extends Personagem {
	private Raca raca;

	public Monstro(Raca raca) {
		super();
		this.raca = raca;
	}

	public Monstro(String nome, Raca raca) {
		super(nome);
		this.raca = raca;
	}

	public void setRaca(Raca raca) {
		this.raca = raca;
	}

	public Raca getRaca() {
		return this.raca;
	}
        
        @Override
        public String toString() {
            return super.toString() + raca.toString();
        }
}
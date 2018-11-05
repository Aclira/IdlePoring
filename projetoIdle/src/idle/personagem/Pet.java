package idle.personagem;

import idle.personagem.Monstro;
import idle.elementos.Raca;

public class Pet extends Monstro {
    public Pet(String nome, Raca raca){
        super(nome, raca);
    }

    public Pet(Raca raca) {
        super(raca);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
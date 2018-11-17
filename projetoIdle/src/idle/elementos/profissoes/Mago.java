package idle.elementos.profissoes;

import idle.elementos.Profissao;

/*
A profissão mago adiciona bônus de 10% na inteligência do personagem.
Utiliza a arma Cajado e o traje Tunica.
*/

public class Mago extends Profissao {
    public Mago() {
        super("Mago", "Cajado", "Tunica", 1, 1, 10/100);
    }
}

package idle.elementos.profissoes;

import idle.elementos.Profissao;

/*
A profissão arqueiro adiciona bônus de 3% na defesa do personagem.
Utiliza a arma Arco e o traje Jaqueta.
*/

public class Arqueiro extends Profissao {
    public Arqueiro() {
        super("Arqueiro", "Arco", "Jaqueta", 0, 3/100, 0);
    }
}

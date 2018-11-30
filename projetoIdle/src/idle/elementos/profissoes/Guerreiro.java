package idle.elementos.profissoes;

import idle.elementos.Profissao;

/*
A profissão guerreiro adiciona bônus de 3% no ataque do personagem.
Utiliza a arma Espada e o traje Armadura.
*/

public class Guerreiro extends Profissao {
    public Guerreiro() {
        super("Guerreiro", "Espada", "Armadura", 3/100, 0, 0);
    }
}

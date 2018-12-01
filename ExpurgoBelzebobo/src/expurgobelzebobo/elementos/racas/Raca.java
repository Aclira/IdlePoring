package expurgobelzebobo.elementos.racas;

import expurgobelzebobo.elementos.Atributo;
import expurgobelzebobo.elementos.Habilidade;

public class Raca { 
    private String nome;
    private String habilidade;
    private String resistencia;
    private String fraqueza;
    
    static Atributo atb = new Atributo();
    static Habilidade habil = new Habilidade();
    
    
    public Raca(String nome, String habilidade, String resistencia, String fraqueza){
        this.nome = nome;
        this.habilidade = habilidade;
        this.resistencia = resistencia;
        this.fraqueza = fraqueza;
    }

    public String getNome() {
        return nome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public String getResistencia() {
        return resistencia;
    }

    public String getFraqueza() {
        return fraqueza;
    }
}

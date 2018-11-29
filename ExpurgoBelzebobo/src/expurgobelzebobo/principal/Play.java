package expurgobelzebobo.principal;

import expurgobelzebobo.elementos.classes.Mago;

public class Play {

    public static void main(String[] args) {
        
        Mago mago = new Mago();
        
        
        System.out.println("Nome: " + mago.getNome());
        System.out.println("Atributo: " + mago.getAtributo());
        System.out.println("Resistência: " + mago.getResistencia());
        System.out.println("Fraqueza: " + mago.getFraqueza());
        System.out.println("Fator Ataque: " + mago.getFatorAtaque());
        System.out.println("Fator Defesa: " + mago.getFatorDefesa());
        System.out.println("Fator Inteligência: " + mago.getFatorInteligencia());
        
        
    }
    
}

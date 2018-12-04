// Exemplo de implementação do iterator utilizando vetor

package idledemon.principal.iterator;

import idledemon.elementos.itens.Item;

public class ItemVetor implements InterfaceIterator {
    
    private final Item[] lista = new Item[100]; // Cria uma nova lista do objeto item
    private int cont = 0;                       // Cria um contador para adicionar elementos na lista
    private int quan = 0;                       // Variável auxliar para acessar elementos da lista
    
    @Override // Retorna o tamanho da lista
    public int tam() {
        return cont;
    }
    
    @Override // Verifica se a lista está vazia
    public boolean empty() {
        return lista[0] == null;
    }
    
    @Override // Adiciona um item a lista
    public void add(Item item) {
        lista[cont] = item;
        cont++;
    }
    
    @Override // Remove um item da lista
    public void rem(Item item) {
        
        for(int i = 0; i < cont; i++) {
            if(lista[i] == item) {
                quan = i;
            }
        }
        
        for(int i = quan; i < cont; i++) {
            lista[i] = lista[i+1];
        }
        
        cont--;
    }
    
    @Override // Retorna um item da lista
    public Item next(int indice) {
        return lista[indice];
    }
}

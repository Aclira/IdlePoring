// Implementa a interface do padrão Iterator

package expurgobelzebobo.principal.iterator;

import expurgobelzebobo.elementos.itens.Item;

public interface InterfaceIterator {
    int tam();               // Retorna o tamanho da lista
    boolean empity();        // Verifica se a lista está vazia
    void add(Item item);     // Adiciona um item a lista
    void rem(Item item);     // Remove um item da lista
    Object next(int indice); // Retorna um elemento da lista 
}

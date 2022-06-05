package pilha;
public class Node<T>{
    private T informacao;
    private Node<T> proximo;

    public Node (T valor){
        this.informacao= valor;
    }
    public void setInformacao(T valor){
        this.informacao= valor;
    }
    public T getInformacao(){
        return this.informacao;
    }
    public void setProximo(Node novoProximo){
        this.proximo= novoProximo;
    }
    public Node getProximo(){
        return this.proximo;
    }
}

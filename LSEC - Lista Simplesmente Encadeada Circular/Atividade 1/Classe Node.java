package atividade1;
public class Node {
    private Node proximo;
    private Livro informacao;
    
    public Node(Livro l){
        this.informacao= l;
    }
    public void setProximo(Node novoProximo){
        this.proximo= novoProximo;
    }
    public void setInfo(Livro l){
        this.informacao= l;
    }
    public Node getProximo(){
        return this.proximo;
    }
    public Livro getInformacao(){
        return this.informacao;
    }
}

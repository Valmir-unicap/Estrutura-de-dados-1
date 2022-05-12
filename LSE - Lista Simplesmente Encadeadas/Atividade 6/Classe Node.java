package atividade6;
public class Node {
       
    private Integer informacao; // atributos
    private Node proximo; // atributos

    public Node (Integer valor) { // método construtor
        this.informacao = valor;
    }
    public void setInformacao (Integer valor) {
        this.informacao =valor;
    }
    public Integer getInformacao () {
        return this.informacao;
    }
    public void setProximo (Node novoProx) {
        this.proximo = novoProx;
    }
    public Node getProximo () {
        return this.proximo;
    }
}

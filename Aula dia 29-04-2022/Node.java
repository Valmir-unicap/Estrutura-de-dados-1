package listacircularsimplesmenteencadeada;
public class Node {   
    private Integer info; // atributos
    private Node prox; // atributos

    public Node (Integer value) { // método construtor
        this.info = value;
    }
    public void setInfo (Integer value) {
        this.info = value;
    }
    public Integer getInfo () {
        return this.info;
    }
    public void setProx (Node novoProx) {
        this.prox = novoProx;
    }
    public Node getProx () {
        return this.prox;
    }
}

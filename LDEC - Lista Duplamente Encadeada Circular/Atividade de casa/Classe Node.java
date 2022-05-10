package listaduplamentecircular;
public class Node {
    private Integer informacao; // atributos
    private Node proximo; // atributos
    private Node anterior;

    public Node (Integer value) { // método construtor
        this.informacao = value;
    }
    public void setInfo (Integer value) {
        this.informacao = value;
    }
    public Integer getInfo () {
        return this.informacao;
    }
    public void setProx (Node novoProx) {
        this.proximo = novoProx;
    }
    public Node getProx () {
        return this.proximo;
    }
    public void setAnterior(Node novoAnterior){
        this.anterior= novoAnterior;
    }
    public Node getAnterior(){
        return this.anterior;
    }
}

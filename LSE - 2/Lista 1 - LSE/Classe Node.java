package primeiralista;
/*
 * @author valmir
 */
public class Node {    
    private Aluno info; // atributos
    private Node prox; // atributos

    public Node (Aluno al) { // método construtor
        this.info = al;
    }
    // métodos get e set
    public void setInfo (Aluno al) {
        this.info = al;
    }
    public Aluno getInfo () {
        return this.info;
    }
    public void setProx (Node novoProx) {
        this.prox = novoProx;
    }
    public Node getProx () {
        return this.prox;
    }
}

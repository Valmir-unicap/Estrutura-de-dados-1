package netflix;
/**
 *
 * @author valmir
 */
public class NodePrincipal {
    private NodePrincipal anterior;
    private NodePrincipal proximo;
    private Categoria informacao;
    
    public NodePrincipal(Categoria c){
        this.informacao= c;
    }
    public void setInformacao(Categoria c ){
        this.informacao=c;
    }
    public Categoria getInformacao(){
        return this.informacao;
    }
    public void setProximo(NodePrincipal novoProximo){
        this.proximo= novoProximo;
    }
    public NodePrincipal getProximo(){
        return this.proximo;
    }
    public void setAnterior(NodePrincipal novoAnterior){
        this.anterior= novoAnterior;
    }
    public NodePrincipal getAnterior(){
        return this.anterior;
    }
}

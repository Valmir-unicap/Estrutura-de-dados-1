package netflix;
/**
 *
 * @author valmir
 */
public class NodeSecundaria {
    private NodeSecundaria anterior;
    private NodeSecundaria proximo;
    private Filme informacao;
    
    public NodeSecundaria (Filme f){
        this.informacao=f;
    }
    public void setInformacao(Filme f){
        this.informacao=f;
    }
    public Filme getInformacao(){
        return this.informacao;
    }
   public void setProximo(NodeSecundaria novoProximo){
        this.proximo= novoProximo;
    }
    public NodeSecundaria getProximo(){
        return this.proximo;
    }
    public void setAnterior(NodeSecundaria novoAnterior){
        this.anterior= novoAnterior;
    }
    public NodeSecundaria getAnterior(){
        return this.anterior;
    }
}

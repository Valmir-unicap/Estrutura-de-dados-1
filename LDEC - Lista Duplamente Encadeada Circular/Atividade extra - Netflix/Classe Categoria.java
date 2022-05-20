package netflix;
/**
 *
 * @author valmir
 */
public class Categoria implements Comparable <Categoria>{
    private String descricao;
    private ListaFilmes lista;
    
    public Categoria(String descricao, ListaFilmes lista){
        this.descricao= descricao;
        this.lista= lista;
    }
    
    public void setDescricao(String descricao){
        this.descricao= descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setLista(ListaFilmes lista){
        this.lista=lista;
    }
    public ListaFilmes getLista(){
        return this.lista;
    }
    @Override
    public String toString(){
        return "O filme: "+this.lista+", da categoria: "+this.descricao;
    }
    @Override
    public int compareTo(Categoria c) {
        return this.descricao.compareTo(c.descricao);
    }
}

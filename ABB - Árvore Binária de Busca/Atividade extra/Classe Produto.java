package extraArvore;
public class Produto implements Comparable<Produto> {
    private String codigo;
    private String descricao;
    private double preco;
    private int estoque;

    public Produto(String codigo, String descricao, double preco, int estoque){//construtor
        this.codigo= codigo;
        this.descricao= descricao;
        this.preco= preco;
        this.estoque= estoque;
    }
    public Produto(String codigo){
        this.codigo= codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public int getEstoque(){
        return this.estoque;
    }
    @Override
    public int compareTo(Produto p) {
        return this.codigo.compareTo(p.codigo);
    }
    @Override
    public String toString() {
        return "Código= "+this.codigo+", da descrição= "+this.descricao+", do preço= R$"+this.preco+", possui no estoque= "+this.estoque+" quantidades.";
    }
}

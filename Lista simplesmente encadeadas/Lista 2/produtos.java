package br.unicap.c3.ed1.lists2.dados;
/*
 * @author valmir
 */
public class produtos implements Comparable<produtos>{
    private String codigo;
    private String descricao;
    private double preco;
    private int estoque;
    
    public produtos(String codigo, String descricao, double preco, int estoque){//Construtor
        this.codigo= codigo;
        this.descricao= descricao;
        this.preco= preco;
        this.estoque= estoque;
    }
    public produtos(String codigo){//Construtor 2
        this.codigo=codigo;
    }
    //public void setCodigo(String codigo){ //só pode ser inserida uma única vez, o código do produto.
       // this.codigo= codigo;
    //}
    public String getCodigo(){
        return this.codigo;
    }
    public void setDescricao(String descricao){
        this.descricao= descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setPreco(double preco){
        this.preco= preco;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setEstoque(int estoque){
        this.estoque= estoque;
    }
    public int getEstoque(){
        return this.estoque;
    }
    @Override
    public String toString(){
        return "O codigo do produto: "+ this.codigo+ ", da descriacao: "+ this.descricao + ", com o preço: " +this.preco+ ", possui no estoque: "+this.estoque+" unidades.";
    }
    @Override
    public int compareTo(produtos P) {
        return this.codigo.compareTo(P.codigo);
    }
}

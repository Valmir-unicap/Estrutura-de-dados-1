package netflix;
public class Filme implements Comparable<Filme>{
    private String titulo;
    private String genero;
    private String classificacao;
    private int ano;
    
    public Filme(String titulo, String genero, String classificacao, int ano){
        this.titulo=titulo;
        this.genero=genero;
        this.classificacao=classificacao;
        this.ano=ano;
    }
    public void setTitulo(String titulo){
        this.titulo= titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setClassificacao(String classificacao){
        this.classificacao=classificacao;
    }
    public String getClassificacao(){
        return this.classificacao;
    }
    public void setAno(int ano){
        this.ano=ano;
    }
    public int getAno(){
        return this.ano;
    }

    @Override
    public int compareTo(Filme f) {
        return this.titulo.compareTo(f.titulo);
    }
    @Override
    public String toString(){
        return "O titulo: "+this.titulo+", do genero: "+this.genero+", da classificacao: "+this.classificacao+", do ano: "+this.ano;
    }
}

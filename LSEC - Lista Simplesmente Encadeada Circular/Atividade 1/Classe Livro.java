package atividade1;
public class Livro implements Comparable <Livro>{
    private String titulo;
    private String autor;
    private String assunto;
    
    public Livro(String titulo, String autor, String assunto){
        this.assunto= assunto;
        this.autor= autor;
        this.titulo= titulo;
    }
    public Livro(String titulo){
        this.titulo= titulo;
    }
    public void setTitulo(String titulo){
        this.titulo= titulo;
    }
    public void setAutor(String autor){
        this.autor= autor;
    }
    public void setAssunto(String assunto){
        this.assunto= assunto;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public String getAssunto(){
        return this.assunto;
    }
    @Override
    public String toString(){
        return "O titulo do livro: "+this.titulo+", do autor: "+this.autor+", do assunto: "+this.assunto;
    } 
    @Override
    public int compareTo(Livro l) {
      return this.titulo.compareTo(l.titulo);
    }
}

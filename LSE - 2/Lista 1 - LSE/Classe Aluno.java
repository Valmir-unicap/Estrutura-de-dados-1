package primeiralista;
/*
 * @author valmir
 */
public class Aluno {
    
    private String matr; // atributos
    private String nome; // atributos
    private double media; // atributos
    private int faltas; // atributos
    
    public Aluno (String matr, String nome, double media, int faltas) { // método construtor
        this.matr = matr;
        this.nome = nome;
        this.media= media;
        this.faltas= faltas;
    }
    // métodos get e set
    public void setMatr (String matr) { 
        this.matr = matr;
    }
    public String getMatr() {
        return this.matr;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }    
   public String getNome() {
        return this.nome;
    }
    public void setMedia (double media) {
        this.media = media;
    } 
    public double getMedia() {
        return this.media;
    }
    public void setFaltas (int faltas) {
        this.faltas = faltas;
    }  
    public int getFaltas() {
        return this.faltas;
    }
    public String toString () { // método toString
        return this.matr + " - O aluno " + this.nome + ", possui a média: " + this.media + ", com a quantidade de faltas: " + this.faltas;
    }
}

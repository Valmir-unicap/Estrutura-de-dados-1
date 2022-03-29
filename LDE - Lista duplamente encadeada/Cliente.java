package listaduplamenteencadeada;
public class Cliente {
    private String cpf;
    private String nome;
    private String fone;
    
    public Cliente(String cpf, String nome, String fone){//permite repetidos
        this.cpf=cpf;
        this.nome=nome;
        this.fone=fone;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setFone(String fone){
        this.fone=fone;
    }
    public String getFone(){
        return this.fone;
    }
    @Override
    public String toString(){
        return " O cpf: "+this.cpf+ ", do nome: "+this.nome+", do telefone:"+this.fone;
    }
}

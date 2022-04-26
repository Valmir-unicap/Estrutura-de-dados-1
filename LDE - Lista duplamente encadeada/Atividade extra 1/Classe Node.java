package controledetarefas;
public class Node {
    
    private Node ant;
    private Tarefas info;
    private Node prox;
    
    public Node(Tarefas t){
        this.info=t;
    }
    public void setAnt(Node novoAnt){
        this.ant=novoAnt;
    }
    public Node getAnt(){
        return this.ant;
    }
    public void setProx(Node novoProx){
        this.prox=novoProx;
    }
    public Node getProx(){
        return this.prox;
    }
    public void setInfo(Tarefas t){
        this.info=t;
    }
    public Tarefas getInfo(){
        return this.info;
    }
}

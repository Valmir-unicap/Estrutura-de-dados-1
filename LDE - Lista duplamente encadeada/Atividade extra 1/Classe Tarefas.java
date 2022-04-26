package controledetarefas;
public class Tarefas implements Comparable <Tarefas>{

    private String tarefa;
    private String descricao;
    private String prioridade;
    
    public Tarefas(String prioridade){//construtor
        this.prioridade=prioridade;
    }
    public Tarefas(String tarefa, String descricao, String prioridade){//não permite repetidos
        this.tarefa= tarefa;
        this.descricao=descricao;
        this.prioridade=prioridade;
    }
    public void setTarefa(String tarefa){
        this.tarefa= tarefa;
    }
    public String getTarefa(){
        return this.tarefa;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setPrioridade(String prioridade){
        this.prioridade= prioridade;
    }
    public String getPrioridade(){
        return this.prioridade;
    }
    @Override
    public String toString(){
        return "A tarefa: "+this.tarefa+", da descricao: "+this.descricao+", da prioridade: "+this.prioridade;
    }
    @Override
    public int compareTo (Tarefas t) {
        return this.prioridade.compareTo(t.prioridade);        
    }
}

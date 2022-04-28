package controledetarefas;
public class Tarefas implements Comparable <Tarefas>{

    private String tarefa;
    private String descricao;
    private String prioridade;
    
    public Tarefas(String prioridade){//construtor
        this.prioridade=prioridade;
    }
    public Tarefas(String tarefa, String descricao, String prioridade){//não permite repetidos //construtor
        this.tarefa= tarefa;
        this.descricao=descricao;
        this.prioridade=prioridade;
    }
    /*public Tarefas(String descricao){
        this.descricao= descricao;
    }*/
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
    public String toStringPrioridadesComDescricao(){
       return "A descricao: "+this.descricao+", da prioridade: "+this.prioridade; 
    }
    public String toStringDescricao(){
       return "A descricao: "+this.descricao; 
    }
    @Override
    public int compareTo (Tarefas t) {
        return this.descricao.compareTo(t.descricao);        
    }
}

package controledetarefas;

public enum Prioridades {
 
    PRIORIDADE1("1");  
 
    private Prioridades (){}
    private String prioridade;
    Prioridades(String prioridade ) {
        this.prioridade = prioridade;
    }

    public Prioridades getPRIORIDADE() {
        return PRIORIDADE;
    }
     
}
 

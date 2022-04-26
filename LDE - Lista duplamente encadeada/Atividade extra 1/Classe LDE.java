package controledetarefas;
public class LDE {
    
    private Node primeiro;
    private Node ultimo;
    private int qtd;
    
    public boolean isEmpty(){
        if(this.primeiro==null || this.ultimo==null || this.qtd==0){
            return true;
        }else{
            return false;
        }
    }   
    public void inserirOrdenado(Tarefas t){
        Node novo= new Node(t);
        Node aux, pegaAnterior, pegaProximo;
        int retorno;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
            this.primeiro= novo;
            this.ultimo= novo;
            this.qtd++;
            System.out.println("Inserção efetuada!");
        }else{
            if(t.compareTo(this.primeiro.getInfo())>=0){//inserção após o primeiro
               novo.setProx(this.primeiro);
               this.primeiro=novo;
               this.primeiro.setAnt(null);
               this.qtd++;
               System.out.println("Inserção efetuada!");
            }else if(t.compareTo(this.ultimo.getInfo())<=0){//inserção após o fim
                this.ultimo.setProx(novo);
                novo.setAnt(this.ultimo);
                this.qtd++;
                System.out.println("Inserção efetuada!");
            }else{//inserção no meio
               aux= this.primeiro;
               while(aux!=null){
                   retorno= aux.getInfo().getDescricao().compareTo(t.getDescricao());//duas descriçõs iguais não pode
                   if(retorno==0){//é repetido?
                       System.out.println("Está descricao é repetida! Inserção não foi efetuada!");
                       return;
                   }else if(retorno>=0){//inserir no meio
                       pegaAnterior= aux.getAnt();
                       novo.setAnt(pegaAnterior);
                       novo.setProx(aux);
                       pegaAnterior.setProx(novo);
                       aux.setAnt(novo);
                       this.qtd++;
                       System.out.println("Inserção efetuada!");
                       return;
                   }else{
                       aux=aux.getProx();//procurando..
                   }
               }
            }
        }
    }
    public void exibirDescricao(){
        Node aux;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else{
            aux= this.primeiro;
            while(aux!=null){
                System.out.println(aux.getInfo().getDescricao());
                aux=aux.getProx();
            }
        }
    }
    public void exibirPorPrioridade(Tarefas t){
        Node aux;
        int retorno;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else{
            aux=this.primeiro;
            while(aux!=null){
                retorno= aux.getInfo().getPrioridade().compareTo(t.getPrioridade());
                if(retorno==0){
                    System.out.println(aux.getInfo().getDescricao());
                } 
                aux=aux.getProx();
            }
        }
    }
    public void remover(Tarefas t){
        Node aux,pegaAnterior,pegaProximo;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else{
            if(this.qtd==1){
                if(this.primeiro.getInfo().getDescricao().compareTo(t.getDescricao())==0){
                    this.primeiro=null;
                    this.ultimo=null;
                    this.qtd--;
            }else{
                    System.out.println("Vázio!");
            }       
        }else{
                if(this.primeiro.getInfo().getDescricao().compareTo(t.getDescricao())==0){
                    pegaProximo= this.primeiro.getProx();
                    this.primeiro= pegaProximo;
                    this.qtd--;
                }else if(this.ultimo.getInfo().getDescricao().compareTo(t.getDescricao())==0){
                    pegaAnterior= this.ultimo.getAnt();
                    this.ultimo= pegaAnterior;
                    this.qtd--;
                }else{//remoção no meio
                    
                }
            }
        }
    }
    public void exibirTudo(){
        Node aux;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else{
            aux= this.primeiro;
            while(aux!=null){
                System.out.println(aux.getInfo());
                aux=aux.getProx();
            }
        }
    }
}

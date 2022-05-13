package controledetarefas;
import java.util.Scanner;
public class LDE {
    
    private Node primeiro;
    private Node ultimo;
    private int qtd;
    
    private boolean isEmpty(){
        if(this.primeiro==null || this.ultimo==null || this.qtd==0){
            return true;
        }else{
            return false;
        }
    }   
    public void inserirOrdenado(Tarefas t){
        Node novo= new Node(t);
        Node aux, pegaAnterior;
        int retorno;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
            this.primeiro= novo;
            this.ultimo= novo;
            this.qtd++;
            System.out.println("Inserção efetuada!");
        }else{
            if(t.getPrioridade().compareTo(this.primeiro.getInfo().getPrioridade())>=0 && t.getDescricao().compareTo(this.primeiro.getInfo().getDescricao())!=0){//inserção após o primeiro
               novo.setProx(this.primeiro);
               this.primeiro=novo;
               this.primeiro.setAnt(null);
               this.qtd++;
               System.out.println("Inserção efetuada!");
            }else if(t.getPrioridade().compareTo(this.ultimo.getInfo().getPrioridade())<=0 && t.getDescricao().compareTo(this.ultimo.getInfo().getDescricao())!=0){//inserção após o fim
                this.ultimo.setProx(novo);
                novo.setAnt(this.ultimo);
                this.ultimo=novo;
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
                    novo.setAnt(pegaAnterior);//criando meu nó
                    novo.setProx(aux);//criando meu nó
                    pegaAnterior.setProx(novo);//o nó anterior, é o proximo do novo nó inserido
                    aux.setAnt(novo);//o nó próximo, é o anterior novo nó inserido
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
    public void exibirDescricaoComPrioridades(){
        Node aux;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else{
            aux= this.primeiro;
            while(aux!=null){
                System.out.println(aux.getInfo().toStringPrioridadesComDescricao());
                aux=aux.getProx();
            }
        }
    }
    public void exibirPorPrioridade(Tarefas t){
        int contador=0;
        Node aux;
        int retorno;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else{
            aux=this.primeiro;
            while(aux!=null){
                retorno= aux.getInfo().getPrioridade().compareTo(t.getPrioridade());
                if(retorno==0){
                    contador=contador+1;
                    System.out.println(aux.getInfo().getDescricao()+" são ao todo "+contador+" prioridades. ");
                } 
                aux=aux.getProx();
            }
        }
    }
    public void remover(Tarefas t){//para descrição iguais //Falta verificar
        Node pegaAnterior,pegaProximo,retorno;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else if(this.qtd==1){
                if(this.primeiro.getInfo().getDescricao().compareTo(t.getDescricao())==0){
                    this.primeiro=null;
                    this.ultimo=null;
                    this.qtd--;
                    System.out.println("Remoção efetuada!");
                    System.out.println("Listá agora está vazia!");
            }else{
                    System.out.println("Não está na lista!");
                }
        }else{
                retorno= this.buscaMelhorada(t);
                if(retorno==null){
                    System.out.println("Não foi encontrado");
                }        
                if(retorno==this.primeiro){
                    pegaProximo= this.primeiro.getProx();
                    this.primeiro= pegaProximo;
                    this.qtd--;
                    System.out.println("Remoção efetuada!");
                }
                if(retorno==this.ultimo){
                    pegaAnterior= this.ultimo.getAnt();
                    this.ultimo= pegaAnterior;
                    this.qtd--;
                    System.out.println("Remoção efetuada!");
                }else{//remoção no meio
                    pegaAnterior= retorno.getAnt();
                    pegaProximo= retorno.getProx();
                    pegaAnterior.setProx(pegaProximo);
                    pegaProximo.setAnt(pegaAnterior);
                    this.qtd--;
                    System.out.println("Remoção efetuada!");                         
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
    private Node buscaMelhorada(Tarefas t){//para descrições iguais
        Node aux;
        int retorno;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia");
        }else{
            aux= this.primeiro;
            while(aux!=null){
                retorno= aux.getInfo().getDescricao().compareTo(t.getDescricao());
                if(retorno==0){//repetido
                    return aux;
                }else if(retorno>0){//não achouu
                    return null;
                }else{
                    aux=aux.getProx();
                }
            }
        }
        return null;
    }
    public void alterarPrioridade(Tarefas t){
        Scanner in= new Scanner(System.in);
        Node aux;
        String novaPrioridade;
        aux=this.buscaNovaMelhorada(t);
        if(aux==null){
            System.out.println("Este grau de prioridade não existe");
        }else{
            t= aux.getInfo();
            System.out.print("Digite a nova prioridade: ");
            novaPrioridade= in.nextLine();
            t.setPrioridade(novaPrioridade);
            System.out.println("Alteração efetuada!");
            //ainda falta! pois deve jogar para a ordenação
        }    
    }
    private Node buscaNovaMelhorada(Tarefas t){//busca prioridades iguais
        Node aux;
        int retorno;
        if(this.isEmpty()==true){
            return null;
        }else{ 
            aux= this.primeiro;
            while(aux!=null){
                retorno= aux.getInfo().getPrioridade().compareTo(t.getPrioridade());
                if(retorno==0){  
                    return aux;
                }if(retorno<0){
                    return null;
                }else{
                    aux=aux.getProx();
                }
            }
        }
        return null;
    }
}

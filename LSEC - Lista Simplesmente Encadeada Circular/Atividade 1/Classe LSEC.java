package atividade1;
public class LSEC {
    private Node primeiro;
    private Node ultimo;
    private int quantidade;
    
    private boolean isEmpty(){
        if(this.primeiro==null && this.ultimo==null && this.quantidade==0){
            return true;
        }else{
            return false;
        }
    }
    public void inserir(Livro l){//inserirOrdenado
        Node novo= new Node(l);
        Node aux,anterior,atual;
        int retorno;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
            this.primeiro=novo;
            this.ultimo=novo;
            this.quantidade++;
            this.ultimo.setProximo(this.primeiro);
            System.out.println("Inserção efetuada!");
        }else{
            if(l.getTitulo().compareTo(this.primeiro.getInformacao().getTitulo())<0){//inserção no inicio
                novo.setProximo(this.primeiro);
                this.primeiro=novo;
                this.quantidade++;
                this.ultimo.setProximo(this.primeiro);
                System.out.println("Inserção efetuada! No inicio da lista");
                return;
            }
            if(l.getTitulo().compareTo(this.ultimo.getInformacao().getTitulo())>0){//inserção no fim
                this.ultimo.setProximo(novo);
                this.ultimo=novo;
                this.quantidade++;
                this.ultimo.setProximo(this.primeiro);
                System.out.println("Inserção efetuada! No fim da lista");
                return;
            }
            aux= this.primeiro;
            atual= aux.getProximo();
            do{
                if(novo.getInformacao().compareTo(atual.getInformacao())<0){
                    aux.setProximo(novo);
                    novo.setProximo(atual);
                    this.quantidade++;
                    System.out.println("Inserção efetuada!");
                    this.ultimo.setProximo(this.primeiro);
                    return;
                }
                if(novo.getInformacao().compareTo(atual.getInformacao())==0){  
                    System.out.println("Repetido! Inserção não foi realizada!");  
                    return;
                }else{
                    aux=atual;
                    atual= atual.getProximo();
                }
            }while(aux!=this.primeiro);
        }
    }

    public void exibirLista(){
        Node aux;
        if(this.isEmpty()==true){
            System.out.println("Listá vázia!");
        }else{
            aux= this.primeiro;
            do{
                System.out.println(aux.getInformacao());  
                aux=aux.getProximo();
            }while(aux!=this.primeiro);
        }
    }
    
    public void exibirLivro(Livro l){
        Node aux;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else{
            aux= this.primeiro;
            do{
                if(l.getTitulo().compareTo(aux.getInformacao().getTitulo())==0){
                    System.out.println("Livro encontrado!");
                    System.out.println(aux.getInformacao());
                    return;
                }else{
                aux=aux.getProximo();
                }
            }while(aux!=this.primeiro);
            System.out.println("Livro não foi encontrado!");
        }
    }
    /*private Node buscaMelhorada(Livro l){
         Node aux;
         int retorno;
         if(this.isEmpty()==true){
             return null;
         }else{
             aux= this.primeiro;
             do{
                 retorno= l.getTitulo().compareTo(aux.getInformacao().getTitulo());
                 if(retorno==0){
                     return aux;//achei o endereço do nó
                 }else if(retorno>0){
                     return null;
                 }else{
                    aux=aux.getProximo();
                 }
             }while(aux!=this.primeiro);
         }
         return null;
    }*/
    public void remover(Livro l){//remover está errado!
        Node aux,retorno,anterior,atual;
        aux= this.primeiro;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else if(this.quantidade==1){
                if(l.getTitulo().compareTo(this.primeiro.getInformacao().getTitulo())==0){//lista só tem 1 elemento
                    this.primeiro=null;
                    this.ultimo=null;
                    this.quantidade--;
                    System.out.println("Remoção efetuada!");
                    System.out.println("Lista vázia!");
                }else{
                    System.out.println("Não foi encontrado na lista.");
                }
            
        }else if(l.getTitulo().compareTo(this.primeiro.getInformacao().getTitulo())==0){//remoção no primeiro
                this.primeiro= this.primeiro.getProximo();
                this.quantidade--;
                this.ultimo.setProximo(this.primeiro);
                System.out.println("Remoção efetuada!");
                
        }else if(l.getTitulo().compareTo(this.ultimo.getInformacao().getTitulo())==0){//remoção no ultimo
                while(aux!=this.ultimo){
                    aux=aux.getProximo();
                }
                this.ultimo=aux;
                this.quantidade--;
                this.ultimo.setProximo(this.primeiro);
                System.out.println("Remoção efetuada!");
           
        }else{//remoção no meio
                anterior= this.primeiro;
                atual=this.primeiro.getProximo();
                while(atual!=this.ultimo){
                    if(l.getTitulo().compareTo(aux.getInformacao().getTitulo())==0){
                        anterior.setProximo(atual.getProximo());
                        this.quantidade--;
                        this.ultimo.setProximo(this.primeiro);
                        System.out.println("Remoção efetuada!");
                        return;
                    }else{
                        anterior=atual;
                        atual=atual.getProximo(); 
                    }
                }
            }
        }
    }

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
                if(novo.getInformacao().compareTo(atual.getInformacao())<0){//inserção no meio
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

    public void remover(Livro l){//remover ordenado
        Node anterior,atual;
        int retorno;
        //retorno= buscaMelhorada(l);
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
        }else {//lista tem mais 1 elementos
            if(l.getTitulo().compareTo(this.primeiro.getInformacao().getTitulo())==0){//remoção no primeiro
                this.primeiro= this.primeiro.getProximo();
                this.quantidade--;
                this.ultimo.setProximo(this.primeiro);
                System.out.println("Remoção efetuada!");
        }else if(l.getTitulo().compareTo(this.ultimo.getInformacao().getTitulo())==0){//remoção no ultimo
                anterior= this.primeiro;
                while(anterior.getProximo()!=this.ultimo){
                    anterior=anterior.getProximo();
                }
                this.ultimo=anterior;
                this.quantidade--;
                this.ultimo.setProximo(this.primeiro);
                System.out.println("Remoção efetuada!");
        }else if(l.compareTo(this.primeiro.getInformacao())<0){//verifica se for menor que o primeiro
                System.out.println("Livro não encontrado!");
        }else if(l.compareTo(this.ultimo.getInformacao())>0){//verifica se for maior que o ultimo
                System.out.println("Livro não encontrado!");
        }else{
            anterior= this.primeiro;
            atual= anterior.getProximo();
            do{
                retorno= atual.getInformacao().compareTo(l);
                if(retorno==0){//achou //remoção no meio não afeta a circularidade da lista
                    anterior.setProximo(atual.getProximo());
                    this.quantidade--;
                    System.out.println("Remoção efetuada!");
                    return;
                }else if(retorno>0){
                        System.out.println("Livro não encontrado!");
                        return;
                }else{
                    anterior=atual;//anterior=anterior.getProximo();
                    atual= atual.getProximo();
                }
            }while(atual!=this.primeiro);
        }
        }
    }
}

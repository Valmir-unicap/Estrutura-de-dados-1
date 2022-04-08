package listaduplamenteencadeada;
/*
 * @author valmir
 */

//Próximo exercício variações
//1- Inserir em ordem descrescente
//2- Permitir valores repetidos -Após -Antes

//função não se exibe mensagem

public class LDE {//ordenada ordem crescente

    private Node primeiro;
    private int qtd;
    private Node ultimo;
    
    public boolean isEmpty () {
        if(this.primeiro == null && this.qtd == 0 && this.ultimo == null) {
            return true;
        }else {
            return false;
        }
    }   
    public void exibirLista() {
        Node aux;
        if (this.isEmpty() == true) {
            System.out.println("Não existem clientes cadastrados!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }
    public void inserirOrdenado2 (Cliente c) {
        Node novo = new Node (c);
        Node aux,anterior;
        int retorno;
        if (this.isEmpty() == true) { // inserção na lista vazia
            System.out.println("Lista vázia!");
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
            System.out.println("Inserção realizada");
        }else if (c.compareTo(this.primeiro.getInfo()) >= 0) { // inserção antes do primeiro //Feito em aula
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd++;
            System.out.println("Inserção realizada no começo da lista");
        }else if (c.compareTo(this.ultimo.getInfo()) <= 0) { // inserção após o último //Feito em aula
            this.ultimo.setProx(novo);
            novo.setAnt(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
            System.out.println("Inserção realizada no final da lista");
        }else{ //inserir no meio
            aux= this.primeiro;
            while(aux!=null){
                retorno= aux.getInfo().compareTo(c);
                if(retorno==0){ //encontrou mas é repetido
                    System.out.println("Repetido! "); 
                    return;
                } else if (retorno>=0){//inserir no meio
                    anterior= aux.getAnt();
                    novo.setAnt(anterior);//criando meu nó
                    novo.setProx(aux);//criando meu nó
                    anterior.setProx(novo);//o nó anterior, é o proximo do novo nó inserido
                    aux.setAnt(novo);//o nó próximo, é o anterior novo nó inserido
                    this.qtd++;
                    System.out.println("Inserção efetuada!");
                    return;
                }else{//procurando.... aqui o é retono <0
                    aux=aux.getProx();
                }
            }
        }  
    } 
    public Node buscaMelhorada(Cliente c){//serve para buscar no meio em ordem crescente
        Node aux;
        int retorno;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else{
            aux=this.primeiro;
            while(aux!=null){
                retorno= aux.getInfo().compareTo(c);
                if(retorno==0){//acheiii
                    return aux;//endereço do nó
                }else if(retorno>0){//não acheiii!!!!
                    return null;
                }else{//procurando....
                    aux=aux.getProx();
                }
            }
        }
        return null;//não achou o valor, pois o valor é o maior que o ultimo.
    }
    public void Remover(Cliente c){//continuar remoção - exercicio 
        Node retorno, anterior, proximo;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else if(this.qtd==1){
                if(c.compareTo(this.primeiro.getInfo())==0){//lista só tem 1 elemento
                this.primeiro=null;
                this.ultimo=null;
                this.qtd--;
                System.out.println("Remoção efetuada!");
                System.out.println("Lista vázia!");
            }else{
                System.out.println("Não tem na lista");
            }
        }else{
            retorno= buscaMelhorada(c);
                if(retorno==null){
                    System.out.println("Valor não encontrado!");
                }else{
                    if(this.primeiro==retorno){
                        this.primeiro= this.primeiro.getProx();
                        this.primeiro.setAnt(null);
                        this.qtd--;
                        System.out.println("Remoção efetuada!");
                    }else if(this.ultimo==retorno){
                        this.ultimo= this.ultimo.getAnt();
                        this.ultimo.setProx(null);
                        this.qtd--;
                        System.out.println("Remoção efetuada!");
                    }else{
                        anterior= retorno.getAnt();
                        proximo= retorno.getProx();
                        anterior.setProx(proximo);
                        proximo.setAnt(anterior);
                        this.qtd--;
                        System.out.println("Remoção efetuada!");
                    }
                }
            }
        }
    }
 

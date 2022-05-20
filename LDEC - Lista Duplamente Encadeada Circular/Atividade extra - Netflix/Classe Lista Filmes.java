package netflix;
/*
 * @author valmir
 */
public class ListaFilmes {
    private NodeSecundaria primeiro;
    private NodeSecundaria ultimo;
    private int quantidade;
    
    public boolean isEmpty(){
        if(this.primeiro==null && this.ultimo==null && this.quantidade==0){
            return true;
        }else{
            return false;
        }
    }
    
    public void inserirOrdenado(Filme f){
        NodeSecundaria novo= new NodeSecundaria(f);
        NodeSecundaria aux, pegaAnterior, pegaProximo;
        int retorno;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
            this.primeiro=novo;
            this.ultimo=novo;
            this.quantidade++;
            this.ultimo.setProximo(this.primeiro);
            this.primeiro.setAnterior(this.ultimo);
            System.out.println("Inserção efetuada!");
        }else if(f.compareTo(this.primeiro.getInformacao())>0){
            novo.setProximo(this.primeiro);
            this.primeiro.setAnterior(novo);
            this.primeiro=novo;
            this.ultimo.setProximo(this.primeiro);
            this.primeiro.setAnterior(this.ultimo);
            this.quantidade++;
            System.out.println("Inserção efetuada!");
        }else if(f.compareTo(this.ultimo.getInformacao())<0){
            this.ultimo.setProximo(novo);
            novo.setAnterior(this.ultimo);
            this.ultimo=novo;
            this.ultimo.setProximo(novo);
            this.primeiro.setAnterior(this.ultimo);
            this.quantidade++;
            System.out.println("Inserção efetuada!");
        }else{
            aux=this.primeiro;
            do{
                retorno= aux.getInformacao().compareTo(f);
                if(retorno==0){
                    System.out.println("Repetido! Inserção não foi efetuada!");
                }else if (retorno>0){//inserção no meio
                    pegaAnterior= aux.getAnterior();
                    pegaProximo= aux.getProximo();
                    novo.setAnterior(pegaAnterior);
                    pegaAnterior.setProximo(novo);
                    novo.setProximo(pegaProximo);
                    pegaProximo.setAnterior(novo);
                    this.quantidade++;
                    System.out.println("Inserção efetuada!");
                    return;
                }else{
                aux=aux.getProximo();
                }
            }while(aux!=this.primeiro);
        }
    }
    public void exibirFilme(String fime){
        NodePrincipal aux;
        ListaCategorias listas;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else{
            
            
        }
    }
}

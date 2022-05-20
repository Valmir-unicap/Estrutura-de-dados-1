package netflix;
/**
 *
 * @author valmir
 */
public class ListaCategorias {
    private NodePrincipal primeiro;
    private NodePrincipal ultimo;
    private int quantidade;
    
    public boolean isEmpty(){
        if(this.primeiro==null && this.ultimo==null && this.quantidade==0){
            return true;
        }else{
            return false;
        }
    }
    public void inserirOrdenado(Categoria c){
        NodePrincipal novo= new NodePrincipal(c);
        NodePrincipal aux, pegaAnterior, pegaProximo;
        int retorno;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
            this.primeiro=novo;
            this.ultimo=novo;
            this.quantidade++;
            this.ultimo.setProximo(this.primeiro);
            this.primeiro.setAnterior(this.ultimo);
            System.out.println("Inserção efetuada!");
        }else if(c.compareTo(this.primeiro.getInformacao())>0){
            novo.setProximo(this.primeiro);
            this.primeiro.setAnterior(novo);
            this.primeiro=novo;
            this.ultimo.setProximo(this.primeiro);
            this.primeiro.setAnterior(this.ultimo);
            this.quantidade++;
            System.out.println("Inserção efetuada!");
        }else if(c.compareTo(this.ultimo.getInformacao())<0){
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
                retorno= aux.getInformacao().compareTo(c);
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
    public void exibirFilmeDeUmaCategoria(String categoria){
        NodePrincipal aux;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else{
            aux= this.primeiro;
            do{
                if(aux.equals(categoria)){
                    System.out.println(aux.getInformacao());
                }else{
                aux=aux.getProximo();
                }
            }while(aux!=this.primeiro);
        }
    }
     public void exibirFilmes(){
        NodePrincipal aux;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else{
            aux= this.primeiro;
            do{
                System.out.println(aux.getInformacao().getLista());
                aux=aux.getProximo(); 
            }while(aux!=this.primeiro);
        }
    }
}

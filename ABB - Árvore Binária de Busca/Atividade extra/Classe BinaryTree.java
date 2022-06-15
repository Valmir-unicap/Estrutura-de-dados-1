package extraArvore;
public class BinaryTree<T extends Comparable<T>> {
    private TreeNode<T> raiz;

    private boolean isEmpty(){
        if(this.raiz==null){
            return true;
        }else{
            return false;
        }
    }
    public void inserir(T valor){
        if(this.isEmpty()==true){
            this.raiz= new TreeNode(valor);
            System.out.println("Inserção efetuada!");
        }else{
            this.raiz.inserirNode(valor);
        }
    }
    public void inOrdem(){
        if(this.isEmpty()==true){
            System.out.println("Árvore vázia!");
        }else{
            percorrerInOrdem(raiz);
        }
    }
    private void percorrerInOrdem(TreeNode<T> r){
        if(r!=null){
            percorrerInOrdem(r.getEsquerda());
            System.out.println(r.getInformacao());
            percorrerInOrdem(r.getDireita());
        }
    }
    private TreeNode<T> buscarNo(T valor){
        TreeNode<T>aux;
        aux= this.raiz;
        while(aux!=null){
            if(aux.getInformacao().compareTo(valor)==0){
                return aux;
            }else if(aux.getInformacao().compareTo(valor)<0){
                if(aux.getDireita()==null){
                    return null;
                }else{
                    aux=aux.getDireita();
                }
            }else{
                if(aux.getEsquerda()==null){
                    return null;
                }else{
                    aux=aux.getEsquerda();
                }
            }
        }
        return null;
    }
    public T procurarValor(T valor){
        TreeNode<T>procura;
        if(this.isEmpty()==true){
            return null;
        }else{
            procura= this.buscarNo(valor);
            if(procura==null){
                return null;
            }else{
                return procura.getInformacao();
            }
        }
    }
}

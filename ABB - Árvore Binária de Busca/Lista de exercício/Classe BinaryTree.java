package atividade1Arvore;
public class BinaryTree<T extends Comparable<T>> {
    private TreeNode<T>raiz;

    public boolean isEmpty(){
        if(this.raiz==null){
            return true;
        }else{
            return false;
        }
    }
    public void inserir(T valor){
        if(this.isEmpty()==true){
            this.raiz= new TreeNode(valor);
        }else{
            this.raiz.inserirNode(valor);
        }
    }
    private TreeNode<T> procurarMaior(TreeNode<T> maiorValor){
        if(maiorValor.getDireita()!=null){
            maiorValor= procurarMaior(maiorValor.getDireita());
        }
        return maiorValor;
    }
    private TreeNode<T>procurarMenor(TreeNode<T>menorValor){
        if(menorValor.getEsquerda()!=null){
            menorValor= procurarMenor(menorValor.getEsquerda());
        }
        return menorValor;
    }
    public T exibirMaior(){
        if(this.isEmpty()==true){
            return null;
        }else{
            TreeNode<T>aux;
            aux= procurarMaior(raiz);
            return aux.getInformacao();
        }
    }
    public T exibirMenor(){
        if(this.isEmpty()==true){
            return null;
        }else{
            TreeNode<T>aux;
            aux= procurarMenor(raiz);
            return aux.getInformacao();
        }
    }
    public T topo(){
        return this.raiz.getInformacao();
    }
    public TreeNode<T> verificarRaiz(){
        return this.raiz;
    }
    private TreeNode<T> pesquisarNaArvore(T valor){
        TreeNode<T>aux;
        aux= this.raiz;
        while(aux!=null){
            if(aux.getInformacao().compareTo(valor)==0){
                return aux;//achei o que procurava
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
    public T buscarValor(T valor){
        TreeNode<T>aux;
        if(this.isEmpty()==true){
            return null;
        }else{
            aux= this.pesquisarNaArvore(valor);
            if(aux==null){
                return null;
            }else{
                return aux.getInformacao();
            }
        }
    }
    public int quantidadeNo(TreeNode<T> no){
        if(no!=null){
            return quantidadeNo(no.getEsquerda()) + quantidadeNo(no.getDireita())  +1;
        }else{
            return 0;
        }
    }
    public int quantidadeFolhas(TreeNode<T>no){
        int quantidade=0;
        if(no==null){
            return 0;
        }else{
            if(no.getEsquerda()== null && no.getDireita()==null){
                return quantidadeNo(no.getEsquerda()) + quantidadeNo(no.getDireita()) +1;
            }else{
                return quantidadeNo(no.getEsquerda()) + quantidadeNo(no.getDireita());
            }
        }
    }
    public void inOrdem(){
        if(this.isEmpty()==true){
            System.out.println("Árvore vázia!");
        }else{
            percorrerInOrdem(raiz);
        }
    }
    public void percorrerInOrdem(TreeNode<T>r){
        if(r!=null){
            percorrerInOrdem(r.getEsquerda());
            System.out.println(r.getInformacao());
            percorrerInOrdem(r.getDireita());
        }
    }
    public int quantidadeNosNaoTerminal(TreeNode<T> no){
        if(no==null) {
            return 0;
        }else{
            if(no.getDireita()!=null || no.getEsquerda()!=null) {
                return quantidadeNosNaoTerminal(no.getEsquerda()) + quantidadeNosNaoTerminal(no.getDireita()) + 1;
            }else{
                return quantidadeNosNaoTerminal(no.getEsquerda()) + quantidadeNosNaoTerminal(no.getDireita());
            }
        }
    }
}

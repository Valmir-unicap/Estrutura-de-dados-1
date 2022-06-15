package extraArvore;
public class TreeNode<T extends Comparable<T>> {
    private T informacao;
    private TreeNode<T>esquerda;
    private TreeNode<T>direita;

    public TreeNode(T valor){
        this.informacao= valor;
    }
    public void setInformacao(T valor) {
        this.informacao = valor;
    }
    public T getInformacao(){
        return this.informacao;
    }
    public void setEsquerda(TreeNode<T> Novaesquerda) {
        this.esquerda = Novaesquerda;
    }
    public TreeNode<T> getEsquerda(){
        return this.esquerda;
    }
    public void setDireita(TreeNode<T> Novadireita) {
        this.direita = Novadireita;
    }
    public TreeNode<T> getDireita(){
        return this.direita;
    }
    public void inserirNode(T valor){
        if(valor.compareTo(this.informacao)==0){
            System.out.println("Valor repetido!");
            System.out.println("Inserção não foi efetuada!");
        }else if(valor.compareTo(this.getInformacao())<0){
            if(this.esquerda==null){
                this.esquerda= new TreeNode(valor);
                System.out.println("Inserção efetuada!");
            }else{
                this.esquerda.inserirNode(valor);
            }
        }else{
            if(this.direita==null){
                this.direita= new TreeNode(valor);
                System.out.println("Inserção efetuada!");
            }else{
                this.direita.inserirNode(valor);
            }
        }
    }
}

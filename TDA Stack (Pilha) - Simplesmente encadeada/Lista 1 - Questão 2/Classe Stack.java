package pilha;
public class Stack<T> {
    private Node<T> topo;

    public boolean isEmpty(){
        if(this.topo==null){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        return false;
    }
    public T topo(){
        if(this.isEmpty()==true){
            return null;
        }else {
            return this.topo.getInformacao();
        }
    }
    public void push(T valor){//inserir no inicio //LIFO: O ultimo que entrar, é o primeiro que sai.
        Node<T>novo= new Node(valor);
        if(this.isEmpty()==true){
            this.topo=novo;
        }else{
            novo.setProximo(this.topo);
            this.topo=novo;//
        }
    }
    public T pop(){//Remoção do primeiro
        T valor;
        Node<T>aux;
        aux= this.topo;
        this.topo= this.topo.getProximo();
        valor= aux.getInformacao();//valor removido!
        return valor;
    }
}

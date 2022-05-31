public class Queue<T> {
    private Node<T> primeiro;
    private Node<T> ultimo;

    public boolean isEmpty() {
        if (this.primeiro == null && this.ultimo == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        return false;
    }

    public T head() {
        return this.primeiro.getInformacao();
    }

    public void enqueue(T valor) {
        Node<T> novo = new Node(valor);
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            System.out.println("Pedido efetuado!");
        } else {
            this.ultimo.setProximo(novo);
            this.ultimo = novo;
            System.out.println("Pedido efetuado!");
        }
    }

    public T dequeue() {
        Node<T> aux = this.primeiro;
        if (this.primeiro == null) {
            this.ultimo = null;
        } else {
            this.primeiro= this.primeiro.getProximo();
        }
        return aux.getInformacao();
    }
}

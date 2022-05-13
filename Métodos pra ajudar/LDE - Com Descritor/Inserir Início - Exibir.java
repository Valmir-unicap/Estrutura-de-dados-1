// Classe LDE
public class LDE {
    private Node primeiro;
    private int qtd;
    private Node ultimo;
    
    public boolean isEmpty () {
        if (this.primeiro == null && this.qtd == 0 && this.ultimo == null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void inserirInicio (Cliente c) {
        Node novo = new Node (c);
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        }
        else {
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo); // só mudou aqui!!!!!!
            this.primeiro = novo;
            this.qtd++;
        }
        System.out.println("Inserção efetuada!!");
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
}

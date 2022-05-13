// Classe LSE com descritor
// Descritor significa que possui o endereço do último
public class LSEComDescritor {
    private Node primeiro;
    private int qtd;
    private Node ultimo;
    
    public boolean isEmpty() { // está vazia??
        if (this.primeiro == null && this.qtd == 0 && this.ultimo == null) {             
            return true;
        } else {
            return false;
        }
    }
    
    public void inserirFinal(Aluno al) {
        Node novo = new Node(al);
        Node aux;
        if (this.isEmpty() == true) {
            this.primeiro = novo;
        } else {
            this.ultimo.setProx(novo);
        }
        this.ultimo = novo;
        this.qtd++;
        System.out.println("Inserção efetuada com sucesso!!!");
    }
    
    public void inserirInicio(Aluno al) {
        Node novo = new Node(al);
        Node aux;
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
        } else {
            novo.setProx (this.primeiro);
            this.primeiro = novo;
        }       
        this.qtd++;
        System.out.println("Inserção efetuada com sucesso!!!");
    }
    
    public void exibirLista() {
        Node aux;
        if (this.isEmpty() == true) {
            System.out.println("Não existem alunos cadastrados!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }
    
    public void removerPrimeiro() {
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!!");
        }
        else if (this.qtd == 1){
            this.primeiro = null;
            this.ultimo = null;
            this.qtd = 0;
            System.out.println("Remoção efetuada!");
        }
        else {
            this.primeiro = this.primeiro.getProx();
            this.qtd--;
            System.out.println("Remoção efetuada!");
        }
    }
    
    public void removerUltimo() {
        Node aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!!");
        }
        else if (this.qtd == 1){
            this.primeiro = null;
            this.ultimo = null;
            this.qtd = 0;
            System.out.println("Remoção efetuada!");
        }
        else {
            aux = this.primeiro;
            while (aux.getProx() != this.ultimo) {
                aux = aux.getProx();
            }
            aux.setProx(null);
            this.ultimo = aux;
            this.qtd--;
            System.out.println("Remoção efetuada!");
        }        
    }
}

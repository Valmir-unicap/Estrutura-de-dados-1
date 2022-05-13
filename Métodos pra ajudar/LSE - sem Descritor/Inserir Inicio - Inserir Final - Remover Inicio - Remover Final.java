public class LSE {

    private Node primeiro;

    public void removerPrimeiro() {
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!!!");
        } else {
            this.primeiro = this.primeiro.getProx();
            System.out.println("Remoção efetuada com sucesso!");
        }
    }

    public void removerUltimo() {
        Node aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!!!");
        } else if (this.primeiro.getProx() == null) { // um nó
            this.primeiro = null;
            System.out.println("Remoção efetuada!");
        } else { // a lista ter mais de um nó
            aux = this.primeiro;
            while (aux.getProx().getProx() != null) {
                aux = aux.getProx(); // "andar com a variável aux"
            }
            aux.setProx(null);
            System.out.println("Remoção efetuada!");
        }
    }

    public void removerUltimoV2() {
        Node anterior, atual;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!!!");
        } else if (this.primeiro.getProx() == null) { // um nó
            this.primeiro = null;
            System.out.println("Remoção efetuada!");
        } else { // a lista ter mais de um nó
            anterior = this.primeiro;
            atual = anterior.getProx();
            while (atual.getProx() != null) {
                atual = atual.getProx();
                anterior = anterior.getProx();
            }
            anterior.setProx(null);
            System.out.println("Remoção efetuada!");
        }
    }

    public boolean isEmpty() { // está vazia??
        if (this.primeiro == null) {
            return true;
        } else {
            return false;
        }
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

    public void inserirFinal(Aluno al) {
        Node novo = new Node(al);
        Node aux;
        if (this.isEmpty() == true) {
            this.primeiro = novo;
        } else {
            aux = this.primeiro;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(novo);
        }
        System.out.println("Inserção efetuada com sucesso!!!");
    }

    public void inserirInicio(Aluno al) {
        Node novo = new Node(al);
        if (this.isEmpty() == true) {
            this.primeiro = novo;
        } else {
            novo.setProx(this.primeiro);
            this.primeiro = novo;
        }
        System.out.println("Inserção efetuada com sucesso!");
    }
}

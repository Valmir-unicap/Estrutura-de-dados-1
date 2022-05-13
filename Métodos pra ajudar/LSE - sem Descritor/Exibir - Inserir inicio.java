//sem descritor, significa que não possui o endereço do ultimo
public class LSE {
    private Node primeiro;
    
    public boolean isEmpty () { // está vazia??
        if (this.primeiro == null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void exibirLista() {
        Node aux;
        if (this.isEmpty() == true) {
            System.out.println("Não existem alunos cadastrados!");
        }
        else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }            
        }
    }
    
    public void inserir (Aluno al) {
        Node novo = new Node(al);
        if (this.isEmpty() == true) {
            this.primeiro = novo;
        }
        else {
            novo.setProx(this.primeiro);
            this.primeiro = novo;
        }  
        System.out.println("Inserção efetuada com sucesso!");
    }
}

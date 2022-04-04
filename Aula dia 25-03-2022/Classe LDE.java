package listaduplamenteencadeada;
public class LDE {
    private Node primeiro;
    private Node ultimo;
    private int qtd;
    //podemos reutilizar da LSE exibir lista, busca
    //o que muda é inserir, remover, ao contrario
    public boolean isEmpty(){
        if(this.primeiro==null && this.ultimo==null && this.qtd==0){
            return true;
        }else{
            return false;
        }
    } 
    public void inserirInicio(Cliente c){
        Node novo= new Node(c);
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
            this.primeiro=novo;
            this.ultimo=novo;
            this.qtd++;
            System.out.println("Inserção efetuada!");
    }else{
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);//só muda aqui de LSE
            this.primeiro=novo;
            this.qtd++;
            System.out.println("Inserção efetuada!");
        }
    }
    public void exibirLista(){//mesmo codigo de LSE
        Node aux;
         if(this.isEmpty()== true) {
             System.out.println("Lista Vázia");
         }else{
            aux= this.primeiro;//estudar nesse
            while(aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            } 
         }
    }
}

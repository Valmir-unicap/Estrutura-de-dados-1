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
    public void inserirUltimo(Cliente c){
        Node novo= new Node(c);
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
            this.primeiro=novo;
            this.ultimo=novo;
            this.qtd++;
            System.out.println("Inserção efetuada!");
    }else{
          this.ultimo.setProx(novo);
          novo.setAnt(this.ultimo);
          this.ultimo=novo;
          this.qtd++;
            }
        }
    public void RemoverPrimeiro(){
        Node aux;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else{
             if(this.qtd==1){
                 this.primeiro=null;
                 this.ultimo=null;
                 this.qtd--;
                 System.out.println("Remoção efetuada!");
                 System.out.println("Lista agora está vázia!");
            }else{
                 aux=this.primeiro;
                 this.primeiro= this.primeiro.getProx();
                 this.primeiro.setAnt(null);
                 this.qtd--;
                 System.out.println("Remoção efetuada!");
             }
        }
    }
    public void RemoverUltimo(){
        Node aux;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else{
            if(this.qtd==1){
                this.primeiro=null;
                this.ultimo= null;
                this.qtd--;
            }else{
               this.ultimo= this.ultimo.getAnt();//pego o endereço do meu anterior
               this.ultimo.setProx(null);//o proximo do endereço anterior será null
               this.qtd--;
            }
        }
    }
    public void exibirAoContrario(){//exibir de trás pra frente
        Node aux;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else{
            aux=this.ultimo;
            while(aux!=null){
                System.out.println(aux.getInfo());
                aux=aux.getAnt();
            }
        }
    }
}

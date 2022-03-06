package primeiralista;
/*
 * @author valmir
 */
public class LSE {
    private Node primeiro;//inicio com null
    private Node ultimo;//inicio com null
    private int quantidade;//inicia com 0.
    
    public boolean isEmpty() { // Verifica se a lista está vazia?
        if(this.primeiro== null) {
            return true;//está vázio
        }else{
            return false;
        }
    }
    
    public void exibirLista() {
        Node aux;
        if (this.isEmpty()== true) {
            System.out.println("Lista vázia!");
        }else{
            aux= this.primeiro;
            while (aux!= null){//loop para exibir as informações armazenadas
                System.out.println(aux.getInfo());
                aux= aux.getProx();
            }            
        }
    }
    
    public void inserirInicio (Aluno al) {
        Node novo = new Node(al);
        if (this.isEmpty() == true) { //verifica se está vázio
            System.out.println("Lista vázia!");
            this.primeiro= novo;//prim deixa de ser null e passa a ter o endereço do nó.
            this.ultimo= novo;//ult deixa de ser null e passa a ter o endereço do nó.
            this.quantidade++;//armaezena a quantidade de nó, nesse caso agora é 1 nó, já que estava vázio.
        }else{
            novo.setProx(this.primeiro);//insiro o valor antes no inicio da lista, já criada. Ou seja, se eu tenho dois nós. 
            //Esse nó passa ser o primeiro e o segundo nó criado quando a lista estava vázia, passa a ser o segundo nó. 
            this.primeiro= novo;//deixar de ser null, o primeiro elemento do primeiro nó, armazena o valor do primeiro nó.
            this.quantidade++;//armazena a quantidade de nós, que nesse caso agora são 2 nós criaddos
        }  
        System.out.println("Inserção efetuada com sucesso! No início da lista! ");
    }
    
    public void inserirFim(Aluno al){
        Node novo = new Node(al);
        if (this.isEmpty() == true) { //verifica se está vázio
            System.out.println("Lista vázia!");
            this.primeiro= novo;//prim deixa de ser null e passa a ter o endereço do nó.
            this.ultimo= novo;//ult deixa de ser null e passa a ter o endereço do nó.
            this.quantidade++;//armaezena a quantidade de nó, nesse caso agora é 1 nó, já que estava vázio.
        }else{
            this.ultimo.setProx(novo);//Lista não está vázia, guardo o endereço do segundo nó.//Logo eu tenho a ligação entre dois nós.
            this.ultimo= novo;//deixar de ser null, o ultimo elemento do primeiro nó, armazena o valor do segundo nó
            this.quantidade++;//armazena a quantidade de nós, que nesse caso agora são 2 nós criaddos.
        }
        System.out.println("Inserção efetuada com sucesso! No fim da lista! ");
    }
    
    public void removerPrimeiro(){
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else if(this.quantidade==1){ //A lista contém só um nó
            this.primeiro=null; //o endereço do primeiro nó, deixa de existir, e passa a ser null
            this.ultimo= null;//o endereço do último nó, deixa de existir, e passa a ser null
            this.quantidade=0; //A lista volta a estar vázia
            System.out.println("Remoção efetuada!");
        }else{
            this.primeiro= this.primeiro.getProx();////o primiero nó é removido
            this.quantidade--;//removo -1 nó.
            System.out.println("Remoção efetuada!");
        }
    }
    
    public void removerFim(){
        Node aux;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else if(this.quantidade==1){ //A lista contém só um nó
            this.primeiro=null; //o endereço do primeiro nó, deixa de existir, e passa a ser null
            this.ultimo= null;//o endereço do último nó, deixa de existir, e passa a ser null
            this.quantidade=0; //A lista volta a estar vázia
            System.out.println("Remoção efetuada!");
        }else{
            aux= this.primeiro;
            while(aux.getProx()!=this.ultimo){ //percorro até chegar no penultimo nó.
                aux= aux.getProx();//armazeno o penultimo nó encontrado.
            }
           aux.setProx(null);//o penultimo nó passa ser o ultimo nó
           this.ultimo=aux;//o valor armazenado no penultimo nó passa a ser o ultimo valor no ultimo nó.
           this.quantidade--;//removo -1 nó.
           System.out.println("Remoção efetuada!");
        }
    }
}

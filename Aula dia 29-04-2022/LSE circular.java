package listacircularsimplesmenteencadeada;
public class LSECircular {
    private Node primeiro;
    private Node ultimo;
    private int qtd;
    
    public boolean isEmpty(){
        if(this.primeiro==null && this.ultimo==null && this.qtd==0){
            return true;
        }else{
            return false;
        }
    }
    public void inserirInicio(Integer value){
        Node novo= new Node(value);
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
            this.primeiro=novo;
            this.ultimo=novo;
            this.qtd++;
            this.ultimo.setProx(this.primeiro);//lista circular!
            System.out.println("Inserção efetuada!");
        }else{
            novo.setProx(this.primeiro);
            this.primeiro=novo;
            this.qtd++;
            this.ultimo.setProx(this.primeiro);
            System.out.println("Inserção efetuada!");
        }
    }
    public void inserirFinal(Integer value){
        Node novo= new Node(value);
        if(this.isEmpty()==true){
            this.primeiro=novo;
            this.ultimo=novo;
            this.qtd++;
            this.ultimo.setProx(this.primeiro);
            System.out.println("Inserção efetuada!");
        }else{
            this.ultimo.setProx(novo);
            this.ultimo=novo;
            this.qtd++;
            this.ultimo.setProx(this.primeiro);
            System.out.println("Inserção efetuada!");
        }
    }
    public void exibirLista(){
        Node aux;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else{
            aux= this.primeiro;
            do{
                System.out.println(aux.getInfo());
                aux=aux.getProx(); //aux não é o primeiro, e sim o proximo do primeiro.
            }while(aux!=this.primeiro);
        }
    }
    
    /*exibir com for
    for(i=this.qtd; i>0; i--){
        System.out.println(aux.getInfo());
        aux=aux.getProx();
    */
    
    public void removerPrimeiro(){
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else{
            if(this.qtd==1){
                this.primeiro=null;
                this.ultimo=null;
                this.qtd--;
                System.out.println("Remoção efetuada!");
            }else{
                this.primeiro= this.primeiro.getProx();
                this.qtd--;
                this.ultimo.setProx(this.primeiro);
                System.out.println("Remoção efetuada!");
            }
        }
    }
    public void removerUltimo(){
        Node aux;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else{
            if(this.qtd==1){
                this.primeiro=null;
                this.ultimo=null;
                this.qtd--;
                System.out.println("Remoção efetuada!");
            }else{
                aux=this.primeiro;
                while(aux!=this.ultimo){
                    aux=aux.getProx();
                }
                this.ultimo=aux;
                this.ultimo.setProx(this.primeiro);
                this.qtd--;
                System.out.println("Remoção efetuada!");
            }
        }
    }
}

package listaduplamentecircular;
public class LDEC {
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
            this.ultimo.setProx(novo);//lista circular!
            this.primeiro.setAnterior(novo);
            System.out.println("Inserção efetuada!");
        }else{
            novo.setProx(this.primeiro); 
            novo.setAnterior(this.ultimo);
            this.ultimo.setProx(novo);
            this.primeiro.setAnterior(novo);
            this.qtd++;
            this.primeiro=novo;
            System.out.println("Inserção efetuada!");
        }
    }
    public void inserirFinal(Integer value){
        Node novo= new Node(value);
        if(this.isEmpty()==true){
            this.primeiro=novo;
            this.ultimo=novo;
            this.qtd++;
            this.ultimo.setProx(novo);
            this.primeiro.setAnterior(novo);
            System.out.println("Inserção efetuada!");
        }else{
            this.ultimo.setProx(novo);
            novo.setAnterior(this.ultimo);
            this.primeiro.setAnterior(novo);
            novo.setProx(this.primeiro);
            this.qtd++;
            this.ultimo=novo;
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
                this.ultimo.setProx(this.primeiro);
                this.primeiro.setAnterior(this.ultimo);
                this.qtd--;
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
                do{
                    aux=aux.getProx();
                }while(aux.getProx()!=this.ultimo);
                this.ultimo=aux;
                this.ultimo.setProx(this.primeiro);
                this.primeiro.setAnterior(this.ultimo);
                this.qtd--;
                System.out.println("Remoção efetuada!");
            }
        }
    }
    public void concatenar(LDEC lista2){
        if(lista2.isEmpty()==true && this.isEmpty()==true){//caso 1
            System.out.println("Ambas listas estão vázia! - Caso 1");
            }else if(lista2.isEmpty()==true && this.isEmpty()==false){//caso 3
                System.out.println("Lista 2 está vázia! - Caso 3");
            }else if(lista2.isEmpty()==false && this.isEmpty()==true){//caso 2
                System.out.println("Lista 2 tem elementos");//lista 1 está vázia e lista 2 tem elementos
                //atualizar lista 1
                this.primeiro=lista2.primeiro;
                this.ultimo=lista2.ultimo;
                this.ultimo.setProx(lista2.primeiro);
                lista2.primeiro.setAnterior(this.ultimo);
                this.qtd= this.qtd+lista2.qtd;
                //atualizar lista 2
                lista2.primeiro=null;
                lista2.ultimo=null;
                lista2.qtd=0;
                //corrigindo a circularidade
                this.primeiro.setAnterior(this.ultimo);
                this.ultimo.setProx(this.primeiro);
                System.out.println("Concatenação efeutuada! Caso 2");
            }else{//caso 4
                //juntando duas listas
                this.ultimo.setProx(lista2.primeiro);
                lista2.primeiro.setAnterior(this.ultimo);
                //atualizar lista 1
                this.ultimo=lista2.ultimo;
                this.qtd=this.qtd + lista2.qtd;
                //atualizar lista 2
                lista2.primeiro=null;
                lista2.ultimo=null;
                lista2.qtd=0;
                //corrigindo a circularidade
                this.primeiro.setAnterior(this.ultimo);
                this.ultimo.setProx(this.primeiro);
                System.out.println("Concatenação efeutuada! Caso 4");
            }
    }
    public LDEC dividir(){//Uma lista no meio
        Node aux1,aux2;
        int tamanho= this.qtd/2;
        int i;
        //Criando a lista 2
        LDEC lista2= new LDEC();
        //Passo 1 achar meio da lista original
        if(this.isEmpty()==true || this.qtd==1){
            System.out.println("Lista vázia!");
            return lista2;
        }else{
            aux1= this.primeiro;
            for(i=0;i<tamanho;i=i+1){//
                aux1=aux1.getProx();
            }
            aux2= aux1.getProx();
            //Passo 2 - Passar os nós da segunda metade da lista original para a lista 2
            lista2.primeiro=aux2;
            lista2.ultimo=this.ultimo;
            lista2.qtd= this.qtd-tamanho;
            lista2.primeiro.setAnterior(lista2.ultimo);
            lista2.ultimo.setProx(lista2.primeiro);
            //lista 2 foi dividida
            //Passo 3 - Atualizar a lista original
            this.ultimo=aux1;
            this.qtd=tamanho;
            this.primeiro.setAnterior(this.ultimo);
            this.ultimo.setProx(this.primeiro);
            //Retorna nova lista criada
            System.out.println("Divisão de lista efetuada!");
            return lista2;
        }
    }
}

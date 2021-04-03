package br.unicap.c3.ed1;
/*
 * @author valmir
 */
public class LSE<T> {//lista vázia
    private LSENode<T> prim;//inicia com null.
    private LSENode<T> ult;//inicia com null.
    private int qtd;//inicia com 0.
       
    //não precisa implementar um construtor
    
    //métodos publicos para manipulação da lista(remover, cadastrar, exibir e entre outros).
    public void inserirValorFinal(T valor){//Tem um único nó//Foi inserido no final da lista
        LSENode<T> novo= new LSENode(valor);//novo guarda o novo endereço que foi criado o nó.
        if(this.qtd==0){//lista vázia
            this.prim=novo;//prim deixa de ser null e passa a ter o endereço do nó.
            this.ult=novo;//ult deixa de ser null e passa a ter o endereço do nó.
            this.qtd++;//armazena a quantidade de nó que nesse caso é 1 nó criado.
        }else{
            this.ult.setProx(novo);//Lista não está vázia, guardo o endereço do segundo nó.//Logo eu tenho a ligação entre dois nós.
            this.ult= novo;//deixar de ser null, o ultimo elemento do primeiro nó, armazena o valor do segundo nó.
            this.qtd++;//armazena a quantidade de nós, que nesse caso agora são 2 nós criaddos.
        }
        System.out.println("Inserção efetuada!");
    }
    public void inserirValorInicio(T valor){//inserido no inicio da lista, novo nó.
        LSENode<T> novo= new LSENode(valor);//novo guarda o novo endereço que foi criado o nó.
        if(this.qtd==0){//lista vázia
            this.prim= novo;//prim deixa de ser null e passa a ter o endereço do nó.
            this.ult= novo;//ult deixa de ser null e passa a ter o endereço do nó.
            this.qtd++;//armazena a quantidade de nó que nesse caso é 1 nó criado.
        }else{
            novo.setProx(prim);//insiro o valor antes no inicio da lista, já criada. Ou seja, se eu tenho dois nós. 
            //Esse nó passa ser o primeiro e o segundo nó criado quando a lista estava vázia, passa a ser o segundo nó. 
            this.prim= novo;//deixar de ser null, o primeiro elemento do primeiro nó, armazena o valor do primeiro nó.
            this.qtd++;//armazena a quantidade de nós, que nesse caso agora são 2 nós criaddos.
        }
        System.out.println("Inserção efetuada!");
    }
    public void exibirLista(){
        LSENode<T> aux;//variavel de referencia
        if(this.qtd==0){
            System.out.println("Lista vazia!");
        }else{
            aux=this.prim;//aux começa com o endereço do primeiro nó.
            while(aux!=null){//null vai ser o final da busca de todos os nó, na ligação dos nó. Logo ele encerra o busca. 
                System.out.println(aux.getInfo());//exibi a informação do primeiro nó.
                aux=aux.getProx();//passa para próximo nó.
            }
        }
    }
}


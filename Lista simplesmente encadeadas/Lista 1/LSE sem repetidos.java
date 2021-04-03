package br.unicap.c3.ed1.lista1;
/*
 * @author valmito
 */
public class LSESemRepetidos<T extends Comparable<T>> {
    private LSENode<T> prim;
    private LSENode<T> ult;
    private int qtd;
    
    //não precisa de contrutor
    //métodos abaixo
    public void inserirFinal(T valor){
        LSENode<T>novo= new LSENode(valor);//guardo o endereço que foi criado o nó.
        boolean achou;
        if(this.qtd==0){//lista vázia
            this.prim= novo;
            this.ult=novo;
            this.qtd++;//armaezena a quantidade de nó, nesse caso é 1 nó.
        }else{//lista não está vázia
            achou= buscar(valor);
            if(achou==true){//repetido
                System.out.println("Valor repetido! Inserção não efetuada");
        }else{//não achou na busca.
            this.ult.setProx(novo);
            this.ult=novo;
            this.qtd++;//armaezena a quantidade de nó, nesse caso é 2 ou mais nó.
            System.out.println("Inserção efetuada!");    
            }
        }
        System.out.println("Inserção efeutada com sucesso");
    }
    public boolean buscar(T valor){
        LSENode<T> aux;//crio uma variavel de referência auxiliar
        if(this.qtd==0){//se a lista tiver vázia, retorna falso
            return false;
        }else{
            aux= this.prim;//variavel auxiliar, começa com o endereço do primeiro nó.
            while(aux!=null){
                if(aux.getInfo().compareTo(valor)==0){//verifico se tem algum repetido
                    return true;
                }else{
                    aux= aux.getProx();
                }
            }
            return false;
        }
    }
    public void exibirLista(){
        LSENode<T>aux;
        if(this.qtd==0){
            System.out.println("Lista vázia");
        }else{
            aux= this.prim;
            while(aux!=null){
                System.out.println(aux.getInfo());
                aux=aux.getProx();
            }
        }
    }
}

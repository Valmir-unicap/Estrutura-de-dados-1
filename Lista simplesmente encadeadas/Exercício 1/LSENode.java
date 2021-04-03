package br.unicap.c3.ed1;
/*
 * @author valmir
 */
class LSENode<T>{//Visibilidade do pacote
//T serve para definir que essa classe é generica, Esse T siginifa objeto de alguma coisa
    private T info;//endereço do objeto que está guardado no nó.
    private LSENode<T> prox;//endereço do proximo nó da lista
    
    LSENode(T valor){//Construtor vai receber elemento que está no nó;
        this.info= valor;
    }
    void setInfo(T valor){//inserir informação no objeto
        this.info= valor; 
    }
    void setProx(LSENode<T> novoProx){//inserir próximo endereço da próxima lista
        this.prox= novoProx;
    }
    T getInfo(){//retirar informação do objeto
        return this.info;
    }
    LSENode<T> getProx(){//retirar próximo endereço da próxima lista
        return this.prox;
    }
}

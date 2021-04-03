package br.unicap.c3.ed1.lista1;
/*
 * @author valmito
 */
public class LSENode<T extends Comparable <T>>{//usado para comparar objetos
    private T info;
    private LSENode<T> prox;
    
    LSENode(T valor){
        info=valor;
    }
    void setInfo(T valor){
        info= valor;
    }
    T getInfo(){
        return info;
    }
    void setProx(LSENode<T>novoProx){
        prox= novoProx;
    }
    LSENode<T> getProx(){
        return prox;
    }
}
    

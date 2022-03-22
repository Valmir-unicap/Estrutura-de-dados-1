package lsecomdescritor;
import java.util.Scanner;
public class LSEComDescritor {

    private Node primeiro;
    private int qtd;
    private Node ultimo;

    public boolean isEmpty() { // lista está vazia??
        if (this.primeiro == null && this.qtd == 0 && this.ultimo == null) {
            return true;//está vaiza
        } else {
            return false;//não está vazia
        }
    }
    
    private Node buscar(String matr) {
        Node aux;
        if (this.isEmpty() == true) {//lista está vázia?
            return null;
        } else {
            Aluno proc = new Aluno(matr);
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfo().equals(proc) == true) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }
    
    public void inserirFinal(Aluno al) {
        Node novo = new Node(al);
        Node aux;
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
            System.out.println("Inserção efetuada com sucesso!!!");
        } else {
            aux = this.buscar(al.getMatr());
            if (aux == null) {
                this.ultimo.setProx(novo);
                this.ultimo = novo;
                this.qtd++;
                System.out.println("Inserção efetuada com sucesso!!!");
            }else{
                System.out.println("Valor repetido. Não pode inserir.");
            }
        }
    }

    public void inserirInicio(Aluno al) {
        Node novo = new Node(al);
        Node aux;
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
            System.out.println("Inserção efetuada com sucesso!!!");
        } else {
            aux = this.buscar(al.getMatr());
            if (aux == null) {
                novo.setProx(this.primeiro);
                this.primeiro = novo;
                this.qtd++;
                System.out.println("Inserção efetuada com sucesso!!!");
            } else {
                System.out.println("Valor repetido. Não pode inserir.");
            }            
        }
    }

    public void exibirLista() {
        Node aux;
        if (this.isEmpty() == true) {
            System.out.println("Não existem alunos cadastrados!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public void removerPrimeiro() {
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!!");
        } else if (this.qtd == 1) {
            this.primeiro = null;
            this.ultimo = null;
            this.qtd = 0;
            System.out.println("Remoção efetuada!");
        } else {
            this.primeiro = this.primeiro.getProx();
            this.qtd--;
            System.out.println("Remoção efetuada!");
        }
    }

    public void removerUltimo() {
        Node aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!!");
        } else if (this.qtd == 1) {
            this.primeiro = null;
            this.ultimo = null;
            this.qtd = 0;
            System.out.println("Remoção efetuada!");
        } else {
            aux = this.primeiro;
            while (aux.getProx() != this.ultimo) {
                aux = aux.getProx();
            }
            aux.setProx(null);
            this.ultimo = aux;
            this.qtd--;
            System.out.println("Remoção efetuada!");
        }
    }

     public void Remover(String matr){
        Aluno proc = new Aluno(matr);
        Node atual, anterior;
        if(this.isEmpty()==true){//lista vázia
            System.out.println("Lista Vázia!");
        }else if(this.qtd==1){//remoção no inicio da lista. - só tem um elemento a lista
                if(proc.equals(this.primeiro.getInfo())){
                    this.primeiro=null;
                    this.ultimo=null;
                    this.qtd=0;
                    System.out.println("Remoção efetuada! ");
                    }else{
                        System.out.println("Não encontrado!");
                    }
                //é o primeiro? - lista tem mais de um elemento
                }else if(proc.equals(this.primeiro.getInfo())){
                        this.primeiro= this.primeiro.getProx();
                        this.qtd--;
                        System.out.println("Remoção efetuada!");
               //remoção no ultimo
                }else if (proc.equals(this.ultimo.getInfo())){
                            anterior= this.primeiro;
                            while(anterior.getProx()!=this.ultimo){
                                anterior= anterior.getProx();
                            }
                            anterior.setProx(null);
                            this.ultimo= anterior;
                            this.qtd--;
                            System.out.println("Remoção efetuada!");
                            }
                //remoção no meio
                    anterior= this.primeiro;
                    atual= anterior.getProx();
                    while(atual!=null){
                        if(proc.equals(atual.getInfo())==true){
                            anterior.setProx(atual.getProx());//
                            this.qtd--;
                            System.out.println("Remoção efetuada!");
                            return;//interrompe o loop
                        }else{
                            atual= atual.getProx();
                            anterior= anterior.getProx();
                        }
                    }
                }
            }

package atividade6;
public class LSE {
    private Node ultimo;
    private Node primeiro;
    private int quantidade;
    
    public boolean isEmpty(){
        if(this.primeiro==null && this.ultimo==null && this.quantidade==0){
            return true;
        }else{
            return false;
        }
    }
    public void inserirInicio(Integer valor){
        Node novo= new Node(valor);
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
            this.primeiro=novo;
            this.ultimo=novo;
            this.quantidade=0;
            System.out.println("Inserção efetuada!");
        }else{
            novo.setProximo(this.primeiro);
            this.primeiro=novo;
            this.quantidade++;
            System.out.println("Inserção efetuada!");
        }
    }
    public void exibir(){
        Node aux;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else{
            aux= this.primeiro;
            while(aux!=null){
                System.out.println(aux.getInformacao());
                aux=aux.getProximo();
            }
        }
    }
    public LSE intersecao(LSE lista2){
        LSE lista3= new LSE();
        int contador=0;
        Integer valor1,valor2,valor3;
        if(this.isEmpty()==true && lista2.isEmpty()==true){
            System.out.println("Lista vázia");
            return lista3;
        }else{
            Node aux1= this.primeiro;
            
            while(aux1!= null){
                Node aux2= lista2.primeiro;
                while(aux2!=null){
                    if(aux1.getInformacao().compareTo(aux2.getInformacao())==0){
                        valor1= aux1.getInformacao();
                        lista3.inserirInicio(valor1);
                        contador= contador+1;
                        System.out.println("Interpolação efetuada "+contador+" vezes.");
                    }
                    aux2=aux2.getProximo();
                }
                aux1=aux1.getProximo();
                }
            }
        return lista3;
    }
}

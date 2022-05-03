package listaduplamentecircular;
public class LDEC {
    private Node primeiro;
    private Node ultimo;
    private int quantidade;
    
    private boolean isEmpty(){
        if(this.primeiro==null && this.ultimo==null && this.quantidade==0){
            return true;
        }else{
            return false;
        }
    }
    
    public void inserirInicio(Cliente c){//ainda falta implementar
        Node novo= new Node(c);
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
            this.primeiro=novo;
            this.ultimo=novo;
            this.quantidade++;
            this.primeiro.setAnt(novo);
            this.ultimo.setProx(novo);
            System.out.println("Inserção efetuada!");
        }else{
            novo.setProx(this.primeiro);
            this.primeiro=novo;
            this.quantidade++;
            
        }
    }
    public void inserirFinal(Cliente c){
        Node novo= new Node(c);
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
            this.primeiro=novo;
            this.ultimo=novo;
            this.quantidade++;
            this.primeiro.setAnt(novo);
            this.ultimo.setProx(novo);
            System.out.println("Inserção efetuada!");
        }else{
            this.ultimo.setProx(novo);
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            novo.setAnt(this.ultimo);
            this.ultimo=novo;
            this.quantidade++;
            System.out.println("Inserção efetuada! No final da lista");
        }
    }
}

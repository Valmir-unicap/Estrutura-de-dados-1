package listaduplamenteencadeada;
/*
 * @author valmir
 */
public class LDE {

    private Node primeiro;
    private int qtd;
    private Node ultimo;
    
    public boolean isEmpty () {
        if (this.primeiro == null && this.qtd == 0 && this.ultimo == null) {
            return true;
        }else {
            return false;
        }
    }
    
    public void inserirOrdenado (Cliente c) {
        Node novo = new Node (c);
        Node atual;
        if (this.isEmpty() == true) { // inserção na lista vazia
            System.out.println("Lista vázia!");
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
            System.out.println("Inserção realizada");
        }else if (c.compareTo(this.primeiro.getInfo()) < 0) { // inserção antes do primeiro //Feito em aula
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd++;
            System.out.println("Inserção realizada no começo da lista");
        }else if (c.compareTo(this.ultimo.getInfo()) > 0) { // inserção após o último //Feito em aula
            this.ultimo.setProx(novo);
            novo.setAnt(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
            System.out.println("Inserção realizada no final da lista");
        }else{
            atual= this.primeiro;
            while(atual!=null){
                if(novo.getInfo().compareTo(atual.getInfo())<0){//comparo em ordem crescente
                   atual.getAnt().setProx(novo);//sera inserido um novo endereço antes do Prox
                   novo.setProx(atual);
                   novo.setAnt(atual.getAnt());//inserção realizada antes do atual
                   this.qtd++;
                   System.out.println("Inserção realizada!");
                   return;
                 }else{
                    atual= atual.getProx();//procurando....
                }
            }
            System.out.println("Repetido! Inserção não foi realizada!");
        }  
    } 
    
    public void exibirLista() {
        Node aux;
        if (this.isEmpty() == true) {
            System.out.println("Não existem clientes cadastrados!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }
}  

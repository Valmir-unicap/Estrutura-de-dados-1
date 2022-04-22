//ordem descrecente com repetidos    
public void inserirOrdenado2 (Cliente c) {//ordem decrescente
        Node novo = new Node (c);
        Node aux,anterior;
        int retorno;
        if (this.isEmpty() == true) { // inserção na lista vazia
            System.out.println("Lista vázia!");
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
            System.out.println("Inserção realizada");
        }else if (c.compareTo(this.primeiro.getInfo()) > 0) { // inserção antes do primeiro //Feito em aula
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd++;
            System.out.println("Inserção realizada no começo da lista");
        }else if (c.compareTo(this.ultimo.getInfo()) <= 0) { // inserção após o último //Feito em aula
            this.ultimo.setProx(novo);
            novo.setAnt(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
            System.out.println("Inserção realizada no final da lista");
        }else{ //inserir no meio
            aux= this.primeiro;
            while(aux!=null){
                retorno= aux.getInfo().compareTo(c);
                if(retorno<0){//inserir no meio
                    anterior= aux.getAnt();
                    novo.setAnt(anterior);//criando meu nó
                    novo.setProx(aux);//criando meu nó
                    anterior.setProx(novo);//o nó anterior, é o proximo do novo nó inserido
                    aux.setAnt(novo);//o nó próximo, é o anterior novo nó inserido
                    this.qtd++;
                    System.out.println("Inserção efetuada!");
                    return;
                }else{//procurando.... aqui o é retono <0
                    aux=aux.getProx();
                }
            }
        }  
    } 
}

    public void inserirOrdenado(Livro l){//Crescente
        Node novo= new Node(l);
        Node aux,anterior,atual;
        int retorno;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
            this.primeiro=novo;
            this.ultimo=novo;
            this.quantidade++;
            System.out.println("Inserção efetuada!");
        }else{
            if(l.getTitulo().compareTo(this.primeiro.getInformacao().getTitulo())<0){//inserção no inicio
                novo.setProximo(this.primeiro);
                this.primeiro=novo;
                this.quantidade++;
                System.out.println("Inserção efetuada! No inicio da lista");
                return;
            }
            if(l.getTitulo().compareTo(this.ultimo.getInformacao().getTitulo())>0){//inserção no fim
                this.ultimo.setProximo(novo);
                this.ultimo=novo;
                this.quantidade++;
                System.out.println("Inserção efetuada! No fim da lista");
                return;
            }
            aux= this.primeiro;
            atual= aux.getProximo();
            while(aux!=null){
                if(novo.getInformacao().compareTo(atual.getInformacao())<0){//inserção no meio
                    aux.setProximo(novo);
                    novo.setProximo(atual);
                    this.quantidade++;
                    System.out.println("Inserção efetuada!");
                    return;
                }
                if(novo.getInformacao().compareTo(atual.getInformacao())==0){  
                    System.out.println("Repetido! Inserção não foi realizada!");  
                    return;
                }else{
                    aux=atual;
                    atual= atual.getProximo();
                }
            }
        }
    }

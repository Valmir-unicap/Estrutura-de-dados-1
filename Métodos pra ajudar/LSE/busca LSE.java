//Serve para alterar algum informação    
private Node busca(String codigo){
        Node aux;
        if(this.IsEmpty()==true){
            return null;
        }else{
           Produto procura= new Produto(codigo);
           aux= this.primeiro;
           while(aux!=null){
               if(aux.getInfo().equals(procura)==true){
                   return aux;//retorna endereço do nó
               }else{
                   aux= aux.getProx(); //continua procurando se tem repetido
               }
           } 
        }
        return null;//lista vazia ou se não encontrar repetido
    }

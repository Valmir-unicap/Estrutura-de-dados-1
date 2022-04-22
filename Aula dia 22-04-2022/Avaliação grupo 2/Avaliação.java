//buscar no meio em ordem decrescente    
public Node buscaMelhorada(Cliente c){//serve para buscar no meio em ordem decrescente
        Node aux;
        int retorno;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else{
            aux=this.primeiro;
            while(aux!=null){
                retorno= aux.getInfo().compareTo(c);
                if(retorno==0){//acheiii
                    return aux;//endereço do nó
                }else if(retorno<0){//não acheiii!!!!
                    return null;
                }else{//procurando....
                    aux=aux.getProx();
                }
            }
        }
        return null;//não achou o valor, pois o valor é o maior que o ultimo.
    }

    public void RemoverDecrescente(Cliente c){
        Node retorno, anterior, proximo;
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
        }else if(this.qtd==1){
                if(c.compareTo(this.primeiro.getInfo())==0){//lista só tem 1 elemento
                this.primeiro=null;
                this.ultimo=null;
                this.qtd--;
                System.out.println("Remoção efetuada!");
                System.out.println("Lista vázia!");
            }else{
                System.out.println("Não tem na lista");
            }
        }else{
            retorno= buscaMelhorada(c);
                if(retorno==null){
                    System.out.println("Valor não encontrado!");
                }else{
                    if(this.primeiro==retorno){
                        this.primeiro= this.primeiro.getProx();
                        this.primeiro.setAnt(null);
                        this.qtd--;
                        System.out.println("Remoção efetuada!");
                    }else if(this.ultimo==retorno){
				if(retorno.getInfo().compareTo(c)==0){
                        this.ultimo= this.ultimo.getAnt();
                        this.ultimo.setProx(null);
                        this.qtd--;
                        System.out.println("Remoção efetuada!");
				}else{
				return;
                    }else{	
			while(retorno!=null){
				if(retorno.getInfo().compareTo(c)==0){
                       			anterior= retorno.getAnt();
                        		proximo= retorno.getProx();
                        		anterior.setProx(proximo);
                       			proximo.setAnt(anterior);
                       			this.qtd--;
					retorno= proximo;//aqui percorre a lista com o loop
                        		System.out.println("Remoção efetuada!");
                    			}else{
						System.out.println("Remoção efetuada!");
						retrun;
						}
					}
		
               			 }
            		}
        	}
  	  }
 

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

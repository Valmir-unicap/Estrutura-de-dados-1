     public void InserirMeio(Aluno al){
         Node novo= new Node(al);
         Node anterior, atual;
         if(this.isEmpty()==true){
             this.primeiro= novo;
             this.ultimo= novo;
             this.qtd++;
             System.out.println("Inserção efetuada!");
         }else{
                 anterior= this.primeiro;
                 atual= anterior.getProx();
                 while(atual!=null){
                     if(this.qtd==0 && this.qtd==1 && this.qtd==qtd){
                       atual= atual.getProx();
                       anterior= anterior.getProx();  
                }else{
                     anterior.setProx(novo);
                     novo.setProx(atual);
                     this.qtd++;
                     System.out.println("Inserção efetuada!");
                     return;
                }
             }   
         }
     }

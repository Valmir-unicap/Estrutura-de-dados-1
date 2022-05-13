//LSE - Nunca está ordenado
//Não serve para ordenação
//Orenação signfica ordem crescente ou descrescente
public void remover (String matr) {
        Aluno proc = new Aluno (matr);
        Node anterior, atual;
        boolean achou = false;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia");
        }
        else if (this.qtd == 1) {
            if (proc.equals(this.primeiro.getInfo())) {
                this.primeiro = null;
                this.ultimo = null;
                this.qtd = 0;
                System.out.println("Removido!");
            }
            else {
                System.out.println("Não encontrado!");
            }    
        }
        else { // lista tem mais de um elemento
            if (proc.equals(this.primeiro.getInfo()) == true) { // é o primeiro??????
                this.primeiro = this.primeiro.getProx();
                this.qtd--;
                System.out.println("Removido!");
            }
            else if (proc.equals(this.ultimo.getInfo()) == true) { // é o último?????
                anterior = this.primeiro;
                while (anterior.getProx() != this.ultimo) {
                    anterior = anterior.getProx();
                }
                anterior.setProx(null);
                this.ultimo = anterior;
                this.qtd--;
                System.out.println("Removido!!!");
            }
            else { // é um do meio ??????
                anterior = this.primeiro;
                atual = anterior.getProx();
                while (atual != null) {
                    if (proc.equals(atual.getInfo()) == true) {
                        anterior.setProx(atual.getProx());
                        this.qtd--;
                        System.out.println("Removido!!!");
                        achou = true;
                        break;
                    }
                    else {
                        atual = atual.getProx();
                        anterior = anterior.getProx();
                    }
                }
                if (achou == false) {
                    System.out.println("Não achei!!!!");
                }
            }
        }
       
    }
}

package ed1lista2lse;
/*
 * @author valmir
 */
import br.unicap.c3.ed1.listas.LSESemRepetidosLista2;
import br.unicap.c3.ed1.lists2.dados.produtos;
import java.util.Scanner;
public class ED1Lista2LSE {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        LSESemRepetidosLista2<produtos> CriarProdutos= new LSESemRepetidosLista2();
        produtos P;
        int escolha;
        String codigo, descricao;
        int estoque;
        double preco;
        do{
            menu();
            escolha= in.nextInt();
            switch (escolha){
                case 1:
                    System.out.print("Digite o código do produto: ");
                    in.nextLine();//Limpeza de Buffer
                    codigo= in.nextLine();
                    System.out.print("Digite a descrição do produto: ");
                    descricao= in.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    preco= in.nextDouble();
                   // in.nextLine();//Limpeza de Buffer
                    while(preco<=0){//validação
                        System.out.print("Preço inválido, digite novamente: ");
                        preco= in.nextDouble();
                       // in.nextLine();//Limpeza de Buffer
                    }
                    System.out.print("Digite a quantidade desse produto no estoque: ");
                    estoque= in.nextInt();
                  //  in.nextLine();//Limpeza de Buffer
                    while(estoque<0){//validação
                        System.out.print("Estoque inválido, digite novamente: ");
                        estoque= in.nextInt();
                       // in.nextLine();//Limpeza de Buffer
                    }
                    P= new produtos(codigo,descricao,preco,estoque);//crio o produto
        CriarProdutos.insirirNoInicio(P);// o produto criado no inicio da lista.
                    break;
                case 2:
                    System.out.print("Digite o código do produto: ");
                    in.nextLine();//Limpeza de Buffer
                    codigo= in.nextLine();
                    System.out.print("Digite a descrição do produto: ");
                    descricao= in.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    preco= in.nextDouble();
                    in.nextLine();//Limpeza de Buffer
                    while(preco<=0){//validação
                        System.out.print("Preço inválido, digite novamente: ");
                        preco= in.nextDouble();
                        in.nextLine();//Limpeza de Buffer
                    }
                    System.out.print("Digite a quantidade desse produto no estoque: ");
                    estoque= in.nextInt();
                    in.nextLine();//Limpeza de Buffer
                    while(estoque<0){//validação
                        System.out.print("Estoque inválido, digite novamente: ");
                        estoque= in.nextInt();
                        in.nextLine();//Limpeza de Buffer
                    }
                    P= new produtos(codigo,descricao,preco,estoque);//crio o produto
                    CriarProdutos.inserirNoFinal(P);// o produto criado no final da lista.
                    break;
                    
                case 3:
                    CriarProdutos.removerPrimeiroProduto();
                    break;
                    
                case 4:
                    CriarProdutos.removerUltimoProduto();
                    break;
                    
                case 5:
                    CriarProdutos.exibirLista();//exibo todos os produtos listados.
                    break;
                    
                case 6:
                    System.out.print("Informe o codigo do produto: ");
                    in.nextLine();
                    codigo= in.nextLine();
                    exibirProduto(CriarProdutos,codigo);
                    break;
                    
                case 7:
                    System.out.print("Informe o  codigo do produto: ");
                    in.nextLine();
                    codigo= in.nextLine();
                    alterarProduto(CriarProdutos, codigo);
                    break;
                    
                case 0:
                    System.out.println("Fim do programa!");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(escolha!=0);
    }
    public static void menu(){
        System.out.println("Menu de opções");
        System.out.println("");
        System.out.println("1- Inserir novo produto no inicio da lista");
        System.out.println("2- Inserir novo produto no final da lista");
        System.out.println("3- Remover o primeiro produto da lista");
        System.out.println("4- Remover o último produto da lista");
        System.out.println("5- Exibir todos os produtos da lista");
        System.out.println("6- Exibir os dados de um produto da lista");
        System.out.println("7- Alterar dados de um produto da lista");
        System.out.println("0- Sair do programa");
        System.out.print("Escolha uma opção: ");
    }
    public static void exibirProduto(LSESemRepetidosLista2<produtos>receberProduto, String codigo){
        produtos P, resultado;
        P= new produtos(codigo);
        resultado= receberProduto.buscarProdutos(P);
        if(resultado==null){
            System.out.println("Produto não encontrado!");
        }else{
            System.out.println("");
            System.out.println("Dados armazenados do produto");
            System.out.println("");
            System.out.println("Descrição do produto: "+resultado.getDescricao());
            System.out.println("Preço do produto: "+resultado.getPreco());
            System.out.println("Quantidade no estoque: "+resultado.getEstoque());
        }
    }
    public static void alterarProduto(LSESemRepetidosLista2<produtos> receberProduto, String codigo){
        Scanner in= new Scanner(System.in);
        produtos P,resultado;
        P= new produtos(codigo);//
        resultado= receberProduto.buscarProdutos(P);
        double precoNovo;
        int estoqueNovo;
        String descricaoNovo;
        if(resultado==null){
            System.out.println("Produto não encontrado!");
        }else{
            System.out.print("Digite a descricao do produto: ");
            descricaoNovo= in.nextLine();
            resultado.setDescricao(descricaoNovo);
            System.out.print("Digite o preço do produto: ");
            precoNovo= in.nextDouble();
            while(precoNovo<=0){
                System.out.print("Preço inválido, digite novamente: ");
                precoNovo= in.nextDouble();
            }
            resultado.setPreco(precoNovo);
            System.out.print("Digite a quantidade desse produto no estoque: ");
            estoqueNovo= in.nextInt();
            while(estoqueNovo<0){
                System.out.print("Estoque inválido, digite novamente: ");
                estoqueNovo= in.nextInt();
            }
            resultado.setEstoque(estoqueNovo);
            System.out.println("Alteração efetuada!");
        }
    }
}

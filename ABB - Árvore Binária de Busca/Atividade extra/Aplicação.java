package extraArvore;
import java.util.Scanner;
public class Aplicacao {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        Cadastro cadastroProduto= new Cadastro();
        int escolha;
        String codigo, descricao;
        double preco;
        int estoque;
        Produto p;
        do{
            menu();
            escolha= in.nextInt();
            switch (escolha){
                case 1:
                    in.nextLine();
                    System.out.print("Digite o código do produto: ");
                    codigo= in.nextLine();
                    System.out.print("Digite a descrição do produto: ");
                    descricao= in.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    preco= in.nextDouble();
                    while(preco<=0){
                        System.out.println("Preço inválido!");
                        System.out.print("Digite o preço do produto: ");
                        preco= in.nextDouble();
                    }
                    System.out.print("Digite a quantidade deste produto no estoque: ");
                    estoque= in.nextInt();
                    while(estoque<=0){
                        System.out.println("Estoque inválido!");
                        System.out.print("Digite a quantidade deste produto no estoque: ");
                        estoque= in.nextInt();
                    }
                    p= new Produto(codigo,descricao,preco,estoque);
                    cadastroProduto.inserirProduto(p);
                    break;

                case 2:
                    cadastroProduto.exibirTudo();
                    break;

                case 3:
                    in.nextLine();
                    String novoCodigo;
                    System.out.print("Digite o código do produto, que deseja consultar: ");
                    novoCodigo= in.nextLine();
                    cadastroProduto.exibirUMProduto(novoCodigo);
                    break;

                case 4:
                    in.nextLine();
                    String procurarCodigo;
                    System.out.print("Digite o código do produto, que deseja altera o preço: ");
                    procurarCodigo= in.nextLine();
                    cadastroProduto.alterarPreco(procurarCodigo);
                    break;

                case 5:
                    in.nextLine();
                    String buscarCodigo;
                    System.out.print("Digite o código do produto, que deseja altera o estoque: ");
                    buscarCodigo= in.nextLine();
                    cadastroProduto.alterarEstoque(buscarCodigo);
                    break;

                case 0:
                    System.out.println("Fim do programa! @Developer Valmir Júnior");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(escolha!=0);
    }
    public static void menu(){
        System.out.println("");
        System.out.println("Menu");
        System.out.println("");
        System.out.println("1- Cadastrar novo produto");
        System.out.println("2- Exibir todos os produtos cadastrados");
        System.out.println("3- Exibir um único produto");
        System.out.println("4- Alterar preço de um produto");
        System.out.println("5- Alterar estoque de um produto");
        System.out.println("0- Sair do programa!");
        System.out.print("Escolha uma opcão: ");
    }
}

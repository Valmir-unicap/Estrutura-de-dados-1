package extraArvore;
import java.util.Scanner;
public class Cadastro {
    Scanner in= new Scanner(System.in);
    private BinaryTree<Produto>arvore;

    public Cadastro(){
        this.arvore= new BinaryTree();
    }
    public void inserirProduto(Produto p){
        this.arvore.inserir(p);
    }
    public void exibirTudo(){
        this.arvore.inOrdem();
    }
    private Produto buscarProduto(String codigo){
        Produto retorno;
        Produto p= new Produto(codigo);
        retorno= this.arvore.procurarValor(p);
        return retorno;
    }
    public void exibirUMProduto(String codigo){
        Produto retorno;
        retorno= buscarProduto(codigo);
        if(retorno!=null){
            System.out.println(retorno);
        }else{
            System.out.println("Produto não encontrado!");
        }
    }
    public void alterarPreco(String codigo){
        Produto retorno;
        double novoPreco;
        retorno= buscarProduto(codigo);
        if(retorno!=null){
            System.out.print("Informe o novo preco: ");
            novoPreco= in.nextDouble();
            while(novoPreco<=0){
                System.out.println("Preço inválido!");
                System.out.print("Informe o novo preco: ");
                novoPreco= in.nextDouble();
            }
            retorno.setPreco(novoPreco);
            System.out.println("Alteração efetuada!");
        }else{
            System.out.println("Produto não encontrado!");
        }
    }
    public void alterarEstoque(String codigo){
        Produto retorno;
        int novoEstoque;
        retorno= buscarProduto(codigo);
        if(retorno!=null){
            System.out.print("Digite a nova quantidade presente no estoque: ");
            novoEstoque= in.nextInt();
            while(novoEstoque<=0){
                System.out.println("Estoque inválido!");
                System.out.print("Digite a nova quantidade presente no estoque: ");
                novoEstoque= in.nextInt();
            }
            retorno.setEstoque(novoEstoque);
            System.out.println("Alteração efetuada!");
        }else{
            System.out.println("Produto não encontrado!");
        }
    }
}

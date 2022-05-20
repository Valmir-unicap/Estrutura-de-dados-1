package netflix;
import java.util.Scanner;
/**
 *
 * @author valmir
 */
public class Netflix {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int escolha;
        String filme, classificacao, descricao, genero;
        int ano;
        Categoria c;
        Filme f;
        ListaFilmes listaComFilmes= new ListaFilmes();
        ListaCategorias listaComCategorias= new ListaCategorias();
        do{
            menu();
            escolha= in.nextInt();
            switch(escolha){
                case 1:
                    in.nextLine();//Limpeza de buffer
                    System.out.print("Infrome a descrição da categoria: ");
                    descricao= in.nextLine();
                    c= new Categoria(descricao,listaComFilmes);
                    listaComCategorias.inserirOrdenado(c);
                    System.out.print("Informe o nome do filme: ");
                    filme= in.nextLine();
                    System.out.print("Informe o genero do filme "+filme+": ");
                    genero= in.nextLine();
                    System.out.print("Informe a classificacao do filme "+filme+": ");
                    classificacao= in.nextLine();
                    System.out.print("Informe o ano de lançamento do filme "+filme+": ");
                    ano= in.nextInt();
                    f= new Filme (filme,genero,classificacao,ano);
                    listaComFilmes.inserirOrdenado(f);
                    break;
                    
                case 2:
                    
                    break;
                    
                case 3:
                    
                    break;
                    
                case 4:
                    
                    break;
                    
                case 5:
                    listaComCategorias.exibirFilmes();
                    break;
                    
                case 6:
                    in.nextLine();//Limpeza de buffer
                    System.out.print("Informe o nome do filme: ");
                    filme= in.nextLine();
                    listaComCategorias.exibirFilmeDeUmaCategoria(filme);
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
        System.out.println("Netflix");
        System.out.println("");
        System.out.println("Menu de opções");
        System.out.println("");
        System.out.println("1- Cadastrar novo filme");
        System.out.println("2- Remover um filme");
        System.out.println("3- Exibir dados de um fime");
        System.out.println("4- Editar os dados de um filme");
        System.out.println("5- Exibir informações de todos os filmes de todas as categoias");
        System.out.println("6- Exibir informações de todos os filmes de uma dada categoria");
        System.out.println("0- Sair do programa!");
        System.out.print("Escolha uma opção: ");
    }
}

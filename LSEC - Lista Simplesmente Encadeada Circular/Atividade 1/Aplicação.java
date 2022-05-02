package atividade1;
import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        LSEC lista= new LSEC();
        String assunto, titulo, autor;
        int escolha;
        Livro l;
        do{
            menu();
            escolha= in.nextInt();
            switch (escolha){
                case 1://inserir
                    in.nextLine();//limpeza de buffer
                    System.out.print("Digite o titulo do livro: ");
                    titulo= in.nextLine();
                    System.out.print("Digite o nome do autor: ");
                    autor= in.nextLine();
                    System.out.print("Digite o assunto deste livro: ");
                    assunto= in.nextLine();
                    l= new Livro(titulo,autor,assunto);
                    lista.inserir(l);
                    break;
                    
                case 2://remoção
                    in.nextLine();
                    System.out.print("Digite o titulo do livro: ");
                    titulo= in.nextLine();
                    l= new Livro(titulo);
                    lista.remover(l);
                    break;
                    
                case 3://exibir livro especifíco
                    in.nextLine();
                    System.out.print("Digite o titulo do livro: ");
                    titulo= in.nextLine();
                    l= new Livro(titulo);
                    lista.exibirLivro(l);
                    break;
                    
                case 4://exibir todos os livros
                    lista.exibirLista();
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
        System.out.println("1- Inserir livro na lista");
        System.out.println("2- Remover um livro da lista");
        System.out.println("3- Exibir um livro especifíco");
        System.out.println("4- Exibir todos os livros");
        System.out.println("0- Sair do programa!");
        System.out.print("Escolha uma opção: ");
    }
}

package listacircularsimplesmenteencadeada;
import java.util.Scanner;
public class ListaCircularSimplesmenteEncadeada {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        LSECircular lista= new LSECircular();
        Integer numero;
        int escolha;
        do{
            menu();
            escolha= in.nextInt();
            switch (escolha){
                case 1:
                    System.out.print("Digite um numero: ");
                    numero= in.nextInt();
                    lista.inserirInicio(numero);
                    break;
                    
                case 2:
                    System.out.print("Digite um número: ");
                    numero= in.nextInt();
                    lista.inserirFinal(numero);
                    break;
                    
                case 3:
                    lista.removerPrimeiro();
                    break;
                    
                case 4:
                    lista.removerUltimo();
                    break;
                    
                case 5:
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
        System.out.println("1- Inserir Inicio");
        System.out.println("2- Inserir Final");
        System.out.println("3- Remover Primeiro");
        System.out.println("4- Remover Ultimo");
        System.out.println("5- Exibir Lista");
        System.out.println("0- Sair do programa!");
        System.out.print("Escolha uma opção: ");
    }
}

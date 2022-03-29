package listaduplamenteencadeada;
import java.util.Scanner;
public class ListaDuplamenteEncadeada {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        LDE listaClientes= new LDE();
        Cliente c;
        String cpf, nome, fone;
        int escolha;
        do{
            menu();
            escolha= in.nextInt();
            switch(escolha){
                case 1:
                    System.out.println("Digite o cpf: ");
                    cpf= in.nextLine();
                    System.out.println("Digite o nome: ");
                    nome= in.nextLine();
                    System.out.println("Digite o telefone: ");
                    fone= in.nextLine();
                    c= new Cliente(cpf,nome,fone);
                    listaClientes.inserirInicio(c);
                    break;
                case 2:
                    listaClientes.exibirLista();
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
        System.out.println("Menu");
        System.out.println("1- Inserir cliente na lsita");
        System.out.println("2- Exibir clientes cadastrados");
        System.out.println("3- Sair do programa");
        System.out.print("Escolha: ");
    }
}

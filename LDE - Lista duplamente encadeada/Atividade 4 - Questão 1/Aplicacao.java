package lista4q1;
import java.util.Scanner;
public class ListaDuplamenteEncadeada {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        LDE listaClientes= new LDE();
        LDE listaCliente2= new LDE();
        Cliente c;
        String cpf, nome, fone, email;
        int escolha;
        do{
            menu();
            escolha= in.nextInt();
            switch(escolha){
                case 1:
                    in.nextLine();
                    System.out.print("Digite o cpf: ");
                    cpf= in.nextLine();
                    System.out.print("Digite o nome: ");
                    nome= in.nextLine();
                    System.out.print("Digite o telefone: ");
                    fone= in.nextLine();
                    System.out.print("Digite o email: ");
                    email= in.nextLine();
                    c= new Cliente(cpf,nome,fone,email);
                    listaClientes.inserirOrdenado2(c);
                    break;
                    
                    
                case 2:
                    in.nextLine();
                    System.out.print("Digite o cpf: ");
                    cpf= in.nextLine();
                    System.out.print("Digite o nome: ");
                    nome= in.nextLine();
                    System.out.print("Digite o telefone: ");
                    fone= in.nextLine();
                    System.out.print("Digite o email: ");
                    email= in.nextLine();
                    c= new Cliente(cpf,nome,fone,email);
                    listaCliente2.inserirOrdenado2(c);
                    break;
                    
                case 3:
                    listaClientes.exibirLista();
                    break;
                case 4:
                    listaCliente2.exibirLista();
                    break;
                case 5:
                    LDE intersercao= listaClientes.interseção(listaCliente2);
                    intersercao.exibirLista();
                    break;
                case 0:
                    System.out.println("Fim do programa! @Developer Valmir Jr");
                    break;
                default: 
                    System.out.println("Opção inválida!");
                    break;
            }    
        }while(escolha!=0);
    }
    
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1- Inserir cliente na lista 1");
        System.out.println("2- Inserir cliente na lista 2");
        System.out.println("3- Exibir clientes cadastrados lista 1");
        System.out.println("4- Exibir clientes cadastrados lista 2");
        System.out.println("5- Interseção");
        System.out.println("0- Sair do programa");
        System.out.print("Escolha: ");
    }
}

package listaduplamenteencadeada;
import java.util.Scanner;
/*
 * @author valmir
 */
public class ListaDuplamenteEncadeada {
    public static void main(String[] args) {
        LDE listaClientes = new LDE();
        Scanner in = new Scanner(System.in);
        int op;
        Cliente cliente;
        String cpf, nome, email,fone;
        do {
            exibirMenu();
            op = in.nextInt();
            switch(op) {
                case 1: 
                    in.nextLine();
                    System.out.print("Informe o CPF do cliente: ");
                    cpf= in.nextLine();
                    System.out.print("Digite seu nome: ");  
                    nome=in.nextLine();
                    System.out.print("Digite seu email: ");
                    email= in.nextLine();
                    System.out.print("Digite seu telefone: ");
                    fone= in.nextLine();
                    cliente = new Cliente(cpf,nome,email,fone);
                    listaClientes.inserirOrdenado(cliente);
                    break;
                case 2 : 
                    listaClientes.exibirLista();
                    break;
                case 0 : 
                    System.out.println("Fim do programa!");
                    break;
                default: 
                    System.out.println("Opção inválida!");
                    break;
            }            
        } while (op!=0);                
    }
     
    public static void exibirMenu() {
        System.out.println("");
        System.out.println("Menu de opções");
        System.out.println("");
        System.out.println("1 - Cadastrar um novo cliente na lista");
        System.out.println("2 - Exibir todos os clientes cadastrados");
        System.out.println("0 - Sair do programa");
        System.out.print("Informe a opção desejada: ");
    }
}

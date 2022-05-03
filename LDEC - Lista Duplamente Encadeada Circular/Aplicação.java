package listaduplamentecircular;
import java.util.Scanner;
public class ListaDuplamenteCircular {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        LDEC lista= new LDEC();
        int escolha;
        Cliente c;
        String cpf,fone,email,nome;
        do{
            menu();
            escolha=in.nextInt();
            switch (escolha){
                case 1:
                    in.nextLine();
                    System.out.print("Digite o cpf: ");
                    cpf= in.nextLine();
                    System.out.print("Digite o nome: ");
                    nome= in.nextLine();
                    System.out.print("Digite o email");
                    email= in.nextLine();
                    System.out.print("Digite o telefone:");
                    fone= in.nextLine();
                    c= new Cliente(cpf,nome,email,fone);
                    lista.inserirFinal(c);
                    break;
                    
                case 2:
                    
                    break;
                    
                case 3:
                    
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
        System.out.println("Menu");
        System.out.println("");
        System.out.println("1- Inserir no início da lista");
        System.out.println("2- Inserir no fim da lista");
        System.out.println("3- Exibir lista");
        System.out.println("0- Sair do programa");
        System.out.print("Escolha uma opção: ");
    }
}

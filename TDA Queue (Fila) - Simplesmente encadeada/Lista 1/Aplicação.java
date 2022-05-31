import java.util.Scanner;
import java.security.SecureRandom;
public class Aplicacao {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        Queue<Restaurante> lanchonete= new Queue();
        Restaurante R;
        int escolha,mesa,totalMesa;
        String pedido,nome;
        System.out.print("Quantas mesas tem no seu restaurante: ");
        totalMesa= in.nextInt();
        while(totalMesa<0){
            System.out.println("Mesa inválida");
            System.out.print("Digite novamente: ");
            totalMesa= in.nextInt();
        }
        do{
            menu();
            escolha= in.nextInt();
            switch (escolha){
                case 1:
                    in.nextLine();
                    System.out.print("Digite o nome do cliente: ");
                    nome= in.nextLine();
                    System.out.print("Digite a descricao do pedido: ");
                    pedido= in.nextLine();
                    System.out.print("Digite o número da mesa: ");
                    mesa= in.nextInt();
                    while(mesa<0 || totalMesa<mesa){
                        System.out.println("Mesa inválida");
                        System.out.print("Digite novamente: ");
                        mesa= in.nextInt();
                    }
                    R= new Restaurante(nome,pedido,mesa);
                    lanchonete.enqueue(R);
                    break;

                case 2:
                    System.out.println(lanchonete.head());
                    break;

                case 3:
                    Restaurante recebe;
                    recebe= lanchonete.dequeue();
                    System.out.println("Pedido pronto: "+recebe);
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
        System.out.println("1- Cadastrar pedido");
        System.out.println("2- Verificar pedido da vez");
        System.out.println("3- Executar pedido da vez");
        System.out.println("0- Sair do programa!");
        System.out.print("Escolha uma opção: ");
    }
}

package pilha;
import java.util.Scanner;
public class Aplicacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int decimal, escolha;
        do{
            menu();
            escolha= in.nextInt();
            switch(escolha){
                case 1:
                    in.nextLine();
                    System.out.print("Digite um número decimal: ");
                    decimal= in.nextInt();
                    while (decimal < 0) {
                        System.out.print("Inválido! Digite novamente: ");
                        decimal= in.nextInt();
                    }
                    System.out.print("Binário= ");
                    conversao(decimal);
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
    public static void conversao(int decimal){
        Stack<Integer> pilha= new Stack<>();
        int resto, quociente, valor;
        do{
            resto= decimal%2;
            quociente= decimal/2;
            pilha.push(resto);
            decimal= quociente;
        }while(decimal!=0);
        while(pilha.isEmpty()==false){
            valor= pilha.pop();
            System.out.print(valor);
        }
        System.out.println();
    }
    public static void menu(){
        System.out.println("");
        System.out.println("Menu");
        System.out.println("");
        System.out.println("1- Converter número decimal em binário");
        System.out.println("0- Sair do programa!");
        System.out.print("Escolha uma opção: ");
    }
}

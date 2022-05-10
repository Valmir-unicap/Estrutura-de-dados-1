package listaduplamentecircular;
import java.util.Scanner;
public class ListaDuplamenteCircular {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        LDEC lista= new LDEC();
        LDEC lista2= new LDEC();
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
                case 6:
                    System.out.print("Digite um numero: ");
                    numero= in.nextInt();
                    lista2.inserirInicio(numero);
                    break;
                    
                case 7: 
                    System.out.print("Digite um numero: ");
                    numero= in.nextInt();
                    lista2.inserirFinal(numero);
                    break;
                    
                case 8:
                    lista2.removerPrimeiro();
                    break;
                    
                case 9:
                    lista2.removerUltimo();
                    break;
                    
                case 10:
                    lista2.exibirLista();
                    break;
                    
                case 11:
                    lista.concatenar(lista2);
                    break;
                    
                case 12:
                    lista2=lista.dividir();
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
        System.out.println("1- Inserir no inicio / lista 1");
        System.out.println("2- Inserir no final / lista 1");
        System.out.println("3- Remover o primeiro / lista 1");
        System.out.println("4- Remover o ultimo / lista 1");
        System.out.println("5- Exibir / lista 1");
        System.out.println("6- Inserir no início / lista 2");
        System.out.println("7- Inserir no final / lista 2");
        System.out.println("8- Remover primeiro / lista 2");
        System.out.println("9- Remover ultimo / lista 2");
        System.out.println("10- Exibir / lista 2");
        System.out.println("11- Concatenar listas");
        System.out.println("12- Dividir listas");
        System.out.println("0- Sair do programa!");
        System.out.print("Escolha uma opção: ");
    }
}

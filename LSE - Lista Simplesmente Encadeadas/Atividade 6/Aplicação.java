package atividade6;
import java.util.Scanner;
public class Atividade6 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        LSE lista= new LSE();
        LSE lista2= new LSE();
        LSE lista3= new LSE();
        int escolha, numero;
        Integer valor;
        do{
            menu();
            escolha= in.nextInt();
            switch (escolha){
                case 1:
                    System.out.print("Digite um número: ");
                    valor= in.nextInt();
                    lista.inserirInicio(valor);
                    break;
                    
                case 2:
                    System.out.print("Digite um número: ");
                    valor= in.nextInt();
                    lista2.inserirInicio(valor);
                    break;
                    
                case 3:
                    lista.exibir();
                    break;
                    
                case 4:
                    lista2.exibir();
                    break;          
                    
                case 5:
                    lista3= lista.intersecao(lista2);
                    lista3.exibir();
                    break;
                    
                case 0:
                    System.out.println("Fim do programa! Developer Valmir Júnior");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
                    break;
                    
            }
        }while(escolha!=0);
    }
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1- Inserir na lista 1");
        System.out.println("2- Inerir na lista 2");
        System.out.println("3- Exibir lista 1");
        System.out.println("4- Exibir lista 2");
        System.out.println("5- Interpolação");
        System.out.println("0- Fim do programa!");
        System.out.print("Escolha uma opção: ");
    }
}

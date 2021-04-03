package exemplolistasencadeadas;
import br.unicap.c3.ed1.LSE;
import java.util.Scanner;
/*
 * @author valmir
 */
public class ExemploListasEncadeadas {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        LSE<Integer> numeros= new LSE();//Integer pois estou trabalhando com objeto, usado  para tipos primitivos
        int op,num;
        do{
            System.out.println("1-Inserir um valor, no inicio da lista");
            System.out.println("2-Inserir um valor, no final da lista");
            System.out.println("3-Exibir a lista ");
            System.out.println("0-Encerrar programa");
            System.out.print("Escolha a opção desejada: ");
            op= in.nextInt();
            switch(op){
                case 1:
                    System.out.print("Informe o valor a ser inserido: ");
                    num= in.nextInt();
                    numeros.inserirValorInicio(num);
                    break;
                case 2:
                    System.out.print("Informe o valor a ser inserido: ");
                    num= in.nextInt();
                    numeros.inserirValorFinal(num);
                    break;
                case 3:
                    numeros.exibirLista();
                    break;
                case 0:
                    System.out.println("Fim do programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(op!=0);
    }
    
}

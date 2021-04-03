package lista1.lse.ed1;
/*
 * @author valmito
 */
import br.unicap.c3.ed1.lista1.LSESemRepetidos;
import java.util.Scanner;
public class ED1Lista1LSE{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        LSESemRepetidos<Integer>A= new LSESemRepetidos();//numeros pares
        LSESemRepetidos<Integer>B= new LSESemRepetidos();//numeros impar
        int escolha, numero;
        do{
            System.out.println("Menu de opções");
            System.out.println("1- Armazenar número");
            System.out.println("2- Procurar número");
            System.out.println("3- Exibir números pares");
            System.out.println("4- Exibir números impares");
            System.out.println("5-Encerrar programa");
            System.out.print("Escolha uma das opções acima: ");
            escolha= in.nextInt();
            switch(escolha){
                case 1:
                    System.out.print("Insira um número: ");
                    numero= in.nextInt();
                    if(numero%2==0){//par
                        A.inserirFinal(numero);
                    }else{//impar
                        B.inserirFinal(numero);
                    }
                    break;
                case 2:
                    boolean achou;
                    System.out.print("Insira o número, que deseja procurar: ");
                    numero= in.nextInt();
                    if(numero%2==0){//numero par
                     achou= A.buscar(numero);
                     if(achou==true){//achou
                         System.out.println("Achou o número procurado: "+numero);
                     }else{//não achou
                         System.out.println("Não achou o número procurado, esse número não foi armazenado");
                     }
                    }else{//numero impar
                        achou= B.buscar(numero);
                        if(achou==true){//achou
                            System.out.println("Achou o número procurado: "+numero);
                        }else{//não achou
                            System.out.println("Não achou o numero procurado, esse número não foi armazenado");
                        }
                    }
                    break;
                    
                case 3:
                    A.exibirLista();
                    break;
                    
                case 4:
                    B.exibirLista();
                    break;
                    
                case 5:
                    System.out.println("Fim do programa!");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(escolha!=5);
    } 
}

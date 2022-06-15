package atividade1Arvore;
import java.util.Scanner;
public class Aplicacao {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        BinaryTree<Integer>arvore= new BinaryTree();
        int escolha,numero;
        do{
            menu();
            escolha= in.nextInt();
            switch (escolha){
                case 1:
                    in.nextLine();
                    System.out.print("Digite um número: ");
                    numero= in.nextInt();
                    while(numero<=0){
                        System.out.println("Inválido! Tente novamente!");
                        System.out.print("Digite um número: ");
                        numero= in.nextInt();
                    }
                    arvore.inserir(numero);
                    break;

                case 2:
                    if(arvore.isEmpty()==true){
                        System.out.println("Árvore vázia!");
                    }else {
                        System.out.println("Raiz: " + arvore.topo());
                    }
                    break;

                case 3:
                    if(arvore.isEmpty()==true){
                        System.out.println("Árvore vázia!");
                    }else{
                        System.out.println("Maior valor na árvore: "+arvore.exibirMaior());
                    }
                    break;

                case 4:
                    if(arvore.isEmpty()==true){
                        System.out.println("Árvore vázia!");
                    }else{
                        System.out.println("Menor valor na árvore: "+arvore.exibirMenor());
                    }
                    break;

                case 5:
                    int quantidade;
                    quantidade= arvore.quantidadeNo(arvore.verificarRaiz());
                    System.out.println("A quantidade de nós= "+quantidade);
                    break;

                case 6:
                    int folhas;
                    folhas= arvore.quantidadeFolhas(arvore.verificarRaiz());
                    System.out.println("A quantidade de folhas= "+folhas);
                    break;

                case 7:
                    int naoTerminal;
                    naoTerminal= arvore.quantidadeNosNaoTerminal(arvore.verificarRaiz());
                    System.out.println("A quantidade de nós não terminal= "+naoTerminal);
                    break;

                case 8:
                    Integer aux;
                    int procurarNumero;
                    System.out.print("Digite um número que deseja procurar: ");
                    procurarNumero= in.nextInt();
                    aux= arvore.buscarValor(procurarNumero);
                    if(aux==null){
                        System.out.println("Valor não encontrado!!");
                    }else{
                        System.out.println("Valor encontrado= "+aux);
                    }
                    break;

                case 9:
                    System.out.println("Valores armazenados: ");
                    arvore.inOrdem();
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
        System.out.println("1- Cadastar novo elemento");
        System.out.println("2- Ver topo");
        System.out.println("3- Maior número cadastrado");
        System.out.println("4- Menor número cadastrado");
        System.out.println("5- Contar quantos nós da arvore");
        System.out.println("6- Contar números de folhas da árvore");
        System.out.println("7- Contar número de nós não terminais na árvore");
        System.out.println("8- Procurar um valor na árvore");
        System.out.println("9- Exibir arvore");
        System.out.println("0- Sair do programa!");
        System.out.print("Escolha uma opção: ");
    }
}

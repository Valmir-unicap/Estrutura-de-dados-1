import java.util.Scanner;
public class Aplicacao {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        Stack<String>pilha= new Stack();
        int escolha;
        String frase;
        do{
            menu();
            escolha= in.nextInt();
            switch(escolha){
                case 1:
                    in.nextLine();
                    System.out.print("Digite a frase: ");
                    frase= in.nextLine();
                    String verificar;
                    verificar= palindromo(frase);
                    if(verificar==null){
                        System.out.println("Está frase não é palindromo!");
                        System.out.println("Inserção não efetuada! ");
                    }else {
                        System.out.println("Está frase é palindromo!");
                        pilha.push(verificar);
                    }
                    break;

                case 2:
                    System.out.println(pilha.topo());
                    break;

                case 3:
                    String recebe;
                    recebe= pilha.pop();
                    System.out.println("Valor desempilhado: "+recebe);
                    break;

                case 4:
                    pilha.exibirTudo();
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
        System.out.println("1- Inserir nova frase");
        System.out.println("2- Exibir frase do topo");
        System.out.println("3- Remover frase do topo");
        System.out.println("4- Exibir tudo!");
        System.out.println("0- Sair do programa!");
        System.out.print("Escolha uma opção: ");
    }
    public static String palindromo(String frase){
        String stAux = frase.replaceAll("\\s+", "");
        String stReverse = new StringBuilder(stAux).reverse().toString();
        String stReverseAux = new StringBuilder(frase).reverse().toString();
        System.out.println("Original: " + frase);
        System.out.println("Invertido: " + stReverseAux);
        if (stAux.equals(stReverse)) {
            return frase;//É um palíndromo
        }else {
            return null;//Não é um palíndromo
        }
    }
}

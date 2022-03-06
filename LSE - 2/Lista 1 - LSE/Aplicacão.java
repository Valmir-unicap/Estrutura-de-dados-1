package primeiralista;
import java.util.Scanner;
/*
 * @author valmir
 */
public class PrimeiraLista {
    public static void main(String[] args) {
        LSE listaAlunosP1 = new LSE();
        Scanner in = new Scanner (System.in);
        Aluno aluno;
        String nome, matr;
        double media;
        int faltas, opcao;
        do {   
            exibirMenu();
            opcao= in.nextInt();
            in.nextLine();
            switch(opcao) {
                case 1: 
                          System.out.print("Digite o nome do aluno: ");
                          nome = in.nextLine();
                          System.out.print("Digite a matrícula do aluno: ");
                          matr = in.nextLine();
                          System.out.print("Digite a média do aluno "+nome+ ": ");
                          media= in.nextDouble();
                          System.out.print("Digite a quantidade de faltas do aluno "+nome+ ": ");
                          faltas= in.nextInt();
                          aluno = new Aluno(matr,nome,media,faltas);
                          listaAlunosP1.inserirInicio(aluno);
                           break;
                case 2: 
                          listaAlunosP1.removerPrimeiro();
                           break;
                case 3:
                          System.out.print("Digite o nome do aluno: ");
                          nome = in.nextLine();
                          System.out.print("Digite a matrícula do aluno: ");
                          matr = in.nextLine();
                          System.out.print("Digite a média do aluno "+nome+ ": ");
                          media= in.nextDouble();
                          System.out.print("Digite a quantidade de faltas do aluno "+nome+ ": ");
                          faltas= in.nextInt();
                          aluno = new Aluno(matr,nome,media,faltas);
                          listaAlunosP1.inserirFim(aluno);
                           break;  
                case 4: 
                           listaAlunosP1.removerFim();
                           break;
                    
                case 5: 
                           listaAlunosP1.exibirLista();
                           break;
                case 0:    System.out.println("Fim do Programa! @Developer Valmir Jr");
                           break;
                default  : System.out.println("Opção inválida!");
                           break;                  
            }            
        } while(opcao!=0);                
    }
     
    public static void exibirMenu() {
        System.out.println("Menu de opções");
        System.out.println("1 - Inserir um novo aluno no início da lista um novo aluno"); //feito em aula
        System.out.println("2 - Remover o primeiro aluno da lista");
        System.out.println("3 - Inserir um novo aluno no final da lista");
        System.out.println("4 - Remover último aluno da lista");
        System.out.println("5 - Exibir todos alunos da lista");//feito em aula
        System.out.println("0 - Sair do programa");
        System.out.print("Escolha uma opção: ");
    }
}

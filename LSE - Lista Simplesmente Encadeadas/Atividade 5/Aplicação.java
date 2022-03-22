package lsecomdescritor;
import java.util.Scanner;
public class Atividade5 {
public static void main(String[] args) {
        LSEComDescritor listaAlunosP1 = new LSEComDescritor();
        Scanner in = new Scanner (System.in);
        char op;
        Aluno aluno;
        String nome, matr;
        double media;
        int faltas;
        do {
            exibirMenu();
            op = in.next().charAt(0); in.nextLine();
            switch(op) {
                case '1': 
                          System.out.print("Digite a matrícula do aluno: ");
                          matr = in.nextLine();
                          System.out.print("Digite o nome do aluno: ");
                          nome= in.nextLine();
                          System.out.print("Digite a média do aluno: ");
                          media= in.nextDouble();
                          System.out.print("Digite a quantidade de faltas do aluno: ");
                          faltas= in.nextInt();
                          aluno = new Aluno(matr,nome,media,faltas);
                          listaAlunosP1.inserirInicio(aluno);
                          break;
                case '2' : 
                           listaAlunosP1.removerPrimeiro();
                           break;
                case '3' :
                          System.out.print("Qual a matrícula do aluno? ");
                          matr = in.nextLine();
                          aluno = new Aluno(matr);
                          listaAlunosP1.inserirFinal(aluno);
                          break;
                case '4' : 
                           listaAlunosP1.removerUltimo();
                           break;
                case '5' : 
                           listaAlunosP1.exibirLista();
                           break;
                case '6':
                          System.out.print("Digite a matricula do aluno: ");
                          matr= in.nextLine();
                          listaAlunosP1.Remover(matr);
                          break;
                case '0' : System.out.println("Fim do programa!");
                           break;
                default: System.out.println("Opção inválida!");
                         break;
            }            
        } while (op != '0');                
    }
     
    public static void exibirMenu() {
        System.out.println("Menu de opções");
        System.out.println("1- Cadastrar um novo aluno no início");
        System.out.println("2- Remover aluno no início da lista");
        System.out.println("3- Cadastrar um novo aluno no final");
        System.out.println("4- Remover aluno do final da lista");
        System.out.println("5- Exibir alunos da turma");
        System.out.println("6- Remover um aluno específico");
        System.out.println("0- Sair do programa");
        System.out.print("Informe a opção desejada: ");
    }
}

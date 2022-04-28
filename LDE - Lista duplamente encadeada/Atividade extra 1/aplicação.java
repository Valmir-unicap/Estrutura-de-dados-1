package controledetarefas;
import java.util.Scanner;
public class ControleDeTarefas {
    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
       LDE listaTarefas= new LDE();
       String tarefa, descricao, prioridade;
       int escolha, conversao;
       Tarefas t;
       do{
           menu();
           escolha= in.nextInt();
           switch(escolha){
               case 1://criar nova tarefa ordenada
                   in.nextLine();
                   System.out.print("Digite o titulo da tarefa: ");
                   tarefa= in.nextLine();
                   System.out.print("Digite a descrição da tarefa: ");
                   descricao= in.nextLine();
                   System.out.print("Digite o grau de prioridade desta tarefa: ");
                   conversao= in.nextInt();
                   while(conversao<0 || conversao>10){
                        System.out.println("Inválido!");
                        System.out.print("Digite o grau de prioridade da tarefa: ");
                        conversao= in.nextInt();
                   }
                   prioridade= String.valueOf(conversao);//converto int para string
                   t= new Tarefas(tarefa,descricao,prioridade);
                   listaTarefas.inserirOrdenado(t);
                   break;
                   
               case 2://remover tarefa
                   in.nextLine();
                   System.out.print("Informe a descrição que deseja remover da lista: ");
                   descricao= in.nextLine();
                   t= new Tarefas(descricao);
                   listaTarefas.remover(t);
                   break;
                   
               case 3://exibir tarefas por prioridades
                   in.nextLine();
                   System.out.print("Digite o grau de prioridade: ");
                   conversao= in.nextInt();
                   while(conversao<0 || conversao>10){
                        System.out.println("Inválido!");
                        System.out.print("Digite o grau de prioridade da tarefa: ");
                        conversao= in.nextInt();
                   }
                   prioridade= String.valueOf(conversao);
                   t= new Tarefas(prioridade);
                   listaTarefas.exibirPorPrioridade(t);
                   break;
                   
               case 4://Exibir descrição e prioridades de todas as tarefa
                   in.nextLine();
                   listaTarefas.exibirDescricaoComPrioridades();
                   break;
                   
               case 5://Alterar prioridade da tarefa
                   in.nextLine();
                   System.out.print("Digite qual tarefa, que desja alterar a prioridade: ");
                   tarefa= in.nextLine();
                   t= new Tarefas(tarefa);
                   listaTarefas.alterarPrioridade(t);
                   break;
                   
               case 6:
                   listaTarefas.exibirTudo();
                   break;
                   
               case 0:
                   System.out.println("Fim do programa! @Developer Valmir Jr");
                   break;
                   
               default:
                   System.out.println("Opção inválida!");
                   break;
           }         
       }while(escolha!=0);
       
    }
    
    public static void menu(){
        System.out.println("");
        System.out.println("Lista de tarefas");
        System.out.println("");
        System.out.println("1- Criar nova tarefa");
        System.out.println("2- Remover uma tarefa da lista");
        System.out.println("3- Exibir tarefas por prioridades");
        System.out.println("4- Exibir descrição e prioridades de todas as tarefas");
        System.out.println("5- Alterar prioridade da tarefa");
        System.out.println("6- Exibir tudo");
        System.out.println("0- Sair do programa");
        System.out.print("Escolha uma opção: ");
    }
}

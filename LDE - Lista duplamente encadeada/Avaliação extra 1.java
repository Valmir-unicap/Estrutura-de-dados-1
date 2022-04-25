package controledetarefas;
import  java.util.Scanner;
public class ControleDeTarefas {
    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
       LDE listaTarefas= new LDE();
       String tarefa, descricao, prioridade;
       Prioridades p = null ;
       int escolha;
       Tarefas t;
       p.PRIORIDADE1.getPRIORIDADE();
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
                   System.out.print("Digite a prioridade da tarefa");
                   prioridade= in.nextLine();
                   t= new Tarefas(tarefa,descricao,prioridade);
                   listaTarefas.inserirOrdenado(t);
                   break;
                   
               case 2://remover tarefa
                   in.nextLine();
                   break;
                   
               case 3://exibir tarefas por prioridades
                   in.nextLine();
                   System.out.println("Digite o grau de prioridade: ");
                   prioridade= in.nextLine();
                   while(prioridade!="1" || prioridade=="2" || prioridade=="3" || prioridade=="4" || prioridade=="5" ||prioridade=="6" || prioridade=="7" || prioridade=="8" || prioridade=="9" || prioridade=="10"){
                       
                   }
                   t= new Tarefas(prioridade);
                   listaTarefas.exibirPorPrioridade(t);
                   break;
                   
               case 4://Exibir descrição e prioridades de todas as tarefa
                   in.nextLine();
                   listaTarefas.exibirDescricao();
                   break;
                   
               case 5://Alterar prioridade da tarefa
                   in.nextLine();
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
        System.out.println("Lista de tarefas");
        System.out.println("");
        System.out.println("1- Criar nova tarefa");
        System.out.println("2- Remover uma tarefa");
        System.out.println("3- Exibir tarefas por prioridades");
        System.out.println("4- Exibir descrição e prioridades de todas as tarefas");
        System.out.println("5- Alterar prioridade da tarefa");
        System.out.println("0- Sair do programa!");
        System.out.print("Escolha uma opção: ");
    }
    
}

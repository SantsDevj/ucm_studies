package inter_exercises.ex005;

import java.util.List;

public class TaskManager {
    
    //Métodos Utilitários

    static void registrar(Tarefa tarefa){
        boolean tarefaReg;

        if (tarefa != null) {
            tarefaReg = true;

            if (tarefaReg) {
                System.out.println("Tarefa Registrada");
            }
        } else{
            tarefaReg = false;
            System.out.println("Erro ao criar uma Tarefa");
        }
    }

    static void imprimirRelatorio(){
        List<Tarefa> tarefa = null;

        System.out.println("Número Total de Tarefas: " + tarefa.size());
        
    }
}

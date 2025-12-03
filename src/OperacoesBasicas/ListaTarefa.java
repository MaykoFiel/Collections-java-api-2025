package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    //atributo

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefas(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
       List<Tarefa> TarefasparaRemover = new ArrayList<>();

       for(Tarefa t : tarefaList){
           if (t.getDescrcao().equalsIgnoreCase(descricao)) {
               TarefasparaRemover.add(t);
           }
       }
       tarefaList.removeAll(TarefasparaRemover);
    }
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }
    public void obterDescricoesTarefa(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de tarefas é: "  + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefas("Tarefa 1 ");
        listaTarefa.adicionarTarefas("Tarefa 1 ");
        listaTarefa.adicionarTarefas("Tarefa 2 ");
        System.out.println("O número total de tarefas é: "  + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 2 ");
        System.out.println("O número total de tarefas é: "  + listaTarefa.obterNumeroTotalTarefas());

         listaTarefa.obterDescricoesTarefa();
    }
}
